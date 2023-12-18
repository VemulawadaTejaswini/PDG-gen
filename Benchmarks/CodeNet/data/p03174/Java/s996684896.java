import java.util.Scanner;

import static java.lang.System.in;

public class Main {
    final static  int MOD = (int)1E9 + 7;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        int n = scanner.nextInt();
        int[][] can = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                can[i][j] = scanner.nextInt();
            }
        }
        int[] dp = new int[1 << n];
        dp[0]=1;
        for (int mask = 0; mask < (1 << n); mask++) {
            int x = Integer.bitCount(mask);
            for (int i = 0; i < n; i++) {
                if((mask & (1 << i)) == 0 && can[x][i] == 1)
                    dp[mask | (1 << i)] = (dp[mask | (1 << i)]%MOD + dp[mask] %MOD) % MOD;
            }
        }
        System.out.println(dp[(1 << n) -1]);
    }
}
