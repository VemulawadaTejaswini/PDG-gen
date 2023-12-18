import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int w = scanner.nextInt();
        int[] weights = new int[n];
        long[] values = new long[n];

        for (int i = 0; i < n; i++) {
            weights[i] = scanner.nextInt();
            values[i] = scanner.nextLong();
        }

        long[][] dp = new long[2][n];
        System.out.println(maxValue(weights, values, dp, w, n - 1));
    }


    public static long maxValue(int[] weights, long[] values, long[][] dp, int w, int n) {

        if (n == -1) {
            return 0;
        }

        long rp = -1;
            //放
        if (weights[n] <= w) {
            if (dp[0][n] > 0) {
                rp = dp[0][n];
            } else {
                rp = maxValue(weights, values, dp, w - weights[n], n - 1) + values[n];
            }
        }
            //不放
        long rnp = -1;
        if (dp[1][n] > 0) {
            rnp = dp[1][n];
        }else {
            rnp = maxValue(weights, values, dp, w, n - 1);
        }

        if (rp > rnp) {
            dp[0][n] = rp;
            return rp;
        } else {
            dp[1][n] = rnp;
            return rnp;
        }
    }
}