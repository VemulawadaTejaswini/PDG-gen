import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		long n = Long.parseLong(str[0]);
		long a = Long.parseLong(str[1]);
		long b = Long.parseLong(str[2]);

		int all = (int) modpow(2, n, 1000000007) - 1;
		int muri = (int) c(n, a, 1000000007) + (int) c(n, b, 1000000007);

		int ans = all - muri;
		while (ans < 0) {
			ans += 1000000007;
		}

		System.out.println(ans);
	}

	static long c(long n, long k, long mod) {
		long x = 1;
		for (long i = n - k + 1; i <= n; i++) {
			x = x * i % mod;
		}

		long y = 1;
		for (int i = 1; i <= k; i++) {
			y = y * i % mod;
		}
		y = modpow(y, mod - 2, mod);

		return x * y % mod;
	}

	static long modpow(long a, long n, long mod) {
		long res = 1;
		while (n > 0) {
			if ((n & 1) == 1)
				res = res * a % mod;
			a = a * a % mod;
			n >>= 1;
		}
		return res % mod;
	}

}
