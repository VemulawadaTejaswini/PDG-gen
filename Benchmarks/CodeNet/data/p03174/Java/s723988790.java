

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	private static Scanner in;
	
	private static int n;
	private static int[][] a;
	private static long[] dp;
	private static final int MOD = (int)1e9+7;
	
	public static void main(String[] args) {
		in = new Scanner(System.in);
		n = in.nextInt();
		a =  new int[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++)
				a[i][j] = in.nextInt();
		}
		
		dp = new long[1<<n+1];
		
//		for(int i=0; i<dp.length; i++)
		Arrays.fill(dp, -1);
		
		System.out.println(solve(0, 0));
		
	}
	
	
	private static long solve(int i, int mask) {
		if (i==n) return 1;
		//mask --> woman mask
		
		
		if (dp[mask]!=-1) return dp[mask];
		
		
		long ans = 0;
		
		for(int j=0; j<n; j++) {
			if ((mask&(1<<j))!=0 || a[i][j]==0) continue;
			
			ans = (ans+solve(i+1, mask|(1<<j)))%MOD;
		}
		
		return dp[mask]=ans;
	}

}
