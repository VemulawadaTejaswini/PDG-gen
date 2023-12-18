import java.io.*;
import java.util.*;
import java.util.function.*;

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Supplier<String> sc) {
		int N = Integer.parseInt(sc.get());
		int[] A = new int[N];
		Arrays.setAll(A, $ -> Integer.parseInt(sc.get()));
		var R = new int[1000000000];

		for (int i = 0; i < A.length; i++) {
			var r = i - A[i];
			if (r < 0) continue;
			R[r]++;
		}

		int count = 0;
		for (int i = 0; i < A.length; i++) {
			var l = i + A[i];
			if (l >= R.length || l < 0) continue;
			count += R[l];
		}

		System.out.println(count);
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