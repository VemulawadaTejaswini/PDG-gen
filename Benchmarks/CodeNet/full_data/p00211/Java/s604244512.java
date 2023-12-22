import java.util.Arrays;
import java.util.Scanner;

public class Main {
	MyScanner sc = new MyScanner();
	Scanner sc2 = new Scanner(System.in);
	int mod = 1000000007;

	void run() {
		for (;;) {
			int n = sc2.nextInt();
			if (n == 0) {
				return;
			}
			long[][] info = new long[n][2];
			for (int i = 0; i < n; i++) {
				info[i][0] = sc2.nextLong();
				info[i][1] = sc2.nextLong();
			}
			long gcd = gcd(info[0][1], info[1][1]);
			long lcm = info[0][1] * info[1][1] / gcd;
			for (int i = 2; i < n; i++) {
				gcd = gcd(lcm, info[i][1]);
				lcm = lcm * info[i][1] / gcd;
			}
			for (int i = 0; i < n; i++) {
				info[i][0] *= lcm / info[i][1];
				info[i][1] = lcm;
			}

			gcd = gcd(info[0][0], info[1][0]);
			lcm = info[0][0] * info[1][0] / gcd;
			for (int i = 2; i < n; i++) {
				gcd = gcd(lcm, info[i][0]);
				lcm = lcm / gcd * info[i][0];
			}
			for (long[] out : info) {
				System.out.println(lcm / out[0]);
			}
		}
	}

	long gcd(long a, long b) {
		return a % b == 0 ? b : gcd(b, a % b);
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}

	void debug2(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
	}

	class MyScanner {
		int nextInt() {
			try {
				int c = System.in.read();
				while (c != '-' && (c < '0' || '9' < c))
					c = System.in.read();
				if (c == '-')
					return -nextInt();
				int res = 0;
				do {
					res *= 10;
					res += c - '0';
					c = System.in.read();
				} while ('0' <= c && c <= '9');
				return res;
			} catch (Exception e) {
				return -1;
			}
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String next() {
			try {
				StringBuilder res = new StringBuilder("");
				int c = System.in.read();
				while (Character.isWhitespace(c))
					c = System.in.read();
				do {
					res.append((char) c);
				} while (!Character.isWhitespace(c = System.in.read()));
				return res.toString();
			} catch (Exception e) {
				return null;
			}
		}
	}
}