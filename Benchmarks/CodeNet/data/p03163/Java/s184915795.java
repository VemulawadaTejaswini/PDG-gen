import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int w = scan.nextInt();

        int[] values = new int[n];
        int[] weights = new int[n];
        for (int i = 0; i < n; ++i) {
            weights[i] = scan.nextInt();
            values[i] = scan.nextInt();
        }

        BigInteger[][] dp = new BigInteger[n + 1][w + 1];
        for (int i = 0; i <= n; ++i) {
            for (int wei = 0; wei <= w; ++wei) {
                if (i == 0 || wei == 0) {
                    dp[i][wei] = new BigInteger("0");
                } else if (weights[i - 1] <= wei) {
                    dp[i][wei] = dp[i - 1][wei].max(BigInteger.valueOf(values[i - 1]).add(dp[i - 1][wei - weights[i - 1]]));
                } else dp[i][wei] = dp[i - 1][wei];
            }
        }

        System.out.println(dp[n][w]);
    }
}
