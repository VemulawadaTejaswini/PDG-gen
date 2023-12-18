import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {

	public static void main(String args[]) {
		ConsoleScanner cin = new ConsoleScanner();
		PrintWriter cout = new PrintWriter(System.out);
		solve(cin, cout);
		cout.flush();
	}

	private static void solve(ConsoleScanner cin, PrintWriter cout) {

		// timeout?
		// int[][] arr = new int[100000 - 1][2];
		// for (int i = 0; i < arr.length; i++) {
		// arr[i][0] = i + 1;
		// arr[i][1] = i + 2;
		// }
		// System.out.println(solve(100000, arr));

		int n = cin.nextInt();
		int[][] abs = new int[n - 1][];
		for (int i = 0; i < abs.length; i++)
			abs[i] = new int[] { cin.nextInt(), cin.nextInt() };

		String ans = solve(n, abs);
		cout.println(ans);
	}

	private static String solve(int n, int[][] abs) {
		TreeSet<int[]> tmap = new TreeSet<>(Comparator.comparingLong((ab) -> (long) ab[0] * Integer.MAX_VALUE + ab[1]));
		for (int[] ab : abs) {
			tmap.add(ab);
			tmap.add(new int[] { ab[1], ab[0] });
		}

		// 1 to n, shortest path
		// ダイクストラ法
		int sp = -1;
		PriorityQueue<int[]> q = new PriorityQueue<>(Comparator.comparingInt((dhp) -> dhp[0]));
		Integer[] preced = new Integer[n + 1];
		q.add(new int[] { 0, 1, -1 });
		while (!q.isEmpty()) {
			int[] arr = q.poll();
			int dist = arr[0];
			int here = arr[1];
			int pre = arr[2];
			if (preced[here] != null)
				continue;
			preced[here] = pre;
			if (here == n) {
				sp = dist;
				break;
			}
			for (int[] edge : tmap.subSet(new int[] { here, 0 }, new int[] { here + 1, 0 })) {
				int to = edge[1];
				if (preced[to] != null)
					continue;
				q.add(new int[] { dist + 1, to, here });
			}
		}
		q.clear();

		ArrayDeque<int[]> stk = new ArrayDeque<>();
		Integer[] paint = new Integer[n + 1];
		final int FENNEC = 1;
		final int SNUKE = 0;
		for (int i = 1, p = preced[n]; i < sp; i++) {
			if (i < sp / 2)
				paint[p] = SNUKE;
			else
				paint[p] = FENNEC;
			stk.add(new int[] { p, paint[p] });
			p = preced[p];
		}
		paint[1] = FENNEC;
		paint[n] = SNUKE;
		stk.add(new int[] { 1, paint[1] });
		stk.add(new int[] { n, paint[n] });

		while (!stk.isEmpty()) {
			int[] arr = stk.pollFirst();
			int here = arr[0];
			int color = arr[1];
			for (int[] edge : tmap.subSet(new int[] { here, 0 }, new int[] { here + 1, 0 })) {
				int to = edge[1];
				if (paint[to] != null)
					continue;
				paint[to] = color;
				stk.add(new int[] { to, color });
			}
		}

		long fennec = Arrays.stream(paint).filter(p -> p != null && p == FENNEC).count();
		long sunuke = Arrays.stream(paint).filter(p -> p != null && p == SNUKE).count();
		if (fennec > sunuke)
			return "Fennec";
		return "Snuke";
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
	}

}
