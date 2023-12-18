import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int n = sc.nextInt();
		int t = sc.nextInt();
		String res = "TLE";
		int minCost = Integer.MAX_VALUE;
		
		for (int i = 0; i < n; i++) {
			int c = sc.nextInt();
			int T = sc.nextInt();
			
			if (T <= t) {
				if (c < minCost) {
					minCost = c;
					res = "" + c;
				}
			}
		}
		System.out.println(res);
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
