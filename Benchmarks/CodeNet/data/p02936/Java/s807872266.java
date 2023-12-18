
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
		List<ArrayList<Integer>> tree = new ArrayList<>();
		int[] counter = new int[n+1];
		
		for (int i = 0; i <= n; i++) {
			tree.add(new ArrayList<Integer>());
		}
		
		for (int i = 0; i < n - 1; i++) {
			int v = sc.nextInt();
			int w = sc.nextInt();
			
			tree.get(v).add(w);
		}
		
		for (int i = 0; i < q; i++) {
			int v = sc.nextInt();
			int weight = sc.nextInt();
			
			Queue<Integer> queue = new LinkedList<>();
			queue.add(v);
			
			
			while (!queue.isEmpty()) {
				int size = queue.size();
				
				for (int j = 0; j < size; j++) {
					int node = queue.poll();
					counter[node] += weight;
					
					for (int child: tree.get(node)) {
						queue.add(child);
					}
				}
				
			}
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
