import java.util.*;

public class Main {
    static int[] coins = new int[]{1, 5, 10, 25};
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int total = n / 50 * 2;
		n %= 50;
		int[][] dp = new int[4][50];
		System.out.println(dfw(dp, 3, n) + total);
	}
	
	static int dfw(int[][] dp, int idx, int amount) {
	    if (amount == 0) {
	        return 0;
	    }
	    if (idx < 0) {
	        return Integer.MAX_VALUE / 10;
	    }
	    if (dp[idx][amount] != 0) {
	        return dp[idx][amount];
	    }
	    int min = Integer.MAX_VALUE;
	    for (int i = 0; i * coins[idx] <= amount; i++) {
	        min = Math.min(min, dfw(dp, idx - 1, amount - i * coins[idx]) + i);
	    }
	    dp[idx][amount] = min;
	    return min;
	}
}

