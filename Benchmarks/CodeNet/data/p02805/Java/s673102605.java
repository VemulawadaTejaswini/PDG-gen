/**
 * Created at 21:38 on 2020-01-12
 */

import java.awt.*;
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

    public double dist2(double a, double b, double c, double d) {
      return (a-c) * (a-c) + (b-d) * (b-d);
    }

    public boolean canEnclose(int N, Point[] ps, double cx, double cy, double r2, int p1, int p2, int p3) {
      for (int i=0; i<N; i++) {
        if (i == p1 || i == p2 || i == p3) continue;
        if (r2 < dist2(cx, cy, ps[i].x, ps[i].y) - 1e-6) return false;
      }
      return true;
    }

    public Solver() {

      int N = sc.nextInt();

      Point[] ps = new Point[N];

      for (int i=0; i<N; i++) {
        ps[i] = new Point(sc.nextInt(), sc.nextInt());
      }

      double ans = 1e9;

      for (int i=0; i<N; i++) {
        for (int j=i+1; j<N; j++) {

          double cx = (ps[i].x + ps[j].x) / 2.0;
          double cy = (ps[i].y + ps[j].y) / 2.0;
          double r2 = dist2(cx, cy, ps[i].x, ps[i].y);

          if (Math.sqrt(r2) < ans && canEnclose(N, ps, cx, cy, r2, i, j, -1)) {
            ans = Math.sqrt(r2);
          }

        }
      }

      for (int i=0; i<N; i++) {
        for (int j=0; j<N; j++) {
          for (int k=0; k<N; k++) {

            if (i == j || j == k || k == i) continue;

            double a = ps[i].x;
            double b = ps[i].y;
            double c = ps[j].x;
            double d = ps[j].y;
            double e = ps[k].x;
            double f = ps[k].y;

            if (d-b == 0 || f-b == 0) continue;

            double A = (a-c) / (d-b);
            double B = - A * (a + c) / 2 + (b + d) / 2;
            double C = (a-e) / (f-b);
            double D = - C * (a + e) / 2 + (b + f) / 2;

            if (C - A == D - B) {
              continue;
            }

            double cx = (D - B) / (C - A);
            double cy = A * cx + B;

            double r2 = dist2(cx, cy, a, b);

            if (Math.sqrt(r2) < ans && canEnclose(N, ps, cx, cy, r2, i, j, k)) {
              ans = Math.sqrt(r2);
            }

          }
        }
      }

      out.println(ans);

    }
  }

  public static void main(String[] args) {
    new Solver();
    out.flush();
  }

  static class FastScanner {
    private InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;


    public void load() {
      try {
        in = new FileInputStream(next());
      } catch (Exception e) {
        e.printStackTrace();
      }
    }

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

    private long startTime;

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

    public void start() {
      startTime = System.currentTimeMillis();
    }

    public void time(String s) {
      long time = System.currentTimeMillis() - startTime;
      println(s + "(" + time + ")");
    }

  }

}
