import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) {
    new Main().solve();
  }

  private void solve() {
    try(InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out)) {

      final int A = in.nextInt();
      final int B = in.nextInt();
      final int Q = in.nextInt();

      long[] s = new long[A+1];
      for (int i = 0; i < A; i++) {
        s[i] = in.nextLong();
      }
      s[A] = 1L << 40;

      long[] t = new long[B+1];
      for (int i = 0; i < B; i++) {
        t[i] = in.nextLong();
      }
      t[B] = 1L << 40;

      for (int q = 0; q < Q; q++) {
        long x = in.nextLong();
        long dist = 1L << 50;

        for (int c = 0; c < 2; c++) {
          long[] af = c == 0 ? s : t;
          long[] as = c == 0 ? t : s;

          for (int i = 0; i < 2; i++) {
            int posF = binarySearch(af, x) + i;
            long df = af[posF];

            for (int j = 0; j < 2; j++) {
              int posS = binarySearch(as, x) + j;
              long ds = as[posS];
              
              long d = Math.abs(x - df);
              d += Math.abs(df - ds);
              dist = Math.min(dist, d);
            }
          }
        }

        out.println(dist);
      }
    }
    catch(IOException e) {
      System.err.println(e);
    }
  }

  private int binarySearch(long[] arr, long x) {
    int left = 0;
    int right = arr.length;

    while(right - left > 1) {
      int mid = (left + right) / 2;
      if(arr[mid] <= x)  left = mid;
      else right = mid;
    }
    return left;
  }

  static class InputReader implements AutoCloseable {
    static public BufferedReader br;
    static public StringTokenizer st;

    public InputReader(InputStream stream) {
      br = new BufferedReader(new InputStreamReader(stream), 32768);
      st = null;
    }
    static public String next() {
      if (st == null || !st.hasMoreTokens()) {
        try { st = new StringTokenizer(br.readLine());
        } catch (IOException e) {
          throw new UncheckedIOException(e);
        }
      }
      return st.nextToken();
    }
    static public int nextInt() { return Integer.parseInt(next()); }
    static public long nextLong() { return Long.parseLong(next()); }
    static public int[] mapInt(int len) {
      int[] ret = new int[len];
      for (int i = 0; i < len; i++) ret[i] = Integer.parseInt(next());
      return ret;
    }
    static public long[] mapLong(int len) {
      long[] ret = new long[len];
      for (int i = 0; i < len; i++) ret[i] = Long.parseLong(next());
      return ret;
    }
    @Override public void close() throws IOException { br.close(); }
  }
}