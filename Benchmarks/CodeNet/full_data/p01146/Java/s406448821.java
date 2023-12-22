
import java.awt.font.GraphicAttribute;
import java.io.*;
import java.util.*;

import javax.swing.undo.StateEdit;

import org.omg.PortableServer.POAManagerPackage.State;

public class Main {
	FastScanner in = new FastScanner(System.in);
	PrintWriter out = new PrintWriter(System.out);

	class Edge {
		int to;
		int cost;

		Edge(int to, int cost) {
			this.to = to;
			this.cost = cost;
		}
	}
	
	class State implements Comparable<State> {
		int u;
		int t;

		State(int u, int t) {
			this.u = u;
			this.t = t;
		}

		public int compareTo(State s) {
			return minDist[u][t] - minDist[s.u][s.t];
		}
	} 
	
	int INF = 1000000000;
	int[][] minDist;
	
	public void run() {
		while (true) {
			int N = in.nextInt(), M = in.nextInt(), L = in.nextInt();
			int K = in.nextInt(), A = in.nextInt(), H = in.nextInt();
			if (N == 0) break;
			
			ArrayList<Edge>[] g = new ArrayList[N];
			for (int i = 0; i < N; i++)
				g[i] = new ArrayList<Edge>();
			
			boolean[] city = new boolean[N];
			for (int i = 0; i < L; i++) {
				int x = in.nextInt();
				city[x] = true;
			}
			
			for (int i = 0; i < K; i++) {
				int x = in.nextInt(), y = in.nextInt(), c = in.nextInt();
				g[x].add(new Edge(y, c));
				g[y].add(new Edge(x, c));
			}
			
			minDist = new int[N][M+1];
			for (int i = 0; i < N; i++) Arrays.fill(minDist[i], INF);
			minDist[A][0] = 0;
			PriorityQueue<State> pq = new PriorityQueue<State>();
			pq.add(new State(A, 0));
			
			while (!pq.isEmpty()) {
				State st = pq.poll();
				if (city[st.u]) {
					for (int i = 1; i <= st.t; i++) {
						if (minDist[st.u][st.t] + i < minDist[st.u][st.t - i]) {
							minDist[st.u][st.t - i] = minDist[st.u][st.t] + i;
							pq.add(new State(st.u, st.t - i));
						}
					}
				}
				for (Edge e : g[st.u]) {
					if (st.t + e.cost <= M) {
						int nc = st.t + e.cost;
						if (minDist[st.u][st.t] + e.cost < minDist[e.to][nc]) {
							minDist[e.to][nc] = minDist[st.u][st.t] + e.cost;
							pq.add(new State(e.to, nc));
						}
					}
				}
			}
			
			int res = INF;
			for (int i = 0; i <= M; i++) 
				res = Math.min(res, minDist[H][i]);
			System.out.println(res == INF ? "Help!" : res);
		}
		out.close();
	}

	public static void main(String[] args) {
		new Main().run();
	}

	public void mapDebug(int[][] a) {
		System.out.println("--------map display---------");

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf("%3d ", a[i][j]);
			}
			System.out.println();
		}

		System.out.println("----------------------------");
		System.out.println();
	}

	public void debug(Object... obj) {
		System.out.println(Arrays.deepToString(obj));
	}

	class FastScanner {
		private InputStream stream;
		private byte[] buf = new byte[1024];
		private int curChar;
		private int numChars;

		public FastScanner(InputStream stream) {
			this.stream = stream;
			//stream = new FileInputStream(new File("dec.in"));

		}

		int read() {
			if (numChars == -1)
				throw new InputMismatchException();
			if (curChar >= numChars) {
				curChar = 0;
				try {
					numChars = stream.read(buf);
				} catch (IOException e) {
					throw new InputMismatchException();
				}
				if (numChars <= 0)
					return -1;
			}
			return buf[curChar++];
		}

		boolean isSpaceChar(int c) {
			return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
		}

		boolean isEndline(int c) {
			return c == '\n' || c == '\r' || c == -1;
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		int[] nextIntArray(int n) {
			int[] array = new int[n];
			for (int i = 0; i < n; i++)
				array[i] = nextInt();

			return array;
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		long[] nextLongArray(int n) {
			long[] array = new long[n];
			for (int i = 0; i < n; i++)
				array[i] = nextLong();

			return array;
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		double[] nextDoubleArray(int n) {
			double[] array = new double[n];
			for (int i = 0; i < n; i++)
				array[i] = nextDouble();

			return array;
		}

		String next() {
			int c = read();
			while (isSpaceChar(c))
				c = read();
			StringBuilder res = new StringBuilder();
			do {
				res.appendCodePoint(c);
				c = read();
			} while (!isSpaceChar(c));
			return res.toString();
		}

		String[] nextStringArray(int n) {
			String[] array = new String[n];
			for (int i = 0; i < n; i++)
				array[i] = next();

			return array;
		}

		String nextLine() {
			int c = read();
			while (isEndline(c))
				c = read();
			StringBuilder res = new StringBuilder();
			do {
				res.appendCodePoint(c);
				c = read();
			} while (!isEndline(c));
			return res.toString();
		}
	}
}