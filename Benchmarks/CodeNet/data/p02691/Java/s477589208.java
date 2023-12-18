import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    long[] a = sc.nextLongArray(n);
    HashMap<Long, List<Integer>> sum = new HashMap<>();
    HashMap<Long, List<Integer>> diff = new HashMap<>();
    for (int i = 0; i < n; i++) {
      long s = -1L * (a[i] + (long) i);
      if (!sum.containsKey(s)) sum.put(s, new ArrayList<>());
      sum.get(s).add(i);
      long d = a[i] - i;
      if (!diff.containsKey(d)) diff.put(d, new ArrayList<>());
      diff.get(d).add(i);
    }
    int count = 0;
    for (long key : sum.keySet()) {
      if (!diff.containsKey(key)) continue;
      List<Integer> js = diff.get(key);
      int size = js.size();
      for (int i : sum.get(key)) {
        if (i > js.get(size - 1)) break;
        int left = -1;
        int right = size - 1;
        while (right - left > 1) {
          int m = left + (right - left) / 2;
          if (js.get(m) > i) right = m;
          else left = m;
        }
        count += size - right;
      }
    }
    System.out.println(count);
  }
}