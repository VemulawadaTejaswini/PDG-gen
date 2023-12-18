import java.io.*;
import java.util.*;
import java.util.function.*;

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Supplier<String> sc) {
		int A = Integer.parseInt(sc.get());
		int B = Integer.parseInt(sc.get());
		int X = Integer.parseInt(sc.get());
		double height = 1. * X / A / A;
		double result;
		if (height <= 0.5 * B){
			result = Math.atan2(B, 2. * X / B / A);
		} else {
			result = Math.atan2(B - height, 0.5 * A);
		}
		System.out.printf("%.10f",Math.toDegrees(result));
		System.out.println();
	}
}

class Main {
	public static void main(String... args) {
		System.setOut(new PrintStream(new BufferedOutputStream(System.out)));
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Solver.INSTANCE.solve(new Supplier<String>() {
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