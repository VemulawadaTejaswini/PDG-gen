import java.util.*;

public class Main {
	static Node[] ns;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Q = sc.nextInt();
		ns = new Node[N];
		for (int i = 0; i < N; i++)
			ns[i] = new Node(i);
		for (int i = 0; i < N - 1; i++) {
			int s = sc.nextInt() - 1;
			int t = sc.nextInt() - 1;
			ns[s].add(ns[t]);
			ns[t].add(ns[s]);
		}
		dfs(ns[0], null);
		for (int i = 0; i < Q; i++) {
			int p = sc.nextInt();
			int x = sc.nextInt();
			ns[p - 1].cnt += x;
		}
		sum(ns[0]);
		StringBuilder res = new StringBuilder();
		for (Node node: ns)
			res.append(" ").append(node.cnt);
		System.out.println(res.substring(1));
	}
	private static void sum(Node node)
	{
		if (node.p != null)
			node.cnt += node.p.cnt;
		for (Node c: node) {
			if (c != node.p) {
				sum(c);
			}
		}
	}
	private static void dfs(Node c, Node p)
	{
		c.p = p;
		for (Node cc: c)
			if (cc != p)
				dfs(cc, c);
	}
	static class Node extends ArrayList<Node>
	{
		Node p;
		int id;
		int cnt = 0;
		Node(int _id) {id = _id;}
	}
}
