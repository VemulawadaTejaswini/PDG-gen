import java.util.Arrays;
import java.util.Scanner;

public class Main {
	MyScanner sc = new MyScanner();
	Scanner sc2 = new Scanner(System.in);
	int mod = 1000000007;

	int N;
	int[] r;
	double[][] memo;

	void run() {
		while (sc2.hasNext()) {
			String[] input = sc2.nextLine().split(" ");
			int L = Integer.valueOf(input[0]);
			N = input.length - 1;
			r = new int[N];
			memo = new double[N][1 << N];

			for (int i = 1; i < N + 1; i++) {
				r[i - 1] = Integer.valueOf(input[i]);
			}
			boolean judge = false;
			for (int i = 0; i < N; i++) {
				double ans = tsp(i, 1 << i) + r[i];
				if (ans <= L) {
					judge = true;
				}
			}
			System.out.println(judge ? "OK" : "NA");
		}
	}

	double tsp(int v, int bit) {
		if(memo[v][bit] != 0) {
			return memo[v][bit];
		}
		if (bit == (1 << N) - 1) {
			return r[v];
		}
		double res = 1 << 10;
		for (int w = 0; w < N; w++) {
			if ((bit & (1 << w)) != 0) {
				continue;
			}
			double dis = Math.sqrt((r[v] + r[w]) * (r[v] + r[w])
					- (r[v] - r[w]) * (r[v] - r[w]));
			res = Math.min(res, dis + tsp(w, bit | 1 << w));
		}
		memo[v][bit] = res;
		return res;
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