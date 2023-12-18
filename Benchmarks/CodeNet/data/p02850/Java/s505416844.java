import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

	public static class Pair implements Comparable<Pair> {
		int x;//where to 
		int y;//idx of the edge

		public Pair(int x, int y) {
			this.x = x;
			this.y = y;
		}

		public int compareTo(Pair x) {
			//ascending order
			if (this.x == x.x) {
				return Long.compare(this.y, x.y);
			} else {
				return Long.compare(this.x, x.x);
			}
			//descending order
			//		if(this.x==x.x) {
			//			return Long.compare(x.y, this.y);
			//		}else {
			//			return Long.compare(x.x, this.x);
			//		}
		}

		//Use it rarely because it has about 0.115% collision rate which is quite 
		//and hence it will constantly keep go into equal function and hence slow
		public int hashCode() {
			return Long.hashCode(x) ^ Long.hashCode(y);
		}

		public boolean equals(Object o) {
			if (!(o instanceof Pair)) {
				return false;
			}
			Pair x = (Pair) o;
			if (x.x == this.x && x.y == this.y) {
				return true;
			} else {
				return false;
			}
		}
	}

	public static LinkedList<Pair>[] adj;
	public static boolean[] visited;
	public static int[] edges_color;
	
	public static int bfs() {
		LinkedList<Integer> q = new LinkedList<Integer>();
		q.add(0);
		visited[0]=true;
		int max = 0;
		while(!q.isEmpty()) {
			int curr = q.removeFirst();
			int val = 1;
			visited[curr]=true;
			int used = -1;
			for(Pair x:adj[curr]) {
				if(edges_color[x.y]!=-1) {
					used = edges_color[x.y];
					break;
				}
			}
			for(Pair x:adj[curr]) {
				if(edges_color[x.y]==-1) {
					if(used != val) {
						edges_color[x.y]=val;
					}else {
						val++;
						edges_color[x.y]=val;
					}
					val++;
				}
				if(!visited[x.x]) {
					q.add(x.x);
				}
			}
			max = Integer.max(max,val-1);
		}
		return max;
	}
	
	
	
	public static void solve() {
		int n =s.nextInt();
		adj=new LinkedList[n];
		visited=new boolean[n];
		for(int i=0;i<n;i++) {
			adj[i]=new LinkedList<Pair>();
		}
		edges_color=new int[n-1];
		Arrays.fill(edges_color,-1);
		for(int i=0;i<n-1;i++) {
			int u=s.nextInt()-1;
			int v=s.nextInt()-1;
			adj[u].add(new Pair(v,i));
			adj[v].add(new Pair(u,i));
		}
		out.println(bfs());
		for(int i=0;i<n-1;i++) {
			out.println(edges_color[i]);
		}
	}

	public static void main(String[] args) {
		out = new PrintWriter(new BufferedOutputStream(System.out));
		s = new FastReader();
		solve();
		out.close();
	}

	public static FastReader s;
	public static PrintWriter out;

	public static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return str;
		}
	}

	
}
