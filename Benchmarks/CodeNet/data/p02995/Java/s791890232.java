/**
 * Created at 00:43 on 2019-06-27
 */

import java.io.*;
import java.util.*;

public class Main implements Runnable {

  static FastScanner sc = new FastScanner();

  static int[] dx = {0, 1, 0, -1};
  static int[] dy = {-1, 0, 1, 0};

  static long MOD = (long) (1e9 + 7);

  public static void main(String[] args) {
    
    new Main().run();

  }

  public void run() {

    long A = sc.nextLong();
    long B = sc.nextLong();
    long C = sc.nextLong();
    long D = sc.nextLong();

    long ans = B - A + 1;
    ans -= count_nq_r(A, B, C, 0);
    ans -= count_nq_r(A, B, D, 0);
    ans += count_nq_r(A, B, lcm(C, D), 0);

    System.out.println(ans);

  }

  /*
   * 区間[a, b]の中でqで割ってr余るものの個数
   * r = 0 なら区間[a, b]の中でqの倍数であるものの個数
   * a <= b, 0 <= r < q
   */
  public long count_nq_r(long a, long b, long q, long r) {
    r %= q;
    return (floor(b-r,q)+1) - (floor(a-1-r, q)+1);
  }

  /*
   * n <= a/b なる最大の整数nを返す
   */
  public long floor(long a, long b) {
    if (b < 0) {
      a *= -1;
      b *= -1;
    }

    if (a > 0) {
      //絶対値の小さい方に丸められる(正なら負の方向)
      return a/b;
    } else {
      //よくある切り上げのテクニックの切り捨て版
      return (a-b+1)/b;
    }
  }

  /*
   * n >= a/b なる最小の整数nを返す
   */
  public long ceil(long a, long b) {
    if (b < 0) {
      a *= -1;
      b *= -1;
    }

    if (a > 0) {
      //よくある切り上げのテクニック
      return (a+b-1)/b;
    } else {
      //絶対値の小さい方に丸められる(負なら正の方向)
      return a/b;
    }
  }

  public long lcm(long a, long b) {
    return a * b / gcd(a, b);
  }

  public long gcd(long a, long b) {
    long M = Math.max(a, b);
    long m = Math.min(a, b);

    if (m == 0) {
      return M;
    }

    return gcd(m, M%m);
  }

  public static class Mathf {

    public static int max(int[] a) {
      int M = a[0];
      for (int i = 1; i < a.length; i++) {
        M = Math.max(M, a[i]);
      }
      return M;
    }

    public static int min(int[] a) {
      int m = a[0];
      for (int i = 1; i < a.length; i++) {
        m = Math.min(m, a[i]);
      }
      return m;
    }

    public static long max(long[] a) {
      long M = a[0];
      for (int i = 1; i < a.length; i++) {
        M = Math.max(M, a[i]);
      }
      return M;
    }

    public static long min(long[] a) {
      long m = a[0];
      for (int i = 1; i < a.length; i++) {
        m = Math.min(m, a[i]);
      }
      return m;
    }

  }

  /*
    add()でインデックスを指定しない場合指定されたソート順に違わない位置に追加する
    (ただしソートされていることが前提となる)
    Comparatorが0を返したとき、それらの順序は保証しない
    (TreeSet, TreeMapと違い削除はしない)
   */
  static class TreeList<E> extends ArrayList<E> {

    Comparator<? super E> comparator;

    TreeList(Comparator<? super E> c) {
      super();
      comparator = c;
    }

    /*
      ソート済みのリストに要素を追加する
     */
    public boolean add(E e) {
      int lowIndex = 0;
      int highIndex = size() - 1;
      int index = 0;

      if (size() == 0) {
        super.add(e);
        return true;
      }

      if (comparator.compare(e, get(0)) < 0) {
        index = 0;
      } else if (comparator.compare(e, get(highIndex)) > 0) {
        index = highIndex + 1;
      } else {
        while (lowIndex <= highIndex) {

          if (highIndex == lowIndex + 1 || highIndex == lowIndex) {
            index = highIndex;
            break;
          }

          int midIndex = (lowIndex + highIndex) / 2;
          ;

          if (comparator.compare(e, get(midIndex)) > 0) {
            lowIndex = midIndex;
          } else {
            highIndex = midIndex;
          }

        }
      }

      super.add(index, e);
      return true;
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

}
