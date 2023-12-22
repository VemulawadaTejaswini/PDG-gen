import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String text = scanner.nextLine();
			while (true) {
				text = decode(text);
				if (text.contains("the") || text.contains("this") || text.contains("that")) {
					System.out.println(text);
					break;
				}
			}
		}
	}
	public static String decode(String text) {
		char[] c = text.toCharArray();
		for (int i = 0; i < c.length; i++) {
			char letter = c[i];
			if ('a' <= letter && letter <= 'z') {
				if (letter == 'z') letter = 'a';
				else letter++;
			}
			c[i] = letter;
		}
		return String.valueOf(c);
	}
}