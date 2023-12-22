import static java.util.Arrays.*;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	static void tr(Object... os) {
		System.err.println(deepToString(os));
	}

	void solve() {
		int n = sc.nextInt();
		int m = sc.nextInt();
		if (n == 0 && m == 0) return;

		int r = n * m;
		while (r > n) {
			r = ((r - n) * m - 1) / (m - 1);
		}
		System.out.println(r);
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