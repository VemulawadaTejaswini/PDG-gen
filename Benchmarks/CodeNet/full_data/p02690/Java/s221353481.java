import java.io.*;
import java.math.*;
import java.util.*;
import java.util.function.*;

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Supplier<String> sc) {
		int X = Integer.parseInt(sc.get());
		for (long i = 0; i < 1000; i++) {
			for (long j = 0; j < 1000; j++) {
				var a5 = BigInteger.valueOf(i).pow(5);
				var b5 = BigInteger.valueOf(j).pow(5);
				if (a5.subtract(b5).intValue() == X) {
					System.out.printf("%d %d\n", i, j);
					return;
				}
				if (a5.add(b5).intValue() == X) {
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