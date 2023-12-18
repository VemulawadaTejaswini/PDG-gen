import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] a = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            a[i] = sc.nextInt();
        }

        int m = (int) 1e9 + 7;
        int[][] dp = new int[N + 1][K + 1];
        dp[0][0] = 1;

        for (int i = 1; i <= N; i++) {
            dp[i][0] = 1;
            for (int j = 0; j < K; j++) {
                dp[i][j + 1] = (dp[i][j] + dp[i - 1][j + 1]) % m;
                if (j - a[i] >= 0)
                    dp[i][j + 1] = (dp[i][j + 1] - dp[i - 1][j - a[i]]) % m;
            }

        }
        System.out.println(dp[N][K] % m);

    }
}
