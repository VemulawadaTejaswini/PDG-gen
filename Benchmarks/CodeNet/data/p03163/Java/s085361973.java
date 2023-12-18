import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Main main = new Main();
        main.solve();
    }
    public void solve() throws Exception {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int W = scan.nextInt();
        int[] w = new int[N];
        long[] v = new long[N];
        for (int i = 0; i < N; i++) {
            w[i] = scan.nextInt();
            v[i] = scan.nextInt();
        }
        long[] dp = new long[W+1];
        Arrays.fill(dp, Long.MIN_VALUE);
        dp[0] = 0;
        for (int i = 0; i < N; i++) {
            long[] next_dp = new long[W+1];
            for (int j = 0; j <= W; j++) {
                next_dp[j] = Math.max(next_dp[j], dp[j]);
                if (dp[j] == Long.MIN_VALUE) {
                    continue;
                }
                if (j + w[i] <= W) {
                    next_dp[j + w[i]] = Math.max(next_dp[j + w[i]], dp[j] + v[i]);
                }
            }
            dp = next_dp;
        }
        System.out.println(Arrays.stream(dp).max().getAsLong());
    }
}
