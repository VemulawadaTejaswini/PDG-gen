import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Main {
	static class Node {
		int id;
		Set<Integer> connNodes;
		int value;

		Node(int id) {
			this.id = id;
			this.connNodes = new HashSet<>();
			this.value = -1;
		}

		int getEdgeNum() {
			return this.connNodes.size();
		}
	}

	static class Edge {
		int src, dst;
		int value;

		Edge(int src, int dst) {
			this.src = src;
			this.dst = dst;
		}
	}

	int N;
	List<Node> nodes;
	List<Edge> edges;
	List<Integer> values;

	Main(int N, List<String> es, String vals) {
		this.N = N;
		this.nodes = new ArrayList<>();
		for (int i = 0; i < N; ++i) {
			this.nodes.add(new Node(i));
		}
		this.edges = new ArrayList<>();
		for (String edge : es) {
			String[] tokens = edge.split(" ");
			int a = Integer.parseInt(tokens[0]) - 1;
			int b = Integer.parseInt(tokens[1]) - 1;
			this.nodes.get(a).connNodes.add(b);
			this.nodes.get(b).connNodes.add(a);
			this.edges.add(new Edge(a, b));
		}
		String[] ts = vals.split(" ");
		this.values = new ArrayList<>();
		for (int i = 0; i < ts.length; ++i) {
			this.values.add(Integer.parseInt(ts[i]));
		}

		Collections.sort(this.values);
		calc();
		show();
	}

	void calc() {
		Collections.sort(this.nodes, new Comparator<Node>() {
			@Override
			public int compare(Node o1, Node o2) {
				if (o1.getEdgeNum() < o2.getEdgeNum()) {
					return -1;
				} else if (o1.getEdgeNum() > o2.getEdgeNum()) {
					return 1;
				} else {
					return 0;
				}
			}
		});
		for (int i = 0; i < this.nodes.size(); ++i) {
			this.nodes.get(i).value = this.values.get(i);
		}

		Collections.sort(this.nodes, new Comparator<Node>() {
			@Override
			public int compare(Node o1, Node o2) {
				if (o1.id < o2.id) {
					return -1;
				} else if (o1.id > o2.id) {
					return 1;
				} else {
					return 0;
				}
			}
		});
	}

	void show() {
		int score = 0;
		for (int i = 0; i < this.edges.size(); ++i) {
			int src = this.edges.get(i).src;
			int dst = this.edges.get(i).dst;
			int val = Math.min(this.nodes.get(src).value, this.nodes.get(dst).value);
			score += val;
		}
		System.out.println(score);
		System.out.println(this.toStr());
	}

	String toStr() {
		StringBuilder strBuilder = new StringBuilder();
		for (int i = 0; i + 1 < this.nodes.size(); ++i) {
			strBuilder.append(this.nodes.get(i).value + " ");
		}
		strBuilder.append(this.nodes.get(this.nodes.size() - 1).value);
		return strBuilder.toString();
	}

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);

		int N = Integer.parseInt(in.readLine());
		List<String> edges = new ArrayList<>(N - 1);
		for (int i = 0; i < N - 1; ++i) {
			edges.add(in.readLine());
		}
		Main ins = new Main(N, edges, in.readLine());
	}

}