import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int n = std.nextInt();
        int[] hs = new int[n];
        int[] dp = new int[n+1];
        for (int i = 0; i < n; i++) {
            hs[i] = std.nextInt();
        }

        dp[0] = 0;
        dp[1] = 0;
        dp[2] = hs[1] - hs[0];
        for (int i = 2; i < n; i++) {
            int one = dp[i] + Math.abs(hs[i] - hs[i-1]);
            int two = dp[i - 1] + Math.abs(hs[i] - hs[i - 2]);
            dp[i + 1] = Math.min(one, two);
        }

        System.out.println(dp[n]);
    }
}
