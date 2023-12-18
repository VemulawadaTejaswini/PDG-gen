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

		long c = modpow(2, n, 1000000007) - 1;

		c -= (c(n, a, 1000000007) + c(n, b, 1000000007)) % 1000000007;

		System.out.println(c % 1000000007);
	}

	static long c(long n, long k, long mod) {
		long p = 1;
		long q = 1;
		for (long i = 0; i < k; i++) {
			p = p * (n - i) % mod;
			q = q * (i + 1) % mod;
		}
		return p * modpow(q, mod - 2, mod) % mod;
	}

	static long modpow(long a, long n, long mod) {
		long res = 1;
		while (n > 0) {
			if ((n & 1) == 1)
				res = res * a % mod;
			a = a * a % mod;
			n >>= 1;
		}
		return res;
	}

}
