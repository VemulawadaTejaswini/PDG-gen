import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	
	static final StdIn in = new StdIn();
	static final PrintWriter out = new PrintWriter(System.out);
	public static void main(String[] args) {
		int r = in.nextInt(), c = in.nextInt();
		int n = in.nextInt();
		int[] xs = new int[n];
		int[] ys = new int[n];
		HashSet<Long> points = new HashSet<>();
		int[] onX = new int[c + 1], onY = new int[r + 1];
		for (int i = 0; i < n; ++i) {
			xs[i] = in.nextInt() - 1;
			ys[i] = in.nextInt() - 1;
			points.add(hash(xs[i], ys[i]));
			onX[xs[i]]++;
			onY[ys[i]]++;
		}
		int maxX = 0, maxY = 0;
		for (int x = 0; x < r; x++)
			maxX = Math.max(maxX, onX[x]);
		for (int y = 0; y < c; y++)
			maxY = Math.max(maxY, onY[y]);
		ArrayList<Integer> canXs = new ArrayList<>(), canYs = new ArrayList<>();
		for (int x = 0; x < r; x++)
			if (onX[x] == maxX)
				canXs.add(x);
		for (int y = 0; y < c; ++y)
			if (onY[y] == maxY)
				canYs.add(y);
		int ans = maxX + maxY - 1;
		outer: for (int x : canXs) {
			for (int y : canYs)
				if (!points.contains(hash(x, y))) {
					ans++;
					break outer;
				}
		}
		out.println(ans);
		out.close();
	}
	
	private static long hash(int x, int y) {
		return x * 1_000_000_000L + y;
	}
	
	private static class Pair {
		int a, b;
		public Pair(int x, int y) {
			a = x;
			b = y;
		}
	}
	
	private static class StdIn {
		private BufferedReader br;
		private StringTokenizer st;
		public StdIn() {
			st = null;
			br = new BufferedReader(new InputStreamReader(System.in), 1 << 20);
		}
		public String next() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return st.nextToken();
		}
		public int nextInt() {
			return Integer.parseInt(next());
		}
	}
}