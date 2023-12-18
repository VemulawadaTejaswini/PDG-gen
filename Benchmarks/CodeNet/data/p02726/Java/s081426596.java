import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
2 3 3

2 8
 */
public class Main {
	
	public static void main(String[] args) {
		FastScanner fs=new FastScanner();
		int n=fs.nextInt(), x=fs.nextInt()-1, y=fs.nextInt()-1;
		ArrayList<Integer>[] adj=new ArrayList[n];
		for (int i=0; i<n; i++) adj[i]=new ArrayList<>();
		for (int i=0; i+1<n; i++) {
			adj[i].add(i+1);
			adj[i+1].add(i);
		}
		adj[x].add(y);
		adj[y].add(x);
		int[] ans=new int[n];
		for (int from=0; from<n; from++) {
			int[] d=bfs(adj, from);
			for (int i=0; i<n; i++)
				ans[d[i]]++;
		}
		for (int i=1; i<n; i++) {
			System.out.println(ans[i]/2);
		}
	}
	
	static int[] bfs(ArrayList<Integer>[] adj, int from) {
		int n=adj.length;
		ArrayDeque<Integer> bfs=new ArrayDeque<>();
		int[] res=new int[n];
		Arrays.fill(res, -1);
		res[from]=0;
		bfs.add(from);
		while (!bfs.isEmpty()) {
			int at=bfs.remove();
			for (int o:adj[at]) {
				if (res[o]==-1) {
					res[o]=res[at]+1;
					bfs.add(o);
				}
			}
		}
		return res;
	}
	
	static class FastScanner {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");
		
		public String next() {
			while (!st.hasMoreElements())
				try {
					st=new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}
		
		public int nextInt() {
			return Integer.parseInt(next());
		}
		
		public long nextLong() {
			return Long.parseLong(next());
		}
		
		public int[] readArray(int n) {
			int[] a=new int[n];
			for (int i=0; i<n; i++) {
				a[i]=nextInt();
			}
			return a;
		}
		
		public double nextDouble() {
			return Double.parseDouble(next());
		}
		
	}

}
