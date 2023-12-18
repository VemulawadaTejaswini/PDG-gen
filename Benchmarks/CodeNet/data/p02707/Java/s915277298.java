import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			int[] s = new int[n];
			Arrays.fill(s, 0);
			IntStream.range(1, n).forEach(i -> s[scanner.nextInt() - 1]++);
			Arrays.stream(s).forEach(System.out::println);
		}
	}
}
