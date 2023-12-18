import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static ArrayList<Edge>[] adj;
	static ArrayList<Query>[] queries;
	static int [] ans;
	static int [] freq;
	static int [] len;
	static int tot;
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		adj = new ArrayList[n];
		for(int i=0;i<n;i++) {
			adj[i] = new ArrayList<>();
		}
		for(int i=0;i<n-1;i++) {
			int a = sc.nextInt()-1;
			int b = sc.nextInt()-1;
			int c = sc.nextInt();
			int d = sc.nextInt();
			adj[a].add(new Edge(b,c,d));
			adj[b].add(new Edge(a,c,d));
		}
		LCA lca= new LCA(adj);
		queries = new ArrayList[n];
		for(int i=0;i<n;i++) {
			queries[i] = new ArrayList<>();
		}
		ans = new int[q];
		freq = new int[n];
		len = new int[n];
		tot =0;
		for(int i=0;i<q;i++) {
			int x = sc.nextInt();
			int y=  sc.nextInt();
			int u = sc.nextInt()-1;
			int v = sc.nextInt()-1;
			int tempLCA = lca.lca(u,v);
			queries[u].add(new Query(x,y,i,false));
			queries[v].add(new Query(x,y,i,false));
			queries[tempLCA].add(new Query(x,y,i,true));
		}
		dfs(0,0);
		StringBuilder sb=  new StringBuilder();
		for(int i=0;i<q;i++) {
			sb.append(ans[i]);
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}
	//maybe change dfs values to facilitate adding
	static void dfs(int curr,int par) {
		if(curr==0) {
			//continue:
		}
		else {
			int tempLen = 0;
			int tempColor = 0;
			for(Edge x : adj[curr]) {
				if(x.dest==par) {
					tempLen = x.len;
					tempColor= x.color;
				}
			}
			freq[tempColor]++;
			len[tempColor]+=tempLen;
			tot+=tempLen;
			
		}
//		System.out.println(tot);
		for(Query temp : queries[curr]) {
			int tempColor =temp.x;
			int newLen = temp.y;
			int delta = newLen*freq[tempColor]-len[tempColor]+tot;
			if(temp.par) {
				ans[temp.index]-=2*delta;
			}
			else {
				ans[temp.index]+=delta;
			}
		}
		for(Edge x : adj[curr]) {
			if(x.dest!=par) {
				dfs(x.dest,curr);
			}
		}
		int tempLen = 0;
		int tempColor = 0;
		for(Edge x : adj[curr]) {
			if(x.dest==par) {
				tempLen = x.len;
				tempColor= x.color;
			}
		}
		freq[tempColor]--;
		len[tempColor]-=tempLen;
		tot-=tempLen;
		
		
	}
	static class Edge{
		int dest;
		int color;
		int len;
		public Edge(int d,int c,int l) {
			this.dest = d;
			this.color =c;
			this.len = l;
		}
	}
	static class Query{
		int x;
		int y;
		int index;
		boolean par;
		public Query(int x,int y,int i, boolean b) {
			this.x = x;
			this. y = y;
			this.index = i;
			this.par = b;
		}
	}
	static class LCA{
		int [] parent;
		int [][] anc;
		int [] depth;
		ArrayList<Edge>[] tree;
		
		public LCA(ArrayList<Edge>[] tree) {
			this.tree=tree;
			depth = new int[tree.length];
			anc = new int[tree.length][21];
			parent = new int[tree.length];

			initializeParent();
			initializeDepth();
			initializeAnc();
		}
		/*
		 * initialize depth
		 */
		void initializeDepth() {

			depth[0] = 0;
			Queue<Integer> q = new LinkedList<Integer>();
			q.add(0);
			while(!q.isEmpty()) {
				int x = q.poll();
				for(Edge next : tree[x]) {
					if(next.dest!=parent[x]) {
						depth[next.dest] = depth[x]+1;
						q.add(next.dest);
					}
				}
			}
		}
		/*
		 * initialize parent
		 */
		void initializeParent() {
			Queue<Integer> q = new LinkedList<Integer>();
			q.add(0);
			while(!q.isEmpty()) {
				int x = q.poll();
				for(Edge next : tree[x]) {
					if(next.dest!=parent[x]) {
						parent[next.dest] = x;
						q.add(next.dest);
					}
				}
			}
		}
		/*
		 * initialize ancestor 
		 */
		void initializeAnc() {
			for(int i=0;i<tree.length;i++) {
				anc[i][0] = parent[i];
			}
			for(int j=1;j<=20;j++) {
				for(int i=0;i<tree.length;i++) {
					anc[i][j] = anc[anc[i][j-1]][j-1];
				}
			}
		}
		/*
		 * given two node numbers computes the lca node
		 */
		int lca(int x,int y) {
			if(depth[x]<depth[y]) {
				int temp = x;
				x=y;
				y=temp;
			}
			for(int i=20;i>=0;i--) {
				if(depth[x]-(int) Math.pow(2,i)>=depth[y]) {
					x=anc[x][i];
				}
			}
			if(x==y) {
				return x;
			}
			for(int i=20;i>=0;i--) {
				if(anc[x][i] !=anc[y][i]) {
					x=anc[x][i];
					y=anc[y][i];
				}
			}
			return anc[x][0];

		}
	}
}

