package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import static jdk.nashorn.internal.objects.Global.println;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int x, y, z;
        int ans;

        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();
        System.out.println("Input Number = " + a + b + c);

        x = Integer.parseInt(a);
        y = Integer.parseInt(b);
        z = Integer.parseInt(c);

        ans = (x - z) / (y + z);
        System.out.println(ans);
    }
}
