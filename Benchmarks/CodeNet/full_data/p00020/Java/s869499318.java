import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);

		String ans = capitalize(sc.nextLine());
		System.out.println(ans);
	}

	public static String capitalize(String text) {
		char[] ca = text.toCharArray();

		int shift = 'A' - 'a';
		for (int i=0; i < ca.length; i++) {
			if ('a' <= ca[i] && ca[i] <= 'z') {
				ca[i] = (char) (ca[i] + shift);
			}
		}
		return String.valueOf(ca);
	}
}