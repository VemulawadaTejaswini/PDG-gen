import java.io.*;
import java.util.*;
import java.util.function.*;

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Supplier<String> sc) {
		int K = Integer.parseInt(sc.get());
		int A = Integer.parseInt(sc.get());
		int B = Integer.parseInt(sc.get());
		var b = B / K;
		var a = (A - 1) / K;
		System.out.println(b - a > 0 ? "OK" : "NG");
	}
}

class Main {
	public static void main(String... args) {
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
	}
}