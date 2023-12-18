import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		if (n % 4 == 0 || n % 7 == 0) {
			System.out.println("Yes");
			return;
		}

		for (int i = 4; i <= 100; i += 4) {
			for (int j = 7; j <= 100; j += 7) {
				if (i + j == n) {
					System.out.println("Yes");
					return;
				}
			}
		}

		System.out.println("No");

	}
}
