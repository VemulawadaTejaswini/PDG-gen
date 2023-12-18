import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] heights = new int[n];
        for (int i = 0; i < n; ++i) {
            heights[i] = scan.nextInt();
        }

        int[] dp = new int[n];
        dp[0] = 0;
        dp[1] = Math.abs(heights[1] - heights[0]);

        for (int i = 2; i < n; ++i) {
            dp[i] = Integer.MAX_VALUE;
            for (int j = 1; j <= k && j <= i; ++j) {
                dp[i] = Math.min(dp[i], dp[i - j] + Math.abs(heights[i] - heights[i - j]));
            }
        }

        System.out.println(dp[n - 1]);
    }
}