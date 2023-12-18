import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String T = sc.next();

		for (int i = 0; i < S.length(); i++) {
			S = S.substring(1) + S.charAt(0);
			if (S.equals(T)) {
				System.out.println("Yes");
				return;
			}
		}

		System.out.println("No");

		return;
	}
}
