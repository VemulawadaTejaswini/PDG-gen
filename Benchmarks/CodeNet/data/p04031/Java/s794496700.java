
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
		int[] p = new int[n];
		int minX = 100;
		int maxX = -100;
		
		for (int i = 0; i < n; i++) {
			p[i] = sc.nextInt();
			minX = Math.min(minX, p[i]);
			maxX = Math.max(maxX, p[i]);
		}
		
		int res = Integer.MAX_VALUE;
		
		for (int i = minX; i <= maxX; i++) {
			int total = 0;
			for (int j = 0; j < n; j++) {
				total += ((i - p[j])*(i - p[j]));
			}
			res = Math.min(res, total);
		}
		
		if (res == Integer.MAX_VALUE) {
			System.out.println("0");
		} else {
			System.out.println(res);
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
