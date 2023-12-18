package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static jdk.nashorn.internal.objects.Global.println;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int x, y, z;
        int ans;
        /*InputStreamReader isr = new InputStreamReader(System.in);
　　　　BufferedReader br = new BufferedReader(isr);
　　　　String buf = null;
        try {
            buf = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
　　　　ｘ = Integer.parseInt（buf）;*/

        System.out.print("input integer: ");
        InputStreamReader isr0 = new InputStreamReader(System.in);
        BufferedReader br0 = new BufferedReader(isr0);
        try{
            String buf = br0.readLine();
            x = Integer.parseInt(buf);
        }catch(Exception e){
            x = 0;
        }
        System.out.println("Input Number = " + x);

        System.out.print("input integer: ");
        InputStreamReader isr1 = new InputStreamReader(System.in);
        BufferedReader br1 = new BufferedReader(isr1);
        try{
            String buf = br1.readLine();
            y = Integer.parseInt(buf);
        }catch(Exception e){
            y = 0;
        }
        System.out.println("Input Number = " + y);

        System.out.print("input integer: ");
        InputStreamReader isr2 = new InputStreamReader(System.in);
        BufferedReader br2 = new BufferedReader(isr2);
        try{
            String buf = br2.readLine();
             z = Integer.parseInt(buf);
        }catch(Exception e){
            z = 0;
        }
        System.out.println("Input Number = " + z);

        ans = (x - z) / (y + z);
        System.out.println(ans);
    }
}
