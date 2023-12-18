import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	private  static Map<Integer, Node> nodeMap = new HashMap<>();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Q = sc.nextInt();
		
		for (int i=1; i<=N; i++) {
			nodeMap.put(i, new Node());
		}
		for (int i=0; i<N - 1; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			Node aNode = nodeMap.get(a);
			aNode.children.add(b);
		}
		
		for (int i=0; i<Q; i++) {
			int p = sc.nextInt();
			int x = sc.nextInt();
			Node pNode = nodeMap.get(p);
			pNode.count += x;
		}
		
		count(nodeMap.get(1), 0);
		
		System.out.print(nodeMap.get(1).count);
		for (int i=2; i<=N; i++) {
			System.out.print(" " + nodeMap.get(i).count);
		}
	}
	
	static void count(Node n, long cnt) {
		n.count += cnt;
		for (Integer c : n.children) {
			Node node = nodeMap.get(c);
			count(node, n.count);
		}
	}
	
	static class Node {
		List<Integer> children = new ArrayList<>();
		long count = 0;
		public Node() {
		}
		public Node(int child) {
			children.add(child);
		}
	}
}