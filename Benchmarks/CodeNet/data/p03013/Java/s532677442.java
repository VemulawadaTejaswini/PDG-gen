import java.util.Scanner;
 
public class Main {
	static final long MOD = 1_000_000_007;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		
		boolean[] broken = new boolean[n];
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			a--;
			broken[a] = true;
		}
		
		long[] dp = new long[n];
		dp[0] = broken[0] ? 0 : 1;
		dp[1] = broken[1] ? 0 : 1 + dp[0];
		for (int i = 2 ; i < n; i++) {
			dp[i] = broken[i] ? 0 : (dp[i - 2] + dp[i - 1]) % MOD;
		}
		
//		System.out.println(Arrays.toString(dp));
		
		System.out.println(dp[n - 1]);
		
		sc.close();
	}
}

