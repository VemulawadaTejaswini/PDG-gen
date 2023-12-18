import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){

			long mod = (long)1e9+7;
			int N = scan.nextInt();
			int K = scan.nextInt();
			int[]a = new int[N+1];
			for(int i = 1;i<=N;i++)a[i] = scan.nextInt();

			long[][]dp = new long[N+1][K+1];


			dp[0][0] =1;

			for(int i = 1;i<=N;i++) {
				long []s = new long [K+2];
				for(int j = 1;j<=K+1;j++) s[j] = (s[j-1]+dp[i-1][j-1])%mod;

				for(int j = 0;j<=K;j++){
					dp[i][j] = (s[j+1]-s[Math.max(0, j-a[i])]+mod)%mod;
				}
			}


			System.out.println(dp[N][K]);




		}


	}


}
