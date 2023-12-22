import java.io.*;
import java.util.*;
import java.util.function.*;

final class Solver {
	void solve(Supplier<String> sc) {
		long a = Long.parseLong(sc.get());
		long b = Long.parseLong(sc.get());
		long c = Long.parseLong(sc.get());
		long d = Long.parseLong(sc.get());
		var max = Math.max(a * c, Math.max(a * d, Math.max(b * c, b * d)));
		if (a * b < 0 || c * d < 0) max = Math.max(max, 0);
		System.out.println(max);
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