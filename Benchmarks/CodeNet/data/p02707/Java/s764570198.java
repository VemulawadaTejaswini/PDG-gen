import java.io.*;
import java.util.*;
import java.util.function.*;

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Supplier<String> sc) {
		int N = Integer.parseInt(sc.get());
		int[] A = new int[N];
		for(int i = 1; i < N; i++) {
			int a = Integer.parseInt(sc.get()) - 1;
			A[a] += 1;
		}

		StringJoiner joiner = new StringJoiner("\n");
		for (int x : A) {
			joiner.add(String.valueOf(x));
		}
		System.out.println(joiner.toString());
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