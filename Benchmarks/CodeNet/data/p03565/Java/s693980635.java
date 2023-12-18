import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	private boolean check(String s, String t) {
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != '?') {
				if (s.charAt(i) != t.charAt(i)) {
					return false;
				}
			}
		}
		return true;
	}

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		String S = sc.next();
		String T = sc.next();

		sc.close();

		int x = -1;

		for (int si = S.length() - T.length(); si >= 0; si--) {
			String s2 = S.substring(si, si + T.length());
			if (check(s2, T)) {
				x = si;
				break;
			}
		}

		if (x == -1) {
			out.println("UNRESTORABLE");
			return;
		}

		StringBuffer sb = new StringBuffer(S);
		sb.replace(x, x + T.length(), T);

		String ans = sb.toString().replace("?", "a");

		out.println(ans);

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
