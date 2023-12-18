import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	private static final int MOD = (int)Math.pow(10, 9);
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int n = sc.nextInt();
		int m = sc.nextInt();
		boolean[] visited = new boolean[n+1];
		int[] res = {0, 0};
		
		Map<Integer, List<Integer>> g = new HashMap<>();
		
		for (int i = 0; i < m; i++) {
			int v = sc.nextInt();
			int w = sc.nextInt();
			
			if (!g.containsKey(v)) {
				g.put(v, new ArrayList<Integer>());
			}
			g.get(v).add(w);
			
			if (!g.containsKey(w)) {
				g.put(w, new ArrayList<Integer>());
			}
			g.get(w).add(v);
		}
		visited[1] = true;
		dfs(n, 1, g, visited, res);
		System.out.println(res[0]);
	}
	
	private static void dfs(int n, int v, Map<Integer, List<Integer>> g, boolean[] visited, int[] res) {
		if (complete(n, visited)) {
			res[0]++;
		} else {
			
			for (int i = 0; i < g.get(v).size(); i++) {
				int next = g.get(v).get(i);
				if (!visited[next]) {
					visited[next] = true;
					dfs(n, next, g, visited, res);
					visited[next] = false;
				}
			}
			
		}
	}
	
	private static boolean complete(int n, boolean[] visited) {
		boolean res = true;
		
		for (int i = 1; i < visited.length; i++) {
			res = res & visited[i];
		}
		return res;
	}
	
	static class FastReader {
	    BufferedReader br;
	    StringTokenizer st;
	
	    public FastReader() {
	      br = new BufferedReader(new InputStreamReader(System.in));
	    }
	  
	    String next() { 
	      while (st == null || !st.hasMoreElements()) {
	        try {
	          st = new StringTokenizer(br.readLine());
	        } catch (IOException  e) {
	          e.printStackTrace();
	        }
	      }
	      return st.nextToken();
	    }
	
	    int nextInt() {
	      return Integer.parseInt(next());
	    }
	
	    long nextLong() {
	      return Long.parseLong(next());
	    }
	
	    double nextDouble() { 
	      return Double.parseDouble(next());
	    }
	
	    String nextLine() {
	      String str = "";
	        try{
	            str = br.readLine();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        return str;
	      }
	  }
}
