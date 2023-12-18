
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
	
	void run() {
		int n = sc.nextInt();
		int[] c = new int[n];
		long mod = 1_000_000_007;
		int cmax = 2 * 100_000;
		
		long dp[] = new long[cmax+1];
		dp[0] = 1;
		
		for(int i = 0 ; i < n ; i++) {
			c[i] = sc.nextInt();
			if( i > 0 && c[i] == c[i-1]) {
				continue;
			}
			
			long next0 = (dp[0] + dp[c[i]]) % mod;
			long nextci = (dp[c[i]] + dp[0]) % mod;
			
			dp[0] = next0;
			dp[c[i]]= nextci;
		}
		
		System.out.println(dp[0]);
	}
}
