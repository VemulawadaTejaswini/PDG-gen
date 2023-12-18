

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;



public class Main {
	
	public static void main(String[] args) throws java.lang.Exception {
			MyScanner sc = new MyScanner();
	      out = new PrintWriter(new BufferedOutputStream(System.out));
	      
	      String input[] = sc.nextLine().split(" ");
	      int n = Integer.parseInt(input[0]);
	      int m = Integer.parseInt(input[1]);
	      int even[] = new int[n];
	      int odd[] = new int[m];
	      int p = 0;
	      for(int i = 1; i <= n; i++)
	    	  even[p++] = 2 * i;
	      p = 0;
	      for(int i = 1; i <= m; i++)
	    	  odd[p++] = (2 * i) - 1;
	      int count = 0;
	      for(int i = 0; i < n; i++) {
	    	  for(int j = i + 1; j < n; j++)
	    		  count++;
	      }
	      
	      for(int i = 0; i < m; i++) {
	    	  for(int j = i + 1; j < m; j++)
	    		  count++;
	      }
	      System.out.println(count);
	      out.close();
	}
	public static PrintWriter out;

	   public static class MyScanner {
	      BufferedReader br;
	      StringTokenizer st;
	 
	      public MyScanner() {
	         br = new BufferedReader(new InputStreamReader(System.in));
	      }
	 
	      String next() {
	          while (st == null || !st.hasMoreElements()) {
	              try {
	                  st = new StringTokenizer(br.readLine());
	              } catch (IOException e) {
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
	 
	      String nextLine(){
	          String str = "";
		  try {
		     str = br.readLine();
		  } catch (IOException e) {
		     e.printStackTrace();
		  }
		  return str;
	      }

	   }

}
