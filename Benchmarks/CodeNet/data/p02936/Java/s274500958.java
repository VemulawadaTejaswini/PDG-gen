import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int q = sc.nextInt();

		Node node[] = new Node[n];
		// 頂点の作成
		for (int i = 0; i < n; i++) {
			node[i] = new Node(i);
		}

		// 辺情報
		for (int i = 0; i < n - 1; i++) {
			int nodeA = sc.nextInt() - 1;
			int nodeB = sc.nextInt() - 1;

			node[nodeA].adjList.add(node[nodeB]);
			node[nodeB].adjList.add(node[nodeA]);
		}

		// 親方向の隣接情報を消す
		//removeParent(0, node);

		/*
		for (int i = 0; i < n; i++) {
			printDebug(node[i]);
		}
		*/

		// カウンター計算
		for (int i = 0; i < q; i++) {
			int subRoot = sc.nextInt() - 1;
			long count = sc.nextLong();

			node[subRoot].offset += count;
		}
		dfs(null, node[0], 0);

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			sb.append(node[i].count).append(" ");
		}
		System.out.println(sb.toString());
		sc.close();
	}

	private static void dfs(Node parent, Node node, int sum) {
		sum += node.offset;
		node.count = sum;
		for (Node adj : node.adjList) {
			if (adj != parent) {
				dfs(node, adj, sum);
			}
		}
	}

	private static void printDebug(Node node) {
		System.out.println("===============================");
		System.out.println("id  = " + node.id);
		System.out.print("adj = ");
		for (Node adj : node.adjList) {
			System.out.print(adj.id + " ");
		}
		System.out.println();
		System.out.println("count = " + node.count);
	}

	private static void removeParent(int id, Node[] node) {
		for (Node adj : node[id].adjList) {
			node[adj.id].adjList.remove(node[id]);
			removeParent(adj.id, node);
		}
	}

	static class Node {
		int id;
		List<Node> adjList;
		long count;
		long offset;

		// コンストラクタ
		public Node(int id) {
			this.id = id;
			this.adjList = new ArrayList<Node>();
			this.count = 0;
			this.offset = 0;
		}
	}

}
