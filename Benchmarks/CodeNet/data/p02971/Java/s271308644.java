import java.io.*;
import java.util.*;
 
public class Main{
   public static void main(String[] args) {
      MyScanner sc = new MyScanner();
      out = new PrintWriter(new BufferedOutputStream(System.out));
      
      //begin
      int n = sc.nextInt();
      int[] nums = new int[n];
      int[] sortnums = new int[n];
      for(int i = 0; i < n; i++)
      {
        nums[i] = sc.nextInt();
        sortnums[i] = nums[i];
      }
      Arrays.sort(sortnums);
      int i = n - 2;
      while(i > -1 && sortnums[i] == sortnums[n - 1])
        i--;
      if(i == -1)
        for(int j = 0; j < n; j++)
            out.println(nums[j]);
      else
      {
          int k = n - 1 - i;
          if(k == 1)
            for(int j = 0; j < n; j++)
                if(nums[j] != sortnums[n - 1])
                    out.println(sortnums[n - 1]);
                else
                    out.println(sortnums[i]);
          else
            for(int j = 0; j < n; j++)
                out.println(sortnums[n - 1]);
                
      }
      //end
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