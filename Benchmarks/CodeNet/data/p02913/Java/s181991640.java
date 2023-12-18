import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int n = std.nextInt();
        String s = std.next();
        int[][] dp = new int[n + 1][n + 1];
        dp[0][0] = 0;

        for (int i = n - 1; i >= 0; i--) {
            char first = s.charAt(i);
            for (int j = n - 1; j >= 0; j--) {
                char second = s.charAt(j);
                if (first == second) {
                    dp[i][j] = dp[i + 1][j + 1] + 1;
                } else {
                    dp[i][j] = 0;
                }
            }
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i > j) {
                    continue;
                }

                int now = Math.min(dp[i][j], j - i);
                ans = Math.max(ans, now);
            }
        }

        System.out.println(ans);
    }
}
