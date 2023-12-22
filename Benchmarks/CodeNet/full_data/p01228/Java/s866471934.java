import static java.lang.Math.*;
import static java.util.Arrays.*;
import java.util.*;
import java.io.*;

public class Main {

	void tr(Object... os) {
		System.err.println(deepToString(os));
	}
	public static void main(String[] args) {
		try {
			System.setIn(new FileInputStream("src/aoj2105/input.txt"));
			// System.setOut(new PrintStream(new FileOutputStream("src/aoj1172/result.txt")));
		} catch (FileNotFoundException e) {
		}
		new Main().run();
	}

	long gcd(long a, long b) {
		return b == 0 ? a : gcd(b, a % b);
	}

	Scanner sc;
	void run() {
		sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (;t-->0;) {
			solve();
		}
	}


	int[] minimize(char[] p) {
		int n = p.length / 2;
		int[] xs = new int[n];
		for (int i = 0; i < n; i++) {
			xs[i] = (p[i*2] - '0') * 16 + (p[i*2+1]-'0');
		}

		int i, j;
		for (int d = n; d > 0; d--) if (n % d == 0) {
			int[] res = new int[n / d];
			for (i = 0; i < res.length; i++) {
				res[i] = xs[i * d];
				for (j = 1; j < d; j++) {
					if (0 != xs[i * d + j])
						break;
				}
				if (j != d)
					break;
			}
			if (i == res.length) return res;
		}

		// don't reach here.
		if (true) throw new RuntimeException();
		return new int[0];
	}

	void solve()
	{
		int n = sc.nextInt();

		int[][] ps = new int[n][];
		for (int i = 0; i < n; i++) {
			char[] p = sc.next().toCharArray();
			ps[i] = minimize(p);
		}

		long lcm = ps[0].length;
		for (int i = 1; i < n; i++) {
			lcm = lcm * ps[i].length / gcd(lcm, ps[i].length);
		}
		if (lcm > 1024) {
			System.out.println("Too complex.");
			return;
		}
		for (int t = 0; t < lcm; t++) {
			int cur = 0;
			for (int i = 0; i < n; i++)
				if (t % (lcm / ps[i].length) == 0)
					cur |= ps[i][(int)(t * ps[i].length / lcm)];
			System.out.printf("%02X", cur);
		}
		System.out.println();

	}


}