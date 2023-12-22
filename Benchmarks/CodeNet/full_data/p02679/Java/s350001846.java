import java.io.*;
import java.util.*;
import java.util.function.*;

class Iwashi {
	long a, b;

	Iwashi(long a, long b) {
		this.a = a;
		this.b = b;
	}
}

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Supplier<String> sc) {
		int N = Integer.parseInt(sc.get());
		Iwashi[] iwashis = new Iwashi[N];
		for (int i = 0; i < N; i++) {
			long A = Long.parseLong(sc.get());
			long B = Long.parseLong(sc.get());
			iwashis[i] = new Iwashi(A, B);
		}

		initFactorial(N + 2);

		var bad = 0;

		for (int i = 0; i < iwashis.length; i++) {
			double ApB = 1. * iwashis[i].a / iwashis[i].b;
			for (int j = i + 1; j < iwashis.length; j++) {
				if (Math.abs(ApB - (-1. * iwashis[j].b / iwashis[j].a)) < Math.ulp(ApB) * 5) {
					bad = add(bad, 1);
				}
			}
		}
		System.out.println(sub(sub(pow(2, N), 1), mul(bad, pow(2, N - 2))));
	}

	static final int MOD = 1000000007;
	int mod(long val) {
		return Math.floorMod(val, MOD);
	}

	int add(long a, long b) {
		return mod(a + b);
	}

	int sub(long a, long b) {
		var add = add(a, -b);
		if (add < 0) add += MOD;
		return add;
	}

	int mul(long a, long b) {
		return mod(a * b);
	}

	int pow(long a, long n) {
		int res = 1;
		for (; n > 0; n /= 2) {
			if (n % 2 == 1) res = mul(res, a);
			a = mul(a, a);
		}
		return res;
	}

	long[] factorial;
	long[] invFactorial;
	long[] inverse;

	void initFactorial(int max) {
		factorial = new long[max];
		invFactorial = new long[max];
		inverse = new long[max];
		factorial[0] = factorial[1] = 1;
		invFactorial[0] = invFactorial[1] = 1;
		inverse[1] = 1;
		for (int i = 2; i < max; i++) {
			factorial[i] = mul(factorial[i - 1], i);
			long inv = inverse[i] = sub(MOD, mul(inverse[MOD % i], MOD / i));
			invFactorial[i] = mul(invFactorial[i - 1], inv);
		}
	}

	int div(long a, int b) {
		return mul(a, inverse != null && b < inverse.length ? inverse[b] : pow(b, MOD - 2));
	}

	int ncr(int n, int r) {
		if (n < r) return 0;
		if (n < 0 || r < 0) return 0;
		return mul(factorial[n], mul(invFactorial[r], invFactorial[n - r]));
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