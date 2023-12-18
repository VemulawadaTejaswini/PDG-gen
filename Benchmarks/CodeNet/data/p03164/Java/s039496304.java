import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int W = sc.nextInt();
		long[] w = new long[N];
		int[] v = new int[N];
		int sum = 0;
		for(int i = 0; i < N; i++) {
			w[i] = sc.nextInt();
			v[i] = sc.nextInt();
			sum += v[i];
		}
		long[][] dp = new long[N+1][sum+1];
		for(int i = 0; i <= N; i++)
			Arrays.fill(dp[i], 1_000_000_000_000L);
		dp[0][0] = 0;
		for(int i = 1; i <= N; i++) {
			for(int j = 0; j <= sum; j++)
				dp[i][j] = Math.min(dp[i][j], dp[i-1][j]);
			for(int j = 0; j <= sum; j++) {
				if(j+v[i-1] <= sum)
					dp[i][j+v[i-1]] = Math.min(dp[i-1][j+v[i-1]], dp[i-1][j] + w[i-1]);
			}
		}
		long ans = 0;
		for(int i = 0; i <= sum; i++)
			if(dp[N][i] <= W)
				ans = i;
		System.out.println(ans);

	}

}
