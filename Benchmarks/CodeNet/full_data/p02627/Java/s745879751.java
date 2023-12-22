import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in)) {
			String data = scanner.nextLine();

			if (data.matches("[A-Z]")) {
				System.out.println("A");
			} else {
				System.out.println("a");
			}
		}
	}
}