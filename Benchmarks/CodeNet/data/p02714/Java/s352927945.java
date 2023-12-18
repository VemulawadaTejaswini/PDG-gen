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
    int n = sc.nextInt();
    String s = sc.next();
    Set<Integer> r = new HashSet<>();
    Set<Integer> g = new HashSet<>();
    Set<Integer> b = new HashSet<>();
    for (int i = 0; i < n; i++) {
      if (s.charAt(i) == 'R') r.add(i);
      else if (s.charAt(i) == 'G') g.add(i);
      else b.add(i);
    }
    long result = (long) r.size() * (long) g.size() * (long) b.size();
    for (int i : r) {
      for (int j : g) {
        int small = Math.min(i, j);
        int big = Math.max(i, j);
        int diff = big - small;
        if (b.contains(small - diff)) result--;
        if (b.contains(big + diff)) result--;
        if (diff % 2 == 0 && b.contains(small + diff / 2)) result--;
      }
    }
    System.out.println(result);
  }
}