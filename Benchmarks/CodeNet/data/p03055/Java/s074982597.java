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
			distance = new int[V];
			
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
			distance[root] = 0;
			setRoot(root, -1);
		}
		public void setRoot(int cur, int parent) {
			p[cur] = parent;
			for(int i=0; i<G.get(cur).size(); i++) {
				int next = G.get(cur).get(i).to;
				if(next!=parent) {
					distance[next] = distance[cur]+1;
					setRoot(next, cur);
				}
			}
		}

		int[] distance;
		int getDiameter() {
			int f1 = getMostFar(root);
			int f2 = getMostFar(f1);
			return getDistance(f1, f2);
		}
		int getMostFar(int p) {
			setRoot(p);
			int far = 0;
			for(int i=1; i<V; i++) {
				if(distance[i]>distance[far])
					far = i;
			}
			return far;
		}
		
		int getDistance(int p1, int p2) {
			setRoot(p1);
			return distance[p2];
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
		System.out.println((tree.getDiameter()-1)%3==0 ? "Second" : "First");
		sc.close();
	}
}
