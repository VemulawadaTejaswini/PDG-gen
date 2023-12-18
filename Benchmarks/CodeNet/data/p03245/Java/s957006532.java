/**
 * Created at 7:17 on 2019/03/07
 */

import java.io.*;
import java.util.*;

public class Main
{

  static FastScanner sc = new FastScanner();

  public static void main(String[] args) {

    int N = sc.nextInt();
    Point[] p = new Point[N];
    for (int i=0; i<N; i++) {
      p[i] = new Point(sc.nextLong(), sc.nextLong());
    }

    /*
    Arrays.sort(p, new Comparator<Point>() {
      @Override
      public int compare(Point o1, Point o2) {
        return (Math.abs(o2.x) + Math.abs(o2.y)) - (Math.abs(o1.x) + Math.abs(o1.y)) > 0 ? 1 : -1;
      }
    });
    */

    //M = m + 1
    if (p[0].d<=20) {
      //偶奇性チェック
      int parity = (int)(p[0].d % 2);
      for (int i=1; i<N; i++) {
        if (p[i].d % 2 != parity) {
          System.out.println(-1);
          return;
        }
      }

      long len = 0;
      for (int i=0; i<N; i++) {
        len = Math.max(len, p[i].d);
      }

      System.out.println(len);
      StringBuilder d = new StringBuilder();
      d.append("1");
      for (int i=1; i<len; i++) {
        d.append(" 1");
      }
      System.out.println(d);

      for (int i=0; i<N; i++) {
        StringBuilder s = new StringBuilder();
        long x = p[i].x;
        long y = p[i].y;
        while (x < 0) {
          s.append("L");
          x++;
        }
        while (x > 0) {
          s.append("R");
          x--;
        }
        while (y < 0) {
          s.append("D");
          y++;
        }
        while (y > 0) {
          s.append("U");
          y--;
        }
        while (len - s.length() > 0) {
          s.append("RL");
        }
        System.out.println(s);
      }
      return;
    }
    /*
    ArrayList<Long> d = new ArrayList();
    d.add(Math.abs(p[0].x));
    d.add(Math.abs(p[0].y));
    for (int i=0; i<p.length; i++) {

    }
    */

    System.out.println(-1);

  }

  static class Point {
    long x, y, d;
    Point(long x, long y) {
      this.x = x;
      this.y = y;
      this.d = Math.abs(x) + Math.abs(y);
    }
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
  }

}
