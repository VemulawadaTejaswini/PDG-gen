import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.util.ArrayList;

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
    DHandstand solver = new DHandstand();
    solver.solve(1, in, out);
    out.close();
  }

  static class DHandstand {
    private List<Integer> trans = new ArrayList<>();

    public void solve(int testNumber, InputReader in, PrintWriter out) {
      int n = in.nextInt(), k = in.nextInt();
      char[] s = in.next().toCharArray();

      for (int i = 1; i < n; i++) {
        if (s[i] != s[i - 1])
          trans.add(i - 1);
      }

      int ans = 0;
      for (int i = 0; i < n; i++) {
        ans = Math.max(ans, compute(i, k, n, s[i] == '1'));
      }
      out.println(ans);
    }

    private int compute(int i, int k, int n, boolean one) {
      int m = trans.size(), R;
      int rightIdx = SearchUtil.lowerBound(trans, 0, m, i) + 2 * k;
      if (!one)
        rightIdx--;
      if (rightIdx >= m)
        R = n - 1;
      else
        R = trans.get(Math.min(rightIdx, m - 1));
      return R - i + 1;
    }

  }


  static class SearchUtil {
    public static int lowerBound(List<Integer> a, int low, int high, int element) {
      while (low < high) {
        int middle = (low + high) / 2;
        if (element > a.get(middle))
          low = middle + 1;
        else
          high = middle;
      }
      return low;
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

