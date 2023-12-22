
import java.io.*;

import java.util.*;
import java.math.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.math.BigInteger.*;
import static java.lang.Character.*;

class AOJ1138 {
	static final double INF = 1e30;

	public void run() {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int p = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			if (n == 0 && m == 0 && p == 0 && a == 0 && b == 0)
				return;

			int[] t = new int[n];
			for (int i = 0; i < n; i++)
				t[i] = sc.nextInt();

			V[][] vs = new V[m][1 << n];
			for (int i = 0; i < m; i++)
				for (int j = 0; j < 1 << n; j++)
					vs[i][j] = new V(i == b - 1);

			for (int i = 0; i < p; i++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				double z = sc.nextInt();
				for (int k = 0; k < n; k++)
					for (int j = 0; j < 1 << n; j++)
						if ((j & (1 << k)) == 0) {
							int nj = j | (1 << k);
							double d = z / t[k];
							vs[x - 1][j].add(new E(d, vs[y - 1][nj]));
							vs[y - 1][j].add(new E(d, vs[x - 1][nj]));
						}
			}

			double ret = INF;
			vs[a - 1][0].cost = 0;
			NavigableSet<V> set = new TreeSet<V>();
			set.add(vs[a - 1][0]);
			while (!set.isEmpty()) {
				V v = set.pollFirst();
				if (v.isGoal) {
					ret = v.cost;
					break;
				}
				for (E e : v) {
					if (v.cost + e.cost < e.to.cost) {
						set.remove(e.to);
						e.to.cost = v.cost + e.cost;
						set.add(e.to);
					}
				}
			}
//			Queue<E> que = new PriorityQueue<E>();
//			que.offer(new E(0, vs[a - 1][0]));
//			while (!que.isEmpty()) {
//				V v = que.poll().to;
//				if (v.isGoal) {
//					ret = v.cost;
//					break;
//				}
//				for (E e : v) {
//					if (v.cost + e.cost < e.to.cost) {
//						e.to.cost = v.cost + e.cost;
//						que.offer(new E(e.to.cost, e.to));
//					}
//				}
//			}
			System.out.println(ret == INF ? "Impossible" : ret);
		}
	}

	int nid = 0;
	class V extends ArrayList<E> implements Comparable<V> {
		double cost = INF;
		final boolean isGoal;
		final int id = nid++;

		public V(boolean isGoal) {
			this.isGoal = isGoal;
		}

		@Override
		public int compareTo(V o) {
			return cost == o.cost ? id - o.id : Double.compare(cost, o.cost);
		}
	}

	class E implements Comparable<E>{
		final double cost;
		final V to;

		public E(double cost, V to) {
			this.cost = cost;
			this.to = to;
		}
		@Override
		public int compareTo(E o) {
			return Double.compare(cost, o.cost);
		}
	}
}

public class Main {
	public static void main(String... args) {
		new AOJ1138().run();
	}

	public static void debug(Object... os) {
		System.err.println(java.util.Arrays.deepToString(os));
	}
}

class Scanner {
	final java.util.Scanner sc;

	public double nextDouble() {
		return Double.parseDouble(sc.next());
	}

	public Scanner(java.io.InputStream is) {
		this.sc = new java.util.Scanner(is);
	}

	public boolean hasNext() {
		return sc.hasNext();
	}

	public String next() {
		return sc.next();
	}

	public int nextInt() {
		return Integer.parseInt(sc.next());
	}

	public String nextLine() {
		return sc.nextLine();
	}

	public long nextLong() {
		return Long.parseLong(sc.next());
	}
}