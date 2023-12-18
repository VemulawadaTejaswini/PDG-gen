

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String S = sc.next();
		int R = 700;
		int T = 0;
		for (int i = 0; i < S.length(); i++) {
			if ("o".equals(S.substring(i, i + 1))) {
				T += 100;
			}
		}
		System.out.println(T + R);
	}
}