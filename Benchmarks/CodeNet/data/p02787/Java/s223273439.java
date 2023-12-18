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
        int H = scan.nextInt();
        int N = scan.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scan.nextInt();
            B[i] = scan.nextInt();
        }
        long[] dp = new long[2*H+1];
        Arrays.fill(dp, Long.MAX_VALUE);
        dp[0] = 0;
        for (int i = 0; i < N; i++) {
            long[] next_dp = new long[2*H+1];
            Arrays.fill(next_dp, Long.MAX_VALUE);
            for (int j = 0; j <= 2*H; j++) {
                if (dp[j] == Long.MAX_VALUE) {
                    next_dp[j] = Math.min(next_dp[j], dp[j]);
                    continue;
                }
                next_dp[j] = Math.min(next_dp[j], dp[j]);
                for (int k = 1; j + A[i] * k <= 2*H; k++) {
                    next_dp[j + A[i] * k] = Math.min(next_dp[j + A[i] * k], dp[j]+B[i]*k);
                }
            }
            dp = next_dp;
        }
        long answer = Long.MAX_VALUE;
        for (int i = H; i <= 2*H; i++) {
            answer = Math.min(answer, dp[i]);
        }
        System.out.println(answer);
    }
}
