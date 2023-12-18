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
		for(int i=1;i<n;++i) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			edges[u].add(v);
			edges[v].add(u);
			k = Math.max(k, Math.max(edges[u].size(), edges[v].size()));
		}
		
		TreeSet<Integer> set = new TreeSet<>();
		for(int i=1;i<=k+1;++i) set.add(i);
		int[] col = new int[n+1]; 
		col[1] = 1;
		dfs(1,0,col);
		out.println(k);
		for(int i=1;i<n;++i) out.println(col[i]);
		
        out.close();
		
	}
	private static void dfs(int v, int par, int[] col) {
		// TODO Auto-generated method stub
		int c = 1;
		for(int child : edges[v]) {
			if(child != par) {
				if(c == col[par]) ++c;
				col[child] = c++;
				dfs(child,v,col);
			}
		}
		
	}

	
}
