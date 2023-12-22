import java.util.*;

public class Main {
    static int[][] dp;
    static int[] coins;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        coins = new int[m];
        for (int i = 0; i < m; i++) {
            coins[i] = sc.nextInt();
        }
        Arrays.sort(coins);
        dp = new int[m][n + 1];
        System.out.println(dfw(m - 1, n));
    }
    
    static int dfw(int idx, int amount) {
        if (amount == 0) {
            return 0;
        }
        if (idx < 0) {
            return Integer.MAX_VALUE / 10;
        }
        if (dp[idx][amount] != 0) {
            return dp[idx][amount];
        }
        if (amount % coins[idx] == 0) {
            return dp[idx][amount] = amount / coins[idx];
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i * coins[idx] <= amount; i++) {
            min = Math.min(min, dfw(idx - 1, amount - coins[idx] * i) + i);
        }
        return dp[idx][amount] = min;
    }
}
