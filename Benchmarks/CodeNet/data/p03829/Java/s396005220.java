import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * 解説通り実装したソースコード
 */
public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt(), a = scanner.nextInt(), b = scanner.nextInt();
			int[] x = IntStream.range(0, n).map(i -> scanner.nextInt()).toArray();
			System.out.println(IntStream.range(1, n).map(i -> Math.min((x[i] - x[i - 1]) * a, b)).sum());
		}
	}
}
