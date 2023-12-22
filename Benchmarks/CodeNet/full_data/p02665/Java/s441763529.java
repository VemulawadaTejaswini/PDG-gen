import java.io.*;
import java.util.*;
import java.util.function.*;

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Supplier<String> sc) {
		int N = Integer.parseInt(sc.get());
		int[] A = new int[N + 1];
		Arrays.setAll(A, $ -> Integer.parseInt(sc.get()));


		var cum = new long[N + 1];
		cum[0] = A[0];
		for (int i = 1; i < A.length; i++) {
			cum[i] = cum[i - 1] + A[i];
		}

		long parent = 1 - A[0];
		long sum = A[N] + 1;
		for (int i = 1; i < A.length - 1; i++) {
			var min = Math.min(parent * 2, cum[N] - cum[i - 1]);
			if (min <= 0) {
				System.out.println(-1);
				return;
			}
			parent = min - A[i];
			sum += min;
		}
		if (parent < A[N]){
			System.out.println(-1);
			return;
		}

		System.out.println(sum);
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