import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int N = S.length();
		int mod = 13;
		int mod_num = 1_000_000_007;

		int[][] mod_table = new int[N][10];
		for (int j=0;j<10;j++) {
			mod_table[0][j] = j;
		}
		for (int i=0;i<N-1;i++) {
			for (int j=0;j<10;j++) {
				mod_table[i+1][j]=mod_table[i][j]*10%mod;
			}
		}

		int[] dp = new int[13];
		dp[0] = 1;
		for (int i=N-1;i>=0;i--) {
			int[] next_dp = new int[13];
			if (S.charAt(i) == '?') {
				for (int l=0;l<10;l++) {
					int k = l;
					for (int j=0;j<mod;j++) {
						next_dp[(mod_table[N-i-1][k] + j)%mod] += dp[j];
						next_dp[(mod_table[N-i-1][k] + j)%mod] %= mod_num;
					}
				}
			} else {
				int k = (int)S.charAt(i) - 48;
				for (int j=0;j<mod;j++) {
					next_dp[(mod_table[N-i-1][k] + j)%mod] += dp[j];
					next_dp[(mod_table[N-i-1][k] + j)%mod] %= mod_num;
				}
			}
			dp = next_dp;
		}
		// System.out.println(N);
		System.out.println(Arrays.toString(dp[6]));
		// System.out.println(Arrays.deepToString(mod_table));
	}
}