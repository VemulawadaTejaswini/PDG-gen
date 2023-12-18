
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String s = sc.nextLine();
			String t = sc.nextLine();

			StringBuilder sb = new StringBuilder(s);
			sb = sb.reverse();
			char[] sca = sb.toString().toCharArray();
			StringBuilder tb = new StringBuilder(t);
			tb = tb.reverse();
			char[] tca = tb.toString().toCharArray();

			for (int i = 0; i < sb.length() - tb.length() + 1; i++) {
				StringBuilder result = new StringBuilder();
				boolean flg = true;
				for (int j = 0; j < i; j++) {
					result.append(sca[j]);
				}
				for (int j = 0; j < t.length(); j++) {
					if (sca[j + i] == tca[j] || sca[i + j] == '?') {
						result.append(tca[j]);
					} else {
						flg = false;
					}
				}
				if (flg) {
					for (int j = result.length(); j < s.length(); j++) {
						result.append(sca[j]);
					}
					printResult(result.reverse().toString());
					return;
				} else {
					continue;
				}
			}

			System.out.println("UNRESTORABLE");

		}
	}

	private static void printResult(String s) {

		for (char c : s.toCharArray()) {
			if (c == '?') {
				System.out.print('a');
			} else {
				System.out.print(c);
			}
		}
		System.out.println();
	}
}
