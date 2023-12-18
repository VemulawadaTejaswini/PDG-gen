import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main{ // 

	public static void main(String args[]) {
		ConsoleScanner cin = new ConsoleScanner();
		PrintWriter cout = new PrintWriter(System.out);
		solve(cin, cout);
		cout.flush();
	}

	static long now() {
		return System.currentTimeMillis();
	}

	static void trace(Object... objects) {
		assert null != System.out.format("trace:%s\n", Arrays.deepToString(objects));
	}

	private static void solve(ConsoleScanner cin, PrintWriter cout) {
		// assert solve(1) == 1;

		int x1 = cin.nextInt();
		int y1 = cin.nextInt();
		int x2 = cin.nextInt();
		int y2 = cin.nextInt();
		int n = cin.nextInt();

		int[][] xys = new int[n][];
		for (int i = 0; i < xys.length; i++)
			xys[i] = new int[] { cin.nextInt(), cin.nextInt() };

		long start = now();

		double ans = solve(x1, y1, x2, y2, n, xys);
		cout.println(ans);

		trace("elapsed", now() - start);
	}

	private static double solve(int x1, int y1, int x2, int y2, int n, int[][] xys) {
		// Longest increasing subsequence
		Arrays.sort(xys, Comparator.comparingInt(arr -> arr[0]));
		int[] fr = { x1, y1 };
		int[] to = { x2, y2 };
		if (x1 > x2) {
			int[] tmp = fr;
			fr = to;
			to = tmp;
		}

		int[] sz = new int[2];
		for (int j = 0; j < 1; j++) {
			PriorityQueue<Integer> pq;
			if (fr[0] < fr[1])
				// find longest ascending subsequence of y(s)
				pq = new PriorityQueue<>(Collections.reverseOrder());
			else
				// find longest descending subsequence of y(s)
				pq = new PriorityQueue<>();
			int miny = Math.min(fr[1], to[1]);
			int maxy = Math.max(fr[1], to[1]);
			for (int i = 0; i < n; i++) {
				int x = xys[i][0];
				int y = xys[i][1];
				if (fr[0] > x)
					continue;
				if (x > to[0])
					break;
				if (miny > y || y > maxy)
					continue;
				pq.add(y);
				while (pq.peek() != y)
					pq.remove();
				sz[j] = Math.max(sz[j], pq.size());
				if (sz[0] == sz[1]) {
					// j==1は動作確認用
					trace(pq);
				}
			}
		}

		double ans = 0;
		ans -= 10.0 * 2 * sz[0];
		if (x1 == x2 || y1 == y2) {
			ans += 20.0 / 2 * sz[0] * Math.PI;
		} else {
			ans += 20.0 / 4 * sz[0] * Math.PI;
		}
		ans += 100.0 * Math.abs(x1 - x2);
		ans += 100.0 * Math.abs(y1 - y2);
		return ans;
	}

	static class ConsoleScanner {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer("");

		String next() {
			try {
				while (!st.hasMoreElements())
					st = new StringTokenizer(br.readLine());
				return st.nextToken();
			} catch (IOException e) {
				throw new AssertionError(e);
			}
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}
	}

}
