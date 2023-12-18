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

    return loop(arr, x, left, right);
  }

  private int loop(long[] arr, long x, int left, int right) {
    if(right - left < 2) return left;
    else {
      int mid = (left + right) / 2;
      if(arr[mid] <= x) return loop(arr, x, mid, right);
      else return loop(arr, x, left, mid);
    }
  }

  static class InputReader implements AutoCloseable {
    public BufferedReader reader;
    public StringTokenizer tokenizer;

    public InputReader(InputStream stream) {
        reader = new BufferedReader(new InputStreamReader(stream), 32768);
        tokenizer = null;
    }

    public String next() {
        while (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                tokenizer = new StringTokenizer(reader.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return tokenizer.nextToken();
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public long nextLong() {
        return Long.parseLong(next());
    }

    @Override
    public void close() throws IOException {
      reader.close();
    }
  }
}