import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	static final int INF = 9999999;
	static int h;
	static int w;
	static int[][] table;
	static Queue<int[]> sq;

	public static void main(String... args) {

		try (Scanner sc = new Scanner(System.in)) {
			String[] tmp = sc.nextLine().split(" ");
			h = Integer.parseInt(tmp[0]);
			w = Integer.parseInt(tmp[1]);

			table = new int[h][w];

			IntStream.range(0, h).forEach(y -> {
				String s = sc.nextLine();
				IntStream.range(0, w).forEach(x -> {
					table[y][x] = s.charAt(x) == '#' ? 0 : INF;
				});
			});

		}
		sq = new ArrayDeque<>(h * w);

		IntStream.range(0, h).forEach(y -> {
			IntStream.range(0, w).forEach(x -> {
				if (table[y][x] == 0) {
					sq.add(new int[] { y, x, 0 });
				}
			});
		});

		while (!sq.isEmpty()) {
			int[] b = sq.remove();
			erosion(b[0], b[1], b[2]);
		}
		
		int maxDis = Arrays.stream(table)
			.map(row -> Arrays.stream(row))
			.mapToInt(rs -> rs.reduce(0, (a,b) -> Math.max(a, b)))
			.reduce(0, (a,b) -> Math.max(a, b));
		
		System.out.println(maxDis);
	}

	static void erosion(int y, int x, int n) {
		if (n < table[y][x] || n == 0) {
			table[y][x] = n;

			if (y < h - 1) {
				sq.add(new int[] { y + 1, x, n + 1 });
			}
			if (y > 0) {
				sq.add(new int[] { y - 1, x, n + 1 });
			}
			if (x < w - 1) {
				sq.add(new int[] { y, x + 1, n + 1 });
			}
			if (x > 0) {
				sq.add(new int[] { y, x - 1, n + 1 });
			}
		}
	}
}
