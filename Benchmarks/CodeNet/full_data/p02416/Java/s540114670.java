import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);

		while (scanner.hasNext()) {
			String str = scanner.nextLine();
			int sum = 0;
			if (str.equals("0")) {
				break;
			}
			for (int i = 0; i < str.length(); i++) {
				sum += str.charAt(i) - '0';
			}
			System.out.println(sum);
		}
	}
}