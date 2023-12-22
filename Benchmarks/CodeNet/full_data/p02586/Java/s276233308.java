import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * 解説通りに実装したソースコード
 */
public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int r = scanner.nextInt(), c = scanner.nextInt(), k = scanner.nextInt();
			long[][] v = new long[r][c];
			IntStream.range(0, k).forEach(i -> v[scanner.nextInt() - 1][scanner.nextInt() - 1] = scanner.nextLong());
			System.out.println(getResult(0, 0, 0, r, c, v, 0L));
		}
	}

	private static long getResult(int x, int y, int lineStart, int r, int c, long[][] v, long currentValue) {
		if ((x == r - 1) && (y == c - 1)) {
			return currentValue + IntStream.rangeClosed(lineStart, y).mapToLong(i -> v[x][i]).sorted()
					.skip(Math.max(0, y - lineStart - 2)).sum();
		}
		if (r - 1 == x) {
			return getResult(x, y + 1, lineStart, r, c, v, currentValue);
		} else if (c - 1 == y) {
			return getResult(x + 1, y, y, r, c, v, currentValue + IntStream.rangeClosed(lineStart, y)
					.mapToLong(i -> v[x][i]).sorted().skip(Math.max(0, y - lineStart - 2)).sum());
		} else {
			return Math.max(getResult(x, y + 1, lineStart, r, c, v, currentValue),
					getResult(x + 1, y, y, r, c, v, currentValue + IntStream.rangeClosed(lineStart, y)
							.mapToLong(i -> v[x][i]).sorted().skip(Math.max(0, y - lineStart - 2)).sum()));
		}
	}
}
