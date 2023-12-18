import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String S = sc.next();
		String T = sc.next();

		boolean flg = false;

		for (int i = 0; i < S.length(); i++) {
			if (S.equals(T)) {
				flg = true;
				break;
			}
			S = change(S);
		}

		System.out.println(flg ? "Yes" : "No");

	}

	private static String change(String str) {

		str = String.valueOf(str.charAt(str.length() - 1)) + str.substring(0, str.length() - 1);
		return str;
	}
}