import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		Scanner in = new Scanner(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		D solver = new D();
		solver.solve(1, in, out);
		out.close();
	}

	static class D {
		public void solve(int testNumber, Scanner in, PrintWriter out) {
			StringBuilder s = new StringBuilder(in.next());
			int n = in.nextInt();

			boolean reverse = false;
			for (int i = 0; i < n; i++) {
				int t = in.nextInt();

				if (t == 1) {
					reverse = !reverse;
				} else {
					int f = in.nextInt();
					if (f == 1) {
						if (!reverse) {
							s.insert(0, in.next());
						} else {
							s.append(in.next());
						}
					} else {
						if (!reverse) {
							s.append(in.next());
						} else {
							s.insert(0, in.next());
						}
					}
				}
			}
			if (reverse) {
				s.reverse();
			}
			out.println(s);
		}

	}
}

