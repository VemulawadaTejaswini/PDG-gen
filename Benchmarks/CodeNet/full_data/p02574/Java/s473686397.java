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

  private static long gcd(long a, long b) {
    if (b == 0L) return a;
    return gcd(b, a % b);
  }

  public static void main(String[] args) {
    FastScanner sc = new FastScanner(System.in);
    int n = sc.nextInt();
    int[] a = sc.nextIntArray(n);
    int[] c = new int[1000001];
    for (int ai: a) {
      c[ai]++;
    }
    boolean isPairwiseCoprime = true;
    for (int i = 2; i <= 1000000; i++) {
      int count = 0;
      for (int j = i; j <= 1000000; j += i) {
        count += c[j];
      }
      if (count > 1) isPairwiseCoprime = false;
    }
    if (isPairwiseCoprime) {
      System.out.println("pairwise coprime");
      return;
    }
    long result = a[0];
    for (int i = 1; i < n; i++) {
      result = gcd(result, a[i]);
      if (result == 1L) break;
    }
    if (result == 1L) System.out.println("setwise coprime");
    else System.out.println("not coprime");
  }
}