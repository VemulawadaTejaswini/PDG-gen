import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; ++i) {
            a[i] = reader.nextInt();
        }
        System.out.println(solve(a));
    }

    private static int solve(int[] a) {
        int[] dp = new int[a.length];
        Arrays.fill(dp, Integer.MAX_VALUE);
//        return findMin(a.length - 1, a.length - 1, a, dp);
        return findMin2(0, 0, a, dp);
    }

    private static int findMin(int curPos, int prevPos, int[] a, int[] dp) {
        if (curPos < 0)
            return Integer.MAX_VALUE;
        if (dp[curPos] > 0)
            return dp[curPos];
        int score = Math.abs(a[curPos] - a[prevPos]);
        if (curPos == 0) {
            return score;
        }
        int min = Math.min(
                findMin(curPos - 1, curPos, a, dp),
                findMin(curPos - 2, curPos, a, dp));
        dp[curPos] = min;

        return min + score;
    }

    private static int findMin2(int curPos, int prevPos, int[] a, int[] dp) {
        if (curPos >= dp.length)
            return Integer.MAX_VALUE;
        int score = Math.abs(a[curPos] - a[prevPos]);
        if (curPos == a.length - 1)
            return score;
        int min;
        if (dp[curPos] != Integer.MAX_VALUE) {
            min = dp[curPos];
        } else {
            min = Math.min(findMin2(curPos + 1, curPos, a, dp), findMin2(curPos + 2, curPos, a, dp));
            dp[curPos] = min;
        }
        return min + score;
    }
}
