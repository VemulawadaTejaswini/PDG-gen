import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int h = scanner.nextInt();
			int w = scanner.nextInt();
			int n = scanner.nextInt();
			int[][] komas = new int[h + 1][w + 1];
			IntStream.rangeClosed(0, h).forEach(i -> Arrays.fill(komas[i], 0));
			IntStream.range(0, n).forEach(i -> komas[scanner.nextInt()][scanner.nextInt()] = 1);
			int[][] sums = new int[h + 1][w + 1];
			Arrays.fill(sums[0], 0);
			IntStream.rangeClosed(1, h).forEach(i -> sums[i][0] = 0);
			IntStream.rangeClosed(1, h).forEach(i -> IntStream.rangeClosed(1, w)
					.forEach(j -> sums[i][j] = sums[i][j - 1] + sums[i - 1][j] - sums[i - 1][j - 1] + komas[i][j]));
			int[] results = new int[10];
			Arrays.fill(results, 0);
			IntStream.rangeClosed(3, h).forEach(i -> IntStream.rangeClosed(3, w)
					.forEach(j -> results[sums[i][j] + sums[i - 3][j - 3] - sums[i - 3][j] - sums[i][j - 3]]++));
			Arrays.stream(results).forEach(System.out::println);
		}
	}
}
