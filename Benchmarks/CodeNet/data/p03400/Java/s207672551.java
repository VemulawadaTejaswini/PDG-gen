import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int result = 0;

			int n = scanner.nextInt();
			int d = scanner.nextInt();
			int x = scanner.nextInt();

			for (int i = 0; i < n; i++) {
				int a = scanner.nextInt();
				for (int j = 1; j <= d; j += a) {
					result++;
				}
			}
			result += x;

			System.out.println(result);
		}
	}
}
