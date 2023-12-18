/*
https://atcoder.jp/contests/dp/tasks/dp_l
*/
import java.io.*;
import java.util.*;

public class Main {

    private static long solve(int n, long[] arr) {
        long[][] dp = new long[n][n];

        for (int i = n - 1; i >= 0; i--) {
            for (int j = i; j < n; j++) {
                if (i == j) {
                    dp[i][j] = arr[i];
                } else {
                    dp[i][j] = Math.max(arr[j] - dp[i][j - 1], arr[i] - dp[i + 1][j]);
                }
            }
        }
        // System.out.println(Arrays.deepToString(dp));
        return dp[0][n - 1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }
        System.out.println(solve(n, arr));
        sc.close();
    }
}