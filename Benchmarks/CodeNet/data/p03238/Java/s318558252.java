
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();

			if (n == 1) {
				System.out.println("Hello World");
				return;
			}
			int result = 0;
			result += sc.nextInt();
			result += sc.nextInt();
			System.out.println(result);
		}
	}
}
