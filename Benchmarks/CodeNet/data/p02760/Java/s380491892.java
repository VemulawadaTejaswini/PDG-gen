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
    int[][] a = new int[3][3];
    for (int i = 0; i < 3; i++) {
      a[i] = sc.nextIntArray(3);
    }
    int n = sc.nextInt();
    int[] b = sc.nextIntArray(n);
    for (int val : b) {
      for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
          if (a[i][j] == val) {
            a[i][j] = -1;
          }
        }
      }
    }
    boolean isBingo = false;
    for (int i = 0; i < 3; i++) {
      int sum = 0;
      for (int j = 0; j < 3; j++) {
        sum += a[i][j];
      }
      isBingo |= sum == -3;
    }
    for (int j = 0; j < 3; j++) {
      int sum = 0;
      for (int i = 0; i < 3; i++) {
        sum += a[i][j];
      }
      isBingo |= sum == -3;
    }
    isBingo |= a[0][0] + a[1][1] + a[2][2] == -3;
    isBingo |= a[0][2] + a[1][1] + a[2][0] == -3;
    System.out.println(isBingo ? "Yes" : "No");
  }
}