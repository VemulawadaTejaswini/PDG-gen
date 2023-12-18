import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] dp = new int[n][3];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < 3; j++) {
                dp[i][j] = sc.nextInt();
            }
        }
        for(int i = n - 2; i >= 0; i--) {
            // 0
            dp[i][0] += Math.max(dp[i + 1][1], dp[i + 1][2]);
            // 1
            dp[i][1] += Math.max(dp[i + 1][2], dp[i + 1][0]);
            // 2
            dp[i][2] += Math.max(dp[i + 1][0], dp[i + 1][1]);
        }
        System.out.println(Math.max(dp[0][0], Math.max(dp[0][1], dp[0][2])));
    }
}
