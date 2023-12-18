import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int P = scan.nextInt();
        int[] A = new int[N];
        long[] dp = new long[5001];
        for (int i = 0; i < N; i++) {
            A[i] = scan.nextInt();
        }
        int sum = Arrays.stream(A).sum();
        dp[0] = 1;
        for (int i = 0; i < N; i++) {
            long[] next_dp = new long[5001];
            for (int j = 0; j <= 5000; j++) {
                if (dp[j] == 0) {
                    continue;
                }
                next_dp[j] += dp[j];
                next_dp[j + A[i]] += dp[j];
            }
            dp = next_dp;
        }
        long ans = 0;
        for (int i = 0; i <= sum; i++) {
            if (i % 2 != P) {
                continue;
            }
            ans += dp[i];
        }
        System.out.println(ans);
    }
}
