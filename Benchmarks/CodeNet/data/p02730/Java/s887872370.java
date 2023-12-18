import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();

		int len = S.length();
		String h1 = S.substring(0, (len - 1) / 2);
		String h2 = S.substring(((len + 3) / 2) - 1, len);

		if (isPalindrome(S) && isPalindrome(h1) && isPalindrome(h2)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

	static boolean isPalindrome(String s) {
		int n = s.length();
		for (int i = 0; i < n / 2; i++) {
			if (s.charAt(i) != s.charAt(n - i - 1)) {
				return false;
			}
		}
		return true;
	}
}
