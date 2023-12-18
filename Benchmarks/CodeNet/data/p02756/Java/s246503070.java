import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;

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
			Deque<String> s = new ArrayDeque<>();
			s.addLast(in.next());
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
							s.addFirst(in.next());
						} else {
							s.addLast(in.next());
						}
					} else {
						if (!reverse) {
							s.addLast(in.next());
						} else {
							s.addFirst(in.next());
						}
					}
				}
			}

			if (reverse) {
				while (!s.isEmpty()) {
					out.print(s.pollLast());
				}
			} else {
				for (String ss : s) {
					out.print(ss);
				}
			}
		}

	}
}

