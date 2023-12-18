import java.util.Scanner;

public class Main {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		String str = scn.next();
		boolean Fp = ispalindrome(str);
		if (Fp) {
			boolean Sp = ispalindrome(str.substring(0, str.length() / 2));
			if (Sp) {
				boolean Tp = ispalindrome(str.substring((str.length()) / 2 + 1));
				if (Tp)
					System.out.println("Yes");
				else
					System.out.println("No");
			} else
				System.out.println("No");
		} else
			System.out.println("No");

	}

	public static boolean ispalindrome(String str) {
		for (int i = 0; i < str.length() / 2; i++) {
			if (str.charAt(i) != str.charAt(str.length() - 1 - i))
				return false;
		}
		return true;
	}
}
