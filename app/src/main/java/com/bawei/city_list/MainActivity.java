package com.bawei.city_list;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.bawei.city_list.City_list.City_activity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btn_city(View view) {

        Intent intent = new Intent(this, City_activity.class);
        startActivity(intent);

    }
}
