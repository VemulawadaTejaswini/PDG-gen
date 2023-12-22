//package Test;

import java.util.*;

public class Main {

    static class Solution {

        void solve(int n){
            // N: 0-9, include 0 and 9
            // mod: 1000000007
            // dp[i][j][k]:
            // j==> 0: 0, 1: 9, 2: other
            // k==> 0: null, 1: 0, 2: 9, 3: 0 && 9
            int mod = 1000000007;
            int[][] dp = new int[n][4];

            dp[0][1] = 1;
            dp[0][2] = 1;
            dp[0][0] = 8;
            for(int i = 1; i < n; i++) {
                for (int j = 0; j < 10; j++) {
                    for (int k = 0; k < 4; k++) {
                        int bit = 0;
                        if (j == 0) bit = 1;
                        else if (j == 9) bit = 2;
                        dp[i][k | bit] = (dp[i][k | bit] + dp[i - 1][k]) % mod;
                    }
                }
            }

            System.out.println(dp[n-1][3]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Solution solution = new Solution();
        solution.solve(n);

    }
}
