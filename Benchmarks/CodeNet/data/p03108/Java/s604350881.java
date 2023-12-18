import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	private class UnionField {
		private class Node {
			public int parent = 0;
			public long size = 1;
			
			public Node(int parent) {
				this.parent = parent;
				this.size = 1;
			}
		}
		
		private Node nodes[] = null;
		
		public UnionField(int size) {
			this.nodes = new Node[size];
			for (int i=0; i<this.nodes.length; i++) {
				this.nodes[i] = new Node(i);
			}
		}
		
		public int getRoot(int node) {
			int parent = this.nodes[node].parent;
			if (parent == node) {
				return node;
			} else {
				int root = getRoot(parent);
				this.nodes[node].parent = root;
				return root;
			}
		}
		
		public long getSize(int node) {
			node = getRoot(node);
			return this.nodes[node].size;
		}
		
		public void union(int a, int b) {
			a = getRoot(a);
			b = getRoot(b);
			if (a != b) {
				this.nodes[a].parent = b;
				this.nodes[b].size += this.nodes[a].size;
			}
		}
		
		public boolean isSame(int a, int b) {
			a = getRoot(a);
			b = getRoot(b);
			return (a == b);
		}
	}

	private class Way {
		public int a;
		public int b;
		
		public Way(int a, int b) {
			this.a = a;
			this.b = b;
		}
	}
	
	public void solve() {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int M = in.nextInt();
		
		UnionField unionField = new UnionField(N);
		LinkedList<Way> ways = new LinkedList<Way>();
		
		for (int i=0; i<M; i++) {
			int a = in.nextInt();
			int b = in.nextInt();

			ways.addFirst(new Way(a, b));
		}
		in.close();

		LinkedList<Long> results = new LinkedList<Long>();
		long nowResult = (long)N * (long)(N-1) / 2;
		results.addFirst(nowResult);
		
		for (Way way : ways) {
			int a = way.a-1;
			int b = way.b-1;
			
			if (unionField.isSame(a, b) == false) {
				long aSize = unionField.getSize(a);
				long bSize = unionField.getSize(b);
				nowResult -= aSize * bSize;
				unionField.union(a, b);	
			}
			
			
			results.addFirst(nowResult);
		}
		
		results.removeFirst();
		for (Long result : results) {
			System.out.println(result);
		}
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
	}
}
