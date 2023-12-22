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
        int r = in.nextInt();
        int c = in.nextInt();
        int sum = 0;
        int[][] sheet = new int[r][c]; 
        int[] sumofrow = new int[r];
        int[] sumofcolumn = new int[c];
        
        for (int i = 0; i < r; i++) {
          for (int j = 0; j < c; j++) {
            sheet[i][j] = in.nextInt();
            sum += sheet[i][j];
          }
        }
        
        for (int i = 0; i < r; i++) {
          for (int j = 0; j < c; j++) {
            sumofrow[i] += sheet[i][j];
            sumofcolumn[j] += sheet[i][j];
          }
        }
        
        for (int i = 0; i < r; i++) {
          for (int j = 0; j < c; j++) {
            out.print(sheet[i][j] + " ");
          }
          out.println(sumofrow[i]);
        }
        
        for (int i = 0; i < c; i++) {
          out.print(sumofcolumn[i] + " ");
        }
        
        out.println(sum);
        
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