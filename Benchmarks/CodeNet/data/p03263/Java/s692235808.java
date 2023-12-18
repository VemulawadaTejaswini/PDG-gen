import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

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
    int h = sc.nextInt();
    int w = sc.nextInt();
    int[][] a = new int[h][w];
    for (int i = 0; i < h; i++) {
      a[i] = sc.nextIntArray(w);
    }
    List<int[]> path = new ArrayList<>();
    for (int i = 0; i < h; i++) {
      if (i % 2 == 0) {
        for (int j = 0; j < w; j++) {
          path.add(new int[] {i, j});
        }
      } else {
        for (int j = w - 1; j >= 0; j--) {
          path.add(new int[] {i, j});
        }
      }
    }
    List<String> result = new ArrayList<>();
    for (int k = 0; k < h * w - 1; k++) {
      int[] from = path.get(k);
      if (a[from[0]][from[1]] % 2 == 0) continue;
      int[] to = path.get(k + 1);
      a[from[0]][from[1]]--;
      a[to[0]][to[1]]++;
      result.add(String.format("%d %d %d %d", from[0] + 1, from[1] + 1, to[0] + 1, to[1] + 1));
    }
    StringBuilder sb = new StringBuilder();
    sb.append(result.size());
    for (String s : result) {
      sb.append("\n");
      sb.append(s);
    }
    System.out.println(sb.toString());
  }
}