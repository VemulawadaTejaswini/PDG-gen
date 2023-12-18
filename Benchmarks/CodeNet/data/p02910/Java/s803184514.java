import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		boolean ans = true;

		for (int i = 0; i < S.length(); i++) {
			char c = S.charAt(i);

			if (c=='U' || c == 'D') {
				continue;
			}
			if (i%2==0) {
				if (c!='R') {
					ans = false;
				}
			} else {
				if (c!='L') {
					ans = false;
				}
			}
		}
		if (ans) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}
}

