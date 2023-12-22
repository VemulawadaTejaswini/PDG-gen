import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			long a = scanner.nextLong(), b = scanner.nextLong(), c = scanner.nextLong(), d = scanner.nextLong();
			if (((b <= 0) && (c >= 0)) || ((a >= 0) && (c <= 0))) {
				// 正の数と負の数の組合せの場合
				System.out.println(Math.max(b * c, a * d));
			} else {
				System.out.println(Math.max(a * c, b * d));
			}
		}
	}
}
