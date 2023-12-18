import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 解説どおりに作成したソースコード
 */
public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int h = scanner.nextInt(), w = scanner.nextInt();
			int n = scanner.nextInt();
			int[] a = new int[n];
			IntStream.range(0, n).forEach(i -> a[i] = scanner.nextInt());
			int[][] result = new int[h][w];
			int color = 1;
			int currentX = 0, currentY = 0;
			for (int ai : a) {
				if (currentY + ai >= w) {
					// 改行が発生する
					for (int i = currentY; i < w; i++) {
						result[currentX][i] = color;
					}
					currentX++;
					currentY = ai + currentY - w;
					for (int i = 0; i < currentY; i++) {
						result[currentX][i] = color;
					}
				} else {
					for (int i = currentY; i < currentY + ai; i++) {
						result[currentX][i] = color;
					}
					currentY += ai;
				}
				color++;
			}
			IntStream.range(0, h).forEach(i -> println(result[i], i));
		}
	}

	/**
	 * 数列を出力する
	 * 
	 * @param a      出力する数列
	 * @param lineNo 行数
	 */
	private static void println(int[] a, int lineNo) {
		if (0 == (lineNo & 1)) {
			// lineNoが偶数の場合，左から右へ出力する
			System.out.println(Arrays.stream(a).mapToObj(String::valueOf).collect(Collectors.joining(" ")));
		} else {
			// 右から左へ出力する
			System.out.println(IntStream.range(0, a.length).mapToObj(i -> String.valueOf(a[a.length - 1 - i]))
					.collect(Collectors.joining(" ")));
		}
	}
}
