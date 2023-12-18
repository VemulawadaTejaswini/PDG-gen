import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int result = 0;

			int a = scanner.nextInt();
			int b = scanner.nextInt();

			result = a < b ? a : b;

			int c = scanner.nextInt();
			int d = scanner.nextInt();

			result += c < d ? c : d;

			System.out.println(result);
		}
	}
}
