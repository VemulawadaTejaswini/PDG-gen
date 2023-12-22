
// package com.company;

import java.util.*;
import java.io.*;

public class Main {
    static Scanner input = new Scanner(System.in);

    static boolean ans() {
        int W = input.nextInt();
        int H = input.nextInt();
        int x = input.nextInt();
        int y = input.nextInt();        
        int r = input.nextInt();
        input.close();

        int d1 = W-x;
        int d2 = H-y;
        int d3 = x;
        int d4 = y;

        int[] d = {d1, d2, d3, d4};

        for (int i = 0; i < 4; i ++) {
            if (d[i] < r) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        if (ans()) System.out.println("Yes");
        else System.out.println("No");
    }
}
