import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		boolean judge = false;
		for (int i = 0; i < n; i++) {
			int a = scanner.nextInt();
			for (int j = 0; j < n; j++) {
				if (Math.abs(n - 1 - j - j) == a) {
					judge = true;
					break;
				} else {
					judge = false;
				}
			}
			if (!judge) {
				break;
			}
		}

		if (judge) {
			System.out.println((long) Math.pow(2, n / 2));
		} else {
			System.out.println(0);
		}
	}
}
