import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		int sum = 0;
		for(int i=0; i<N; i++) {
			a[i] = sc.nextInt();
			sum += a[i];
		}

		final long MOD = 998244353;

		long[][] dp = new long[2][sum+1];
		dp[0][0] = 1;
		int flg=0;
		for(int i=0; i<N; i++) {
			Arrays.fill(dp[flg^1], 0);
			for(int j=0; j<=sum; j++) {
				dp[flg^1][j] = (dp[flg^1][j] + dp[flg][j]*2) %MOD;
				if(j+a[i]<=sum)
					dp[flg^1][j+a[i]] = (dp[flg^1][j+a[i]] + dp[flg][j]) %MOD;
			}
			flg ^= 1;
		}
		long over = 0;
		for(int i=(sum+1)/2; i<=sum; i++)
			over = (over + dp[flg][i])%MOD;
		
		long ans = 1;
		for(int i=0; i<N; i++)
			ans = (ans * 3) % MOD;
		
		ans = (ans - over*3 + MOD*3) % MOD;
		if(sum%2==0) {
			long[][] dp2 = new long[2][sum/2+1];
			dp2[0][0] = 1;
			flg=0;
			for(int i=0; i<N; i++) {
				Arrays.fill(dp2[flg^1], 0);
				for(int j=0; j<=sum/2; j++) {
					dp2[flg^1][j] = (dp2[flg^1][j] + dp2[flg][j]) %MOD;
					if(j+a[i]<=sum/2)
						dp2[flg^1][j+a[i]] = (dp2[flg^1][j+a[i]] + dp2[flg][j]) %MOD;
				}
				flg ^= 1;
			}
			ans = (ans + dp2[flg][sum/2]*3 + MOD*3) % MOD;

		}
		System.out.println(ans);
		sc.close();
	}
}
