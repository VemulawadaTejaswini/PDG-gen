import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String S = sc.next();

		boolean app[] = new boolean[26];

		for (int i = 0; i < 26; i++) {
			app[i] = false;
		}

		for (int i = 0; i < S.length(); i++) {
			app[S.charAt(i) - 'a'] = true;
		}

		for (int i = 0; i < 26; i++) {
			if(!app[i]) {
				char c = (char)('a' + i);
				System.out.println(c);
				System.exit(0);
			}
		}
		System.out.println("None");
	}
}
