import java.io.*;
import java.util.*;

public class Main {
    private static int n, c;
    private static long[] w;
    private static long[] v;
    private static long[][] dp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        c = sc.nextInt();
        w = new long[n];
        v = new long[n];
        dp = new long[c + 1][n];
        for (int i = 0; i < n; i++) {
            w[i] = sc.nextLong();
            v[i] = sc.nextLong();
        }

        for (int i = 0; i <= c; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = -1;
            }
        }
        System.out.println(solveKnapsack(c, 0));
    }

    private static long solveKnapsack(int remcap, int item) {
        if (item == n) {
            return 0;
        }
        if (dp[remcap][item] != -1) {
            return dp[remcap][item];
        }
        long t1 = 0, t2 = 0;
        if (remcap - w[item] >= 0) {
            t1 = solveKnapsack((int) (remcap - w[item]), item + 1) + v[item];
        }

        t2 = solveKnapsack(remcap, item + 1);

        return dp[remcap][item] = Math.max(t1, t2);
    }
}