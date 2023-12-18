

import java.util.Scanner;

public class Main {

	static int mincost(int i, int[] ar, int[] dp) {

		if (i >= ar.length)
			return 0;

		if (i == ar.length - 1)
			return 0;

		if (dp[i] != -1)
			return dp[i];

		int left = Math.abs(ar[i] - ar[i + 1]) + mincost(i + 1, ar, dp);
		
		int right = Integer.MAX_VALUE;
		
		if(i + 2 < ar.length)
			right = Math.abs(ar[i] - ar[i + 2]) + mincost(i + 2, ar, dp);

		return dp[i] = Math.min(left, right);
	}

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ar[] = new int[n];
		int dp[] = new int[n];

		for (int i = 0; i < n; i++) {
			ar[i] = sc.nextInt();
			dp[i] = -1;
		}

		System.out.println(mincost(0, ar, dp));
	}

}