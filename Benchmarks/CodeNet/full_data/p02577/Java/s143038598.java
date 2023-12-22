import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in)) {
			String data = scanner.nextLine();

			char[] chars = data.toCharArray();

			int total = 0;
			for (int i = 0; i < chars.length; i++) {
				int n = Integer.parseInt(String.valueOf(chars[i]));
				total += n;
			}

			System.out.println(total % 9 == 0 ? "Yes" : "No");
		}
	}
}