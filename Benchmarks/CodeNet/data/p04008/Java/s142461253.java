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
		int[] depth;
		boolean[] valid;
		
		public Tree(int[] a, int[] b) {
			this.V = a.length+1;
			p = new int[V];
			depth = new int[V];
			valid = new boolean[V];
			Arrays.fill(valid, true);
			
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
			depth[root] = 0;
			setRoot(root, -1);
		}
		public void setRoot(int cur, int parent) {
			p[cur] = parent;
			for(int i=0; i<G.get(cur).size(); i++) {
				int next = G.get(cur).get(i).to;
				if(next!=parent) {
					depth[next] = depth[cur]+1;
					setRoot(next, cur);
				}
			}
		}
		public int getAncestor(int cur, int n) {
			for(int i=0; i<n; i++) {
				cur = p[cur];
			}
			return cur;
		}
		
		public void changeParentToRoot(int cur) {
			depth[cur]=1;
			resizeDepth(cur, p[cur]);
		}
		public void resizeDepth(int cur, int parent) {
			for(int i=0; i<G.get(cur).size(); i++) {
				int next = G.get(cur).get(i).to;
				if(next!=parent && valid[next]) {
					depth[next] = depth[cur]+1;
					resizeDepth(next, cur);
					valid[next]=false;
				}
			}
			
		}
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] a = new int[N];
		for(int i=0; i<N; i++)
			a[i] = sc.nextInt()-1;
		
		int[] p = new int[N-1];
		int[] q = new int[N-1];
		for(int i=0; i<N-1; i++) {
			p[i] = i+1;
			q[i] = a[i+1];
		}
		
		Tree tree = new Tree(p, q);
		
		long[] list = new long[N];
		for(int i=0; i<N; i++)
			list[i] = (long)tree.depth[i]<<20 | i;
		Arrays.sort(list);
		
		int ans = 0;
		for(int i=N-1; i>0; i--) {
			int idx = (int)(list[i]&((1<<20)-1));
			if(tree.valid[idx] & tree.depth[idx]>K) {
				ans++;
				tree.changeParentToRoot(tree.getAncestor(idx, K-1));
			}
		}
		if(a[0]!=0)
			ans++;
		
		System.out.println(ans);
		sc.close();
	}
}
