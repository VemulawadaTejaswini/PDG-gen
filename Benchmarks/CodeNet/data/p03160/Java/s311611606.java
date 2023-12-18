import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] stones = new int[n];
		int[] dp = new int[n];
		dp[0] = 0;
		for (int i = 0; i < 2; ++i) {
			stones[i] = sc.nextInt();
			if (i > 0) dp[i] = Math.abs(stones[i] - stones[i - 1]);
		}
		for (int i = 2; i < n; ++i) {
			stones[i] = sc.nextInt();
			dp[i] = Math.min(Math.abs(stones[i] - stones[i - 1]) + dp[i - 1], Math.abs(stones[i] - stones[i - 2]) + dp[i - 2]);
		}
		System.out.println(dp[n - 1]);
		
		sc.close();
	}

}
