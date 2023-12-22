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
    TreeMap<Long, TreeSet<Long>> xsort = new TreeMap<>();
    TreeMap<Long, TreeSet<Long>> ysort = new TreeMap<>();
    for (int i = 0; i < n; i++) {
      long x = sc.nextLong();
      long y = sc.nextLong();
      if (!xsort.containsKey(x)) xsort.put(x, new TreeSet<>());
      xsort.get(x).add(y);
      if (!ysort.containsKey(y)) ysort.put(y, new TreeSet<>());
      ysort.get(y).add(x);
    }
    long max = Long.MIN_VALUE;
    long minX = xsort.firstKey();
    long maxX = xsort.lastKey();
    max = Math.max(max, maxX - minX + Math.abs(xsort.get(minX).first() - xsort.get(maxX).last()));
    max = Math.max(max, maxX - minX + Math.abs(xsort.get(maxX).first() - xsort.get(minX).last()));
    long minY = ysort.firstKey();
    long maxY = ysort.lastKey();
    max = Math.max(max, maxY - minY + Math.abs(ysort.get(minY).first() - ysort.get(maxY).last()));
    max = Math.max(max, maxY - minY + Math.abs(ysort.get(maxY).first() - ysort.get(minY).last()));
    System.out.println(max);
  }
}