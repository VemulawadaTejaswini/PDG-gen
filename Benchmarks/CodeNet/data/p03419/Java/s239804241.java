import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			long n = scanner.nextLong();
			long m = scanner.nextLong();

			if (n == 1 || m == 1) {
				System.out.println(n * m - 2);
				return;
			}

			if (n == 2 || m == 2) {
				System.out.println(0);
				return;
			}

			System.out.println(n * m - (m * 2) - (n - 2) * 2);
		}
	}
}
