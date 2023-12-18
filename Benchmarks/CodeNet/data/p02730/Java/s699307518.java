import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			String s = scanner.next();
			int n = s.length();
			System.out.println((isPalindromic(s) && isPalindromic(s.substring(0, n / 2))
					&& isPalindromic(s.substring((n + 2) / 2))) ? "Yes" : "No");
		}
	}

	private static boolean isPalindromic(String string) {
		char[] s = string.toCharArray();
		for (int i = 0; i < s.length; i++) {
			if (s[i] != s[s.length - 1 - i]) {
				return false;
			}
		}
		return true;
	}
}
