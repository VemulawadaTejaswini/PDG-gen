

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	private static Scanner in;
	private static int n;
	private static int[] a;
	private static int[] b;
	private static int[] c;
	private static long[][] dp;
	
	public static void main(String[] args) {
		in = new Scanner(System.in);
		n = in.nextInt();
		a = new int[n];
		b = new int[n];
		c = new int[n];
		
		for(int i=0; i<n; i++) {
			a[i] = in.nextInt();
			b[i] = in.nextInt();
			c[i] = in.nextInt();
		}
		dp = new long[n+1][3];
		
		for(int i=0; i<dp.length; i++) {
			Arrays.fill(dp[i], -1);
		}
		
		long ans = solve(1, 0)+a[0];
		ans = Math.max(ans, solve(1, 1)+b[0]);
		ans = Math.max(ans, solve(1, 2)+c[0]);
		System.out.println(ans);

	}
	
	private static long solve(int i, int f) {
//		System.out.println(i+" "+f);
		if (i==n) return 0;
		
		if (dp[i][f]!=-1) return dp[i][f];
		
		long ans = 0;
		
		switch(f) {
		case 0:
			ans = Math.max(ans, b[i]+solve(i+1, 1));
			ans = Math.max(ans, c[i]+solve(i+1, 2));
			break;
		case 1:
			ans = Math.max(ans, a[i]+solve(i+1, 0));
			ans = Math.max(ans, c[i]+solve(i+1, 2));
			break;
		case 2:
			ans = Math.max(ans, a[i]+solve(i+1, 0));
			ans = Math.max(ans, b[i]+solve(i+1, 1));
			break;
		}
		
		return dp[i][f]=ans;
	}

}
