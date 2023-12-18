import java.util.*;


public class Main {
	
	static int n, m, a, b;
	
	static int MOD = 1000000007;
	
	public static void main(String[] args) {
		
		Scanner cin = new Scanner(System.in);
		
		/*input*/
		
		n = cin.nextInt();
		m = cin.nextInt();
		a = cin.nextInt();
		b = cin.nextInt();
		long[] dp = new long[m];
		Arrays.fill(dp, 1);
		

		/*start*/
		
		for (int i = 1; i < n; i ++) {
			
			if (i < n - a ) { 
				
				for (int j = 1; j < m; j ++) {
					dp[j] = dp[j] + dp[j-1];
					dp[j] %= MOD;
				}
			} else { // special caes
				
				dp[b-1] = 0;
				for (int j = b; j < m; j ++) {
					dp[j] = dp[j] + dp[j-1];
					dp[j] %= MOD;
				}
			}
		}
		
		
		dp[m-1] += MOD;
		dp[m-1] %= MOD;
		/*finish*/
		System.out.println(dp[m-1]);
		
	}
}

