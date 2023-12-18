import java.util.*;
import java.io.*;

public class Main {

  void solve(InputReader in, PrintWriter out) {
    int n = in.nextInt();
    int k = in.nextInt();

    PriorityQueue<Integer> q = new PriorityQueue<>();
    for (int i = 0; i < n; ++i) {
      q.offer(-1 * in.nextInt());
      if (q.size() > n - k)
        q.poll();
    }
    
    long ans = 0;
    while (!q.isEmpty()) {
      ans -= q.poll();
    }
    out.println(ans);
  }

  public static void main(String[] args) throws Exception {
    InputReader in = new InputReader(System.in);
    PrintWriter out = new PrintWriter(System.out);
    Main solver = new Main();
    solver.solve(in, out);
    out.close();
  }

  static class InputReader {
    BufferedReader in;
    StringTokenizer st;

    public InputReader(InputStream is) {
      in = new BufferedReader(new InputStreamReader(is));
    }

    public String next() {
      try {
        while (st == null || !st.hasMoreTokens()) {
          st = new StringTokenizer(in.readLine());
        }
        return st.nextToken();
      } catch (Exception e) {
        throw new RuntimeException(e);
      }
    }

    public int nextInt() {
      return Integer.parseInt(next());
    }

    public long nextLong() {
      return Long.parseLong(next());
    }
  }
}
