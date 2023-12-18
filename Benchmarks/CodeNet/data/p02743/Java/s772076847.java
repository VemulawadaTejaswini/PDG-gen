import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		if (4 * a * b < (c - a - b) * (c - a - b) && c - a - b > 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
