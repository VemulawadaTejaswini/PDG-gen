import java.util.*;

public class Main {
    static long[][] dp;
    static final int MOD = 1_000_000_007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        dp = new long[N + 1][K + 1];
        dp[0][0] = 1;
        for (int k = 1; k < K + 1; k++) {
            dp[0][k] = 0;
        }
        for (int i = 0; i < N; i++) {
            long[] diff = new long[K + 1];
            for (int k = 0; k < K + 1; k++) {
                diff[k] += dp[i][k];
                diff[k] %= MOD;
                int end = k + a[i] + 1;
                if (end < K + 1) {
                    diff[end] -= dp[i][k];
                    diff[end] %= MOD;
                }
            }
            dp[i + 1][0] = diff[0];
            for (int k = 1; k < K + 1; k++) {
                dp[i + 1][k] = dp[i + 1][k - 1] + diff[k];
                dp[i + 1][k] %= MOD;
            }
        }
        long ans = dp[N][K];
        System.out.println(ans);
    }
}