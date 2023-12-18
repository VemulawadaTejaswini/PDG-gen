import java.util.Scanner;

public class Main {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int x = Math.abs(a - b);
		if (x == c) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
