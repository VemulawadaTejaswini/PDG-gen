import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
  static InputReader in;
  static PrintWriter out;
  
  static class Solution {
    void solve() throws IOException {
      int n = in.nextInt();
      double[] x = new double[n + 1];
      double[] y = new double[n + 1];
      double dist1  = 0;
      double dist2 = 0;
      double dist3 = 0;
      double distinf = 0;
      
      for (int i = 1; i <= n; i++) {
        x[i] = in.nextDouble();
      }
      for (int i = 1; i <= n; i++) {
        y[i] = in.nextDouble();
      }
      
      for (int i = 1; i <= n; i++) {
        dist1 += Math.abs(x[i] - y[i]);
      }
      
      for (int i = 1; i <= n; i++) {
        dist2 += Math.pow(Math.abs(x[i] - y[i]), 2);
      }
      dist2 = Math.sqrt(dist2);
      
      for (int i = 1; i <= n; i++) {
        dist3 += Math.pow(Math.abs(x[i] - y[i]), 3);
      }
      dist3 = Math.cbrt(dist3);
      
      double max = 0;
      for (int i = 1; i <= n; i++) {
        max = Math.max(max, Math.abs(x[i] - y[i]));
      }
      distinf = max;
      
      out.printf("%.5f\n%.5f\n%.5f\n%.5f\n", dist1, dist2, dist3, distinf);
//      End solve()
    }
//    End Solution
}


  public static void main(String[] args) throws IOException {
    in = new InputReader(System.in);
    out = new PrintWriter(System.out);
    Solution solver = new Solution();
    solver.solve();
    out.close();
}


  static class InputReader {
    public BufferedReader br;
    public StringTokenizer st;

    public InputReader(InputStream stream) {
      br = new BufferedReader(new InputStreamReader(stream));
    }

    public int nextInt() throws IOException {
      while (st == null || !st.hasMoreTokens()) {
        st = new StringTokenizer(br.readLine());
      }
      return Integer.parseInt(st.nextToken());
    }

    public long nextLong() throws IOException {
      while (st == null || !st.hasMoreTokens()) {
        st = new StringTokenizer(br.readLine());
      }
      return Long.parseLong(st.nextToken());
    }

    public String next() throws IOException {
      while (st == null || !st.hasMoreTokens()) {
        st = new StringTokenizer(br.readLine());
      }
      return st.nextToken();
    }

    public double nextDouble() throws IOException {
      while (st == null || !st.hasMoreTokens()) {
        st = new StringTokenizer(br.readLine());
      }
      return Double.parseDouble(st.nextToken());
    }

  }

}