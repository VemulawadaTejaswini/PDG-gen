import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int MOD = 998244353;
		int N = sc.nextInt();
		int S = sc.nextInt();
		int[] A = new int[N];
		Arrays.setAll(A, i -> sc.nextInt());
		long[][] dp = new long[N+1][S+1];
		dp[0][0] = 1;
		for(int i = 0; i < N; i++) {
			for(int j = 0; j <= S; j++)
				dp[i+1][j] = dp[i][j] * 2 % MOD;
			for(int j = 0; j <= S; j++)
				if(j+A[i] <= S)
					dp[i+1][j+A[i]] += dp[i][j];
		}
		System.out.println(dp[N][S] % MOD);
	}

}