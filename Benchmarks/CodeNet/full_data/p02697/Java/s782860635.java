import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt(), m = scanner.nextInt();
			int[][] a = new int[m][2];
			a[m - 1][0] = n / 2;
			a[m - 1][1] = n / 2 + 1;
			IntStream.range(1, m).map(i -> m - 1 - i).forEach(i -> {
				a[i][0] = a[i + 1][0] - 1;
				a[i][1] = a[i + 1][1] + 1;
			});
			IntStream.range(0, m).forEach(i -> System.out.println(a[i][0] + " " + a[i][1]));
		}
	}
}
