
import java.util.Scanner;
import java.util.Vector;

public class Main {
	static int a[];
	static long dp[][];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		dp = new long [n][n];
		a = new int[n];
		for (int i=0;i<n;i++) 
			a[i]=sc.nextInt();
		
		f(0,n-1);
		System.out.println(dp[0][n-1]);
	}
	private static long f(int l, int r) {
		if (l==r) {
			dp[l][r] = 0;
			return 0;
		}
		if (dp[l][r]>0) return dp[l][r];
		long ans = Long.MAX_VALUE;
		long sum = a[r];
		for (int i=l;i<r;i++) {
			sum+=a[i];
			long kq = f(l,i) + f(i+1,r);
			if (ans > kq) ans = kq;
		}
		dp[l][r] = ans+sum;
		return dp[l][r];
	}
}
