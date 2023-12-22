import java.io.*;
import java.util.*;
import java.util.function.*;

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Supplier<String> sc) {
		int A = Integer.parseInt(sc.get());
		int B = Integer.parseInt(sc.get());
		int H = Integer.parseInt(sc.get());
		int M = Integer.parseInt(sc.get());
		long minutes = H * 60L + M;
		double degH = minutes / 12.;
		double degM = minutes;
		var deg = Math.abs(degH - degM) * Math.PI / 30;
		var x2 = A * A + B * B - 2 * A * B * Math.cos(deg);
		System.out.printf("%.11f", Math.pow(x2, 0.5));
		System.out.println();
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