import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
  static InputReader in;
  static PrintWriter out;

  static class Solution {
    void solve() throws IOException {
      int n = in.nextInt();
      int m =  in.nextInt();
      
      int[][] a = new int[n + 1][m + 1];
      int[] b = new int[m + 1];
      int[] c = new int[n + 1];

      for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= m; j++) {
          a[i][j] = in.nextInt();
        }
      }
      
      for (int i = 1; i <= m; i++) {
        b[i] = in.nextInt();
      }
      
      for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= m; j++)
        c[i] += a[i][j]* b[j];
      }
      
      for (int i = 1; i <= n; i++) {
        out.println(c[i]);
      }
      
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