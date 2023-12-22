import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	int[] dx = { 1, 0, 0, -1 };
	int[] dy = { 0, 1, -1, 0 };

	void run() {
		HashMap<ArrayList<Integer>, Integer> map = new HashMap<ArrayList<Integer>, Integer>();
		LinkedList<ArrayList<Integer>> que = new LinkedList<ArrayList<Integer>>();
		int cnt = 0;
		ArrayList<Integer> d = new ArrayList<Integer>();
		for (int i = 0; i < 8; i++) {
			d.add(i);
		}
		que.add(d);
		map.put(d, cnt);
		while (!que.isEmpty()) {
			cnt++;
			int size = que.size();
			for (int i = 0; i < size; i++) {
				ArrayList<Integer> now = que.poll();
				int zero = 0;
				for (int j = 0; j < 8; j++) {
					if (now.get(j) == 0) {
						zero = j;
					}
				}
				if (zero != 0 && zero != 4) {
					ArrayList<Integer> next = new ArrayList<Integer>(now);
					int t = next.get(zero - 1);
					next.set(zero, t);
					next.set(zero - 1, 0);
					if (!map.containsKey(next)) {
						map.put(next, cnt);
						que.add(next);
					}
				}
				if (zero != 3 && zero != 7) {
					ArrayList<Integer> next = new ArrayList<Integer>(now);
					int t = next.get(zero + 1);
					next.set(zero, t);
					next.set(zero + 1, 0);
					if (!map.containsKey(next)) {
						map.put(next, cnt);
						que.add(next);
					}
				}
				ArrayList<Integer> next = new ArrayList<Integer>(now);
				int t = next.get((zero + 4) % 8);
				next.set(zero, t);
				next.set((zero + 4) % 8, 0);
				if (!map.containsKey(next)) {
					map.put(next, cnt);
					que.add(next);
				}
			}
		}
		while (sc.hasNext()) {
			Integer[] in = new Integer[8];
			for (int i = 0; i < 8; i++) {
				in[i] = sc.nextInt();
			}
			List<Integer> key = Arrays.asList(in);
			System.out.println(map.get(key));
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

	boolean inner(int h, int w, int limH, int limW) {
		return 0 <= h && h < limH && 0 <= w && w < limW;
	}

	void swap(int[] x, int a, int b) {
		int tmp = x[a];
		x[a] = x[b];
		x[b] = tmp;
	}

	// find minimum i (a[i] >= border)
	int lower_bound(long a[], long border) {
		int l = -1;
		int r = a.length;

		while (r - l > 1) {
			int mid = (l + r) / 2;
			if (border < a[mid]) {
				r = mid;
			} else {
				l = mid;
			}
		}
		// r = l + 1
		return r - 1;
	}

	boolean palindrome(String s) {
		for (int i = 0; i < s.length() / 2; i++) {
			if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
				return false;
			}
		}
		return true;
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

		long nextLong() {
			return Long.parseLong(next());
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

		int[] nextIntArray(int n) {
			int[] in = new int[n];
			for (int i = 0; i < n; i++) {
				in[i] = nextInt();
			}
			return in;
		}

		int[][] nextInt2dArray(int n, int m) {
			int[][] in = new int[n][m];
			for (int i = 0; i < n; i++) {
				in[i] = nextIntArray(m);
			}
			return in;
		}

		double[] nextDoubleArray(int n) {
			double[] in = new double[n];
			for (int i = 0; i < n; i++) {
				in[i] = nextDouble();
			}
			return in;
		}

		long[] nextLongArray(int n) {
			long[] in = new long[n];
			for (int i = 0; i < n; i++) {
				in[i] = nextLong();
			}
			return in;
		}

		char[][] nextCharField(int n, int m) {
			char[][] in = new char[n][m];
			for (int i = 0; i < n; i++) {
				String s = sc.next();
				for (int j = 0; j < m; j++) {
					in[i][j] = s.charAt(j);
				}
			}
			return in;
		}
	}
}