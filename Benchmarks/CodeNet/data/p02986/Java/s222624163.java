import java.util.*;
import java.io.*;

public class Main {
	static ArrayList<Route>[] tree;
	static Node[] nodes;
	public static void main (String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] first = br.readLine().split(" ", 2);
		int n = Integer.parseInt(first[0]);
		int q = Integer.parseInt(first[1]);
		tree = new ArrayList[n];
		nodes = new Node[n];
		for (int i = 0; i < n; i++) {
			tree[i] = new ArrayList<Route>();
		}
		for (int i = 0; i < n - 1; i++) {
			String[] line = br.readLine().split(" ", 4);
			int a = Integer.parseInt(line[0]) - 1;
			int b = Integer.parseInt(line[1]) - 1;
			int c = Integer.parseInt(line[2]) - 1;
			int d = Integer.parseInt(line[3]);
			Route route = new Route(c, d, a, b);
			tree[a].add(route);
			tree[b].add(route);
		}
		addNode(0, new ArrayList<Integer>(), new int[n], new int[n], 0);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < q; i++) {
			String[] line = br.readLine().split(" ", 4);
			int x = Integer.parseInt(line[0]) - 1;
			int y = Integer.parseInt(line[1]);
			int u = Integer.parseInt(line[2]) - 1;
			int v = Integer.parseInt(line[3]) - 1;
			int idx = 0;
			while (idx < nodes[u].fromRoot.size() && idx < nodes[v].fromRoot.size() && nodes[u].fromRoot.get(idx).equals(nodes[v].fromRoot.get(idx))) {
				idx++;
			}
			if (idx != 0) {
				idx--;
			}
			
			int total = nodes[u].total - nodes[u].colorSum[x] + nodes[u].colorNum[x] * y + nodes[v].total - nodes[v].colorSum[x] + nodes[v].colorNum[x] * y;
			total -= (nodes[idx].total - nodes[idx].colorSum[x] + nodes[idx].colorNum[x] * y) * 2;
			sb.append(total).append("\n");
		}
		System.out.print(sb);
	}
	
	static void addNode(int idx, ArrayList<Integer> fromRoot, int[] colorNum, int[] colorSum, int total) {
		nodes[idx] = new Node(fromRoot, colorNum, colorSum, total);
		for (Route r : tree[idx]) {
			int to;
			if (r.to == idx) {
				to = r.from;
			} else {
				to = r.to;
			}
			if (nodes[to] == null) {
				ArrayList<Integer> nextList = (ArrayList<Integer>)(fromRoot.clone());
				nextList.add(idx);
				int[] nextNum = (int[])(colorNum.clone());
				nextNum[r.color]++;
				int[] nextSum = (int[])(colorSum.clone());
				nextSum[r.color] += r.dist;
				addNode(to, nextList, nextNum, nextSum, total + r.dist);
			}
		}
	}
	
	
	static class Node {
		ArrayList<Integer> fromRoot;
		int[] colorNum;
		int[] colorSum;
		int total;
		
		public Node(ArrayList<Integer> fromRoot, int[] colorNum, int[] colorSum, int total) {
			this.fromRoot = fromRoot;
			this.colorNum = colorNum;
			this.colorSum = colorSum;
			this.total = total;
		}
	}
	
	static class Route {
		int color;
		int dist;
		int from;
		int to;
		
		public Route(int color, int dist, int from, int to) {
			this.color = color;
			this.dist = dist;
			this.from = from;
			this.to = to;
		}
		
		public boolean equals(Object o) {
			Route another = (Route) o;
			return this.color == another.color && this.dist == another.dist && ((this.from == another.from && this.to == another.to) || (this.from == another.to && this.to == another.from));
		}
	}
}
