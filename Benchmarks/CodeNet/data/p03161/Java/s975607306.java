import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int k = reader.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; ++i) {
            a[i] = reader.nextInt();
        }
        System.out.println(solve(a, k));
    }

    private static int solve(int[] a, int k) {
        return findMinIt(a, k);
    }

    private static int findMinIt(int[] a, int k) {
        int[] dp = new int[a.length];
        for (int i = a.length - 2; i >= 0; --i) {
            dp[i] = Integer.MAX_VALUE;
            for (int j = i + 1; j < i + k + 1 && j < a.length; ++j) {
                dp[i] = Math.min(dp[j] + Math.abs(a[i] - a[j]), dp[i]);
            }
        }
        return dp[0];
    }
}
