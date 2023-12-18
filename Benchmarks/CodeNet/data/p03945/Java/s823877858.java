import java.io.*;
import java.util.*;
import java.util.function.*;

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Supplier<String> sc) {
		char[] S = sc.get().toCharArray();
		int count = 0;
		for (int i = 1; i < S.length; i++) {
			if (S[i - 1] != S[i]) count += 1;
		}
		System.out.println(count);
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