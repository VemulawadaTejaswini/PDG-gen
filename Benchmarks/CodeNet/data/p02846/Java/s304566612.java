/**
 * Created at 21:40 on 2019-12-01
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

      long T1 = sc.nextLong();
      long T2 = sc.nextLong();
      long A1 = sc.nextLong();
      long A2 = sc.nextLong();
      long B1 = sc.nextLong();
      long B2 = sc.nextLong();

      long averageDif = A1*T1+A2*T2 - (B1*T1+B2*T2);

      if (averageDif == 0) {
        out.println("infinity");
        return;
      } else if (averageDif < 0) {
        long temp = A1;
        A1 = B1;
        B1 = temp;
        temp = A2;
        A2 = B2;
        B2 = temp;
      }

      //Aの方がBより速い

      long d1 = (A1-B1) * T1;
      long d2 = (A2-B2) * T2;
      long d = d1 + d2; //d > 0

      if ((d1 > 0 && d2 > 0) || (d1 < 0 && d2 < 0)) {
        out.println(0);
      } else if (d1 > 0) {
        long ans = (-d2-d1+d-1)/d*2;
        //if (ans/2 * d + d1 + d2 <= 0) ans++;
        out.println(ans);
      } else {
        long ans = (-d1+d-1)/d*2-1;
        if ((ans+1)/2 * d + d1 <= 0) ans++;
        out.println(ans);
      }

      /*
      long xA = 0, xB = 0;
      long dif = 0;
      for (int i=0; i<60; i++) {
        xA += A1 * T1;
        xB += B1 * T1;
        dif += (A1 - B1) * T1;
        out.println(dif);
        //out.println(xA + ", " + xB + ", " + (xA > xB));
        xA += A2 * T2;
        xB += B2 * T2;
        dif += A2 * T2 - B2 * T2;
        out.println(dif);
        //out.println(xA + ", " + xB + ", " + (xA > xB));
      }
      */

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
