import java.util.Scanner;

public class Main {
	private static final String[] reversedWords = {"dream", "dreamer", "erase", "eraser"};

	public static void main(String[] args) {
		String s;
		try (Scanner scanner = new Scanner(System.in)) {
			s = scanner.next();
		}

		int stringLength = s.length();
		boolean canDevide = true;
		while (canDevide && stringLength > 0) {
			canDevide = false;
			for (String word: Main.reversedWords) {
				if (s.substring(0, stringLength).endsWith(word)) {
					canDevide = true;
					stringLength -= word.length();
				}
			}
		}

		if (canDevide) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}