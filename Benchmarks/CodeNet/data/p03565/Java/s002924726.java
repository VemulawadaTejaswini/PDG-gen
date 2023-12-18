import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		char[] s = sc.next().toCharArray();
		char[] t = sc.next().toCharArray();

		int ns = s.length;
		int nt = t.length;

		if (nt > ns) {
			pr.println("UNRESTORABLE");
			return;
		}

		List<String> ans = new ArrayList<>();
		out:
		for (int i = 0; i + nt - 1 < ns; i++) {
			for (int j = 0; j < nt; j++) {
				if (s[i + j] == '?') {
				} else if (s[i + j] == t[j]) {
				} else {
					continue out;
				}
			}

			char[] tmp = s.clone();
			for (int j = 0; j < nt; j++) {
				tmp[i + j] = t[j];
			}
			for (int j = 0; j < ns; j++) {
				if (tmp[j] == '?') {
					tmp[j] = 'a';
				}
			}
			ans.add(new String(tmp));
		}
		Collections.sort(ans);

		if (ans.size() > 0) {
			pr.println(ans.get(0));
		} else {
			pr.println("UNRESTORABLE");
		}
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
