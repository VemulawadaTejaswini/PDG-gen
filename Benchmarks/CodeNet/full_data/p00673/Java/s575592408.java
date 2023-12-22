import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int N, G;
	static int[] M = new int[100];
	static int[][] X = new int[100][20];
	static int[][] Y = new int[100][20];
	static int[][] C = new int[100][20];
	static ArrayList<Node> all = new ArrayList<Node>();

	public static void main(String[] args) {
		while (true) {
			N = sc.nextInt();
			if (N == 0) break;
			all.clear();
			for (int i = 0; i < N - 1; ++i) {
				M[i] = sc.nextInt();
				for (int j = 0; j < M[i]; ++j) {
					X[i][j] = sc.nextInt();
					Y[i][j] = sc.nextInt();
					C[i][j] = sc.nextInt();
				}
			}
			G = sc.nextInt();
			ArrayList<Node> cur = new ArrayList<Node>();
			Node source = new Node(0);
			cur.add(source);
			for (int i = 0; i < N - 1; ++i) {
				HashMap<Integer, Node> map = new HashMap<Integer, Node>();
				for (int j = 0; j < M[i]; ++j) {
					if (!map.containsKey(Y[i])) {
						map.put(Y[i][j], new Node(Y[i][j]));
					}
				}
				for (Node n : cur) {
					for (int j = 0; j < M[i]; ++j) {
						if (n.time <= X[i][j]) {
							n.addEdge(1, C[i][j], map.get(Y[i][j]));
						}
					}
				}
				ArrayList<Node> next = new ArrayList<Node>();
				for (int key : map.keySet()) {
					Node nn = new Node(key);
					map.get(key).addEdge(1, 0, nn);
					next.add(nn);
				}
				cur = next;
			}
			Node sink = new Node(Integer.MAX_VALUE);
			for (Node n : cur) {
				n.addEdge(1, 0, sink);
			}
			int[] ans = minCostFlow(source, sink, all, G);
			System.out.println(ans[0] + " " + ans[1]);
		}
	}

	static int[] minCostFlow(Node src, Node sink, ArrayList<Node> all, int maxFlow) {
		int[] ret = new int[2];
		for (int i = 0; i < maxFlow; ++i) {
			for (Node n : all) {
				n.dist = Integer.MAX_VALUE;
				n.prev = null;
				n.amount = 0;
			}
			src.dist = 0;
			src.amount = Integer.MAX_VALUE;
			for (int j = 0; j < all.size(); ++j) {
				boolean update = false;
				for (Node n : all) {
					if (n.dist == Integer.MAX_VALUE) continue;
					for (Edge edge : n.edges) {
						if (edge.cap - edge.flow > 0 && edge.to.dist > n.dist + edge.cost) {
							edge.to.dist = n.dist + edge.cost;
							edge.to.prev = edge;
							edge.to.amount = Math.min(n.amount, edge.cap - edge.flow);
							update = true;
						}
					}
					for (Edge edge : n.rev) {
						if (edge.flow > 0 && edge.from.dist > n.dist - edge.cost) {
							edge.from.dist = n.dist - edge.cost;
							edge.from.prev = edge;
							edge.from.amount = Math.min(n.amount, edge.flow);
							update = true;
						}
					}
				}
//				for (Node n : all) {
//					System.out.println(n.time + " " + n.dist + " " + n.amount);
//				}
//				System.out.println();
				if (!update) break;
			}
			if (sink.dist == Integer.MAX_VALUE) break;
			ret[0]++;
			ret[1] += sink.dist * sink.amount;
			Node cur = sink;
			while (cur != src) {
				if (cur.prev.to == cur) {
					cur.prev.flow += sink.amount;
					cur = cur.prev.from;
				} else {
					cur.prev.flow -= sink.amount;
					cur = cur.prev.to;
				}
			}
		}
		return ret;
	}

	static class Node {
		ArrayList<Edge> edges = new ArrayList<Edge>();
		ArrayList<Edge> rev = new ArrayList<Edge>();
		int time;
		int dist;
		Edge prev;
		int amount;

		Node(int t) {
			this.time = t;
			all.add(this);
		}

		void addEdge(int cap, int cost, Node to) {
			Edge edge = new Edge(cap, cost, this, to);
			this.edges.add(edge);
			to.rev.add(edge);
		}
	}

	static class Edge {
		int cap, flow, cost;
		Node from, to;

		Edge(int cap, int cost, Node from, Node to) {
			this.cap = cap;
			this.flow = 0;
			this.cost = cost;
			this.from = from;
			this.to = to;
		}
	}

}