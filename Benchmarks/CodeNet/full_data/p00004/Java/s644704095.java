import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.math.BigDecimal;

public class Main {
  static InputReader in;
  static PrintWriter out;

  static class Solution {
    void solve() throws IOException {
      Scanner sc = new Scanner(System.in);
      while (sc.hasNext()) {
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        double e = sc.nextDouble();
        double f = sc.nextDouble();
        
        double y = (d * c - a * f) / (d * b - a * e);
        double x = (e * c - b * f) / (a * e - b * d);
        BigDecimal xx = new BigDecimal(x);
        BigDecimal yy = new BigDecimal(y);

        xx = xx.setScale(3, BigDecimal.ROUND_HALF_UP);
        yy = yy.setScale(3, BigDecimal.ROUND_HALF_UP);
        
        out.printf("%.3f %.3f\n", xx, yy);
      }
      
//      End solve()
    }
    
    int gcd(int x, int y) {
      if (x < y) {
        int tmp = x;
        x = y;
        y = tmp;
      }
      
      while (y > 0) {
        int r = x % y;
        x = y;
        y = r;
      }
      
      return x;
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