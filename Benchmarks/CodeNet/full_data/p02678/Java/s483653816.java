import java.io.*;
import java.math.BigInteger;
import java.util.*;



public class Main {
	

	public static class FastReader {
		BufferedReader br;
		StringTokenizer root;
		
 
		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
 
		String next() {
			while (root == null || !root.hasMoreTokens()) {
				try {
					root = new StringTokenizer(br.readLine());
				} catch (Exception addd) {
					addd.printStackTrace();
				}
			}
			return root.nextToken();
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
			} catch (Exception addd) {
				addd.printStackTrace();
			}
			return str;
		}
	}
	
	public static PrintWriter out = new PrintWriter (new BufferedOutputStream(System.out));
	
	public static FastReader sc = new FastReader();
 
	static int mod = (int) (1e9+7),MAX=(int) (2e5);
    static List<Integer>[] edges;
    
	public static void main(String[] args) throws IOException {
		int n = sc.nextInt();
		int m = sc.nextInt();
		edges = new ArrayList[n+1];
		for(int i=0;i<edges.length;++i) {
			edges[i] = new ArrayList<>();
		}
		for(int i=1;i<=m;++i) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			edges[u].add(v);
			edges[v].add(u);
		}
		int[] dis = new int[n+1];
		Arrays.fill(dis,-1);
		//dis[0] = 0;
		dis[1] = 1;
		Queue<Integer> q = new LinkedList<>();
		q.add(1);
		while(q.size() > 0) {
			int x = q.poll();
			for(int child : edges[x]) {
				if(dis[child] == -1) {
					q.add(child);
					dis[child] = dis[x]+1;
				}
			}
		}
		boolean found = true;
		for(int i=1;i<=n;++i) {
			if(dis[i] == -1)
				found = false;
		}
		if(found) {
			out.println("Yes");
			int[] ans = new int[n+1];
			for(int i=2;i<=n;++i) {
				int x = dis[i];
				for(int child : edges[i]) {
					if(dis[child] == x-1) {
						ans[i] = child;
						break;
					}
				}
			}
			for(int i=2;i<=n;++i) out.println(ans[i]);
		}else out.print("No");
		out.close();
	}

   
}



