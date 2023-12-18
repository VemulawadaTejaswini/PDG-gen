import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		String S = sc.next();
		String T = sc.next();

		sc.close();

		int x = -1;

		NEXT_SI: for (int si = 0; si < S.length() - T.length() + 1; si++) {
			for (int ti = 0; ti < T.length(); ti++) {
				if (S.charAt(si + ti) != '?' && S.charAt(si + ti) != T.charAt(ti)) {
					continue NEXT_SI;
				}
			}
			x = si;
			break;
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
