/**
 * Created at 04:40 on 2019-08-30
 */

import java.io.*;
import java.util.*;

public class Main {

  static FastScanner sc = new FastScanner();
  static Output out = new Output(System.out);

  static final int[] dx = {0, 1, 0, -1};
  static final int[] dy = {-1, 0, 1, 0};

  static final long MOD = (long) (1e9 + 7);
  static final long INF = Long.MAX_VALUE / 2;

  static final int e5 = (int) 1e5;

  public static class Solver {
    public Solver() {

      int N = sc.nextInt();
      int K = sc.nextInt();

      ArrayList<Long> xs = new ArrayList<Long>();
      ArrayList<Long> ys = new ArrayList<Long>();
      Point[] ps = new Point[N];

      for (int i=0; i<N; i++) {
        ps[i] = new Point(sc.nextInt(), sc.nextInt());
        xs.add(ps[i].x);
        ys.add(ps[i].y);
      }

      xs = new ArrayList(new HashSet(xs));
      ys = new ArrayList(new HashSet(ys));
      Collections.sort(xs);
      Collections.sort(ys);

      Arrays.sort(ps);

      long[][] cumsum = new long[ys.size()+1][xs.size()+1];

      for (int i=1; i<=ys.size(); i++) {
        for (int j=1; j<=xs.size(); j++) {
          cumsum[i][j] += cumsum[i-1][j] + cumsum[i][j-1] - cumsum[i-1][j-1];
          if (Arrays.binarySearch(ps, new Point(xs.get(j-1), ys.get(i-1))) >= 0) {
            cumsum[i][j]++;
          }
        }
      }

      long ans = INF;
        for (int y1=0; y1<ys.size(); y1++) {
          for (int x1=0; x1<xs.size(); x1++) {
            for (int y2=y1+1; y2<ys.size(); y2++) {
              for (int x2=x1+1; x2<xs.size(); x2++) {
              if (cumsum[y2+1][x2+1] - cumsum[y1][x2+1] - cumsum[y2+1][x1] + cumsum[y1][x1] >= K) {
                ans = Math.min(ans, (ys.get(y2) - ys.get(y1)) * (xs.get(x2) - xs.get(x1)));
              }
            }
          }
        }
      }

      out.println(ans);

    }

    public class Point implements Comparable<Point> {

      long x, y;
      Point (long X, long Y) {
        x = X;
        y = Y;
      }

      @Override
      public int compareTo(Point p) {
        if (x == p.x && y == p.y) return 0;
        else if (x == p.x) return y - p.y > 0 ? 1 : -1;
        else return x - p.x > 0 ? 1 : -1;
      }
    }

  }

  public static void main(String[] args) {
    new Solver();
    out.flush();
  }

  static class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;

    private boolean hasNextByte() {
      if (ptr < buflen) {
        return true;
      } else {
        ptr = 0;
        try {
          buflen = in.read(buffer);
        } catch (IOException e) {
          e.printStackTrace();
        }
        if (buflen <= 0) {
          return false;
        }
      }
      return true;
    }

    private int readByte() {
      if (hasNextByte()) return buffer[ptr++];
      else return -1;
    }

    private static boolean isPrintableChar(int c) {
      return 33 <= c && c <= 126;
    }

    private void skipUnprintable() {
      while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
    }

    public boolean hasNext() {
      skipUnprintable();
      return hasNextByte();
    }

    public String next() {
      if (!hasNext()) throw new NoSuchElementException();
      StringBuilder sb = new StringBuilder();
      int b = readByte();
      while (isPrintableChar(b)) {
        sb.appendCodePoint(b);
        b = readByte();
      }
      return sb.toString();
    }

    public long nextLong() {
      if (!hasNext()) throw new NoSuchElementException();
      long n = 0;
      boolean minus = false;
      int b = readByte();
      if (b == '-') {
        minus = true;
        b = readByte();
      }
      if (b < '0' || '9' < b) {
        throw new NumberFormatException();
      }
      while (true) {
        if ('0' <= b && b <= '9') {
          n *= 10;
          n += b - '0';
        } else if (b == -1 || !isPrintableChar(b)) {
          return minus ? -n : n;
        } else {
          throw new NumberFormatException();
        }
        b = readByte();
      }
    }

    public int nextInt() {
      return (int) nextLong();
    }

    public int[] nextIntArray(int N, boolean oneBased) {
      if (oneBased) {
        int[] array = new int[N + 1];
        for (int i = 1; i <= N; i++) {
          array[i] = sc.nextInt();
        }
        return array;
      } else {
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
          array[i] = sc.nextInt();
        }
        return array;
      }
    }

    public long[] nextLongArray(int N, boolean oneBased) {
      if (oneBased) {
        long[] array = new long[N + 1];
        for (int i = 1; i <= N; i++) {
          array[i] = sc.nextLong();
        }
        return array;
      } else {
        long[] array = new long[N];
        for (int i = 0; i < N; i++) {
          array[i] = sc.nextLong();
        }
        return array;
      }
    }
  }

  static class Output extends PrintWriter {

    public Output(PrintStream ps) {
      super(ps);
    }

    public void print(int[] a, String separator) {
      for (int i = 0; i < a.length; i++) {
        if (i == 0) print(a[i]);
        else print(separator + a[i]);
      }
      println();
    }

    public void print(long[] a, String separator) {
      for (int i = 0; i < a.length; i++) {
        if (i == 0) print(a[i]);
        else print(separator + a[i]);
      }
      println();
    }

    public void print(String[] a, String separator) {
      for (int i = 0; i < a.length; i++) {
        if (i == 0) print(a[i]);
        else print(separator + a[i]);
      }
      println();
    }

    public void print(ArrayList a, String separator) {
      for (int i = 0; i < a.size(); i++) {
        if (i == 0) print(a.get(i));
        else print(separator + a.get(i));
      }
      println();
    }
  }

}
