import java.io.*;
import java.util.*;
import java.util.function.*;

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Supplier<String> sc) {
		int X = Integer.parseInt(sc.get());
		for (long i = 0; i < 100; i++) {
			for (long j = 0; j < 100; j++) {
				var a5 = i * i * i * i * i;
				var b5 = j * j * j * j * j;
				if (a5 - b5 == X) {
					System.out.printf("%d %d\n", i, j);
					return;
				}
				if (a5 + b5 == X) {
					System.out.printf("%d %d\n", i, -j);
					return;
				}
			}
		}
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