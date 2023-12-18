import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
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
    EFriendships solver = new EFriendships();
    solver.solve(1, in, out);
    out.close();
  }

  static class EFriendships {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
      int n = in.nextInt(), k = in.nextInt();
      if (k > (n - 1) * (n - 2) / 2) {
        out.print(-1);
        return;
      }

      List<Pair<Integer, Integer>> L = generateComplete(n);
      int min = 0;
      for (Pair<Integer, Integer> p : L) {
        if (k == 0)
          break;
        if (p.getSc() != n) {
          p.setFs(-1);
          min++;
        }
        k--;
      }

      if (k > 0) {
        out.print(-1);
        return;
      }
      out.println(L.size() - min);
      for (Pair<Integer, Integer> p : L) {
        if (p.getFs() == -1)
          continue;
        out.print(p.getFs());
        out.print(' ');
        out.println(p.getSc());
      }
    }

    private List<Pair<Integer, Integer>> generateComplete(int n) {
      List<Pair<Integer, Integer>> L = new ArrayList<>();
      for (int i = 1; i <= n; i++) {
        for (int j = i + 1; j <= n; j++) {
          L.add(new Pair<>(i, j));
        }
      }
      return L;
    }

  }


  static class Pair<T1 extends Comparable<T1>, T2 extends Comparable<T2>>
      implements Comparable<Pair<T1, T2>> {
    T1 fs;
    T2 sc;

    public T1 getFs() {
      return fs;
    }

    public void setFs(T1 fs) {
      this.fs = fs;
    }

    public T2 getSc() {
      return sc;
    }

    public Pair(T1 fs, T2 sc) {
      this.fs = fs;
      this.sc = sc;
    }

    public int compareTo(Pair<T1, T2> o) {
      int fc = fs.compareTo(o.fs);
      if (fc != 0) {
        return fc;
      }
      return sc.compareTo(o.sc);
    }

    public String toString() {
      return "<" + "" + fs + ", " + sc + '>';
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

