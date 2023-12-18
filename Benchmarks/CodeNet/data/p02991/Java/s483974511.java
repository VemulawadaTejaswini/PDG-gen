import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class Main {

	static HashMap<Integer, Node> map = new HashMap<>();

	static class Node {
		int n;
		int dist = -1;
		ArrayList<Node> links = new ArrayList<>();
		ArrayList<Node> links2 = new ArrayList<>();
		ArrayList<Node> links3 = new ArrayList<>();

		Node(int n) {
			this.n = n;
		}

	}

	public static void main(String[] args) throws IOException {
		String testInput1 = "4 4\n" + 
				"1 2\n" + 
				"2 3\n" + 
				"3 4\n" + 
				"4 1\n" + 
				"1 3";
		String testInput2 = "3 3 1 2 2 3 3 1 1 2";
		String testInput3 = "2 0\n" + 
				"1 2";
		String testInput4 = "6 8\n" + 
				"1 2\n" + 
				"2 3\n" + 
				"3 4\n" + 
				"4 5\n" + 
				"5 1\n" + 
				"1 4\n" + 
				"1 5\n" + 
				"4 6\n" + 
				"1 6";

		
		InputStream in = new ByteArrayInputStream(testInput4.getBytes("utf-8"));

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		for (int i = 0; i < n; i++) {
			map.put(i + 1, new Node(i));
		}
		for (int i = 0; i < m; i++) {
			Node from = map.get(sc.nextInt());
			Node to = map.get(sc.nextInt());
			from.links.add(to);
		}

		for (Node node : map.values()) {
			for (Node n1 : node.links) {
				for (Node n2 : n1.links) {
					for (Node n3 : n2.links) {
						if (!n3.links2.contains(node)) {
							n3.links2.add(node);
						}
					}
				}
			}
		}

		for (Node node : map.values()) {
			StringBuilder sb = new StringBuilder();
			sb.append("[" + node.n + "]:links1 ");
			for (Node x : node.links) {
				sb.append(x.n).append(" ");
			}
			sb.append("[" + node.n + "]:links2 ");
			for (Node x : node.links2) {
				sb.append(x.n).append(" ");
			}
			System.out.println(sb.toString());
		}
		
		
		Node start = map.get(sc.nextInt());
		Node goal = map.get(sc.nextInt());

		goal.dist = 0;
		while (true) {
			int minDist = Integer.MAX_VALUE;
			Node target0 = null;
			Node target = null;
			for (Node node : map.values()) {
				for (Node n1 : node.links2) {
					if (node.dist >= 0 && n1.dist < 0 && node.dist + 1 < minDist) {
						minDist = node.dist + 1;
						target0 = node;
						target = n1;
					}
				}
			}
			if (target == null) {
				break;
			}
			if (target != null) {
				target0.links3.add(target);
				target.dist = minDist;
			}
			if (target == start) {
				System.out.println(target.dist);
				return;
			}
		}
		System.out.println("-1");
	}
}
