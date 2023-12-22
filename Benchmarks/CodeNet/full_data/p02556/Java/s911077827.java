import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
import java.util.function.*;

final class Point{
	int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

final class Solver {
	void solve(Supplier<String> sc) {
		int N = Integer.parseInt(sc.get());
		var points = new Point[N];
		var che = new Point[N];
		for (int i = 0; i < points.length; i++) {
			int x = Integer.parseInt(sc.get());
			int y = Integer.parseInt(sc.get());
			points[i] = new Point(x, y);
			che[i] = new Point(x + y, x - y);
		}

		var sortedByX = Arrays.copyOf(che, N);
		var sortedByY = Arrays.copyOf(che, N);
		Arrays.sort(sortedByX, Comparator.comparingInt(p -> p.x));
		Arrays.sort(sortedByY, Comparator.comparingInt(p -> p.y));
		System.out.println(Math.max(sortedByX[N - 1].x - sortedByX[0].x, sortedByY[N - 1].y - sortedByY[0].y));
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