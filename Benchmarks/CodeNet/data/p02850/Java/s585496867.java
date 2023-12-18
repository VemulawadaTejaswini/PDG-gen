import java.io.*;
import java.util.*;

public class Main {

	static class FastReader { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    } 
	public static List<Integer>[] edges;
	public static long[] fac,inv;
	public static int mod = (int) (1e9+7),MAX = (int) (1e5+1);
	public static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FastReader sc = new FastReader();
	
	
		int n = sc.nextInt();
		edges = new ArrayList[n+1];
		for(int i=0;i<=n;++i) edges[i] = new ArrayList<>();
		int k = 0;
		List<Pair> list = new ArrayList<>();
		for(int i=1;i<n;++i) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			edges[u].add(v);
			edges[v].add(u);
			list.add(new Pair(u,v));
			k = Math.max(k, Math.max(edges[u].size(), edges[v].size()));
		}
	
		int[] col = bfs(n);
		out.println(k);
		for(int i=0;i<list.size();++i) out.println(col[list.get(i).v]);
		
        out.close();
		
	}
	
	private static int[] bfs(int n) {
		int[] col = new int[n+1];
		Queue<Integer> q = new ArrayDeque<>();
		q.add(1);
		boolean[] vis = new boolean[col.length];
		vis[1] = true;
		while(q.size() > 0) {
			int node = q.poll();
			int c = 1;
			for(int v : edges[node]) {
				if(!vis[v]) {
					if(c == col[node]) ++c;
					col[v] = c++;
					vis[v] = true;
					q.add(v);
					
				}
			}
		}
		
		return col;
	}
	
	static class Pair implements Comparable<Pair>{
		int u;
		int v;
		int c;
		Pair(int u,int v){
			this.u = u;
			this.v = v;
		}
		@Override
		public int compareTo(Pair arg0) {
			// TODO Auto-generated method stub
			return this.u - arg0.u;
		}
	}
	
}
