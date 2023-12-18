import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int N= scanner.nextInt();
			int A = scanner.nextInt();

			System.out.println((N % 500) - A <= 0 ? "Yes" : "No");
		}
	}
}
