import java.util.*;

class Main {
	static final int MOD = 998244353;
	Scanner sc;
	int N;
	int S;
	int[] dp;
	
	void calc() {
		sc = new Scanner(System.in);
		N = sc.nextInt();
		S = sc.nextInt();
		dp = new int[S+1];
		for (int i = 0; i < N; i++) {
			int a = sc.nextInt();
			dp[0] = i+1;
			if (a <= S) dp[S] = (int)( ( dp[S] + (long)dp[S-a]*(N-i) )%MOD);
			for (int j = S-a-1; j >= 0; j--) {
				dp[j+a] = (dp[j+a] + dp[j]) % MOD;
			}
		}
		System.out.println(dp[S]);
	}
	
	public static void main(String[] args) {
		new Main().calc();
	}
}
