import java.io.*;
import java.util.*;
import java.util.function.*;

final class Solver {
	void solve(Supplier<String> sc) {
		int N = Integer.parseInt(sc.get());
		int[] count = new int[N + 1];
		for (int x = 1; x <= 100; x++) {
			for (int y = 1; y <= 100; y++) {
				for (int z = 1; z <= 100; z++) {
					var res = (long) x * x + y * y + z * z + x * y + y * z + z * x;
					if (0 < res && res < count.length) count[(int) res]++;
				}
			}
		}
		for (int i = 1; i < count.length; i++) {
			System.out.println(count[i]);
		}
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