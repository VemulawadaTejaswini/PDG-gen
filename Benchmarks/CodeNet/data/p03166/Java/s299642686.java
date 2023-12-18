import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.LinkedList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in Actual solution is at the top
 *
 * @author Jatin Yadav
 */
public class Main {
  public static void main(String[] args) {
    InputStream inputStream = System.in;
    OutputStream outputStream = System.out;
    InputReader in = new InputReader(inputStream);
    PrintWriter out = new PrintWriter(outputStream);
    LongestPath solver = new LongestPath();
    solver.solve(1, in, out);
    out.close();
  }

  static class LongestPath {
    InputReader in;
    PrintWriter out;
    HashMap<Integer, LinkedList<Integer>> g;
    int[] dp;

    public void solve(int testNumber, InputReader in, PrintWriter out) {
      this.in = in;
      this.out = out;
      solve();
    }

    public void solve() {
      g = new HashMap<>();
      int n = ni();
      int m = ni();
      for (int i = 0; i < m; i++) {
        int x = ni();
        int y = ni();
        g.putIfAbsent(x, new LinkedList<>());
        g.get(x).add(y);
      }
      dp = new int[n + 1];
      Arrays.fill(dp, -1);
      int bestAns = 0;
      for (int i = 1; i <= n; i++) {
        bestAns = Math.max(bestAns, bestChild(i));
      }
      out.println(bestAns);
    }

    private int bestChild(int src) {
      if (dp[src] != -1) return dp[src];

      boolean isLeaf = true;
      int bestChild = 0;
      if (g.containsKey(src)) {
        for (int child : g.get(src)) {
          isLeaf = false;
          bestChild = Math.max(bestChild, bestChild(child));
        }
      }
      return isLeaf ? 0 : 1 + bestChild;
    }

    private int ni() {
      return in.nextInt();
    }
  }

  static class InputReader {
    private final InputStream stream;
    private final byte[] buf = new byte[8192];
    private int curChar;
    private int snumChars;
    private InputReader.SpaceCharFilter filter;

    public InputReader(InputStream stream) {
      this.stream = stream;
    }

    public int snext() {
      if (snumChars == -1) {
        throw new InputMismatchException();
      }
      if (curChar >= snumChars) {
        curChar = 0;
        try {
          snumChars = stream.read(buf);
        } catch (IOException e) {
          throw new InputMismatchException();
        }
        if (snumChars <= 0) {
          return -1;
        }
      }
      return buf[curChar++];
    }

    public int nextInt() {
      int c = snext();
      while (isSpaceChar(c)) {
        c = snext();
      }
      int sgn = 1;
      if (c == '-') {
        sgn = -1;
        c = snext();
      }
      int res = 0;
      do {
        if (c < '0' || c > '9') {
          throw new InputMismatchException();
        }
        res *= 10;
        res += c - '0';
        c = snext();
      } while (!isSpaceChar(c));
      return res * sgn;
    }

    public boolean isSpaceChar(int c) {
      if (filter != null) {
        return filter.isSpaceChar(c);
      }
      return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
    }

    public interface SpaceCharFilter {
      public boolean isSpaceChar(int ch);
    }
  }
}

