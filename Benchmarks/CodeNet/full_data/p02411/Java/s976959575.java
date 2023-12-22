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
      while (true) {
        int m = in.nextInt();
        int f = in.nextInt();
        int r = in.nextInt();
        char grade = 'F';
        int tmp = m + f;
        
        if (m == -1 || f == -1 ) {
          if (m == -1 && f == -1 &&  r == -1) {
            break;
          } 
        } else if (tmp >= 80) {
          grade = 'A';
        } else if (tmp >= 65) {
          grade = 'B';
        } else if (tmp >= 50) {
          grade = 'C';
        } else if (tmp >= 30) {
          grade = 'D';
          
          if (r >= 50) {
            grade = 'C';
          } 
        } 
        
       
        
        out.println(grade);
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