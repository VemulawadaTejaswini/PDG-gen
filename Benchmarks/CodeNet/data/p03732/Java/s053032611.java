import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main{

	static class Pair{
		int w,v;
		public Pair(int a, int b){
			this.w = a;
			this.v = b;
		}
	}
	public static void main(String[] args) {
		solve();
	}

	public static void solve() {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		final int MAX = 310;
		final int MOD = 1000000007;

		//入力
		int n = sc.nextInt();
		long w = sc.nextLong();
		Pair[] pairs = new Pair[n];
		for(int i = 0; i < n; i++){
			Pair a = new Pair(sc.nextInt(), sc.nextInt());
			pairs[i] = a;
		}
		sc.close();

		//準備
		int base = pairs[0].w;
		for(int i = 0; i < n; i++){
			pairs[i].w -= base;
		}
		int[][] dp = new int[n+1][MAX];
		for(int i = 0; i < MAX; i++){
			for(int j = 0; j < n+1; j++){
				dp[j][i] = -1;
			}
		}
		dp[0][0] = 0;

		//処理
		for(int i = 0; i < n; i++){
			for(int j = n; j > 0; j--){
				for(int k = 0; k < MAX; k++){
					if(k - pairs[i].w >= 0 && dp[j-1][k - pairs[i].w] >= 0){
						dp[j][k] = Math.max(dp[j][k], dp[j-1][k - pairs[i].w] + pairs[i].v);
					}
				}
			}
		}

		int ans = 0;
		for(int i = 1; i < n+1; i++){
			for(int j = 0; j < MAX; j++){
				if((long)i * base + j <= w){
					ans = Math.max(ans, dp[i][j]);
				}
			}
		}

		//出力	
		out.println(ans);
		out.flush();
	}
}