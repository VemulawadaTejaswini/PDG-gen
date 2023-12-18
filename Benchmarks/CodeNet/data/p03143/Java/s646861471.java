import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int N, M;
	static long[] X;

	public static void main(String[] args) {
		N = sc.nextInt();
		M = sc.nextInt();
		X = new long[N];
		for (int i = 0; i < N; i++) {
			X[i] = sc.nextInt();
		}
		Edge[] es = new Edge[M];
		for (int i = 0; i < M; i++) {
			int A = Integer.parseInt(sc.next()) - 1;
			int B = Integer.parseInt(sc.next()) - 1;
			int Y = Integer.parseInt(sc.next());
			es[i] = new Edge(A, B, Y);
		}
		Arrays.sort(es, (e1, e2) -> Integer.compare(e1.w, e2.w));
		UnionFind uf = new UnionFind(N);
		int ans = M;
		for (int i = 0; i < M; i++) {
			uf.union(es[i].a, es[i].b, es[i].w);
			if (uf.invalidCount == 0) {
				ans = M - (i + 1);
			}
		}
		System.out.println(ans);
	}

	static class Edge {
		int a, b;
		int w;

		public Edge(int a, int b, int w) {
			this.a = a;
			this.b = b;
			this.w = w;
		}
	}

	static class Node {
		int size, maxEdge;
		long sumNode;

		Node() {
			size = -1;
		}

		public Node(int size, int maxEdge, long sumNode) {
			this.size = size;
			this.maxEdge = maxEdge;
			this.sumNode = sumNode;
		}

		boolean valid() {
			return sumNode >= maxEdge;
		}
	}

	static class UnionFind {
		Node[] set;
		int invalidCount = 0;

		UnionFind(int n) {
			set = new Node[n];
			for (int i = 0; i < N; i++) {
				set[i] = new Node(-1, 0, X[i]);
			}
		}

		void union(int a, int b, int edgeWeight) {
			int rtA = root(a);
			int rtB = root(b);
			if (rtA == rtB) {
				if (!set[rtA].valid()) invalidCount--;
				set[rtA].maxEdge = Math.max(set[rtA].maxEdge, edgeWeight);
				if (!set[rtA].valid()) invalidCount++;
				return;
			}
			if (!set[rtA].valid()) invalidCount--;
			if (!set[rtB].valid()) invalidCount--;
			set[rtA].size += set[rtB].size;
			set[rtA].sumNode += set[rtB].sumNode;
			set[rtA].maxEdge = Math.max(set[rtA].maxEdge, set[rtB].maxEdge);
			set[rtA].maxEdge = Math.max(set[rtA].maxEdge, edgeWeight);
			set[rtB].size = rtA;
			if (!set[rtA].valid()) invalidCount++;
		}

		boolean find(int a, int b) {
			return root(a) == root(b);
		}

		int root(int a) {
			if (set[a].size < 0) {
				return a;
			} else {
				set[a].size = root(set[a].size);
				return set[a].size;
			}
		}

		int size(int a) {
			return -set[root(a)].size;
		}
	}
}
