import java.io.*;
import java.util.*;
import java.util.function.*;

final class Solver {
	void solve(Supplier<String> sc) {
		long X = Long.parseLong(sc.get());
		long K = Long.parseLong(sc.get());
		long D = Long.parseLong(sc.get());
		var floor = Math.floorDiv(X, D);
		var ceil = -Math.floorDiv(-X, D);
		if (Math.abs(floor) > K) {
			System.out.println(Math.abs(X - (floor < 0 ? -1 : 1) * K * D));
			return;
		}
		var floorDistance = Math.abs(X - floor * D);
		var ceilDistance = Math.abs(X - ceil * D);
		if (Math.abs(ceil) > K) {
			System.out.println(floorDistance);
		} else if ((K - floor) % 2 == 0) {
			System.out.println(floorDistance);
		} else if ((K - ceil) % 2 == 0) {
			System.out.println(ceilDistance);
		} else {
			System.out.println(D + Math.min(floorDistance, ceilDistance));
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