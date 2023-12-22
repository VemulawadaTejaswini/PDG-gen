import java.io.*;
import java.util.*;
import java.util.function.*;

final class Solver {
	void solve(Supplier<String> sc) {
		int N = Integer.parseInt(sc.get());
		int K = Integer.parseInt(sc.get());
		int[] A = new int[N];
		Arrays.setAll(A, $ -> Integer.parseInt(sc.get()));
		Arrays.sort(A);

		int minus = 0;
		int plus = 0;
		for (int value : A) {
			if (value > 0) {
				plus += 1;
			} else if (value < 0) {
				minus += 1;
			}
		}

		if (plus == 0 && K % 2 != 0) {
			Integer[] abs = new Integer[N];
			Arrays.setAll(abs, i -> A[i]);
			Arrays.sort(abs, Comparator.comparingInt(Math::abs));

			int heaven = 1;
			for (int i = 0; i < K; i++) {
				heaven = mul(heaven, abs[i]);
			}
			System.out.println(heaven);
			return;
		}


		int result = 1;
		int count = 0;
		int r = A.length - 1;
		minpul:for (int l = 0; l < A.length - 1; l += 2) {
			int minus1 = A[l];
			int minus2 = A[l + 1];

			long mulmin = (long) minus1 * minus2;
			while (true) {
				if (r <= l || r - 1 <= l + 1) break minpul;

				if (count >= K) break minpul;

				int plus1 = A[r];
				int plus2 = A[r - 1];

				long mulpul = (long) plus1 * plus2;
				if (mulmin < mulpul){
					result = mul(result, plus1);
					count += 1;
					r -= 1;
				} else {
					break;
				}
			}

			result = mul(result, mod(mulmin));
			count += 2;
		}

		System.out.println(result);
	}

	static final int MOD = 1000000007;

	int mod(long val) {
		return Math.floorMod(val, MOD);
	}

	int add(long a, long b) {
		return mod(a + b);
	}

	int sub(long a, long b) {
		return add(a, -b);
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
}

class Main {
	public static void main(String... args) {
		System.setOut(new PrintStream(new BufferedOutputStream(System.out)));
		var reader = new BufferedReader(new InputStreamReader(System.in));
		new Solver().solve(new Supplier<>() {
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