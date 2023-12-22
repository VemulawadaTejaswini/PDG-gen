
import java.io.*;
import java.util.*;
 
 
class Main{
   public static void main(String[] args) {
      FastScanner sc = new FastScanner();
      out = new PrintWriter(new BufferedOutputStream(System.out));
      String s = sc.next();
      if(isUpperCase(s)) {
        out.println("A");
      }else {
        out.println("a");
      }
      out.close();
   }
   
   public static boolean isUpperCase(String s)
   {
       for (int i=0; i<s.length(); i++)
       {
           if (!Character.isUpperCase(s.charAt(i)))
           {
               return false;
           }
       }
       return true;
   }

     

   //-----------PrintWriter for faster output---------------------------------
   public static PrintWriter out;
      
   //-----------MyScanner class for faster input----------
   public static class FastScanner {
      BufferedReader br;
      StringTokenizer st;
 
      public FastScanner() {
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
