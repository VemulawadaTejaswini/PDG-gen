import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        long dp[][] = new long[n + 1][2];
        dp[1][1] = arr[1];
        for (int i = 2; i <= n; i++) {
            if (i % 2 == 0) {
                if (i > 2) {
                    dp[i][0] = Math.max(dp[i - 3][1], dp[i - 2][0]) + arr[i];
                } else {
                    dp[i][0] = dp[i - 2][0] + arr[i];
                }
            } else {
                dp[i][0] = Math.max(dp[i - 3][0], dp[i - 2][0]) + arr[i];
                dp[i][1] = dp[i - 2][1] + arr[i];
            }
        }
        long total;
        if (n % 2 == 0) {
            total = Math.max(dp[n - 1][1], dp[n][0]);
        } else {
            total = Math.max(Math.max(dp[n][0], dp[n - 1][0]), dp[n - 2][1]);
        }
        System.out.println(total);
    }
}