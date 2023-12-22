import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			long a = scanner.nextLong(), b = scanner.nextLong(), c = scanner.nextLong(), d = scanner.nextLong();
			if (((b <= 0) && (c >= 0)) || ((a >= 0) && (c <= 0))) {
				// 正の数と負の数の組合せの場合
				System.out.println(max(a * c, a * d, b * c, b * d));
			} else {
				System.out.println(max(a * c, a * d, b * c, b * d, 0));
			}
		}
	}

	private static long max(long... a) {
		return Arrays.stream(a).max().getAsLong();
	}
}
