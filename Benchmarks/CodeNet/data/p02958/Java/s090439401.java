import java.io.*;
import java.util.*;
import java.util.function.*;

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Supplier<String> sc) {
		int N = Integer.parseInt(sc.get());
		int[] P = new int[N];
		Arrays.setAll(P, $ -> Integer.parseInt(sc.get()));

		int[] sorted = Arrays.copyOf(P, N);
		Arrays.sort(sorted);

		int difference = 0;
		for (int i = 0; i < N; i++) {
			if (P[i] != sorted[i]) difference += 1;
		}

		System.out.println(difference <= 2 ? "YES" : "NO");
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