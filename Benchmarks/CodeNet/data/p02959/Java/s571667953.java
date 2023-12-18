import java.io.*;
import java.util.*;
import java.util.function.*;

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Supplier<String> sc) {
		int N = Integer.parseInt(sc.get());
		int[] A = new int[N + 1];
		Arrays.setAll(A, $ -> Integer.parseInt(sc.get()));
		int[] B = new int[N];
		Arrays.setAll(B, $ -> Integer.parseInt(sc.get()));

		int count = 0;
		int remainder = 0;
		for (int i = 0; i < N; i++) {
			int prev = Math.min(A[i], remainder);
			int current = Math.min(A[i] - prev, B[i]);
			remainder = B[i] - current;
			count += prev + current;
		}

		System.out.println(count + Math.min(remainder, A[N]));
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