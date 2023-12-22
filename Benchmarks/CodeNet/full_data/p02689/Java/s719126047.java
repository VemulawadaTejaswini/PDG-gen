import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class Main {
	//java11

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		int[] H = new int[N];
		for(int i=0; i<N; i++) {
			H[i] = sc.nextInt();
		}

		Graph g = new Graph(N);
		for(int i=0; i<M; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();

			g.addEdge(g.getNode(A), g.getNode(B));
			g.addEdge(g.getNode(B), g.getNode(A));
		}

		int ans = 0;
		for(int i=1; i<=N; i++) {
			Node n = g.getNode(i);

			if(n.edges.size() == 0) {
				ans++;
			}else {
				boolean isGood = true;
				for(int j=0; j<n.edges.size(); j++) {
					Node to = n.edges.get(j).to;
					if(H[n.value-1] <= H[to.value-1]) {
						isGood = false;
						break;
					}
				}

				if(isGood)
					ans++;
			}
		}

		System.out.println(ans);

	}


	//一般的なグラフ
	public static class Graph{
		int n;
		Map<Integer, Node> nodes;	//(ノード番号, ノード)

		//1~Nまでをもつグラフ
		public Graph(int n) {
			this.n = n;
			nodes = new HashMap<>(n);

			for(int i=0; i<n; i++) {
				nodes.put(i+1, new Node());
			}
		}

		public Graph(int n, int[] values) {
			this.n = n;
			nodes = new HashMap<>(n);

			for(int i=0; i<n; i++) {
				nodes.put(values[i], new Node(values[i]));
			}
		}

		public Node getNode(int node_n) {
			//ノード番号を指定してノードを取得
			return nodes.get(node_n);
		}

		public void addEdge(Node from, Node to) {
			//重みが1のグラフの場合(重みが均等な場合にも場合によっては使える)
			from.edges.add(new Edge(to, 1));
		}

		public void addEdge(Node from, Node to, long weight) {
			//エッジの重みが異なる場合
			from.edges.add(new Edge(to, weight));
		}

		public void removeEdge(Node from, Node to) {
			//指定したノード間のエッジを削除
			from.edges.remove(new Edge(to, 1));
		}
	}

	public static int count = 0;
	//ノードを表すクラス
	public static class Node{

		int value;
		List<Edge> edges;
		boolean visited = false;
		Node root;

		public Node(){
			value = count+1;
			edges = new LinkedList<Edge>();
			count++;
		}

		public Node(int value) {
			this.value = value;
			edges = new LinkedList<Edge>();
		}

		@Override
		public boolean equals(Object obj) {
			if(obj instanceof Node) {
				Node n = (Node)obj;
				if(this.value == n.value)
					return true;
				else
					return false;
			}

			return false;
		}

		@Override
		public int hashCode() {
			return Objects.hash(this.value);
		}
	}

	//エッジを表すクラス
	public static class Edge{
		Node to;		//行き先
		long weight;		//重み

		public Edge(Node to, long weight) {
			this.to = to;
			this.weight = weight;
		}

		@Override
		public boolean equals(Object obj) {
			if(obj instanceof Edge) {
				Edge e = (Edge)obj;
				if(this.to.equals(e.to))
					return true;
				else
					return false;
			}

			return false;
		}

		@Override
		public int hashCode() {
			return Objects.hash(this.to);
		}
	}

}
