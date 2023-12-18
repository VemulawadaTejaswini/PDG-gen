

import java.util.Scanner;

public class Main {

	static int mincost(int i, int k, int[] ar, int[] dp) {

		if (i == ar.length - 1)
			return 0;

		if (dp[i] != -1)
			return dp[i];

		int mincost = Integer.MAX_VALUE;
		
		for(int index = i + 1; index <= Math.min(ar.length - 1, i + k); index++)
			mincost = Math.min(mincost, (Math.abs(ar[i] - ar[index]) + mincost(index, k, ar, dp)));

		return dp[i] = mincost;
	}

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int ar[] = new int[n];
		int dp[] = new int[n];

		for (int i = 0; i < n; i++) {
			ar[i] = sc.nextInt();
			dp[i] = -1;
		}

		System.out.println(mincost(0, k, ar, dp));
		sc.close();
	}

}