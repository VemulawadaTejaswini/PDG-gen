import java.io.*;
import java.util.*;
import java.util.function.*;

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Supplier<String> sc) {
		int N = Integer.parseInt(sc.get());
		int K = Integer.parseInt(sc.get());
		int mod = 1000000007;

		int sum = 0;
		for (int i = K; i <= N + 1; i++) {
			var max = seqsum(N + 1 - i, N, i);
			var min = seqsum(0, i - 1, i);
			sum = Math.toIntExact((sum + (max - min) + 1) % mod);
		}
		System.out.println(sum);
	}

	long seqsum(int a, int l, long n) {
		return (a + l) * n / 2;
	}
}

class Main {
	public static void main(String... args) {
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
	}
}