import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author koneko096
 */
public class Main {
  public static void main(String[] args) {
    InputStream inputStream = System.in;
    OutputStream outputStream = System.out;
    InputReader in = new InputReader(inputStream);
    PrintWriter out = new PrintWriter(outputStream);
    CStones solver = new CStones();
    solver.solve(1, in, out);
    out.close();
  }

  static class CStones {
    private static final int N = 200004;

    public void solve(int testNumber, InputReader in, PrintWriter out) {
      int[] B = new int[N], W = new int[N];

      int n = in.nextInt();
      char[] s = in.next().toCharArray();

      for (int i = 1; i <= n; i++) {
        B[i] = B[i - 1] + boolToInt(s[i - 1] == '#');
        W[i] = W[i - 1] + boolToInt(s[i - 1] == '.');
      }

      int ans = N;
      for (int i = 0; i <= n; i++) {
        ans = Math.min(ans, B[i] + W[n] - W[i]);
      }
      out.println(ans);
    }

    private int boolToInt(boolean b) {
      return (b ? 1 : 0);
    }

  }


  static class InputReader {
    public BufferedReader reader;
    public StringTokenizer tokenizer;

    public InputReader(InputStream stream) {
      reader = new BufferedReader(new InputStreamReader(stream), 32768);
      tokenizer = null;
    }

    public String next() {
      while (tokenizer == null || !tokenizer.hasMoreTokens()) {
        try {
          tokenizer = new StringTokenizer(reader.readLine());
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      }
      return tokenizer.nextToken();
    }

    public int nextInt() {
      return Integer.parseInt(next());
    }

  }
}

