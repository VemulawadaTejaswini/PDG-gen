import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	static FastScanner sc = new FastScanner(System.in);
	static int N;

	public static void main(String[] args) throws Exception {
		while (true) {
			N = sc.nextInt();
			if (N == 0) break;
			int M = sc.nextInt();
			int[] A = new int[M];
			int[] B = new int[M];
			int[] W = new int[M];
			boolean[] type = new boolean[M];
			ArrayList<ArrayList<Edge>> graph = new ArrayList<>();
			for (int i = 0; i < N; ++i) {
				graph.add(new ArrayList<Edge>());
			}
			for (int i = 0; i < M; ++i) {
				type[i] = sc.nextChar() == '!';
				A[i] = sc.nextInt() - 1;
				B[i] = sc.nextInt() - 1;
				if (type[i]) {
					W[i] = sc.nextInt();
					graph.get(A[i]).add(new Edge(B[i], W[i]));
					graph.get(B[i]).add(new Edge(A[i], -W[i]));
				}
			}
			int[] dist = new int[N];
			Arrays.fill(dist, Integer.MIN_VALUE);
			for (int i = 0; i < N; ++i) {
				if (dist[i] != Integer.MIN_VALUE) continue;
				ArrayDeque<Integer> q = new ArrayDeque<Integer>();
				q.add(i);
				dist[i] = 0;
				while (!q.isEmpty()) {
					int cur = q.poll();
					for (Edge e : graph.get(cur)) {
						int next = e.to;
						if (dist[next] != Integer.MIN_VALUE) continue;
						dist[next] = dist[cur] + e.w;
						q.add(next);
					}
				}
			}

			UnionFind uf = new UnionFind(N);
			for (int i = 0; i < M; ++i) {
				if (type[i]) {
					uf.union(A[i], B[i]);
				} else {
					if (!uf.find(A[i], B[i])) {
						System.out.println("UNKNOWN");
					} else {
						System.out.println(dist[B[i]] - dist[A[i]]);
					}
				}
			}
		}
	}

	static class Edge {
		int to, w;

		Edge(int to, int w) {
			this.to = to;
			this.w = w;
		}
	}

	static class UnionFind {
		int[] set;

		UnionFind(int n) {
			set = new int[n];
			Arrays.fill(set, -1);
		}

		void union(int a, int b) {
			int rtA = root(a);
			int rtb = root(b);
			if (rtA == rtb) {
				return;
			}
			set[rtA] += set[rtb];
			set[rtb] = rtA;
		}

		boolean find(int a, int b) {
			return root(a) == root(b);
		}

		int root(int a) {
			if (set[a] < 0) {
				return a;
			} else {
				set[a] = root(set[a]);
				return set[a];
			}
		}

		int size(int a) {
			return -set[root(a)];
		}
	}

	static class FastScanner {
		Reader input;

		FastScanner() {
			this(System.in);
		}

		FastScanner(InputStream stream) {
			this.input = new BufferedReader(new InputStreamReader(stream));
		}

		int nextInt() throws IOException {
			int sign = 1;
			int b = input.read();
			while ((b < '0' || '9' < b) && b != '-' && b != '+') {
				b = input.read();
			}
			if (b == '-') {
				sign = -1;
				b = input.read();
			} else if (b == '+') {
				b = input.read();
			}
			int ret = b - '0';
			while (true) {
				b = input.read();
				if (b < '0' || '9' < b) return ret * sign;
				ret *= 10;
				ret += b - '0';
			}
		}

		char nextChar() throws IOException {
			int b = input.read();
			while (Character.isWhitespace((char) b)) {
				b = input.read();
			}
			return (char) b;
		}
	}

}