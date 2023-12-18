import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			execute(scanner);
		}
	}

	private static void execute(Scanner scanner) {
		int r = scanner.nextInt();
		int g = scanner.nextInt();
		System.out.println(2 * g - r);
	}
}
