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
		B solver = new B();
		solver.solve(1, in, out);
		out.close();
	}

	static class B {
		public void solve(int testNumber, Scanner in, PrintWriter out) {
			int n = in.nextInt(), a = in.nextInt(), b = in.nextInt();
			int blue = 0;

			if (a != 0 && b != 0) {
				while (n > 0) {
					if (n >= a) {
						blue += a;
					} else {
						blue += n;
					}

					n -= (a + b);

				}
			}

			out.println(blue);
		}

	}
}

