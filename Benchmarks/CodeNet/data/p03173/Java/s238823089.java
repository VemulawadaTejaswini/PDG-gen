import java.util.Arrays;
import java.util.Scanner;

class Main{
	static int N;
	static int[] a;

	static long[][] dp;
	static long[][] cost;
	static boolean[][] memo;
	static int hash = (int)1e+9 + 7;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();

		a = new int[N];
		dp = new long[N][N];
		cost = new long[N][N];
		memo = new boolean[N][N];

		for(int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
			Arrays.fill(memo[i],false);
		}

		dp(0, N - 1);
		System.out.println(cost[0][N - 1]);
		sc.close();
	}

	static long dp(int l, int r){
		if(memo[l][r]) {
			return dp[l][r];
		}

		memo[l][r] = true;

		if(l == r) {
			cost[l][r] = 0;
			return dp[l][r] = a[l];
		}

		long min = Long.MAX_VALUE;
		int index = 0;
		for(int i = l; i < r; i++) {
			long c = dp(l, i) + dp(i + 1, r) + cost[l][i] + cost[i + 1][r];
			if(c < min) {
				min = c;
				index = i;
			}
		}
		cost[l][r] = min;
		return dp[l][r] = dp(l, index) + dp(index + 1, r);
	}
}