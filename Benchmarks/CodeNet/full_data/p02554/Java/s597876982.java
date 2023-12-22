//package Test;

import java.util.*;

public class Main {

    static class Solution {

        void solve(int n){
            // N: 0-9, include 0 and 9
            // mod: 1000000007
            // dp[i][j][4]:
            // 0: null, 1: 0, 2: 9, 3: 0 && 9
            int mod = 1000000007;
            int[][][] dp = new int[n][10][4];
            for(int i = 1; i < 9; i++) dp[0][i][0] = 1;
            dp[0][0][1] = 1;
            dp[0][9][2] = 1;
            for(int i = 1; i < n; i++) {
                for(int j = 0; j < 10; j++) {
                    if(j == 0) {
                        for(int k = 0; k < 10; k++) {
                            dp[i][j][1] = ((dp[i][j][1] + dp[i-1][k][0]) % mod + dp[i-1][k][1]) % mod;
                            dp[i][j][3] = ((dp[i][j][3] + dp[i-1][k][3]) % mod + dp[i-1][k][2]) % mod;
                        }
                    }
                    else if(j == 9) {
                        for(int k = 0; k < 10; k++) {
                            dp[i][j][2] = ((dp[i][j][2] + dp[i-1][k][0]) % mod + dp[i-1][k][2]) % mod;
                            dp[i][j][3] = ((dp[i][j][3] + dp[i-1][k][3]) % mod + dp[i-1][k][1]) % mod;
                        }
                    }
                    else {
                        for(int k = 0; k < 10; k++) {
                            dp[i][j][0] = (dp[i][j][0] + dp[i-1][k][0]) % mod;
                            dp[i][j][1] = (dp[i][j][1] + dp[i-1][k][1]) % mod;
                            dp[i][j][2] = (dp[i][j][2] + dp[i-1][k][2]) % mod;
                            dp[i][j][3] = (dp[i][j][3] + dp[i-1][k][3]) % mod;
                        }
                    }
                }
            }

            int ans = 0;
            for(int i = 0; i < 10; i++) {
                ans = (ans + dp[n-1][i][3]) % mod;
            }
            System.out.println(ans);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Solution solution = new Solution();
        solution.solve(n);

    }
}
