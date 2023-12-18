import java.io.*;
import java.util.*;
import java.util.function.*;

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Supplier<String> sc) {
		int N = Integer.parseInt(sc.get());
		int M = Integer.parseInt(sc.get());
		int[] A = new int[M];
		Arrays.setAll(A, $ -> Integer.parseInt(sc.get()));
		int sum = 0;
		for (int a : A) {
			sum += a;
		}
		System.out.println(Math.max(-1, N - sum));
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