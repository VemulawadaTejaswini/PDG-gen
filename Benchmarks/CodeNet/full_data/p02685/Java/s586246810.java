import java.io.*;
import java.lang.reflect.*;
import java.util.*;
import java.util.function.*;

final class Solver {
	static final Solver INSTANCE = new Solver();
	private int N;

	void solve(Supplier<String> sc) {
		N = Integer.parseInt(sc.get());
		int M = Integer.parseInt(sc.get());
		int K = Integer.parseInt(sc.get());
		init();
		int sum = 0;
		for (int i = 0; i <= K; i++) {
			long edge = ncr(N - 1, i); // 色変えポイントどれを選ぶか
			sum = (int) ((sum + (edge * (M * modpow(M - 1, N - 1 - i, MOD) % MOD)) % MOD) % MOD);
		}
		System.out.println(sum);
	}

	long modpow(long a, long n, long mod) {
		long res = 1;
		while (n > 0) {
			if (n % 2 == 1) res = res * a % mod;
			a = a * a % mod;
			n /= 2;
		}
		return res;
	}

	static final int MOD = 998244353;

	long[] factorial;
	long[] facInverse;
	long[] inverse ;

	void init() {
		int MAX = N + 2;
		factorial = new long[MAX];
		facInverse = new long[MAX];
		inverse = new long[MAX];
	    factorial[0] = factorial[1] = 1;
	    facInverse[0] = facInverse[1] = 1;
	    inverse[1] = 1;
	    for (int i = 2; i < MAX; i++) {
	        factorial[i] = factorial[i - 1] * i % MOD;
	        long inv = inverse[i] = MOD - inverse[MOD % i] * (MOD / i) % MOD;
	        facInverse[i] = facInverse[i - 1] * inv % MOD;
	    }
	}

	long ncr(int n, int r) {
	    if (n < r) return 0;
	    if (n < 0 || r < 0) return 0;
	    return factorial[n] * (facInverse[r] * facInverse[n - r] % MOD) % MOD;
	}
}

class Main {
	public static void main(String... args) {
		System.setOut(new PrintStream(new BufferedOutputStream(System.out)));
		var reader = new BufferedReader(new InputStreamReader(System.in));
		Solver.INSTANCE.solve(new Supplier<>() {
			StringTokenizer line;

			public String get() {
				while (line == null || !line.hasMoreTokens()) try {
					line = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
					throw new UncheckedIOException(e);
				}
				return line.nextToken();
			}
		});
		System.out.flush();
	}
}