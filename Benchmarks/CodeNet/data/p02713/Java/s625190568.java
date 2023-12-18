import java.io.*;
import java.util.*;
import java.util.function.*;

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Supplier<String> sc) {
		int K = Integer.parseInt(sc.get());
		long sum = 0;
		for (int a = 1; a <= K; a++) {
			for (int b = 1; b <= K; b++) {
				int ab = gcd(a, b);
				for (int c = 1; c <= K; c++) {
					sum += gcd(ab, c);
				}
			}
		}
		System.out.println(sum);
	}

	int gcd(int a, int b) {
	    return b == 0 ? a : gcd(b, a % b);
	}
}

class Main {
	public static void main(String... args) {
		var reader = new BufferedReader(new InputStreamReader(System.in));
		Solver.INSTANCE.solve(new Supplier<>() {
			private StringTokenizer line;

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