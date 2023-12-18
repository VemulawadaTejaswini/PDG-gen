import java.io.*;
import java.util.*;
import java.util.function.*;

final class Solver {
	static final Solver INSTANCE = new Solver();

	long solve(Supplier<String> sc) {
		long X = Long.parseLong(sc.get());
		long rem = X % 11;
		return -Math.floorDiv(-X, 11) * 2 - (rem <= 6 && 0 < rem ? 1 : 0);
	}
}

class Main {
	public static void main(String... args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(Solver.INSTANCE.solve(new Supplier<String>() {
			private StringTokenizer tokenizer;

			public String get() {
				try {
					return (tokenizer = tokenizer != null && tokenizer.hasMoreTokens() ? tokenizer : new StringTokenizer(reader.readLine())).nextToken();
				} catch (IOException e) {
					throw new UncheckedIOException(e);
				}
			}
		}));
	}
}