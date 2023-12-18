

import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		int ans = 0;

		for (int i = 1; i < s.length() / 2; i++) {
			StringBuilder sb = new StringBuilder(s);
			sb.setLength(s.length() - 2);
			s = sb.toString();
			int sl = s.length();

			if (s.substring(0, sl / 2).equals(s.substring(sl / 2))) {
				ans = sl;
				break;
			}

		}

		System.out.println(ans);
	}

}
