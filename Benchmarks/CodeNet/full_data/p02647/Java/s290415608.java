import java.io.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Supplier<String> sc) {
		int N = Integer.parseInt(sc.get());
		int K = Integer.parseInt(sc.get());
		int[] A = new int[N];
		Arrays.setAll(A, $ -> Integer.parseInt(sc.get()));

		for (int t = 0; t < K; t++) {
			int[] range = new int[N + 2];
			for (int i = 0; i < N; i++) {
				var d = A[i];
				var from = i - d + 1;
				var to = i + d + 2;
				range[Math.max(0, from)]++;
				if (to <= N) range[to]--;
			}

			int[] B = new int[N + 2];
			B[0] = range[0];
			for (int i = 1; i < range.length; i++) {
				B[i] = B[i - 1] + range[i];
			}
			System.arraycopy(B, 1, A, 0, N);
			
			if (Arrays.stream(A).allMatch(i -> i == N)) {
				break;
			}
		}

		StringJoiner joiner = new StringJoiner(" ");
		for (int i = 0; i < N; i++) {
			joiner.add(String.valueOf(A[i]));
		}
		System.out.println(joiner);
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