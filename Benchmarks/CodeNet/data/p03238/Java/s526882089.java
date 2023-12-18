import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		if (n == 1) {
			System.out.println("Hello World");
		} else {
			System.out.println(scanner.nextInt() + scanner.nextInt());
		}
		scanner.close();
	}
}