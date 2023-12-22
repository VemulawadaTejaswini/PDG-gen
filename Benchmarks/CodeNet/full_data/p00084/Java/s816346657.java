import static java.util.Arrays.*;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	static void tr(Object... os) {
		System.err.println(deepToString(os));
	}

	void solve() {
		String[] words = sc.nextLine().split("[ ,\\.]");
		boolean first = true;
		for (int i = 0; i < words.length; i++) {
			if (3 <= words[i].length() && words[i].length() <= 6) {
				if (first) { first = false; } else out.print(" ");
				out.print(words[i]);
			}
		}
		out.println();

	}

	public static void main(String[] args) throws Exception {
		new Main().run();
	}

	Scanner sc = null;
	PrintWriter out = null;
	public void run() throws Exception {
		sc = new Scanner(System.in);
		out = new PrintWriter(System.out);
		for (;sc.hasNext();) {
			solve();
			out.flush();
		}
		out.close();
	}

}