import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
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

  private static List<Long> binarySearch(long[] a, long target) {
    List<Long> result = new ArrayList<>();
    if (target <= a[0]) {
      result.add(a[0]);
      return result;
    } else if (target >= a[a.length - 1]) {
      result.add(a[a.length - 1]);
      return result;
    }
    int left = 0;
    int right = a.length;
    while (right - left > 1) {
      int m = left + (right - left) / 2;
      if (a[m] == target) {
        result.add(a[m]);
        return result;
      } else if (a[m] < target) {
        left = m;
      } else {
        right = m;
      }
    }
    result.add(a[left]);
    result.add(a[left + 1]);
    return result;
  }

  public static void main(String[] args) {
    FastScanner sc = new FastScanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int q = sc.nextInt();
    long[] s = sc.nextLongArray(a);
    Arrays.sort(s);
    long[] t = sc.nextLongArray(b);
    Arrays.sort(t);
    long[] x = sc.nextLongArray(q);
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < q; i++) {
      if (i > 0) sb.append("\n");
      long min = Long.MAX_VALUE;
      List<Long> nearestShrines = binarySearch(s, x[i]);
      for (Long shrine : nearestShrines) {
        long sum = Math.abs(shrine - x[i]);
        List<Long> nearestTemples = binarySearch(t, shrine);
        long nt = Long.MAX_VALUE;
        for (Long temple : nearestTemples) {
          nt = Math.min(nt, Math.abs(shrine - temple));
        }
        sum += nt;
        min = Math.min(min, sum);
      }
      List<Long> nearestTemples = binarySearch(t, x[i]);
      for (Long temple : nearestTemples) {
        long sum = Math.abs(temple - x[i]);
        nearestShrines = binarySearch(s, temple);
        long nt = Long.MAX_VALUE;
        for (Long shrine : nearestShrines) {
          nt = Math.min(nt, Math.abs(shrine - temple));
        }
        sum += nt;
        min = Math.min(min, sum);
      }
      sb.append(min);
    }
    System.out.println(sb.toString());
  }
}