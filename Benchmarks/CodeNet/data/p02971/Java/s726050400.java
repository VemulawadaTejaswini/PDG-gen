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
        int s = sc.nextInt();
        nums[i] = s;
        sortnums[i] = s;
      }
      Arrays.sort(sortnums);
      for(int i = 0; i < n; i++)
      {
          int max = 0;
          int j = n - 1;
          while(j > -1 && sortnums[j] <= nums[i])
            j--;
          if(j == -1)
          {
              j = n - 1;
              while(j > -1 && sortnums[j] == nums[i])
                j--;
              if(j == -1)
                out.println(nums[i]);
              else
                out.println(sortnums[j]);
          }
          else
            out.println(sortnums[j]);
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