

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public final class Main {

    private static final int MOD = 998244353;

    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        final int n = in.nextInt();
         int m = in.nextInt();
        final int k = in.nextInt();
        in.nextLine();
        System.out.println(recurse(n, m, k, -1, -1, 0, new Integer[m + 1][k + 1][n]));
    }

    private static int recurse(int n, int m, int k, int prev, int sameColor, int curr, Integer[][][] dp) {
        if (curr == n) {
            return 1;
        }
        if (prev != -1 && dp[prev][sameColor][curr] != null) {
            return dp[prev][sameColor][curr];
        }

        int res = 0;
        for (int i = 1; i <= m; i++) {
            if (i == prev) {
                if (sameColor < k) {
                    res = (res + recurse(n, m, k, i, sameColor + 1, curr + 1, dp)) % MOD;
                }
            } else {
                res = (res + recurse(n, m, k, i, 0, curr + 1, dp)) % MOD;
            }
        }
        if (prev != -1) {
            dp[prev][sameColor][curr] = res;
        }
        return res;
    }
}
