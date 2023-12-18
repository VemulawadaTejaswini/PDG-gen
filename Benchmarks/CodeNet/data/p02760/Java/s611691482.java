import java.util.*;
import java.io.*;

public class Main {

  void solve(InputReader in, PrintWriter out) {
    int[][] arr = new int[3][3];
    for (int i = 0; i < 3; ++i) {
      for (int j = 0; j < 3; ++j) {
        arr[i][j] = in.nextInt();
      }
    }

    Set<Integer> li = new HashSet<>();
    int n = in.nextInt();
    for (int i = 0; i < n; ++i) {
      li.add(in.nextInt());
    }

    for (int i = 0; i < 3; ++i) {
      for (int j = 0; j < 3; ++j) {
        if (li.contains(arr[i][j])) {
          arr[i][j] = -1;
        }
      }
    }

    boolean ans = false;
    for (int i = 0; i < 3 && !ans; ++i) {
      if (arr[i][0] == -1 && arr[i][1] == -1 && arr[i][2] == -1) {
        ans = true;
      } else if (arr[0][i] == -1 && arr[1][i] == -1 && arr[2][i] == -1) {
        ans = true;
      } 
    }

    if (arr[0][0] == -1 && arr[1][1] == -1 && arr[2][2] == -1) {
      ans = true;
    } else if (arr[2][0] == -1 && arr[1][1] == -1 && arr[0][2] == -1) {
      ans = true;
    }

    out.println(ans ? "Yes" : "No");
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
