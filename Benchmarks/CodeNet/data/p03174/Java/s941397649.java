
import java.util.Scanner;
import java.util.Vector;

public class Main {
	static int a[][];
	static long dp[];
	static int n;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		dp = new long [1<<n];
		for (int i=0;i<1<<n;i++)
			dp[i] = -1;
		a = new int[n][n];
		for (int i=0;i<n;i++)
			for (int j=0;j<n;j++) 
				a[i][j]=sc.nextInt();
		
		long ans = f((1<<n)-1);
		System.out.println(ans);
	}
	private static long f(int bit) {
		if (bit==0) return 1;
		if (dp[bit]>=0) 
			return dp[bit];
		int fb = Integer.bitCount(bit)-1;

		long ans = 0;
		for (int i=0;i<n;i++) {
			if ((bit>>i)%2==0) continue;
			if (a[fb][i]==0) continue;
			long l = f(bit^(1<<i));
			ans = (ans + l)%1000000007;
		}
		dp[bit] = ans;
		return ans;
	}
}
