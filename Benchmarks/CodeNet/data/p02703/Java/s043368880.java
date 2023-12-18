import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	int N, M;
	long S;
	Node[][] nodes;
	int maxCoin;
	Map<Integer, Long> minDists;

	static class Node {
		int id;
		int coin;
		long dist;
		Set<Edge> edges = new HashSet<>();
	}

	static class Edge {
		long length;
		Node src, dst;
	}

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	Main(BufferedReader in) throws IOException {
		String[] tokens = in.readLine().split(" ");
		this.N = Integer.parseInt(tokens[0]);
		this.M = Integer.parseInt(tokens[1]);
		this.S = Long.parseLong(tokens[2]);
		// 値の読み込み
		int[] U = new int[M];
		int[] V = new int[M];
		int[] A = new int[M];
		long[] B = new long[M];
		for (int i = 0; i < M; ++i) {
			tokens = in.readLine().split(" ");
			int u = Integer.parseInt(tokens[0]) - 1;
			int v = Integer.parseInt(tokens[1]) - 1;
			int a = Integer.parseInt(tokens[2]);
			long b = Long.parseLong(tokens[3]);
			U[i] = u;
			V[i] = v;
			A[i] = a;
			B[i] = b;
		}
		long[] C = new long[N];
		long[] D = new long[N];
		for (int i = 0; i < N; ++i) {
			tokens = in.readLine().split(" ");
			long c = Long.parseLong(tokens[0]);
			long d = Long.parseLong(tokens[1]);
			C[i] = c;
			D[i] = d;
		}
		// 最大の運賃を求める．
		this.maxCoin = 0;
		for (int a : A) {
			maxCoin = Math.max(maxCoin, a);
		}
		this.maxCoin *= (N - 1);

		// nodeIdとcoinを状態として持つnodeMatrixを作る
		this.nodes = new Node[N][maxCoin + 1];
		for (int i = 0; i < N; ++i) {
			for (int j = 0; j <= maxCoin; ++j) {
				Node node = new Node();
				node.coin = j;
				node.dist = Long.MAX_VALUE / 4;
				node.id = i;
				this.nodes[i][j] = node;
			}
		}

		// coinを減らす際のEdgeを作成する
		for (int i = 0; i < N; ++i) {
			for (int j = maxCoin; j > 0; --j) {
				Node src = nodes[i][j];
				Node dst = nodes[i][j - 1];
				Edge edge = new Edge();
				edge.src = src;
				edge.dst = dst;
				edge.length = 0;
				src.edges.add(edge);
			}
		}
		// coinを両替する際のEdgeを作成する
		for (int i = 0; i < N; ++i) {
			for (int j = 0; j < maxCoin; ++j) {
				long newCoin = (long) j + C[i];
				if (newCoin > maxCoin) {
					newCoin = (long) maxCoin;
				}
				int nc = (int) newCoin;
				Node src = nodes[i][j];
				Node dst = nodes[i][nc];
				Edge edge = new Edge();
				edge.src = src;
				edge.dst = dst;
				edge.length = D[i];
				src.edges.add(edge);
			}
		}

		// 移動の際のEdgeを作成する
		for (int i = 0; i < M; ++i) {
			int a = A[i];
			long b = B[i];
			int u = U[i];
			int v = V[i];
			for (int j = maxCoin; j >= 0; --j) {
				int newCoin = j - a;
				if (newCoin < 0) {
					break;
				}
				Node src = nodes[u][j];
				Node dst = nodes[v][newCoin];
				Edge edge0 = new Edge();
				edge0.src = src;
				edge0.dst = dst;
				edge0.length = b;
				src.edges.add(edge0);
				Node src1 = nodes[v][j];
				Node dst1 = nodes[u][newCoin];
				Edge edge1 = new Edge();
				edge1.src = src1;
				edge1.dst = dst1;
				edge1.length = b;
				src1.edges.add(edge1);
			}
		}
		this.minDists = new HashMap<>();
	}

	void calc() {
		Queue<Edge> que = new PriorityQueue<>(new Comparator<Edge>() {
			@Override
			public int compare(Edge o1, Edge o2) {
				return Long.compare(o1.length, o2.length);
			}
		});
		int initCoin = maxCoin;
		if (initCoin > (int) S) {
			initCoin = (int) S;
		}
		que.addAll(nodes[0][initCoin].edges);
		this.minDists.put(0, 0L);
		nodes[0][initCoin].dist = 0L;
		Set<Edge> evaledEdges = new HashSet<>();
		while (!que.isEmpty()) {
			Edge edge = que.poll();
			Node dst = edge.dst;
			if(dst.dist > edge.src.dist + edge.length) {
				dst.dist = edge.src.dist + edge.length;
			}
			if (!minDists.containsKey(dst.id)) {
				minDists.put(dst.id, dst.dist);
			} else if (minDists.get(dst.id) > dst.dist) {
				minDists.put(dst.id, dst.dist);
			}
			evaledEdges.add(edge);
			for (Edge e : dst.edges) {
				if (!evaledEdges.contains(e)) {
					que.add(e);
				}
			}
		}
	}

	void showResult() {
		for (int i = 1; i < N; ++i) {
			System.out.println(minDists.get(i));
		}
	}

}
