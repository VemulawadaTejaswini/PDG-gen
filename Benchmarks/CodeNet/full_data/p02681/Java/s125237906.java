import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String S = sc.next();
		String T = sc.next();
		boolean flag = true;
		if (S.length() + 1 != T.length()) {
			flag = false;
		}

		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) != T.charAt(i)) {
				flag = false;
			}

		}
		System.out.println(flag ? "Yes" : "No");
	}
}
