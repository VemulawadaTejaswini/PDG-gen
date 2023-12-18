import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), k = in.nextInt();
        long[] h = new long[n];
        for (int i = 0; i < n; i++) h[i] = in.nextLong();
        long[] dp = new long[n];
        Arrays.fill(dp, Long.MAX_VALUE);
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= k; j++) {
                if (i + j >= n) break;
                dp[i+j] = Math.min(dp[i+j], dp[i] + Math.abs(dp[i+j]-h[i]));
            }
        }
        System.out.println(dp[n-1]);
        in.close();
    }
}