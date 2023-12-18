import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long[] a = new long[n];
		for (int i = 0; i < n; i++)
			a[i] = in.nextLong();

		long mod = (int)1e9 + 7;
		long[][] cs = new long[60][n + 1];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 60; j++)
				cs[j][i] = (a[i] & (1 << j));
		}
		for (int i = 0; i < 60; i++)
			for (int j = 1; j <= n; j++)
				cs[i][j] += cs[i][j - 1];

		long ans = 0;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < 60; j++) {
				long cnt = cs[j][n] - cs[j][i];
				if ((a[i] & (1 << j)) == 0) {
					cnt = (cnt * (1 << j)) % mod;
					ans += cnt;
					ans %= mod;
				}
				else {
					cnt = (n - i) - cnt;
					cnt = (cnt * (1 << j)) % mod;
					ans += cnt;
					ans %= mod;
				}
			}
		
		System.out.println(ans);
	}
}
