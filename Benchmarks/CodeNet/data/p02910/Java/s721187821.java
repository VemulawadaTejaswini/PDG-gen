import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		boolean possible = false;

		for (int i = 0; i < S.length(); i++) {
			if (i % 2 == 0 && ("R".equals(String.valueOf(S.charAt(i)))
					|| "U".equals(String.valueOf((S.charAt(i))))
					|| "D".equals(String.valueOf((S.charAt(i)))))) {
				possible = true;
				continue;
			} else if (i % 2 == 1 && ("L".equals(String.valueOf(S.charAt(i)))
					|| "U".equals(String.valueOf((S.charAt(i))))
					|| "D".equals(String.valueOf((S.charAt(i)))))) {
				possible = true;
				continue;
			}
			possible = false;
			break;
		}

		if (possible) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
