import java.io.*;
import java.util.*;
import java.util.function.*;

final class Solver {
	void solve(Supplier<String> sc) {
		long A = Integer.parseInt(sc.get());
		long B = Integer.parseInt(sc.get());
		long C = Integer.parseInt(sc.get());
		int K = Integer.parseInt(sc.get());
		while (A >= B) {
			B *= 2;
			K -= 1;
		}
		while (B >= C) {
			C *= 2;
			K -= 1;
		}
		System.out.println(K < 0 ? "No": "Yes");
	}
}

class Main {
	public static void main(String... args) {
		System.setOut(new PrintStream(new BufferedOutputStream(System.out)));
		var reader = new BufferedReader(new InputStreamReader(System.in));
		new Solver().solve(new Supplier<>() {
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