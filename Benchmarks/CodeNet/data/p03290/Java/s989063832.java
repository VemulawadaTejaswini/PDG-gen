/**
 * Created at 18:10 on 2019-06-28
 */

import java.io.*;
import java.util.*;

public class Main {

  static FastScanner sc = new FastScanner();

  static int[] dx = {0, 1, 0, -1};
  static int[] dy = {-1, 0, 1, 0};

  static long MOD = (long) (1e9 + 7);

  public static void main(String[] args) {

    new Main().run();

  }

  public void run() {

    int D = sc.nextInt();
    int G = sc.nextInt();

    int[] p = new int[D];
    int[] c = new int[D];

    for (int i=0; i<D; i++) {
      p[i] = sc.nextInt();
      c[i] = sc.nextInt();
    }

    Pair[] complete = new Pair[D];
    for (int i=0; i<D; i++) {
      int score = (i+1) * 100 * p[i] + c[i];
      complete[i] = new Pair(i, score, score/(double)p[i]);
    }

    Arrays.sort(complete, (o1, o2) -> (o2.rate - o1.rate > 0 ? 1 : -1));

    int high = (int)Mathf.sum(p);
    int low = 0;
    int mid = (high + low) / 2;

    boolean[] solved;
    while(high - low > 1) {
      solved = new boolean[D];
      int remaining = mid;
      int score = 0;
      int maxUnsolvedIndex = D-1;
      for (int i=0; i<D; i++) {
        int n = complete[i].number;
        while (complete[i].rate < (maxUnsolvedIndex+1)*100) {
          int j = maxUnsolvedIndex;
          if (solved[j]) {
            maxUnsolvedIndex--;
            continue;
          }
          if (remaining >= p[j]) {
            score += (j+1) * 100 * p[j];
            remaining -= p[j];
            solved[j] = true;
            maxUnsolvedIndex--;
          } else {
            score += (j+1) * 100 * remaining;
            remaining = 0;
            break;
          }
        }
        if (p[n] <= remaining) {
          remaining -= p[n];
          solved[n] = true;
          score += complete[i].score;
        }
      }
      for (int i=D-1; i>=0 && remaining > 0; i--) {
        if (solved[i]) continue;
        if (remaining >= p[i]) {
          score += (i+1) * 100 * p[i];
          remaining -= p[i];
        } else {
          score += (i+1) * 100 * remaining;
          remaining = 0;
        }
      }
      if (score >= G) {
        high = mid;
      } else {
        low = mid;
      }
      mid = (high + low) / 2;
    }

    System.out.println(high);

  }

  public class Pair {
    int number, score;
    double rate;
    public Pair(int n, int s, double r) {
      number = n;
      score = s;
      rate = r;
    }
  }

  public static class Mathf {

    public static long sum(int[] a) {
      long sum = 0;
      for (int i=0; i<a.length; i++) {
        sum += a[i];
      }
      return sum;
    }

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
