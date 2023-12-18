
import javax.swing.*;
import java.io.*;
import java.sql.Struct;
import java.text.DecimalFormat;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        long[][][] dp = new long[n + 1][n + 1][2];

        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < n + 1; j++) {
                for (int k = 0; k < 2; k++) {
                    dp[i][j][k] =  Long.MAX_VALUE;
                }
            }
        }
        System.out.println(calculate(dp, 0, 0, n, arr));
    }

    static long calculate(long[][][] dp, int player, int start, int end, int[] arr) {
        if (dp[start][end][player] != Long.MAX_VALUE) {
            return dp[start][end][player];
        }
        if (start == end) {
            return 0;
        }
        int another = (player + 1)% 2;
        long f = calculate(dp, another, start + 1, end, arr);
        long s = calculate(dp, another, start, end - 1, arr);
        if (player == 0) {
            dp[start][end][player] = Math.max((f + arr[start]), s + arr[end - 1]);
        } else {
            dp[start][end][player] = Math.min((f - arr[start]), s - arr[end - 1]);
        }
        return dp[start][end][player];
    }
}