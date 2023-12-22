import java.io.*;
import java.util.*;
public class Main {
 
  public static void main(String[] args) { 
        solve();
      out.close();
  }

  private static void solve() {
      //String s = sc.next();
      int n = sc.nextInt();
      int k = sc.nextInt();
      long[] arr = sc.readArray(n);
      StringBuilder sb = new StringBuilder();
      int left = 0;
      long sum = 1;
      for(int i = 0; i < n; i++) {
        sum *= arr[i];
        if(i >= k) {
          long prev = sum / arr[i];
          sum /= arr[i - k];
          if(prev < sum)
            sb.append("Yes\n");
          else
            sb.append("No\n");
        }
      }
      out.print(sb.toString());
  }

  public static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
 
  public static FastScanner sc = new FastScanner();

  static class FastScanner {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st=new StringTokenizer("");
      String next() {
        while (!st.hasMoreTokens())
          try {
            st=new StringTokenizer(br.readLine());
          } catch (IOException e) {
            e.printStackTrace();
          }
        return st.nextToken();
      }
      
      int nextInt() {
        return Integer.parseInt(next());
      }
      long[] readArray(int n) {
        long[] a=new long[n];
        for (int i=0; i<n; i++) a[i]=nextLong();
        return a;
      }
      long nextLong() {
        return Long.parseLong(next());
      }
  }
}