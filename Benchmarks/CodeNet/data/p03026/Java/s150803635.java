import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Node[] nodes = new Node[n];
		for (int i = 0; i < n; i++) {
			nodes[i] = new Node(i);
		}
		Route[] routes = new Route[n - 1];
		for (int i = 0; i < n - 1; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			nodes[a].count++;
			nodes[b].count++;
			routes[i] = new Route(nodes[a], nodes[b]);
		}
		int[] costs = new int[n];
		for (int i = 0; i < n; i++) {
			costs[i] = sc.nextInt();
		}
		Arrays.sort(costs);
		Arrays.sort(nodes, new Comparator<Node>() {
		public int compare(Node n1, Node n2) {
			return n1.count - n2.count;
		}
		});
		for (int i = 0; i < n; i++) {
			nodes[i].value = costs[i];
		}
		Arrays.sort(nodes, new Comparator<Node>() {
		public int compare(Node n1, Node n2) {
			return n1.idx - n2.idx;
		}
		});
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			if (i != 0) {
				sb.append(" ");
			}
			sb.append(nodes[i].value);
		}
		long sum = 0;
		for (int i = 0; i < n - 1; i++) {
			sum += routes[i].getValue();
		}
		System.out.println(sum);
		System.out.println(sb);
	}
	
	static class Route {
		Node left;
		Node right;
		public Route(Node left, Node right) {
			this.left = left;
			this.right = right;
		}
		
		public int getValue() {
			return Math.min(left.value, right.value);
		}
	}
	
	static class Node {
		int idx;
		int count;
		int value;
		
		public Node(int idx) {
			this.idx = idx;
			this.count = 0;
			this.value = 0;
		}
	}
}
