import java.io.*;
import java.util.*;
import java.util.function.*;

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Supplier<String> sc) {
		int X = Integer.parseInt(sc.get());
		int Y = Integer.parseInt(sc.get());
		int abses = Math.abs(Y) - Math.abs(X);
		int[] ints = {
				Y < X ? Integer.MAX_VALUE : Y - X,
				Y < X && X < -Y ? Integer.MAX_VALUE : Math.abs(Y) - X + 1,
				X < Y && Y < -X ? Integer.MAX_VALUE :Y - Math.abs(X) + 1,
				abses < 0 ? Integer.MAX_VALUE : abses + 2
		};
		Arrays.sort(ints);
		for (int x : ints) {
			if (x >= 0) {
				System.out.println(x);
				return;
			}
		}
	}
}

class Main {
	public static void main(String... args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Solver.INSTANCE.solve(new Supplier<String>() {
			private StringTokenizer tokenizer;

			public String get() {
				try {
					return (tokenizer = tokenizer != null && tokenizer.hasMoreTokens() ? tokenizer : new StringTokenizer(reader.readLine())).nextToken();
				} catch (IOException e) {
					throw new UncheckedIOException(e);
				}
			}
		});
	}
}