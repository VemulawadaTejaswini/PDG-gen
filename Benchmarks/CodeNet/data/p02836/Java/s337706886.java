import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String S = in.next();
		int ans = 0;
		for (int i = 0; i < S.length() / 2; i++) {
			if (S.charAt(i) != S.charAt(S.length() - (i + 1))) {
				ans++;
			}
		}
		System.out.println(ans);
		in.close();

	}
}