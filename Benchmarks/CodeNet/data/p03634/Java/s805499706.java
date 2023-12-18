import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Main {

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
		int n = cin.nextInt();
		int[][] abcs = new int[n - 1][];
		for (int i = 0; i < abcs.length; i++)
			abcs[i] = new int[] { cin.nextInt(), cin.nextInt(), cin.nextInt() };
		int q = cin.nextInt();
		int k = cin.nextInt();
		int[][] xys = new int[q][];
		for (int i = 0; i < xys.length; i++)
			xys[i] = new int[] { cin.nextInt(), cin.nextInt() };

		long start = now();

		long[] ans = solve(n, abcs, q, k, xys);
		String ansstr = Arrays.stream(ans).mapToObj(Objects::toString)
				.collect(Collectors.joining(System.lineSeparator()));

		cout.println(ansstr);
		trace("elapsed", now() - start);
	}

	private static long[] solve(int n, int[][] abcs, int q, int k, int[][] xys) {
		int[] elen = new int[n + 1];
		for (int[] abc : abcs) {
			elen[abc[0]] += 1;
			elen[abc[1]] += 1;
		}
		int[][][] edges = new int[n + 1][][];
		for (int i = 1; i <= n; i++)
			edges[i] = new int[elen[i]][];
		for (int[] abc : abcs) {
			edges[abc[0]][--elen[abc[0]]] = new int[] { abc[1], abc[2] };
			edges[abc[1]][--elen[abc[1]]] = new int[] { abc[0], abc[2] };
		}

		// 始点Kからの最短経路
		// ダイクストラ法
		long[] dist = new long[n + 1];
		Arrays.fill(dist, -1L);
		PriorityQueue<long[]> pq = new PriorityQueue<>(Comparator.comparingLong(vals -> vals[1]));
		pq.add(new long[] { k, 0 });
		while (!pq.isEmpty()) {
			long[] arg = pq.poll();
			int v = (int) arg[0];
			long c = arg[1];
			if (dist[v] != -1)
				continue;
			dist[v] = c;
			for (int[] e : edges[v]) {
				int to = e[0];
				if (dist[to] != -1)
					continue;
				pq.add(new long[] { to, c + e[1] });
			}
		}

		long[] ans = Arrays.stream(xys).mapToLong(xy -> dist[xy[0]] + dist[xy[1]]).toArray();
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
