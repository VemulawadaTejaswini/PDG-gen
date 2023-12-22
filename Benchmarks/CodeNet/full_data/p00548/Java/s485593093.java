import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[] oranges = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            oranges[i] = sc.nextInt();
        }
        long[] dp = new long[n + 1];
        Arrays.fill(dp, Long.MAX_VALUE);
        dp[0] = 0;
        for (int i = 1; i <= n; i++) {
            long min = Long.MAX_VALUE;
            long max = 0;
            for (int j = 1; j <= m && i - j>= 0; j++) {
                min = Math.min(min, oranges[i - j + 1]);
                max = Math.max(max, oranges[i - j + 1]);
                dp[i] = Math.min(dp[i], (max - min) * j + k + dp[i - j]);
            }
        }
        System.out.println(dp[n]);
    }
}

