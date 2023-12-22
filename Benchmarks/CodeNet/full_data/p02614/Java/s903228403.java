import java.io.*;
import java.util.*;
import java.util.function.*;

final class Solver {
	void solve(Supplier<String> sc) {
		int H = Integer.parseInt(sc.get());
		int W = Integer.parseInt(sc.get());
		int K = Integer.parseInt(sc.get());
		var grid = new char[H][W];
		for (int i = 0; i < H; i++) {
			var row = sc.get().toCharArray();
			grid[i] = row;
		}

		int result = 0;
		for (int i = 0; i < 1 << H; i++) {
			for (int j = 0; j < 1 << W; j++) {
				int count = 0;
				for (int y = 0; y < H; y++) {
					if ((i & 1 << y) == 0) continue;
					for (int x = 0; x < W; x++) {
						if ((j & 1 << x) == 0) continue;
						if (grid[y][x] == '#') {
							count++;
						}
					}
				}
				if (count == K) result++;
			}
		}
		System.out.println(result);
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