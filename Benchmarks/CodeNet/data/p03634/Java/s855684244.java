import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
import java.util.Vector;

public class Main {
	static Node[] nodes;
	static int src;
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		InputReader in = new InputReader(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		int n = in.nextInt();
		int e = n - 1;
		nodes = new Node[n];
		for (int i = 0; i < n; i++) nodes[i] = new Node(i);
		for (int i = 0; i < e; i++) {
			int from = in.nextInt() - 1;
			int to = in.nextInt() - 1;
			double len = in.nextInt();
			nodes[from].edges.add(new Edge(nodes[from], nodes[to], len));
			nodes[to].edges.add(new Edge(nodes[to], nodes[from], len));
		}
		int q = in.nextInt();
		src = in.nextInt() - 1;
		PFSearch dj = new PFSearch(nodes);
		dj.solve(nodes[src]);
		for (int i = 0; i < q; i++) {
			int x = in.nextInt() - 1;
			int y = in.nextInt() - 1;
			out.println((long)(dj.nodes[x].value + dj.nodes[y].value));
		}
		out.flush();
	}
	public static class Node implements Comparable {
		int id;
		double value;
		Node via;
		Vector<Edge> edges;
		public Node(int id) {
			this.id = id;
			this.value = Double.MAX_VALUE;
			this.via = null;
			this.edges = new Vector<Edge>();
		}
		public int compareTo(Object o) {
			if (!(o instanceof Node)) throw new IllegalArgumentException("Node needed");
			Node x = (Node)o;
			return (this.value > x.value)? 1 :
				((this.value < x.value)? (-1) : 0);
		}
	}
	public static class Edge {
		Node src;
		Node dst;
		double value;
		public Edge(Node src,Node dst,double value) {
			this.src = src;
			this.dst = dst;
			this.value = value;
		}
	}
	public static class PFSearch {
		Node[] nodes;
		public PFSearch(Node[] nodes) {
			this.nodes = nodes;
		}
		public void solve(Node src) {
			PriorityQueue<Node> q = new PriorityQueue<Node>();
			for (int i = 0; i < nodes.length; i++) {
				nodes[i].value = Double.MAX_VALUE;
				q.add(nodes[i]);
			}
			q.remove(src);
			src.value = 0;
			q.offer(src);
			while (q.size() > 0) {
				Node x = q.poll();
				if (x.value == Double.MAX_VALUE) return;
				for (Iterator<Edge> it = x.edges.iterator(); it.hasNext(); ) {
					Edge e = it.next();
					Node y = e.dst;
					double newValue = x.value + e.value;
					if (newValue < y.value) {
						if (q.remove(y)) {
							y.value = newValue;
							y.via = x;
							q.offer(y);
						}
					}
				}
			}
		}
		public Node[] getPath(int id) {
			Vector<Node> v = new Vector<Node>();
			for (Node node = nodes[id]; node != null; node=node.via) v.add(node);
			for (int i = 0; i < v.size() / 2; i++) {
				int j = v.size() - 1 - i;
				Node tmp = v.get(i);
				v.set(i, v.get(j));
				v.set(j, tmp);
			}
			return v.toArray(new Node[0]);
		}
	}
	public static class InputReader {
		BufferedReader in;
		StringTokenizer tok;
		public String nextString() {
			while (!tok.hasMoreTokens()) {
				try {
					tok = new StringTokenizer(in.readLine(), " ");
				} catch (IOException e) {
					throw new InputMismatchException();
				}
			}
			return tok.nextToken();
		}
		public int nextInt() {
			return Integer.parseInt(nextString());
		}
		public long nextLong() {
			return Long.parseLong(nextString());
		}
		public int[] nextIntArray(int n) {
			int[] res = new int[n];
			for (int i = 0; i < n; i++) {
				res[i] = nextInt();
			}
			return res;
		}
		public long[] nextLongArray(int n) {
			long[] res = new long[n];
			for (int i = 0; i < n; i++) {
				res[i] = nextLong();
			}
			return res;
		}
		public InputReader(InputStream inputStream) {
			in = new BufferedReader(new InputStreamReader(inputStream));
			tok = new StringTokenizer("");
		}
	}
}