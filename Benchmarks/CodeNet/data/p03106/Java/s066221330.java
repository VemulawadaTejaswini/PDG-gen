import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		final Scanner scanner = new Scanner(System.in);
		final int a = scanner.nextInt();
		final int b = scanner.nextInt();
		final int c = scanner.nextInt();

		int i = 0;
		int result = Math.max(a, b);
		while (true) {
			result--;
			if (a % result == 0 && b % result == 0) {
				if (++i == c) {
					break;
				}
			}
		}
		System.out.println(result);
	}

}