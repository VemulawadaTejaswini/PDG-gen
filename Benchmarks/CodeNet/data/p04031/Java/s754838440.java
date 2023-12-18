import java.io.*;
import java.util.*;
import java.util.function.*;

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Supplier<String> sc) {
		int N = Integer.parseInt(sc.get());
		int[] A = new int[N];
		Arrays.setAll(A, $ -> Integer.parseInt(sc.get()));
		long round = Math.round(Arrays.stream(A).average().orElseThrow(RuntimeException::new));
		System.out.println(Arrays.stream(A).mapToLong(x -> (x - round) * (x - round)).sum());
	}
}

class Main {
	public static void main(String... args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Solver.INSTANCE.solve(new Supplier<String>() {
			private StringTokenizer tokenizer;

			public String get() {
				try {
					return (tokenizer = tokenizer != null && tokenizer.hasMoreTokens() ? tokenizer : new StringTokenizer(reader.readLine())).nextToken();
				} catch (IOException e) {
					throw new UncheckedIOException(e);
				}
			}
		});
	}
}