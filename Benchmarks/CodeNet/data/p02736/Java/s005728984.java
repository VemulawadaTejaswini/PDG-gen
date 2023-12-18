
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws java.lang.Exception {
	      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	      MyScanner sc = new MyScanner();
	      out = new PrintWriter(new BufferedOutputStream(System.out));
	      String s1 = sc.nextLine();
	      int n = 0;
	      try{
              if(s1!=null){
                  n=Integer.parseInt(s1);
              }
          }catch(NumberFormatException e){

          }
	      char input[] = sc.nextLine().trim().toCharArray();
	      byte x[] = new byte[n];
	      for(int i = 0; i < n; i++) {
	    	  x[i] = (byte)((int)(input[i]) - 48);
	      }
	      
	      int elements = (n * (n + 1)) / 2;
	      byte dp[] = new byte[elements];
	      for(int i = 0; i < n; i++)
	    	  dp[i] = x[i];
	      
	      int flag = n;
	      for(int i = 1; i < n; i++) {
	    	  
	    	  for(int j = 0; j < n - i; j++) {
	    		  int p = flag;
	    		  dp[flag++] = (byte)Math.abs(dp[p - n + (i - 1)] - dp[p - n + i]);
	    	  }
	      }
	      
	     /* for(int item : dp)
	    	  System.out.print(item + " ");*/
	     System.out.print("\n" + dp[flag - 1]);
	      
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
