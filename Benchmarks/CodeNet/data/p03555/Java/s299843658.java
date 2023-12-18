import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			execute(scanner);
		}
	}

	private static void execute(Scanner scanner) {
		String line1 = scanner.nextLine();
		String line2 = new StringBuilder(scanner.nextLine()).reverse().toString();
		if (line1.equals(line2)) {
			System.out.println("YES");
			return;
		}
		System.out.println("NO");
	}
}
