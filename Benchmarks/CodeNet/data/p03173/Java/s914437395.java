package dp;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[][] dp = new long[401][401];

        int n = sc.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }

        for (int l = n - 1; l >= 0; l--) {
            for (int r = l; r < n; r++) {
                if (l == r) {
                    dp[l][r] = 0;
                } else {
                    dp[l][r] = Long.MAX_VALUE;
                    long sum = 0;
                    for (int p = l; p <= r; p++) {
                        sum += arr[p];
                    }
                    for (int k = l; k <= r; k++) {
                        dp[l][r] = Math.min(dp[l][r], dp[l][k] + dp[k + 1][r] + sum);
                    }
                }
            }
        }

        System.out.println(dp[0][n - 1]);
    }
}