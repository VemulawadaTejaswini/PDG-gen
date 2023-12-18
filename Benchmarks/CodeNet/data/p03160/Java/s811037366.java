import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[] dp = new long[n];
        int[] h = new int[n];

        long INF = Long.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }

        sc.close();

        for (int i = 0; i < n; i++) {
            dp[i] = INF;
        }

        dp[0] = 0;
        dp[1] = Math.abs(h[0] - h[1]);

        for (int i = 2; i < n; i++) {
            dp[i] = dp[i - 1] + Math.abs(h[i - 1] - h[i]);
            dp[i] = Math.min(dp[i], dp[i - 2] + Math.abs(h[i - 2] - h[i]));
        }

        System.out.println(dp[n - 1]);
    }

}