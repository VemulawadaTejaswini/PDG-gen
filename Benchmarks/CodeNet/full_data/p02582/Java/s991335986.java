/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codeforces;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String weather = s.nextLine();
        int count = 0, max =0;
        for(int i = 0; i < 3; ++i) {
            if(weather.charAt(i) == 'R') {
                count++;
            } else {
                max = Math.max(max, count);
                count = 0;
            }
        }
        max = Math.max(max, count);
        System.out.println(max);
   }
}
