import java.io.*;
import java.util.*;
import java.util.function.*;

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Supplier<String> sc) {
		String S = sc.get();
		char[] chars = S.toCharArray();
		for (int i = 0; i < chars.length - 3; i++) {
			int c0 = chars[i];
			int c1 = chars[i + 1];
			int c2 = chars[i + 2];
			if (c0 != c1 || c1 == c2) if (c0 != c2) continue;
			System.out.printf("%d %d%n", i + 1, i + 3 + 1);
			return;
		}
		System.out.println("-1 -1");
	}
}

class Main {
	public static void main(String... args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Solver.INSTANCE.solve(new Supplier<String>() {
			StringTokenizer line;

			public String get() {
				try {
					return (line = line != null && line.hasMoreTokens() ? line : new StringTokenizer(reader.readLine())).nextToken();
				} catch (IOException e) {
					throw new UncheckedIOException(e);
				}
			}
		});
	}
}