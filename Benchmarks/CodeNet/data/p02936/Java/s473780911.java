
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int n = sc.nextInt();
		int q = sc.nextInt();
		
		// Key is child, value is root
		Map<Integer, Integer> tree = new HashMap<>();
		long[] counter = new long[n+1];
		
		
		// Build tree
		for (int i = 0; i < n - 1; i++) {
			int v = sc.nextInt();
			int w = sc.nextInt();
			
			tree.put(w, v);
		}
		
		for (int i = 0; i < q; i++) {
			int v = sc.nextInt();
			int weight = sc.nextInt();
			counter[v] += weight;
		}
		
		// Compute all node's counter from node 2 (node 1 is root)
		for (int i = 2; i <= n; i++) {
			counter[i] += counter[tree.get(i)];
		}
		
		for (int i = 1; i < counter.length; i++) {
			if (i == counter.length - 1) {
				System.out.println(counter[i]);
			} else {
				System.out.print(counter[i] + " ");
			}
		}
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
