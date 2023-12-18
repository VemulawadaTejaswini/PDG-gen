
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
		removeParent(0, node);

		/*
		for (int i = 0; i < n; i++) {
			printDebug(node[i]);
		}
		*/

		// カウンター計算
		for (int i = 0; i < q; i++) {
			int subRoot = sc.nextInt() - 1;
			int count = sc.nextInt();

			node[subRoot].count += count;
		}

		for (int i = 0; i < n; i++) {
			System.out.print(node[i].count + " ");
			for (Node adj : node[i].adjList) {
				adj.count += node[i].count;
			}
		}
		System.out.println();
		sc.close();
	}

	private static void addCount(int subRoot, int count, Node[] node) {
		node[subRoot].count += count;
		for (Node child : node[subRoot].adjList) {
			addCount(child.id, count, node);
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

		// コンストラクタ
		public Node(int id) {
			this.id = id;
			this.adjList = new ArrayList<Node>();
			this.count = 0;
		}
	}

}
