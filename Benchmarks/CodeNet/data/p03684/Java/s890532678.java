

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	static class Triple {
		int idx, x, y;

		Triple(int a, int b, int c) {
			idx = a;
			x = b;
			y = c;
		}

		@Override
		public String toString() {
			return idx + " " + x + " " + y;
		}
	}

	static class Edge {
		int u, v;
		long cost;

		Edge(int a, int b, long c) {
			u = a;
			v = b;
			cost = c;
		}

		@Override
		public String toString() {
			return u + " " + v + " " + cost;
		}
	}

	static class UnionFind {
		int[] rep, rank;

		UnionFind(int n) {
			rep = new int[n];
			rank = new int[n];
			for (int i = 0; i < n; i++)
				rep[i] = i;
		}

		boolean union(int x, int y) {
			if (sameSet(x, y))
				return false;
			x = findSet(x);
			y = findSet(y);
			if (rank[x] > rank[y])
				rep[y] = y;
			else {
				rep[x] = y;
				if (rank[x] == rank[y])
					rank[y]++;
			}
			return true;
		}

		int findSet(int x) {
			if (rep[x] == x)
				return x;
			return rep[x] = findSet(rep[x]);
		}

		boolean sameSet(int x, int y) {
			return findSet(x) == findSet(y);
		}
	}

	public static void main(String[] args) throws IOException {
		MyScanner sc = new MyScanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int n = sc.nextInt();
		Triple[] t = new Triple[n];
		for (int i = 0; i < n; i++)
			t[i] = new Triple(i, sc.nextInt(), sc.nextInt());
		Edge[] edgeList = new Edge[(n << 1) - 2];
		Arrays.sort(t, (a, b) -> a.x - b.x);
		for (int i = 0; i < n - 1; i++)
			edgeList[i] = new Edge(t[i].idx, t[i + 1].idx, t[i + 1].x - t[i].x);
		Arrays.sort(t, (a, b) -> a.y - b.y);
		for (int i = 0; i < n - 1; i++)
			edgeList[(n - 1) + i] = new Edge(t[i].idx, t[i + 1].idx, t[i + 1].y - t[i].y);
		Arrays.sort(edgeList, (a, b) -> Long.compare(a.cost, b.cost));
		UnionFind uf = new UnionFind(n);
		long mst = 0;
		for (Edge e : edgeList) {
			if (uf.union(e.u, e.v))
				mst += e.cost;
		}
		out.println(mst);
		out.flush();
		out.close();
	}

	static class MyScanner {
		StringTokenizer st;
		BufferedReader br;

		public MyScanner(InputStream s) {
			br = new BufferedReader(new InputStreamReader(s));
		}

		public MyScanner(String file) throws IOException {
			br = new BufferedReader(new FileReader(new File(file)));
		}

		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}

		public String nextLine() throws IOException {
			return br.readLine();
		}

		public boolean ready() throws IOException {
			return br.ready();
		}
	}
}
