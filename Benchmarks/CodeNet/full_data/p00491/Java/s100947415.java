import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		try(Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();// 日にち
			int K = sc.nextInt();// 決められたパスタ
			long[][][] dp = new long[N+1][4][3];
			// 何日までに何のパスタを何日連続して食べている がn通り
			// dp[i][j][2] = dp[i-1][j][1]
			// dp[i][j][1] = dp[i-1][j以外][1]+dp[i-1][j以外][2]
			
			int[] key = new int[N+1];
			for(int i=0; i<N+1; i++) {
				key[i] = 0;
			}
			for(int i=0; i<K; i++) {
				int date = sc.nextInt();
				key[date] = sc.nextInt();
			}
			
			for(int i=1; i<N+1; i++) {
				for(int j=1; j<4; j++){
					for(int l=1; l<3; l++) {
						dp[i][j][l] = 0;
					}
				}
			}
			
			if(key[1] == 1) {
				dp[1][1][1] = 1;
			}
			else if(key[1] == 2) {
				dp[1][2][1] = 1;
			}
			else if(key[1] == 3) {
				dp[1][3][1] = 1;
			}
			else if(key[1] == 0) {
				dp[1][1][1] = 1;
				dp[1][2][1] = 1;
				dp[1][3][1] = 1;
			}
			
			for(int n=2; n<N+1; n++) {
				if(key[n] == 1) {
					dp[n][1][2] = dp[n-1][1][1]%10000;
					dp[n][1][1] = (dp[n-1][2][1]+dp[n-1][2][2]+dp[n-1][3][1]+dp[n-1][3][2])%10000;
				}
				else if(key[n] == 2) {
					dp[n][2][2] = dp[n-1][2][1]%10000;
					dp[n][2][1] = (dp[n-1][1][1]+dp[n-1][1][2]+dp[n-1][3][1]+dp[n-1][3][2])%10000;
				}
				else if(key[n] == 3) {
					dp[n][3][2] = dp[n-1][3][1]%10000;
					dp[n][3][1] = (dp[n-1][2][1]+dp[n-1][2][2]+dp[n-1][1][1]+dp[n-1][1][2])%10000;
				}
				else {
					dp[n][1][2] = dp[n-1][1][1]%10000;
					dp[n][1][1] = (dp[n-1][2][1]+dp[n-1][2][2]+dp[n-1][3][1]+dp[n-1][3][2])%10000;
					dp[n][2][2] = dp[n-1][2][1]%10000;
					dp[n][2][1] = (dp[n-1][1][1]+dp[n-1][1][2]+dp[n-1][3][1]+dp[n-1][3][2])%10000;
					dp[n][3][2] = dp[n-1][3][1]%10000;
					dp[n][3][1] = (dp[n-1][2][1]+dp[n-1][2][2]+dp[n-1][1][1]+dp[n-1][1][2])%10000;
				}
			}
			
			long ans = 0;
			for(int i=1; i<4; i++) {
				for(int j=1; j<3; j++) {
					ans += dp[N][i][j];
				}
			}
			System.out.println(ans%10000);
		}
	}

}


