import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	static long dp[][];

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		String str[] = br.readLine().split(" ");
		int a[] = new int[n];
		dp = new long[n + 1][n + 1];

		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(str[i]);
		}

		long s[] = new long[n];
		s[0] = a[0];

		for (int i = 0; i < n - 1; i++) {
			s[i + 1] = s[i] + a[i + 1];
		}
		for (int i = 0; i < dp.length; i++) {
			Arrays.fill(dp[i], -1);
		}
		System.out.println(solve(0, n - 1, s, a));
	}

	static long solve(int l, int r, long s[], int a[]) {
		if (l >= r)
			return 0;
		if (dp[l][r] != -1)
			return dp[l][r];
		long ans = Long.MAX_VALUE;
		for (int k = l; k < r; k++) {
			ans = Math.min(ans, solve(l, k, s, a) + solve(k + 1, r, s, a) + sum(l, r, a));
		}
		return dp[l][r] = ans;
	}

	static long sum(int i, int j, int arr[]) {
		long ans = 0;
		for (int k = i; k <= j; k++) {
			ans += arr[k];
		}
		return ans;
	}
}
