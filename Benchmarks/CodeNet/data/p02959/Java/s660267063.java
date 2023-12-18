import java.io.*;
import java.util.*;
 
public class Main{
   public static void main(String[] args) {
      MyScanner sc = new MyScanner();
      out = new PrintWriter(new BufferedOutputStream(System.out));
      
      //begin
      int n = sc.nextInt();
      int[] monsters = new int[n + 1];
      int[] heroes = new int[n];
      long count = 0;
      for(int i = 0; i < n + 1; i++)
        monsters[i] = sc.nextInt();
      for(int i = 0; i < n; i++)
        heroes[i] = sc.nextInt();
      for(int i = 0 ; i < n; i++)
      {
          count += Math.min(heroes[i], monsters[i]);
          heroes[i] -= Math.min(heroes[i], monsters[i]);
          count += Math.min(heroes[i], monsters[i + 1]);
          heroes[i] -= Math.min(heroes[i], monsters[i + 1]);
          monsters[i + 1] -= Math.min(heroes[i], monsters[i + 1]);
      }
      out.println(count);
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