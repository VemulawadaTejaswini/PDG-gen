import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		MyScanner sc = new MyScanner();
		PrintWriter out = new PrintWriter(System.out);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] vals = new int[N];
		for (int i = 0; i < N; i++) {
			vals[i] = sc.nextInt();
		}
		while (K > 0) {
			int[] tmp = make(vals);
			if (Arrays.equals(tmp, vals)) break;
			vals = tmp;
			K--;
		}
		for (int i = 0; i < N; i++) {
			out.print(vals[i] + " ");
		}
		out.println();

		out.flush();
	}

	static int[] make(int[] vals) {
		Point[] all = new Point[vals.length * 2];
		int idx = 0;
		for (int i = 0; i < vals.length; i++) {
			all[idx++] = new Point(i - vals[i], true);
			all[idx++] = new Point(i + vals[i], false);
		}
		Arrays.sort(all);
		int[] ret = new int[vals.length];
		idx = 0;
		int got = 0;
		for (int i = 0; i < ret.length; i++) {
			while (idx < all.length && (all[idx].val < i || all[idx].val == i && all[idx].open)) {
				if (all[idx].open) got++;
				else got--;
				idx++;
			}
			ret[i] = got;
		}
		return ret;
	}

	static class Point implements Comparable<Point> {
		int val;
		boolean open;

		public Point(int val, boolean open) {
			this.val = val;
			this.open = open;
		}

		@Override
		public int compareTo(Point o) {
			int cmp = Integer.compare(val, o.val);
			if (cmp != 0) return cmp;
			return Boolean.compare(o.open, open);
		}
	}
	
	static class MyScanner {
		private BufferedReader br;
		private StringTokenizer tokenizer;
		
		public MyScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
		
		public String next() {
			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return tokenizer.nextToken();
		}
		
		public int nextInt() {
			return Integer.parseInt(next());
		}
		
		public long nextLong() {
			return Long.parseLong(next());
		}
	}
}
