import java.io.*;
import java.util.*;
public class Main {
static PrintWriter pw =new PrintWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) {
	// write your code here
        MyScanner mc = new MyScanner();
        mc.nextLine();
        String line = mc.nextLine();
        int count =0;
        for (int i=0;i<line.length();i++){
            for (int j=i+1;j<line.length();j++){
                for (int k=j+1;k<line.length();k++){
                    if (line.charAt(i)!=line.charAt(k)&&line.charAt(i)!=line.charAt(j)&&line.charAt(k)!=line.charAt(j)&&(j-i)!=k-j){
                        count++;
                    }
                }
            }
        }
        pw.println(count);
        pw.flush();
    }

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
