/**
 * Created at 20:48 on 2019-05-04
 */

import java.awt.*;
import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
import java.math.BigInteger;

public class Main {

  static FastScanner sc = new FastScanner();

  static int[][] board;
  static int W,H;

  public static void main(String[] args) {

    H = sc.nextInt();
    W = sc.nextInt();

    board = new int[H][W];

    ArrayList<Point> blackList = new ArrayList<Point>();

    for (int i=0; i<H; i++) {
      String line = sc.next();
      for (int j=0; j<W; j++) {
        board[i][j] = (line.charAt(j) == '#' ? 0 : 65536);
        if (board[i][j] == 0) blackList.add(new Point(j, i));
      }
    }

    int i = 1;
    while(true) {
      boolean updated = false;
      for (Point p : blackList) {
        updated = fill(p.x, p.y, i) | updated;
      }
      if (!updated) break;
      i++;
    }

    i--;

    System.out.println(i);

  }

  static boolean fill(int x, int y, int i) {
    boolean updated = false;
    for (int j=0; j<=i; j++) {
      updated = set(x + j, y + i - j, i) | updated;
      updated = set(x + j, y - i + j, i) | updated;
      updated = set(x - j, y + i - j, i) | updated;
      updated = set(x - j, y - i + j, i) | updated;
    }
    return updated;
  }

  static boolean set(int x, int y, int dist) {
    try {
      if (dist < board[y][x]) {
        board[y][x] = dist;
        return true;
      }
      return false;
    } catch (ArrayIndexOutOfBoundsException e) {
      return false;
    }
  }

  static int search(int x, int y) {
    int size = 2*Math.max(H, W);
    for (int i=0; i<size; i++) {
      for (int j=0; j<=i; j++) {
        try {
          if (board[y + i - j][x + j] == 0) return i;
        } catch (ArrayIndexOutOfBoundsException e) {}
        try {
          if (board[y - i + j][x - j] == 0) return i;
        } catch (ArrayIndexOutOfBoundsException e) {}
        try {
          if (board[y + i - j][x - j] == 0) return i;
        } catch (ArrayIndexOutOfBoundsException e) {}
        try {
          if (board[y - i + j][x + j] == 0) return i;
        } catch (ArrayIndexOutOfBoundsException e) {}
      }
    }
    return 65536;
  }

  static class Debugger {

    static long startTime;
    static boolean on = true;

    //入力受け取り後に呼び出す(入力時間をカウントしないため)
    static void start() {
      startTime = System.currentTimeMillis();
    }

    static void printTime() {
      if (on) System.out.println("(" + (System.currentTimeMillis() - startTime) + "ms)");
    }

    static void toggle() {
      on = !on;
    }

  }

  static class BigInt extends BigInteger {

    BigInteger MOD = new BigInteger("1000000007");
    static BigInt ZERO = new BigInt(0);
    static BigInt ONE = new BigInt(1);
    static BigInt TEN = new BigInt(10);

    public BigInt(long l) {
      super(Long.toString(l));
    }

    public BigInt(BigInteger i) {
      super(i.toByteArray());
    }

    public BigInt pow(int i) {
      return new BigInt(super.pow(i));
    }

    public BigInt[] divideAndRemainder(long l) {
      return divideAndRemainder(new BigInt(l));
    }

    public BigInt[] divideAndRemainder(BigInt i) {
      BigInt[] ret = new BigInt[2];
      BigInteger[] dAndR = super.divideAndRemainder(i);
      ret[0] = new BigInt(dAndR[0]);
      ret[1] = new BigInt(dAndR[1]);
      return ret;
    }

    public BigInt mod(long l) {
      return mod(new BigInt(l));
    }

    public BigInt mod(BigInt i) {
      return new BigInt(super.mod(i));
    }

    public BigInt mod() {
      return new BigInt(super.mod(MOD));
    }

    public BigInt add(long l) {
      return add(new BigInt(l));
    }

    public BigInt add(BigInt i) {
      return new BigInt(super.add(i));
    }

    public BigInt subtract(long l) {
      return subtract(new BigInt(l));
    }

    public BigInt subtract(BigInt i) {
      return new BigInt(super.subtract(i));
    }

    public BigInt multiply(long l) {
      return multiply(new BigInt(l));
    }

    public BigInt multiply(BigInt i) {
      return new BigInt(super.multiply(i));
    }

    public BigInt divide(long l) {
      return divide(new BigInt(l));
    }

    public BigInt divide(BigInt i) {
      return new BigInt(super.divide(i));
    }

    public BigInt abs() {
      return new BigInt(super.abs());
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
  }

}
