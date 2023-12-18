import java.util.Scanner;

/**
 * https://abc050.contest.atcoder.jp/tasks/arc066_b
 */
public class Main {

	static final int MOD = 1000000007;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		sc.close();
		
		long bit = (long)(Math.log10(N)/Math.log10(2) + 1.0);
		long[][] dp = new long[(int)bit+1][3];
		dp[0][0] = 1;
		System.out.println(bit);
		for (int i = 1; i <= bit; i++) {
			if(((long)1<<(bit-i)&N)>0){
				dp[i][0] = dp[i-1][0];
				dp[i][1] = (dp[i-1][0] + dp[i-1][1]) % MOD;
				dp[i][2] = (2*dp[i-1][1] + 3*dp[i-1][2]) % MOD;
			} else {
				dp[i][0] = (dp[i-1][0] + dp[i-1][1]) % MOD;
				dp[i][1] = dp[i-1][1];
				dp[i][2] = (dp[i-1][1] + 3*dp[i-1][2]) % MOD;
		    }
		}
	 
		long ans = (dp[(int)bit][0] + dp[(int)bit][1] + dp[(int)bit][2]) % MOD;
		System.out.println(ans);

	}

}