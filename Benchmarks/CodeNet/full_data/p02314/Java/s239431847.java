
import java.util.Scanner;

public class Main {

    public static int coinChange(int[] coins, int amount) {
        if (coins == null || coins.length == 0) {
            return 0;
        }
        int[] dp = new int[amount + 1];

        for (int i = 1; i < dp.length; i++) {
            dp[i] = -1;
        }

        for (int coinsNum = 1; coinsNum <= coins.length; coinsNum++) {
            for (int amountN = 1; amountN <= amount; amountN++) {
                if ((amountN - coins[coinsNum - 1] >= 0) && dp[amountN - coins[coinsNum - 1]] != -1) {
                    int prevTotal = dp[amountN - coins[coinsNum - 1]];
                    if (dp[amountN] == -1) {
                        dp[amountN] = prevTotal + 1;
                    } else {
                        dp[amountN] = Math.min(dp[amountN], prevTotal + 1);
                    }
                }
            }
        }
        return dp[amount];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        int n = scanner.nextInt();
        int[] coins = new int[n];
        for (int i = 0; i < n; i++) {
            coins[i] = scanner.nextInt();
        }
        System.out.println(coinChange(coins, amount));
    }
}