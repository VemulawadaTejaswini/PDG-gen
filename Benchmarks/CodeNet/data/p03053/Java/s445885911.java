import java.io.*;
import java.util.*;
import java.util.function.*;

class Pair{
	int x, y;

	Pair(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Supplier<String> sc) {
		int H = Integer.parseInt(sc.get());
		int W = Integer.parseInt(sc.get());
		List<Pair> blacks = new ArrayList<>();
		for (int i = 0; i < H; i++) {
			char[] data = sc.get().toCharArray();
			for (int j = 0; j < data.length; j++) {
				if (data[j] == '#'){
					blacks.add(new Pair(i, j));
				}
			}
		}

		int[][] nearestBlack = new int[H][W];
		{
			int[] row = new int[W];
			Arrays.fill(row, Integer.MAX_VALUE);
			Arrays.setAll(nearestBlack, $ -> Arrays.copyOf(row, row.length));
		}
		for (Pair black : blacks) {
			for (int i = 0; i < H; i++) {
				for (int j = 0; j < W; j++) {
					nearestBlack[i][j] = Math.min(nearestBlack[i][j], Math.abs(i - black.x) + Math.abs(j - black.y));
				}
			}
		}
		int max = 0;
		for (int[] ints : nearestBlack) {
			for (int l : ints) {
				max = Math.max(max, l);
			}
		}
		System.out.println(max);
	}
}

class Main {
	public static void main(String... args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Solver.INSTANCE.solve(new Supplier<String>() {
			StringTokenizer line;

			public String get() {
				try {
					return (line = line != null && line.hasMoreTokens() ? line : new StringTokenizer(reader.readLine())).nextToken();
				} catch (IOException e) {
					throw new UncheckedIOException(e);
				}
			}
		});
	}
}