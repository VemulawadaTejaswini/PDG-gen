import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("[a-z]+");
		String w = scanner.next();
		int length = w.length();
		if (1 <= length && length <= 100 && pattern.matcher(w).find()) {
			char[] chars = w.toCharArray();
			for (int i = 0; i < length; i++) {
				if (chars[i] == '0') continue;
				for (int j = i + 1; j < length; j++) {
					if (chars[i] == chars[j]) {
						chars[i] = '0';
						chars[j] = '0';
						continue;
					}
				}
			}
			for (int i = 0; i < length; i++) {
				if (chars[i] != '0') {
					System.out.println("No");
					return;
				}
			}
			System.out.println("Yes");
		}
		System.out.println("No");
	}
}
