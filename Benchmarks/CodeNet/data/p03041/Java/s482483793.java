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
	public static List<Pair>[] edges;
	public static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FastReader sc = new FastReader();
		int n = sc.nextInt();
		edges = new ArrayList[n+1];
		for(int i=0;i<=n;++i) edges[i] = new ArrayList<>();
		for(int i=1;i<n;++i) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			int w = sc.nextInt();
			edges[u].add(new Pair(v,w));
			edges[v].add(new Pair(u,w));
		}
		int[] col = new int[n+1];
		bfs(1,0,col);
		for(int i=1;i<=n;++i) {
			out.println(col[i]);
		}
		
        out.close();
		
	}
	
	private static void bfs(int i, int j, int[] col) {
		Queue<Integer> q = new ArrayDeque<>();
		q.add(1);
		boolean[] vis = new boolean[col.length];
		vis[1] = true;
		while(q.size() > 0) {
			int node = q.poll();
			for(Pair child : edges[node]) {
				if(!vis[child.v]) {
					q.add(child.v);
					if((child.w&1) == 0)
					col[child.v] = col[node];
					else col[child.v] = col[node]^1;
					vis[child.v] = true;
				}
			}
		}
		
		
	}

	static class Pair{
		int v;
		int w;
		Pair(int v,int w){
			this.v = v;
			this.w = w;
		}
	}
}
