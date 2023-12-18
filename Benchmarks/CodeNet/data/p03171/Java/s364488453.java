

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	private static Scanner in;
	
	private static int n;
	private static int[] a;
	private static long[][] dp;
	private static final int MOD = (int)1e9+7;
	
	public static void main(String[] args) {
		in = new Scanner(System.in);
		n = in.nextInt();
		a =  new int[n];
		for(int i=0; i<n; i++) {
			a[i] = in.nextInt();
		}
		
		dp = new long[n+1][n+1];
		
		for(int i=0; i<dp.length; i++)
			Arrays.fill(dp[i], -1);
		
		
		
		System.out.println(solve(0, n-1, 0));
	
	}
	
	private static long solve(int l, int r, int f) {
		int multiplier = (f==0?1:-1);
		if (l==r) return multiplier*a[l];
		
		if (dp[l][r]!=-1) return dp[l][r];
		
		
		long ans = 0;
		
		if (f==0) {
			ans = Math.max(a[l]+solve(l+1, r, 1-f), a[r]+solve(l, r-1, 1-f));
		} else {
			ans = Math.min(-1*a[l]+solve(l+1, r, 1-f), -1*a[r]+solve(l, r-1, 1-f));
		}
		return dp[l][r] = ans;
		
	}

}
