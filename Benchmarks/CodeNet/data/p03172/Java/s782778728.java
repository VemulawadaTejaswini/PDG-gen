import java.util.Scanner;

public class Main{
	static long mod = 1000000000 + 7;
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			int N = sc.nextInt(), K = sc.nextInt();
			int[] a = new int[N];
			for(int i = 0; i < N; i++) a[i] = sc.nextInt();
			long[][] dp = new long[N][K + 1];
			for(int i = 0; i <= a[N - 1]; i++) dp[N - 1][i] = 1;
			for(int i = N - 2; i >= 0; i--) {
				for(int j = 0; j <= K; j++) {
					if(j == 0) {
						dp[i][j] = dp[i + 1][j];
						continue;
					}
					dp[i][j] = dp[i + 1][j] + dp[i][j - 1];
					if(j - a[i] - 1 >= 0) dp[i][j] -= dp[i + 1][j - a[i] - 1];
					dp[i][j] %= mod;
				}
			}
			System.out.println(dp[0][K] % mod);
		}
	}
}