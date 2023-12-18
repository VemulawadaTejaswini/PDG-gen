import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }

        int[] dp = new int[n];
        for (int i = 0; i < n; i++) {
            dp[i] = Integer.MAX_VALUE;
        }

        dp[0] = 0;

        for (int i = 1; i < n; i++) {
            int a = dp[i - 1] + Math.abs(h[i] - h[i - 1]);
            if (dp[i] > a) {
                dp[i] = a;
            }

            if (i > 1) {
                int b = dp[i - 2] + Math.abs(h[i] - h[i - 2]);
                if (dp[i] > b) {
                    dp[i] = b;
                }
            }

            if (i > k) {
                int c = dp[i - k] + Math.abs(h[i] - h[i - k]);
                if (dp[i] > c) {
                    dp[i] = c;
                }
            }
        }

        System.out.println(dp[n - 1]);
    }
}
