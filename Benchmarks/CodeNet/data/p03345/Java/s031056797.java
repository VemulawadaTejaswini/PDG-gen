import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			long a = scanner.nextLong();
			long b = scanner.nextLong();
			scanner.nextLong();
			long k = scanner.nextLong();

			if (k % 2 == 0) {
				System.out.println(a - b);
			} else {
				System.out.println(b - a);
			}
		}
	}
}
