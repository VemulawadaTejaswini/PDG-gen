import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	int N, M;
	long S;
	Node[] nodes;
	List<Edge> edges;
	int maxCoin;
	long[][] distMatrix;

	static class Node {
		int id;
		long C, D;
		Set<Edge> edges = new HashSet<>();
	}

	static class Edge {
		int U, V;
		int A;
		long B;
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
		this.edges = new ArrayList<>(M);
		for (int i = 0; i < M; ++i) {
			tokens = in.readLine().split(" ");
			int U = Integer.parseInt(tokens[0]) - 1;
			int V = Integer.parseInt(tokens[1]) - 1;
			int A = Integer.parseInt(tokens[2]);
			long B = Long.parseLong(tokens[3]);
			Edge edge = new Edge();
			edge.U = U;
			edge.V = V;
			edge.A = A;
			edge.B = B;
			this.edges.add(edge);
		}
		this.nodes = new Node[N];
		for (int i = 0; i < N; ++i) {
			tokens = in.readLine().split(" ");
			Node node = new Node();
			node.id = i;
			node.C = Long.parseLong(tokens[0]);
			node.D = Long.parseLong(tokens[1]);
			this.nodes[i] = node;
		}
		for (Edge edge : edges) {
			nodes[edge.U].edges.add(edge);
			nodes[edge.V].edges.add(edge);
		}
		// 最大の運賃を求める．
		this.maxCoin = 0;
		for (Edge edge : edges) {
			maxCoin = Math.max(maxCoin, edge.A);
		}
		this.maxCoin *= (N - 1);
		// Node0からの距離行列(ただし手持ちの資金の状態含む)を作る．
		this.distMatrix = new long[N][maxCoin + 1];
		for (int i = 0; i < N; ++i) {
			Arrays.fill(distMatrix[i], Long.MAX_VALUE / 2);
		}
		for (int i = 0; i <= maxCoin; ++i) {
			if (i > S) {
				Node node = this.nodes[0];
				long time = (i / S) * node.C * node.D;
				if (i % S != 0) {
					time += node.D;
				}
				distMatrix[0][i] = time;
			} else {
				distMatrix[0][i] = 0L;
			}
		}
	}

	void evalEdge(int src, int dst, Edge edge) {
		for (int i = 0; i <= maxCoin - edge.A; ++i) {
			distMatrix[dst][i] = Math.min(distMatrix[dst][i], distMatrix[src][i + edge.A] + edge.B);
		}
		for (int i = maxCoin - edge.A + 1; i <= maxCoin; ++i) {
			int index = i - (int) nodes[dst].C;
			if (index < 0) {
				index = 0;
			}
			distMatrix[dst][i] = distMatrix[dst][index] + nodes[dst].D;
		}
	}

	void calc() {
		Queue<Edge> que = new PriorityQueue<>(new Comparator<Edge>() {
			@Override
			public int compare(Edge o1, Edge o2) {
				return Long.compare(o1.B, o2.B);
			}
		});
		que.addAll(nodes[0].edges);
		Set<Edge> evaledEdges = new HashSet<>();
		Set<Integer> evaledNodes = new HashSet<>();
		evaledNodes.add(0);
		while (!que.isEmpty()) {
			Edge edge = que.poll();
			evaledEdges.add(edge);
			// edgeの評価
			if (evaledNodes.contains(edge.U) && evaledNodes.contains(edge.V)) {
				evalEdge(edge.U, edge.V, edge);
				evalEdge(edge.V, edge.U, edge);
				evaledNodes.add(edge.U);
				evaledNodes.add(edge.V);
			} else if (evaledNodes.contains(edge.U)) {
				evalEdge(edge.U, edge.V, edge);
				evaledNodes.add(edge.V);
				for (Edge e : nodes[edge.V].edges) {
					if (!evaledEdges.contains(e)) {
						que.add(e);
					}
				}
			} else {
				evalEdge(edge.V, edge.U, edge);
				evaledNodes.add(edge.U);
				for (Edge e : nodes[edge.U].edges) {
					if (!evaledEdges.contains(e)) {
						que.add(e);
					}
				}
			}
		}
	}

	void showResult() {
		long[] minDistances = new long[N];
		Arrays.fill(minDistances, Long.MAX_VALUE / 2);
		minDistances[0] = 0;
		for (int i = 1; i < N; ++i) {
			for (int j = 0; j <= maxCoin; ++j) {
				minDistances[i] = Math.min(minDistances[i], distMatrix[i][j]);
			}
		}
		for (int i = 1; i < N; ++i) {
			System.out.println(minDistances[i]);
		}
	}

}