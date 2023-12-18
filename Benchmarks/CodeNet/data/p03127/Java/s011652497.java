package main;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] gcms = new int[n][n];
        for (int i = 0; i < n; i++) {
            gcms[0][i] = sc.nextInt();
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                gcms[i][j] = gcm(gcms[i - 1][j], gcms[i - 1][j + 1]);

            }
        }
        System.out.println(gcms[n - 1][0]);
    }

    private static int gcm(int n, int m) {
        int big = n;
        int small = m;
        int tmp;
        while (true) {
            tmp = big;
            big = small;
            small = tmp;
            big = big % small;
            if (big == 0) {
                return small;
            }

        }

    }
}
