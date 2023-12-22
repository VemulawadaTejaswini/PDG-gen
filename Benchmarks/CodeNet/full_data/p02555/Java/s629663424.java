import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int S = scan.nextInt();
        if (S < 3) {
            System.out.println(0);
            return;
        }
        long mod = 1000000007;
        long ans = 1;
        int max = (S + 2) / 3;
        int lower = 3;
        long[] dp = new long[S+1];
        for (int i = lower; i <= S; i++) {
            dp[i] = 1;
        }
        for (int k = 1; k < max; k++) {
            if (S - 3 < lower) {
                continue;
            }
            long[] next_dp = new long[S + 1];
            for (int i = lower; i <= S - 3; i++) {
                for (int j = 3; j <= S - i; j++) {
                    next_dp[i + j] += dp[i];
                    next_dp[i + j] %= mod;
                }
            }
            lower += 3;
            ans += next_dp[S];
            ans %= mod;
            dp = next_dp;
        }
        System.out.println(ans);
    }
}
