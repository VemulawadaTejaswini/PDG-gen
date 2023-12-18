import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static Node[] nodes;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int nodeCnt = sc.nextInt();
		nodes = new Node[nodeCnt];
		for (int i = 0; i < nodeCnt; i++) {
			nodes[i] = new Node(i + 1);
		}

		int processCnt = sc.nextInt();

		for (int i = 0; i < nodeCnt - 1; i++) {
			int from = sc.nextInt();
			int to = sc.nextInt();
			nodes[from - 1].addNode(to);
		}

		for (int i = 0; i < processCnt; i++) {
			int node = sc.nextInt();
			int p = sc.nextInt();
			addPoint(node, p);
		}

		for (int i = 0; i < nodeCnt; i++) {
			System.out.print(nodes[i].getPoint() + " ");
		}
		System.out.println("");
	}

	public static void addPoint(int num, int p) {
		Node node = nodes[num - 1];
		node.addPoint(p);
		List<Integer> list = node.getNodes();
		for (int i = 0; i < list.size(); i++) {
			addPoint(list.get(i), p);
		}
	}

	static class Node {
		int num = 0;
		int point = 0;
		List<Integer> list = new ArrayList<Integer>();

		public Node(int num) {
			this.num = num;
		}

		public void addNode(int num) {
			list.add(num);
		}

		public List<Integer> getNodes() {
			return list;
		}

		public void addPoint(int point) {
			this.point = this.point + point;
		}

		public int getPoint() {
			return this.point;
		}
	}
}
