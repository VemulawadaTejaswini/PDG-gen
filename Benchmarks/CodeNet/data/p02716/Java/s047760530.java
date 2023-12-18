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
        int N = scan.nextInt();
        long[] A = new long[N];
        for (int i = 0; i < N; i++) {
            A[i] = scan.nextLong();
        }
        long[][] dp = new long[N+1][N/2];
        for (int i = 1; i <= N; i++) {
            if (i == 1) {
                dp[i][0] = A[i-1];
                continue;
            }
            if (2 <= i) {
                dp[i][0] = Math.max(dp[i - 2][0], A[i-1]);
                for (int j = 1; j < N/2; j++) {
                    dp[i][j] = Math.max(dp[i - 2][j], dp[i - 2][j-1] + A[i-1]);
                }
            }
        }
        long ans = 0;
        for (int i = 1; i <= N; i++) {
            ans = Math.max(ans, dp[i][N/2-1]);
        }
        System.out.println(ans);
    }
}
