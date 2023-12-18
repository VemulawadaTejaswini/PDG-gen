import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();

		int frag = 0;
		if (S.charAt(0) == 'A') {
			for (int i = 2; i < S.length() - 1; i++) {
				if (S.charAt(i) == 'C') {
					frag = 1;
					break;
				}
			}
		}
		int cnt = 0;
		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) == 'C')
				cnt++;
			if (S.charAt(i) == 'C' && i < 2)
				frag = 0;
			if (S.charAt(i) == 'C' && i > S.length() - 2)
				frag = 0;
		}
		if (cnt >= 2 && cnt == 0)
			frag = 0;

		if (frag == 1) {
			System.out.println("AC");
		} else {
			System.out.println("WA");
		}
		sc.close();
	}
}