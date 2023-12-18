import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
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

  public static void main(String[] args) {
    FastScanner sc = new FastScanner(System.in);
    int n = sc.nextInt();
    int[][] points = new int[n][2];
    for (int i = 0; i < n; i++) {
      points[i] = sc.nextIntArray(2);
    }
    double min = Double.MAX_VALUE;
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        double x = (double) (points[i][0] + points[j][0]) / 2.0;
        double y = (double) (points[i][1] + points[j][1]) / 2.0;
        double r = Math.sqrt(Math.pow(x - points[i][0], 2.0) + Math.pow(y - points[i][1], 2.0));
        boolean allInclude = true;
        for (int k = 0; k < n; k++) {
          double dist = Math.sqrt(Math.pow(x - points[k][0], 2.0) + Math.pow(y - points[k][1], 2.0));
          if (dist > r) {
            allInclude = false;
            break;
          }
        }
        if (allInclude) {
          min = Math.min(min, r);
        }
      }
    }
    System.out.println(min);
  }
}