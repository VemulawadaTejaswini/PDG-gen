//package april2020;

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

public class Main {
//	static long[] dp;
	static int n,k, a[];
	static long MOD = (long)1e9+7;
	static ArrayList<Integer>[] graph;
//	static HashSet<Integer> visited;
//	static long[][] dp;
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException {
		FastReader scn = new FastReader();
		OutputStream out = new BufferedOutputStream ( System.out );
		n = scn.nextInt();
		graph = new ArrayList[n+1];
//		visited = new HashSet<>();
		for(int i=1;i<=n;i++) {
			graph[i] = new ArrayList<>();
		}
		for(int i =0;i<n-1;i++) {
			int u = scn.nextInt();
			int v = scn.nextInt();
			graph[u].add(v);
			graph[v].add(u);
		}
		Pair res = dfs(1,-1);
		long answer = (res.first+res.second)%MOD;
		
		out.write((answer+"\n").getBytes());
		out.close();
	}
	static Pair dfs(int curr, int parent) {
		long all_white=1;
		long sth_is_black = 0;
		for(int b:graph[curr]) {
			if(b!=parent) {
				Pair p=dfs(b,curr);long maw = all_white;
				all_white = all_white*p.second%MOD;
				sth_is_black = (maw*p.first%MOD + sth_is_black*(p.first+p.second)%MOD)%MOD;
			}
		}
		return new Pair(all_white, (all_white+sth_is_black)%MOD);
	}
	static class Pair{
		long first;
		long second;
		public Pair(long first, long second) {
			this.first = first;
			this.second = second;
		}
	}
	static class FastReader 
    { 
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
}
