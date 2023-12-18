import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	/** 何分割するか */
	private static final int N = 3;

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			long h = scanner.nextLong();
			long w = scanner.nextLong();
			long[] s = new long[N];
			System.out.println(getResult(Math.max(h, w), Math.min(h, w), s, N));
		}
	}

	/**
	 * @param h 高さ
	 * @param w 幅 w<=h
	 * @param s 結果の配列
	 * @param n 何分割するか
	 * @return 結果の最大値と最小値の差分
	 */
	private static long getResult(final long h, final long w, final long[] s, int n) {
		if (1 == n) {
			s[N - n] = h * w;
			return Arrays.stream(s).max().getAsLong() - Arrays.stream(s).min().getAsLong();
		}
		if ((0 == (h % n)) || (0 == (w % n))) {
			IntStream.range(N - n, N).forEach(i -> s[i] = h * w / n);
			return Arrays.stream(s).max().getAsLong() - Arrays.stream(s).min().getAsLong();
		} else {
			return IntStream.rangeClosed(-(n - 1), (n - 1)).mapToLong(i -> {
				s[N - n] = (h / n + i) * w;
				return getResult(Math.max(h - h / n - i, w), Math.min(h - h / n - i, w), s, n - 1);
			}).min().getAsLong();
		}
	}
}
