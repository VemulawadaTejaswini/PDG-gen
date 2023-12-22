import java.util.Scanner;

public class Main {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int[] abc = new int[26];
		String input = "";

		while (scanner.hasNext()) {

			input = input().toLowerCase();

			for (int i = 0; i < input.length(); i++) {

				char charNumber = input.charAt(i);

				if ('a' <= charNumber && charNumber <= 'z') {

					abc[charNumber - 'a']++;

				}
			}
		}

			for (int j = 0; j < 26; j++) {

			System.out.println((char)('a' + j) + " : " + abc[j]);

		}

		close();

	}

	public static String input() {

		return scanner.nextLine();

	}

	public static void close() {

		if (scanner != null) {

			scanner.close();

		}
	}
}