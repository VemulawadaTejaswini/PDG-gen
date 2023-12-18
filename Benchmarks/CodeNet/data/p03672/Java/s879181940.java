import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	static Scanner in;
	static PrintWriter out;

	static void solve() {
		String S = in.next();
		int L = S.length() / 2;
		for (int i = 0; i < L; i++) {
			S = S.substring(0, (S.length() - 2));
			String s1 = S.substring(0, S.length() / 2);
			String s2 = S.substring((S.length() / 2), S.length());
			if (s1.equals(s2)) {
				out.println(S.length());
				break;
			}
		}

	}

	public static void main(String[] args) {
		in = new Scanner(System.in);
		out = new PrintWriter(System.out);
		solve();
		out.flush();
		out.close();
		in.close();
	}

}
