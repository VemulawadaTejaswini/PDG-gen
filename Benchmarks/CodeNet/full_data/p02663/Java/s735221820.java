import java.io.*;
import java.util.*;
import java.util.function.*;

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Supplier<String> sc) {
		int H1 = Integer.parseInt(sc.get());
		int M1 = Integer.parseInt(sc.get());
		int H2 = Integer.parseInt(sc.get());
		int M2 = Integer.parseInt(sc.get());
		int K = Integer.parseInt(sc.get());
		var hour = H2 - H1;
		var minutes = M2 - M1;
		System.out.println(hour * 60 + minutes - K);
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