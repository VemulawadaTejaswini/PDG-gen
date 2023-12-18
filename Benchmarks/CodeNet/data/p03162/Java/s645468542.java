

/*
https://atcoder.jp/contests/dp/tasks/dp_c
*/
import java.io.*;
import java.util.*;

public class Main {
    private static int n;
    private static int[][] arr;
    private static int[][] dp;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n][4];
        dp = new int[n][4];
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= 3; j++) {
                arr[i][j] = sc.nextInt();
                dp[i][j] = -1;
            }
            dp[i][0] = -1;
        }

        System.out.println(solve(0, 0)); // solve(day,choosen on previous day)
    }

    private static int solve(int day, int flag) {
        if (day == n) {
            return 0;
        }

        if (dp[day][flag] != -1) {
            return dp[day][flag];
        }

        int max = 0;
        for (int i = 1; i <= 3; i++) {
            if (i != flag) {
                max = Math.max(max, arr[day][i] + solve(day + 1, i));
            }
        }
        return dp[day][flag] = max;
    }
}