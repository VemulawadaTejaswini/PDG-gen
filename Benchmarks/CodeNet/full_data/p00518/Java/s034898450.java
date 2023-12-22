import java.util.Scanner;

public class Main {
	public static int MOD = 10007;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[] s = sc.next().toCharArray();
		for(int i=0;i<n;i++) {
			if (s[i] == 'J') {
				s[i] = 0;
			}else if(s[i] == 'O') {
				s[i] = 1;
			}else{
				s[i] = 2;
			}
		}
		int[][] dp = new int[n+1][8];
		dp[0][1] = 1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<8;j++) {
				if ((j >> s[i-1] & 1) == 0) {
					continue;
				}
				for(int k=1;k<8;k++) {
					if ((j & k) == 0) {
						continue;
					}
					dp[i][j] += dp[i-1][k];
					dp[i][j] %= MOD;
				}
			}
		}
		int ans = 0;
		for(int i=0;i<8;i++) {
			ans = (ans + dp[n][i]) % MOD;
		}
//		System.out.println(Arrays.deepToString(dp));
		System.out.println(ans);
	}

}