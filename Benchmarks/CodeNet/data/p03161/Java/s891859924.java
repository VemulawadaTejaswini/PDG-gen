import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] heights = new int[n];
        for (int i=0; i<n; i++) {
            heights[i] = sc.nextInt();
        }

        int[] dp = new int[n];
        for (int i=0; i<n; i++) {
            dp[i] = Integer.MAX_VALUE;
        }
        dp[0] = 0;

        for (int i=1; i<n; i++) {
            for (int j=Math.max(i - k, 0); j<i; j++) {
                dp[i] = Math.min(dp[i], dp[j] + Math.abs(heights[i] - heights[j]));
            }
        }
        System.out.println(dp[n - 1]);
    }
}
