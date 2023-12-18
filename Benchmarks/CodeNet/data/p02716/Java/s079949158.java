import java.util.Scanner;

import static java.lang.Math.max;

public class Main {


    static class Solution {


    }

    static public boolean isValid(int total, int remain) {
        return remain * 2 - total <= 1;
    }

    static public long solve(int cur, int remain, long[][] dp, long[] arr) {
        if(!isValid(cur, remain)) {
            return Long.MIN_VALUE;
        }
        if(remain <= 0) {
            return 0L;
        }

        int state = cur / remain;
        if(dp[cur][state] != Long.MIN_VALUE) return dp[cur][state];

        long ans = Long.MIN_VALUE;
        if(isValid(cur - 1, remain)) {
            ans = max(ans, solve(cur - 1, remain, dp, arr));
        }
        ans = max(ans, solve(cur - 2, remain - 1, dp, arr) + arr[cur]);
        dp[cur][state] = ans;
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n+1];
        long[][] dp = new long[n+1][5];

        for(int i=1; i <=n; ++i) {
            arr[i] = sc.nextLong();
        }
        for(int i=1; i<=n; ++i) {
            for(int j=0; j<5; ++j){
                dp[i][j] = Long.MIN_VALUE;
            }
        }
        long ans = solve(n, n / 2, dp, arr);
        System.out.println(ans);

    }
}
