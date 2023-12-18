import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S, T;
		S = sc.next();
		T = sc.next();

		for (int i = 0; i < S.length(); i++) {
			if (S.equals(T)) {
				System.out.println("Yes");
				return;
			}
			S = rotate(S);
		}

		System.out.println("No");
	}

	private static String rotate(String S) {
		return S.substring(1) + S.charAt(0);
	}
}