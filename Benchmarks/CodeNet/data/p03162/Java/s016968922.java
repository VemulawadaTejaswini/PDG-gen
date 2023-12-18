import java.util.*;

public class Main{
	void solve(){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
			b[i] = scan.nextInt();
			c[i] = scan.nextInt();
		}
		int[][] dp = new int[n][3];
		dp[0][0] = a[0];
		dp[0][1] = b[0];
		dp[0][2] = c[0];
		for(int i = 1; i < n; i++) {
			dp[i][0] = Math.max(dp[i - 1][1] + a[i], dp[i - 1][2] + a[i]);
			dp[i][1] = Math.max(dp[i - 1][0] + b[i], dp[i - 1][2] + b[i]);
			dp[i][2] = Math.max(dp[i - 1][0] + c[i], dp[i - 1][1] + c[i]);
		}
		System.out.println(Math.max(dp[n - 1][0], Math.max(dp[n - 1][1], dp[n - 1][2])));
		scan.close();
	}

	public static void main(String[] args){
		new Main().solve();
	}
}
 