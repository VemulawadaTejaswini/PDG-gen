import java.util.*;

public class Main {
	static class Tree {
		public class Edge {
			int to, rev;

			public Edge(int to, int rev) {
				this.to = to;
				this.rev = rev;
			}
		}
		
		int V;
		ArrayList<ArrayList<Edge>> G;
		int root;
		int[] p;
		
		public Tree(int[] a, int[] b) {
			this.V = a.length+1;
			p = new int[V];
			
			G = new ArrayList<ArrayList<Edge>>();
			for(int i=0; i<V; i++) {
				G.add(new ArrayList<Edge>());
			}
			
			for(int i=0; i<V-1; i++) {
				G.get(a[i]).add(new Edge(b[i], G.get(b[i]).size()));
				G.get(b[i]).add(new Edge(a[i], G.get(a[i]).size()-1));
			}
			setRoot(0);
		}
		
		public void setRoot(int root) {
			this.root = root;
			setRoot(root, -1);
		}
		public void setRoot(int cur, int parent) {
			p[cur] = parent;
			for(int i=0; i<G.get(cur).size(); i++) {
				int next = G.get(cur).get(i).to;
				if(next!=parent) {
					setRoot(next, cur);
				}
			}
		}
		
		public int getXor() {
			int xor = 0;
			for(Edge e : G.get(root)) {
				xor ^= getXor(e.to);
			}
			return xor;
		}
		
		int getXor(int cur) {
			int ans = 1;
			while(true) {
				if(G.get(cur).size()!=2)
					return ans;
				if(G.get(cur).get(0).to==p[cur])
					cur = G.get(cur).get(1).to;
				else
					cur = G.get(cur).get(0).to;
				ans++;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] a = new int[N-1];
		int[] b = new int[N-1];
		for(int i=0; i<N-1; i++) {
			a[i] = sc.nextInt()-1;
			b[i] = sc.nextInt()-1;
		}
		
		Tree tree = new Tree(a, b);
		
		int xor = tree.getXor();
		
		System.out.println(xor==0 ? "Bob" : "Alice");
		sc.close();
	}
}
