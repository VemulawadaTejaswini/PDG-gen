import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		long k = sc.nextLong();

		if (s.length() == 1) {
			System.out.println(k / 2);
			return;
		}

		long change = 0;
		char first = s.charAt(0);
		char before = s.charAt(0);
		boolean isDuplicate = false;
		int i = 1;
		while (i < s.length()) {
			char now = s.charAt(i);
			if (before == now) {
				change++;
				if (i + 1 < s.length() && s.charAt(i + 1) == now) {
					i++;
				}
			}
			before = now;
			i++;
		}
		if (s.charAt(s.length() - 2) != s.charAt(s.length() - 1)) {
			if (first == s.charAt(s.length() - 1)) {
				isDuplicate = true;
			}
		}
		long returnLong = change * k;
		if (isDuplicate) {
			returnLong = returnLong + k - 1;
		}
		System.out.println(returnLong);
	}
}