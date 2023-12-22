
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			String a = scanner.next();
			if (a.equals("-")) {
				break;
			}
			int b = scanner.nextInt();
			int sum = 0;
			for (int i = 0; i < b; i++) {
				sum += scanner.nextInt();
			}
			String c = a + a;
			System.out.println(c.substring(sum % a.length(), sum
					% a.length() + a.length()));
		}
	}
}