import java.io.*;
import java.util.*;
import java.util.function.*;

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Supplier<String> sc) {
		int N = Integer.parseInt(sc.get());
		int[] A = new int[N];
		Arrays.setAll(A, $ -> Integer.parseInt(sc.get()));
		int[] forward = new int[N];
		forward[0] = A[0];
		for (int i = 1; i < N; i++) {
			forward[i] = gcd(forward[i - 1], A[i]);
		}
		int[] backward = new int[N];
		backward[backward.length - 1] = A[A.length - 1];
		for (int i = N - 2; i >= 0; i--) {
			backward[i] = gcd(backward[i + 1], A[i]);
		}

		int max = Math.max(forward[forward.length - 2], backward[1]);
		for (int i = 0; i < N - 2; i++) {
			max = Math.max(max, gcd(forward[i], backward[i + 2]));
		}
		System.out.println(max);
	}

	int gcd(int a, int b) {
		return b == 0 ? a : gcd(b, a % b);
	}
}

class Main {
	public static void main(String... args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Solver.INSTANCE.solve(new Supplier<String>() {
			StringTokenizer line;

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