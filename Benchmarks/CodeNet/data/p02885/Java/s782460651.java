import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		scanner.close();

		if (b * 2 < a) {
			System.out.println(a - b * 2);
		} else {
			System.out.println(0);
		}
	}
}
