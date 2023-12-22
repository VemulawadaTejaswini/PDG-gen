import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	int N, M;
	Node[] nodes;

	static class Node {
		int id;
		int parent = -2;
		Set<Integer> conns;

		Node(int id) {
			this.id = id;
			this.conns = new HashSet<>();
		}
	}

	static class Edge {
		int src, dst;

		Edge(int src, int dst) {
			this.src = src;
			this.dst = dst;
		}
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
		N = Integer.parseInt(tokens[0]);
		M = Integer.parseInt(tokens[1]);
		this.nodes = new Node[N];
		for (int i = 0; i < N; ++i) {
			this.nodes[i] = new Node(i);
		}
		for (int i = 0; i < M; ++i) {
			tokens = in.readLine().split(" ");
			int a = Integer.parseInt(tokens[0]) - 1;
			int b = Integer.parseInt(tokens[1]) - 1;
			nodes[a].conns.add(b);
			nodes[b].conns.add(a);
		}
	}

	void mark(int current, int parent) {
		if (nodes[current].parent != -2) {
			return;
		}
		nodes[current].parent = parent;
		for (Integer i : nodes[current].conns) {
			if (i.equals(parent)) {
				continue;
			}
			mark(i, current);
		}
	}

	void calc() {
		Deque<Edge> que = new ArrayDeque<>();
		for (Integer dst : nodes[0].conns) {
			que.add(new Edge(0, dst));
		}
		Set<Integer> markedNodes = new HashSet<>();
		markedNodes.add(0);
		nodes[0].parent = -1;
		while (!que.isEmpty()) {
			Edge edge = que.poll();
			if (!markedNodes.contains(edge.dst)) {
				nodes[edge.dst].parent = edge.src;
				markedNodes.add(edge.dst);
				for (Integer dst : nodes[edge.dst].conns) {
					if (markedNodes.contains(dst)) {
						continue;
					}
					que.add(new Edge(edge.dst, dst));
				}
			}
		}
		System.out.println("Yes");
		for (int i = 1; i < N; ++i) {
			System.out.println((nodes[i].parent + 1));
		}
	}

	void showResult() {
	}

}
