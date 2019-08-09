package com;


import com.model.Settings;
import com.view.FormControl;
import javax.swing.*;
import java.util.Map;


public class main
{
    public static void main(String[] args) {

        JFrame myWindow = new FormControl();

        Map<String, String> settings = Settings.getSettings();
        System.out.println(settings.get("password"));


    }
}
