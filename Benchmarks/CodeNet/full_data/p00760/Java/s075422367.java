
// package com.company;

import java.util.*;
import java.io.*;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        List<Integer> ans = new ArrayList<>();
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            int Y = input.nextInt();
            int M = input.nextInt();
            int D = input.nextInt();

            int years = 1000 - Y;

            int yearsBig = years / 3;
            if ( Y % 3 != 1) yearsBig ++;
            // System.out.println("Y = " + yearsBig);
            int yearsSmall = years - yearsBig;

            int days = yearsBig*200 + yearsSmall*195;
            // System.out.println("day = " + days);

            int monthDis = M - 1;
            int monthSmall = monthDis / 2;
            int monthBig = monthDis - monthSmall;
            if (Y %3 != 0) {
                days = days - monthSmall * 19 - monthBig * 20;
            } else {
                days = days - monthDis * 20;
            }
            // System.out.println("day = " + days);

            int dayDis = D - 1;

            days = days - dayDis;
            // if (M * D > 1)
            //     ans.add(days + 5);
            // else ans.add(days);

            ans.add(days);
        }

        for (int day : ans) {
            System.out.println(day);
        }
    }
}
