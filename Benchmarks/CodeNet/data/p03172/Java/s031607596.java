import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }

        int m = 1000000007;


        long[][] dp = new long[N + 1][K + 1];
        dp[0][0] = 1;

        for (int i = 1; i <= N; i++) {
            dp[i][0] = 1;
            for (int j = 0; j < K; j++) {
                dp[i][j + 1] = dp[i][j] + dp[i - 1][j + 1];
                if (dp[i][j + 1] >= m) dp[i][j + 1] -= m;
                if (j - a[i - 1] >= 0) {
                    dp[i][j + 1] = (dp[i][j + 1] - dp[i - 1][j - a[i - 1]] )% m;
                    if (dp[i][j + 1] >= m) dp[i][j + 1] -= m;
                }
            }

        }
        System.out.println(dp[N][K]);
    }
}
