//package Beginner121;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int c = s.nextInt();
        int[] b = new int[m];
        int[][] a = new int[n][m];
        for (int i = 0; i < m; i++) {
            b[i] = s.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = s.nextInt();
            }
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            int sum = c;
            for (int j = 0; j < m; j++) {
                sum += a[i][j] * b[j];
            }

            if(sum > 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}