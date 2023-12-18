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
		int[] dis = new int[n+1];
		dfs(1,0,dis);
		for(int i=1;i<=n;++i) {
			if((dis[i]&1) == 0) out.println(0);
			else out.println(1);
		}
		
        out.close();
		
	}
	private static void dfs(int v, int par, int[] dis) {
		// TODO Auto-generated method stub
		for(Pair child : edges[v]) {
			if(child.v != par)
				dfs(child.v,v,dis);
			else dis[v] = dis[par] + child.w;
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
