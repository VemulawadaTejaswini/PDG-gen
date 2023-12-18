import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
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
    int x = sc.nextInt() - 1;
    int y = sc.nextInt() - 1;
    int[][] node = new int[n][n];
    for (int i = 0; i < n; i++) {
      Arrays.fill(node[i], n);
      node[i][i] = 0;
      if (i < n - 1) {
        node[i][i+1] = 1;
        node[i+1][i] = 1;
      }
      if (i > 0) {
        node[i][i - 1] = 1;
        node[i - 1][i] = 1;
      }
    }
    node[x][y] = 1;
    node[y][x] = 1;
    for (int k = 0; k < n; k++) {
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
          node[i][j] = Math.min(node[i][j], node[i][k] + node[k][j]);
        }
      }
    }
    int[] result = new int[n];
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        result[node[i][j]]++;
      }
    }
    StringBuilder sb = new StringBuilder();
    for (int k = 1; k < n; k++) {
      if (sb.length() > 0) sb.append("\n");
      sb.append(result[k]);
    }
    System.out.println(sb.toString());
  }
}