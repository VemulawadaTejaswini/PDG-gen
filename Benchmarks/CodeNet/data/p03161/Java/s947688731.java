import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        long[] dp = new long[100000];
        int[] h = new int[100000];

        long INF = Long.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }

        sc.close();

        for (int i = 0; i < 100000; i++) {
            dp[i] = INF;
        }

        dp[0] = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= k; j++) {
                dp[i + j] = Math.min(dp[i + j], dp[i] + Math.abs(h[i] - h[i + j]));
            }
        }
        System.out.println(dp[n - 1]);
    }

}