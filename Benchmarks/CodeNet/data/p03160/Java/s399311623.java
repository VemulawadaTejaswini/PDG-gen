import java.util.*;

public class Main {

    long INF = Long.MAX_VALUE;
    long[] dp;
    long n;
    long S;
    int[] h;

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        dp = new long[N];
        h = new int[N];

        Arrays.fill(dp, Long.MAX_VALUE);
        dp[0] = 0;
        for (int i = 0; i < N; i++) {
            h[i] = sc.nextInt();
        }
        System.out.println(flog(N - 1));
    }

    long flog(int i) {
        if (dp[i] != Long.MAX_VALUE) {
            return dp[i];
        }
        if (i <= 0) {
            return 0;
        }
        if (i == 1) {
            return dp[i] = flog(i - 1) + Math.abs(h[i - 1] - h[i]);
        }
        return dp[i] = Math.min(flog(i - 1) + Math.abs(h[i - 1] - h[i]), flog(i - 2) + Math.abs(h[i - 2] - h[i]));
    }
}
