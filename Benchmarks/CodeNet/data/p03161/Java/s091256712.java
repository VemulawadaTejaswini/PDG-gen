import java.util.*;

public class Main{
	void solve(){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		int[] h = new int[n];
		for(int i = 0; i < n; i++) h[i] = scan.nextInt();
		int[] dp = new int[n];
		dp[0] = 0;
		for(int i = 1; i < n; i++) dp[i] = dp[i - 1] + Math.abs(h[i] - h[i - 1]);
		for(int i = 1; i < n; i++) {
			for(int j = 1; j <= k; j++) {
				if(i - j >= 0) dp[i] = Math.min(dp[i], dp[i - j] + Math.abs(h[i - j] - h[i]));
			}
		}
		System.out.println(dp[n - 1]);
		scan.close();
	}

	public static void main(String[] args){
		new Main().solve();
	}
}
 