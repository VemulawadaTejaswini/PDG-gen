
import java.io.*;

import java.util.*;

public class Main {
    private static int[] heights;
    private static int n, ans = Integer.MAX_VALUE,k;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
      	k = sc.nextInt();
        heights = new int[n + 3];
        dp = new int[n + 3];
        for (int i = 1; i <= n; i++) {
            heights[i] = sc.nextInt();
        }
        Arrays.fill(dp, -1);
        System.out.println(findJumpCost(1));
        sc.close();
    }

    private static int[] dp;

    private static int findJumpCost(int ind) {
        if (ind == n)
            return 0;

        if (dp[ind] != -1) {
            return dp[ind];
        }
        int min = Integer.MAX_VALUE;
        for (int i = ind + 1; i <= Math.min(n, ind + k); i++) {
            min = Math.min(min, Math.abs(heights[i] - heights[ind]) + findJumpCost(i));
            // System.out.println(min);
        }
        return dp[ind] = min;
    }
}