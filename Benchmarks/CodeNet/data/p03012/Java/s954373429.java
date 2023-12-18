import java.io.*;
import java.util.*;
import java.util.function.*;

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Supplier<String> sc) {
		int N = Integer.parseInt(sc.get());
		int[] W = new int[N];
		Arrays.setAll(W, $ -> Integer.parseInt(sc.get()));

		int[] cum = new int[N];
		cum[0] = W[0];
		for (int i = 1; i < W.length; i++) {
			cum[i] = cum[i - 1] + W[i];
		}

		int min = Integer.MAX_VALUE;
		for (int i = 0; i < W.length; i++) {
			int lower = cum[i];
			int upper = cum[N - 1] - cum[i];
			min = Math.min(min, Math.abs(upper - lower));
		}
		System.out.println(min);
	}
}

class Main {
	public static void main(String... args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Solver.INSTANCE.solve(new Supplier<String>() {
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