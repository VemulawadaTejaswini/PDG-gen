import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int x = scanner.nextInt();
			System.out.println((int) Math.ceil((Math.sqrt(8 * x + 1) - 1.0) / 2.0));
		}
	}
}
