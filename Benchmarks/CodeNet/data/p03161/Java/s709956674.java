import java.util.*;

public class Main {

    long INF = Long.MAX_VALUE;
    long[] dp;

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] h = new int[N];
        dp = new long[N];
        for (int i = 0; i < N; i++) {
            h[i] = sc.nextInt();
        }
        Arrays.fill(dp, INF);
        dp[0] = 0;
        for (int i = 0; i < N; i++) {
            long c = INF;
            for (int j = 1; j <= K; j++) {
                if (i + j >= N) {
                    break;
                }
                dp[i + j] = Math.min(dp[i + j], dp[i] + Math.abs(h[i] - h[i + j]));
            }
        }
        System.out.println(dp[N - 1]);
    }
}