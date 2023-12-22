import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		String key = sc.next();
		while (true) {
			String word = sc.next();
			if (word.equals("END_OF_TEXT")) {
				break;
			}

			word = word.toLowerCase();
			if (key.equals(word)) {
				count++;
			}
		}

		System.out.println(count);

	}
}
