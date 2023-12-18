import java.util.*;

public class Main {

    long INF = 1000000001;
    long[][] dp;
    boolean A, B, C;

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int W = sc.nextInt();
        int[] w = new int[N];
        int[] v = new int[N];
        dp = new long[N + 1][100001];
        for (int j = 0; j <= 100000; j++) {
            dp[0][j] = INF;
        }
        dp[0][0] = 0;
        for (int i = 0; i < N; i++) {
            w[i] = sc.nextInt();
            v[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= 100000; j++) {
                if (j < v[i]) {
                    dp[i + 1][j] = dp[i][j];
                } else {
                    dp[i + 1][j] = Math.min(dp[i][j], dp[i][j - v[i]] + w[i]);
                }
            }
        }
        long ans = INF;
        for (int i = 0; i <= 100000; i++) {
            if (dp[N][i] <= W) {
                ans = i;
            }
        }
        System.out.println(ans);
    }
}