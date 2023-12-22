//package com.company;
import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        char[] days = br.readLine().toCharArray();
        int max = 0;
        int curr = 0;
        for (char c : days) {
            if (c == 'S') {
                max = Math.max(max, curr);
                curr = 0;
            } else if (c == 'R') {
                ++curr;
            }
        }
        max = Math.max(curr, max);
        pw.println(max);
        pw.close();
    }
}