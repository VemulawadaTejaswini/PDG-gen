package test2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String count = sc.next();
		int ans = 0;
		int loopCount = 0;
		List<String> list = new ArrayList<String>();

		for (int i = 0; i < Integer.parseInt(count); i++) {
			list.add(sc.next());
		}

		for (String match : list) {

			for (int j = loopCount; j < Integer.parseInt(count); j++) {

				if (matcher(match, list.get(j))) {
					ans = ans + 1;
				}
			}
			loopCount = loopCount + 1;
		}
		System.out.println(ans);
	}

	private static boolean matcher(String match, String b) {
		StringBuilder sb = new StringBuilder(b);
		if (match.equals(b)) {
			return false;
		}
		for (int i = 0; i < match.length(); i++) {
			char s = match.charAt(i);
			if (sb.indexOf(String.valueOf(s)) == -1) {
				return false;
			}
			sb.deleteCharAt(sb.indexOf(String.valueOf(s)));
		}
		return true;
	}
}
