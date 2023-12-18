import java.io.*;
import java.util.*;
 
public class Main{
   public static void main(String[] args) {
      MyScanner sc = new MyScanner();
      out = new PrintWriter(new BufferedOutputStream(System.out));
      
      //begin
      int n = sc.nextInt();
      ArrayList<Integer> lowers = new ArrayList<Integer>();
      int colors = 1;
      lowers.add(sc.nextInt());
      for(int i = 1; i < n; i++)
      {
          int a = sc.nextInt();
          Collections.sort(lowers, Collections.reverseOrder());
          int j = 0;
          while(j < lowers.size() && lowers.get(j) >= a)
            j++;
          if(j == lowers.size())
          {
              colors++;
              lowers.add(a);
          }
          else
            lowers.set(j, a);
      }
      out.println(colors);
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