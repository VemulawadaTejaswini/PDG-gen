import java.util.*;
import java.lang.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int lw = sc.nextInt();
        int[] w = new int[n + 1];
        int[] v = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            w[i] = sc.nextInt();
            v[i] = sc.nextInt();
        }
        long[][] dp = new long[n + 1][100001];
        for (int i = 0; i < n + 1; i++) {
            for (int j = 1; j < 100001; j++) {
                dp[i][j] = lw + 1;
            }
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < 100001; j++) {
                if (v[i] > j) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = Math.min(dp[i - 1][j - v[i]] + w[i], dp[i - 1][j]);
                }
            }
        }
        for (int i = 100000; i > 0; i--) {
            if (dp[n][i] <= lw) {
                System.out.println(i);
                break;
            }
        }
    }
}