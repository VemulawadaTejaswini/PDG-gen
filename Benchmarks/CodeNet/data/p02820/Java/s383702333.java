import java.io.*;
import java.util.*;

 
public class Main{
   public static void main(String[] args) {
      MyScanner sc = new MyScanner();
      out = new PrintWriter(new BufferedOutputStream(System.out));
      int N=sc.nextInt();
      int K=sc.nextInt();
      int R=sc.nextInt();
      int S=sc.nextInt();
      int P=sc.nextInt();
      String t=sc.next();
      int dp[]=new int[N+K];
      int ans=0;

      for(int i=0;i<N;i++){
          char op=t.charAt(i);
          int cand=0;
          switch (op) {
              case 'r':
                  cand=1;
                  break;
              case 's':
                  cand=2;
                  break;
              case 'p':
                  cand=3;
                  break;
          }
          if(dp[i]!=cand){
              dp[i+K]=cand;
              switch (cand) {
                  case 1:
                      ans+=P;
                      break;
                  case 2:
                      ans+=R;
                      break;
                  case 3:
                      ans+=S;
                      break;
              }
          }
      }
      
      out.println(ans);
      out.close();
   }

   //-----------PrintWriter for faster output---------------------------------
   public static PrintWriter out;
      
   //-----------MyScanner class for faster input----------
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