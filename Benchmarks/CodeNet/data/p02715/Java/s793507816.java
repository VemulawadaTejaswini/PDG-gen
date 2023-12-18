import java.io.*;
import java.util.*;
import java.util.function.*;

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Supplier<String> sc) {
		int N = Integer.parseInt(sc.get());
		int K = Integer.parseInt(sc.get());
		var mod = 1000000007;
		long sum = 0;
		var ints = new long[K];
		for (int i = K; i >= 1; i--) {
			int count = 0;
			long minus = 0;
			for (int j = i; j <= K; j+=i) {
				if (j % i != 0) continue;
				count += 1;
				minus = (minus + ints[j - 1]) % mod;
			}
			long pow = (modpow(count, N, mod) - minus) % mod;
			ints[i - 1] = pow = pow < 0 ? pow + mod : pow;
			sum = (sum + ((i * pow) % mod)) % mod;
		}
		System.out.println(sum % mod);
	}

	int gcd(int a, int b) {
	    return b == 0 ? a : gcd(b, a % b);
	}

	long modpow(long a, long n, long mod) {
		long res = 1;
		while (n > 0) {
			if ((n & 1) == 1) res = res * a % mod;
			a = a * a % mod;
			n >>= 1;
		}
		return res;
	}
}

class Main {
	public static void main(String... args) {
		var reader = new BufferedReader(new InputStreamReader(System.in));
		Solver.INSTANCE.solve(new Supplier<>() {
			private StringTokenizer line;

			public String get() {
				try {
					return (line = line != null && line.hasMoreTokens() ? line : new StringTokenizer(reader.readLine())).nextToken();
				} catch (IOException e) {
					throw new UncheckedIOException(e);
				}
			}
		});
	}
}