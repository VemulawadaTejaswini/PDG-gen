import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();

		boolean flg = true;

		if (!String.valueOf(S.charAt(0)).equals("A"))
			flg = false;
		if (Character.isUpperCase(S.charAt(1)))
			flg = false;
		if (!String.valueOf(S.charAt(2)).equals("C"))
			flg = false;

		for (int i = 3; i < S.length(); i++) {
			if (Character.isUpperCase(S.charAt(i)))
				flg = false;
		}

		if (flg) {
			System.out.println("AC");
		} else {
			System.out.println("WA");
		}

		sc.close();

	}

}