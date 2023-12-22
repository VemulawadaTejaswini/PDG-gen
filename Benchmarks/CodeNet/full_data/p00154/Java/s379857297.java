import java.util.Arrays;
import java.util.Scanner;

public class Main {
	MyScanner sc = new MyScanner();
	Scanner sc2 = new Scanner(System.in);
	int mod = 1000000007;

	int n, query, cnt;
	int test;
	int[][] card;
	int[][] memo;

	void run() {
		for (;;) {
			n = sc.nextInt();
			if (n == 0) {
				return;
			}
			card = new int[n][2];
			for (int i = 0; i < n; i++) {
				card[i][0] = sc.nextInt();
				card[i][1] = sc.nextInt();
			}

			int g = sc.nextInt();
			memo = new int[1 << 10][1 << 13];
			for (int i = 0; i < g; i++) {
				cnt = 0;
				test = 0;
				query = sc.nextInt();
				dfs(0, 0);
				System.out.println(cnt);
			}
		}
	}

	void dfs(int k, int sum) {
		if (sum == query) {
			cnt++;
			return;
		}
		if (k == n) {
			return;
		}
		for (int i = 0; i <= card[k][1]; i++) {
			dfs(k + 1, sum + card[k][0] * i);
		}
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