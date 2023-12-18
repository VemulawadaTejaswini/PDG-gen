import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		int four = 0;
		int two = 0;
		for (int i = 0; i < n; i++) {
			long a = scanner.nextLong();
			if (a % 4 == 0) {
				four++;
			} else if (a % 2 == 0) {
				two++;
			}
		}

		if (four >= n / 2) {
			System.out.println("Yes");
		} else if (four >= Math.ceil((n - two) / 2) && two >= 2) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
