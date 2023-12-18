import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int n = sc.nextInt();

		char[] s = sc.next().toCharArray();

		Deque<Character> st = new ArrayDeque<>();

		for (int i = 0; i < n; i++) {
			if (s[i] == '(') {
				st.push(s[i]);
			} else {
				if (st.size() > 0 && st.peek() == '(') {
					st.pop();
				} else {
					st.push(s[i]);
				}
			}
		}

		StringBuilder ret = new StringBuilder();
		ret.append(s);
		for (char c : st) {
			if (c == ')') {
				ret.insert(0, '(');
			} else {
				ret.append(')');
			}
		}

		pr.println(ret);
	}

	// ---------------------------------------------------
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		pr = new Printer(System.out);

		solve();

		pr.close();
		sc.close();
	}

	private static class Printer extends PrintWriter {
		Printer(PrintStream out) {
			super(out);
		}
	}
}
