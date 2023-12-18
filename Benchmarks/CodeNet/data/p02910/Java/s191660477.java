import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean ans = true;
		String s = sc.nextLine();
		char c[] = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			if (i % 2 == 0) {
				// Lのとき
				if (c[i] == 'L') {
					ans = false;
				}
			} else {
				// Rのとき
				if (c[i] == 'R') {
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
