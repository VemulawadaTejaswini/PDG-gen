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
        int Z = scan.nextInt();
        int W = scan.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = scan.nextInt();
        }
        long[][] dp = new long[N+1][3];
        dp[0][0] = Math.abs(Z-W);
        dp[0][1] = Z;
        dp[0][2] = W;
        for (int i = 1; i<= N; i++) {
            if (i % 2 == 1) {
                long score = dp[i-1][0];
                dp[i][0] = dp[i-1][0];
                dp[i][2] = dp[i-1][2];
                for (int j = i; j <= N; j++) {
                    if (score < Math.abs(a[j-1] - dp[i][2])) {
                        dp[i][0] = Math.max(dp[i][0], Math.abs(a[j-1] - dp[i][2]));
                        dp[i][1] = a[j-1];
                    }
                }
            } else {
                long score = dp[i-1][0];
                dp[i][0] = dp[i-1][0];
                dp[i][1] = dp[i-1][1];
                for (int j = i; j <= N; j++) {
                    if (Math.abs(dp[i][1]-a[j-1]) < score) {
                        dp[i][0] = Math.min(dp[i][0], Math.abs(dp[i][1]-a[j-1]));
                        dp[i][2] = a[j-1];
                    }
                }
            }
        }
        long answer = dp[N][0];
        System.out.println(answer);
    }
}
