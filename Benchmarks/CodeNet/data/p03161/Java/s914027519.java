
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] stones = new int[n];
        for (int i = 0; i < n; i++) {
            stones[i] = scanner.nextInt();
        }
        int[] dp = new int[n];
        int[] cal = new int[n];
        System.out.println(minInjured(stones, n - 1, dp, cal, k));
    }

    public static int minInjured(int[] stones, int n, int[] dp, int[] cal, int k) {

        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return Math.abs(stones[1] - stones[0]);
        }

        if (cal[n] == 1) {
            return dp[n];
        }

        for (int i = 1; i <= k; i++) {
            if (n - i >= 0 && cal[n - i] != 1) {
                dp[n - i] = minInjured(stones, n - i, dp, cal, k);
                cal[n - i] = 1;
            }
        }

        int min = Integer.MAX_VALUE;
        for (int i = 1; i <= k; i++) {
            if (n - i >= 0) {
                min = Math.min(dp[n - i] + Math.abs(stones[n] - stones[n - i]), min);
            }
        }
        dp[n] = min;

        return dp[n];
    }
}
