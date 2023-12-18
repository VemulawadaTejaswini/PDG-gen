
import java.util.Scanner;
import java.util.Vector;

public class Main {
	static int a[];
	static long dp[][];
	static int g[][];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		dp = new long [n][n];
		g = new int[n][n];
		a = new int[n];
		for (int i=0;i<n;i++) 
			a[i]=sc.nextInt();
			f(0,n-1);
		System.out.println(dp[0][n-1]);
	}
	private static long f(int l, int r) {
		if (l==r) {
			g[l][r] = 1;
			dp[l][r] = a[l];
			return a[l];
		}
		if (g[l][r]>0) return dp[l][r];
		long ans = a[r] - f(l,r-1);
		long ans1 = a[l] - f(l+1,r);
		if (ans<ans1) ans = ans1;
		
		g[l][r] = 1;
		dp[l][r] = ans;
		return ans;
	}
}
