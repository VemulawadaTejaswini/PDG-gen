import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in) ;
	public static void main(String[]args) {
		Main m = new Main();
		m.run();
	}
	
	long MOD = 998244353;
	
	void run() {
		String s = sc.next();
		int n = s.length();
		
		int b[] = new int[n];
		int r[] = new int[n];
		for(int i = 0; i < n; i++) {
			b[i] = s.charAt(i) - '0';
			r[i] = 2 - b[i];
		}
		
		
		int bb[] = new int[2*n+1];
		int rr[] = new int[2*n+1];
		
		for(int i = 0 ; i < n ; i++) {
			bb[i + 1] = bb[i] + b[i];
			rr[i + 1] = rr[i] + r[i];
		}
		for(int i = 0 ; i < n ; i++) {
			bb[i+n+1] = bb[i+n];
			rr[i+n+1] = rr[i+n];
		}
		
		
		long dp[][] = new long[2*n+1][2*n+1];
		dp[0][0] = 1;
		
		for(int i = 0 ; i < 2*n ; i++) {
			for(int rc = 0; rc <= i ; rc++) {
				int bc = i-rc;
				
				if(rr[i+1] >= rc+1) {
					dp[rc+1][bc] += dp[rc][bc];
					dp[rc+1][bc] %= MOD;
				}
				if(bb[i+1] >= bc+1) {
					dp[rc][bc+1] += dp[rc][bc];
					dp[rc][bc+1] %= MOD;
				}
			}
		}
		System.out.println(dp[rr[n]][bb[n]] % MOD);
		
	}
	
}
