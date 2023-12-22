import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		String T = sc.nextLine();
		if (S.matches("[a-z]{1,10}") && T.matches("[a-z]{1,}")) {
			if (T.length() == S.length() + 1) {
				if (T.substring(0,S.length()).equals(S)) {
					System.out.println("Yes");
				} else {
					System.out.println("No");
				}
			} else {
				System.out.println("No");
			}

		} else {
			System.out.println("No");
		}
		sc.close();
	}
}
