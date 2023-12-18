import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.stream.IntStream;
import java.util.Collection;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import java.util.StringTokenizer;
import java.io.BufferedReader;
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
    CPeaks solver = new CPeaks();
    solver.solve(1, in, out);
    out.close();
  }

  static class CPeaks {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
      int n = in.nextInt(), m = in.nextInt();

      List<Integer> h = new ArrayList<>();
      List<Boolean> V = new ArrayList<>();
      for (int i = 0; i < n; i++) {
        h.add(in.nextInt());
        V.add(true);
      }

      while (m > 0) {
        int u = in.nextInt() - 1, v = in.nextInt() - 1;
        if (h.get(u) >= h.get(v))
          V.set(v, false);
        if (h.get(u) <= h.get(v))
          V.set(u, false);
        m--;
      }

      int ans = V.stream().mapToInt(x -> x ? 1 : 0).sum();
      out.println(ans);
    }

  }


  static class InputReader {
    private BufferedReader reader;
    private StringTokenizer tokenizer;

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

