import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
  private static class FastScanner {
    private BufferedReader reader = null;
    private StringTokenizer tokenizer = null;

    public FastScanner(InputStream in) {
      reader = new BufferedReader(new InputStreamReader(in));
      tokenizer = null;
    }

    public String next() {
      if (tokenizer == null || !tokenizer.hasMoreTokens()) {
        try {
          tokenizer = new StringTokenizer(reader.readLine());
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      }
      return tokenizer.nextToken();
    }

    public String nextLine() {
      if (tokenizer == null || !tokenizer.hasMoreTokens()) {
        try {
          return reader.readLine();
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      }

      return tokenizer.nextToken("\n");
    }

    public long nextLong() {
      return Long.parseLong(next());
    }

    public int nextInt() {
      return Integer.parseInt(next());
    }

    public double nextDouble() {
      return Double.parseDouble(next());
    }

    public int[] nextIntArray(int n) {
      int[] a = new int[n];
      for (int i = 0; i < n; i++)
        a[i] = nextInt();
      return a;
    }

    public long[] nextLongArray(int n) {
      long[] a = new long[n];
      for (int i = 0; i < n; i++)
        a[i] = nextLong();
      return a;
    }
  }

  private static int diff(int a) {
    return 10 * (int) Math.ceil(a / 10);
  }

  private static class Diff {
    int val;
    int diff;
    int tens;
    Diff(int val) {
      this.val = val;
      this.tens = (int) (10 * Math.ceil(val / 10.0));
      this.diff = this.tens - val;
    }
  }

  public static void main(String[] args) {
    FastScanner sc = new FastScanner(System.in);
    Diff[] a = new Diff[5];
    for (int i = 0; i < 5; i++) {
      a[i] = new Diff(sc.nextInt());
    }
    Arrays.sort(a, (Diff x, Diff y) -> x.diff - y.diff);
    int sum = 0;
    for (int i = 0; i < 4; i++) sum += a[i].tens;
    sum += a[a.length - 1].val;
    System.out.println(sum);
  }
}