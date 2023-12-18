import java.util.*;
import java.lang.*;


public class Main {
    static int n;
    static int lw;
    static int[] w;
    static int[] v;
    static long[][] dp;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        lw = sc.nextInt();
        w = new int[n];
        v = new int[n];
        for (int i = 0; i < n; i++) {
            w[i] = sc.nextInt();
            v[i] = sc.nextInt();
        }
        dp = new long[n + 1][100001];
        nap(0);
        System.out.println(dp[n][lw]);
    }
    static void nap(int i) {
        if (i == n) {
            return;
        }
        for (int j = 0; j <= lw; j++) {
            if (j >= w[i]) {
                dp[i + 1][j] = Math.max(dp[i][j - w[i]] + v[i], dp[i][j]);
            } else {
                dp[i + 1][j] = dp[i][j];
            }
        }
        nap(i + 1);
    }
}