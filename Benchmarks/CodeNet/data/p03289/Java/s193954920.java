import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String S;
		int count = 0;
		int tmp = 0;

		S = sc.next();

		if (S.charAt(0) != 'A') {
			System.out.println("WA");
		} else {
			for (int i = 2; i < S.length() - 1; ++i) {
				if (S.charAt(i) == 'C') {
					++count;
					tmp = i;
				}
			}
			if (count != 1) {
				System.out.println("WA");
			} else {
				int i;
				for (i = 1; i < S.length(); ++i) {
					if (i != tmp) {
						if (S.charAt(i) > 'z' && S.charAt(i) < 'a') {
							break;
						}
					}
				}
				if (i == S.length()) {
					System.out.println("AC");
				} else {
					System.out.println("WA");
				}
			}
		}
		sc.close();
	}
}
