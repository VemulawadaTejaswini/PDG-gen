package DP;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String K = sc.next();
        int D = sc.nextInt();

        Main instance = new Main();

        int res = (int) instance.solve(K, D);

        System.out.println(res);
    }

    public long solve(String K, int D) {
        int n = K.length();
        long[][][] dp = new long[n + 1][2][D + 1]; // 0 : 0 - 9   1 : ch
        int mod  = (int) 1e9 + 7;

        dp[0][0][0] = 1;

        for (int i = 0; i < n; i++) {
            int ch = K.charAt(i) - '0';
            for (int d = 0; d < D; d++) {
                for (int j = 0; j < 10; j++) {
                    dp[i + 1][1][(d + j) % D] += dp[i][1][d];
                    dp[i + 1][1][(d + j) % D] %= mod;
                }

                for (int j = 0; j <= ch; j++) {
                    if (j == ch) {
                        dp[i + 1][0][(d + j) % D] += dp[i][0][d];
                        dp[i + 1][0][(d + j) % D] %= mod;
                    } else {
                        dp[i + 1][1][(d + j) % D] += dp[i][0][d];
                        dp[i + 1][1][(d + j) % D] %= mod;
                    }
                }
            }
        }

        long res = ((dp[n][0][0] % mod ) + (dp[n][1][0] % mod)) % mod;


        return (res + mod - 1) % mod;
    }
}
