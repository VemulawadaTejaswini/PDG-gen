import java.util.*;

public class Main  {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		long mod = 1000000007;
		int x[] = new int[n];
		int y[] = new int[m];
		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
		}
		for (int i = 0; i < m; i++) {
			y[i] = sc.nextInt();
		}
		long X = 0;
		for (int i = 0; i < n - 1; i++) {
			X = (X + (i + 1L) * (n - i - 1) * (x[i+1] - x[i])) % mod;
		}
		long ans = 0;
		for (int i = 0; i < m - 1; i++) {
			ans = (ans + (((i + 1) * (m - i - 1) * (y[i+1] - y[i]))%mod) * X) % mod;
		}
		System.out.println(ans);
	}
}
