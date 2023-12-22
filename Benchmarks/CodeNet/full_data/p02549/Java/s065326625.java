import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int K = scan.nextInt();
        boolean[] temp = new boolean[N+1];
        for (int i = 0; i < K; i++) {
            int L = scan.nextInt();
            int R = scan.nextInt();
            for (int j = L; j <= R; j++) {
                temp[j] = true;
            }
        }
        boolean in = false;
        int current_l = 0;
        List<Range> ranges = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            if (!temp[i] && in) {
                in = false;
                ranges.add(new Range(current_l, i - 1));
                continue;
            }
            if (!temp[i]) {
                continue;
            }
            if (!in) {
                current_l = i;
                in = true;
            }
        }
        long mod = 998244353;
        int len = ranges.size();
        long[] dp = new long[N+1];
        dp[1] = 1;
        for (int i = 2; i <= N; i++) {
            long[] original_dp = Arrays.copyOf(dp, N+1);
            if (2 < i) {
                dp[i] += dp[i-1];
            }
            for (int j = 0; j < len; j++) {
                int l = ranges.get(j).l;
                int r = ranges.get(j).r;
                if (i - l < 1) {
                    continue;
                }
                dp[i] += original_dp[i-l];
                dp[i] %= mod;
                if (i - r - 1 < 1) {
                    continue;
                }
                dp[i] -= original_dp[i - r - 1];
                dp[i] %= mod;
                if (dp[i] < 0) {
                    dp[i] += mod;
                }
            }
        }
        System.out.println(dp[N]);
    }
    class Range {
        int l;
        int r;
        Range(int l, int r) {
            this.l = l;
            this.r = r;
        }
    }
}
