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
      int count = 0;
      for(int i = 0; i < n + 1; i++)
        monsters[i] = sc.nextInt();
      for(int i = 0; i < n; i++)
        heroes[i] = sc.nextInt();
      for(int i = 0; i < n - 1; i++)
      {
          if(heroes[i + 1] < monsters[i + 1] + monsters[i + 2])
          {
              while(Math.max(monsters[i], monsters[i + 1]) != Math.min(monsters[i], monsters[i + 1]) && heroes[i] > 0)
              {
                  if(monsters[i] > monsters[i + 1])
                    monsters[i]--;
                  else
                    monsters[i + 1]--;
                  heroes[i]--;
                  count++;
              }
              while(monsters[i] > 0 && heroes[i] > 0)
              {
                  monsters[i]--;
                  heroes[i]--;
                  count++;
              }
          }
          else
          {
              while(monsters[i] > 0 && heroes[i] > 0)
              {
                  monsters[i]--;
                  heroes[i]--;
                  count++;
              }
          }
      }
      while(monsters[n] > 0 && heroes[n - 1] > 0)
      {
          monsters[n]--;
          heroes[n - 1]--;
          count++;
      }
      while(monsters[n - 1] > 0 && heroes[n - 1] > 0)
      {
          monsters[n - 1]--;
          heroes[n - 1]--;
          count++;
      }
      for(int i = 0; i < n; i++)
      {
          while(monsters[i + 1] > 0 && heroes[i] > 0)
          {
              monsters[i + 1]--;
              heroes[i]--;
              count++;
          }
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