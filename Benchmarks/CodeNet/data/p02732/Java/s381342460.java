

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

import atcoder.triangle.MyScanner;

public class Main {
	
	public static void main(String[] args) throws java.lang.Exception {
	      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	      MyScanner sc = new MyScanner();
	      out = new PrintWriter(new BufferedOutputStream(System.out));
	      
	      int n = sc.nextInt();
	      int ar[] = new int[n];
	      String s[] = sc.nextLine().split(" ");
	      for(int i = 0; i < n;i++)
	    	  ar[i] = Integer.parseInt(s[i]);
	      Arrays.parallelSort(ar);
	      int count = 0;
	      for(int k = 1; k <= n; k++) {
	    	  count = 0;
	    	  for(int i = 0; i < n-1; i++) {
	    		  if(k!=i && ar[i] == ar[i+1])
	    			  count++;
	    	  }
	    	  System.out.println(count);
	      }
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
