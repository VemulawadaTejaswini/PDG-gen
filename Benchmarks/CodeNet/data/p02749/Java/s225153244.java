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
		int[] mod;
		
		public Tree(int[] a, int[] b) {
			this.V = a.length+1;
			p = new int[V];
			mod = new int[V];
			
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
		
		public void setGroup() {
			setMod(root, 1);
		}
		void setMod(int cur, int value) {
			mod[cur] = value;
			for(int i=0; i<G.get(cur).size(); i++) {
				int next = G.get(cur).get(i).to;
				if(next!=p[cur]) {
					setMod(next, 3-value);
				}
			}
		}
		public int[] getMod() {
			return mod;
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
		
		tree.setGroup();
		int[] m = tree.getMod();
		int[] count = new int[3];
		for(int i=0; i<N; i++)
			count[m[i]]++;
		if(count[1]<count[2]) {
			for(int i=0; i<N; i++)
				m[i] = 3-m[i];
			int temp = count[1];
			count[1] = count[2];
			count[2] = temp;
		}
		
		if(count[2]<(N+1)/3) {
			count = new int[3];
			for(int i=0; i<N; i++) {
				int v = m[i];
				if(m[i]==2) {
					v = 0;
				} else {
					if(count[1]<(N+2)/3) {
						v = 1;
					} else if(count[2]<(N+1)/3) {
						v = 2;
					} else {
						v = 0;
					}
				}
				m[i] = count[v]*3+(v==0 ? 3 : v);
				count[v]++;
			}
		} else {
			count = new int[3];
			for(int i=0; i<N; i++) {
				int v = m[i];
				if(count[m[i]]==(N+(3-m[i]))/3) {
					v = 0;
				}
				m[i] = count[v]*3+(v==0 ? 3 : v);
				count[v]++;
			}
		}
		
		for(int i=0; i<N; i++)
			System.out.print(m[i] + (i==N-1 ? "\n" : " "));
		sc.close();
	}
}
