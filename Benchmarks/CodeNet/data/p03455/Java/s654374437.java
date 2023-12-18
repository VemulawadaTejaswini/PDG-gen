import java.io.IOException;
import java.util.Scanner;

/**
 * @author aneeshashutosh
 */
public class Main {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		int b = scanner.nextInt();

		System.out.println((((a * b) % 2 == 0) ? "Even" : "Odd"));
	}
}
