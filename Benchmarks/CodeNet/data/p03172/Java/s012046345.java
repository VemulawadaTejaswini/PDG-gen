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

        int mod = 1000000007;
        long[] dp = new long[K + 1];
        dp[0] = 1;
        for(int i = 0; i < N; i++){
            for(int j = K - a[i] - 1; j >= 0; j--) {
                dp[j + a[i] + 1] += mod - dp[j];
                if(dp[j + a[i] + 1] >= mod) dp[j + a[i] + 1] -= mod;
            }

            for(int j = 0; j <= K; j++){
                if(j > 0) {
                    dp[j] += dp[j - 1];
                    if(dp[j] >= mod) dp[j] -= mod;
                }
            }
        }
        System.out.println(dp[K]);
        /*
        long[][] dp = new long[N + 1][K + 1];
        dp[0][0] = 1;

        for (int i = 1; i <= N; i++) {
            dp[i][0] = 1;
            for (int j = 0; j < K; j++) {
                dp[i][j + 1] = dp[i][j] + dp[i - 1][j + 1];
                if (dp[i][j + 1] >= m) dp[i][j + 1] -= m;
                if (j - a[i] >= 0) {
                    dp[i][j + 1] -= dp[i - 1][j - a[i]];
                    if (dp[i][j + 1] >= m) dp[i][j + 1] -= m;
                }
            }

        }
        System.out.println(dp[N][K]);
         */
    }
}
