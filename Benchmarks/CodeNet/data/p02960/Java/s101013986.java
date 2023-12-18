import java.io.*;
import java.util.*;

 
public class Main{
   public static void main(String[] args) {
      MyScanner sc = new MyScanner();
      out = new PrintWriter(new BufferedOutputStream(System.out));
      String S=sc.next();
      int N=S.length();
      char clst[]=S.toCharArray();
      int curd=1;
      int mod=(int)Math.pow(10, 9)+7;
      int residual[][]=new int[N+1][13];
      residual[0][0]=1;

      for(int dig=1;dig<=N;dig++){
          int p=N-dig;
          char c=clst[p];

          if(c=='?'){
              for(int d=0;d<10;d++){
                  for(int i=0;i<13;i++){
                      residual[dig][(i+d*curd)%13]+=residual[dig-1][i];
                      residual[dig][(i+d*curd)%13]%=mod;
                  }
              }
          }else{
              int d=c-'0';
              for(int i=0;i<13;i++){
                  residual[dig][(i+d*curd)%13]+=residual[dig-1][i];
                  residual[dig][(i+d*curd)%13]%=mod;
              }
          }
          curd=(curd*10)%13;
      }
      out.println(residual[N][5]);
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