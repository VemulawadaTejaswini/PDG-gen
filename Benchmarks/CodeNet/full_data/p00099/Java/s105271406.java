import java.util.*;
import java.io.*;
import java.awt.geom.*;
import java.math.*;

public class Main {

	static final Scanner in = new Scanner(System.in);
	static final PrintWriter out = new PrintWriter(System.out,false);

	static void solve() {
		int n = in.nextInt();
		int q = in.nextInt();

		int[] cnt = new int[n+1];

		PriorityQueue<Pair> pQ = new PriorityQueue<Pair>();

		for (int i=1; i<=n; i++) {
			pQ.add(new Pair(0,i));
		}

		while (q-- > 0) {
			int a = in.nextInt();
			int v = in.nextInt();
			pQ.remove(new Pair(cnt[a],a));

			cnt[a] += v;

			pQ.add(new Pair(cnt[a],a));

			out.println(pQ.peek().second + " " + pQ.peek().first);
		}
	}

	static class Pair implements Comparable {
		int first, second;

		public Pair(int first, int second) {
			this.first = first; this.second = second;
		}

		public boolean equals(Object o) {
			Pair other = (Pair)o;
			return this.first == other.first && this.second == other.second;
		}

		public int compareTo(Object o) {
			Pair other = (Pair)o;
			if (other.first != this.first) return other.first - this.first;
			return this.second - other.second;
		}
	}

	public static void main(String[] args) {
		long start = System.currentTimeMillis();

		solve();
		out.flush();

		long end = System.currentTimeMillis();
		//trace(end-start + "ms");
		in.close();
		out.close();
	}

	static void trace(Object... o) { System.out.println(Arrays.deepToString(o));}
}