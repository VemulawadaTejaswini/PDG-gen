

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	private static Scanner in;
	
	private static int n;
	private static int[] a;
	private static double[][][] dp;
	private static final int MOD = (int)1e9+7;
	
	public static void main(String[] args) {
		in = new Scanner(System.in);
		n = in.nextInt();
		a =  new int[n];
		for(int i=0; i<n; i++) {
			a[i] = in.nextInt();
		}
		
		dp = new double[n+1][n+1][n+1];
		
		for(int i=0; i<dp.length; i++)
			for(int j=0; j<dp[0].length; j++)
				Arrays.fill(dp[i][j], -1);
		
		int x, y, z;
		x=y=z=0;
		
		for(int i=0; i<n; i++) {
			if (a[i]==1) x++;
			else if (a[i]==2) y++;
			else if (a[i]==3) z++;
		}
		
		System.out.println(solve(x, y, z));
	
	}
	
	private static double solve(int x, int y, int z) {
		if (x<0 || y<0 || z<0) return 0;
		if (x+y+z==0) return 0;
		
		if (dp[x][y][z]!=-1) return dp[x][y][z];
		
		double alpha = (double)x*(1+solve(x-1, y, z))/n + (double)y*(1+solve(x+1, y-1, z))/n + (double)z*(1+solve(x, y+1, z-1))/n+1-(double)(x+y+z)/n;
		double ans = (double)n/(x+y+z)*alpha;
	
		return dp[x][y][z]=ans;
	}

}
