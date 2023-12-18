import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.TreeSet;


public class Main {

  private int N;
  private int[] array;

  private boolean checkNaive(int[] hats) {
    for (int i = 0; i < N; i++) {
      TreeSet<Integer> set = new TreeSet<>();
      for (int j = 0; j < N; j++) {
        if (i == j) {
          continue;
        }
        set.add(hats[j]);
      }
      if (set.size() != array[i]) {
        return false;
      }
    }
    return true;
  }

  private boolean dfsNaive(int pos, int[] hats) {
    if (pos == N) {
      return checkNaive(hats);
    }
    for (int i = 0; i < N; i++) {
      hats[pos] = i;
      if (dfsNaive(pos + 1, hats)) {
        return true;
      }
    }
    return false;
  }

  private boolean solve() {
    Arrays.sort(array);
    int max = array[N - 1];
    if (max == N - 1) {
      boolean all = true;
      for (int a : array) {
        if (a != N - 1) {
          all = false;
          break;
        }
      }
      if (all) {
        return true;
      }
    }

    // max のやつが 1 人グループであることはありえない
    int maxCount = 0;
    for (int a : array) {
      if (a == max) {
        maxCount++;
      } else if (a != max - 1) {
        return false;
      }
    }
    int solo = N - maxCount;

    int split = max - 1 - (solo - 1);
    if (split > 0) {
      int minimumMembers = maxCount / split;
      if (minimumMembers <= 1) {
        return false;
      }
    }

    return maxCount >= 2 && solo + 1 <= max;
  }

  private void test() {

    Random random = new Random();
    N = 6;
    for (int i = 0; i < 100000; i++) {
      array = new int[N];
      for (int j = 0; j < N; j++) {
        array[j] = random.nextInt(N - 1) + 1;
      }
      if (solve() != dfsNaive(0, new int[N])) {
        System.out.println(Arrays.toString(array));
        return;
      }
      if (i % 100 == 0) {
        System.out.println(i);
      }
    }
  }

  private void solve(FastScanner in, PrintWriter out) {
//    test();
    N = in.nextInt();
    array = in.nextIntArray(N);

    if (solve()) {
      out.println("Yes");
    } else {
      out.println("No");
    }

  }

  public static void main(String[] args) {
    PrintWriter out = new PrintWriter(System.out);
    new Main().solve(new FastScanner(), out);
    out.close();
  }

  private static class FastScanner {

    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int bufferLength = 0;

    private boolean hasNextByte() {
      if (ptr < bufferLength) {
        return true;
      } else {
        ptr = 0;
        try {
          bufferLength = in.read(buffer);
        } catch (IOException e) {
          e.printStackTrace();
        }
        if (bufferLength <= 0) {
          return false;
        }
      }
      return true;
    }

    private int readByte() {
      if (hasNextByte()) {
        return buffer[ptr++];
      } else {
        return -1;
      }
    }

    private static boolean isPrintableChar(int c) {
      return 33 <= c && c <= 126;
    }

    private void skipUnprintable() {
      while (hasNextByte() && !isPrintableChar(buffer[ptr])) {
        ptr++;
      }
    }

    boolean hasNext() {
      skipUnprintable();
      return hasNextByte();
    }

    public String next() {
      if (!hasNext()) {
        throw new NoSuchElementException();
      }
      StringBuilder sb = new StringBuilder();
      int b = readByte();
      while (isPrintableChar(b)) {
        sb.appendCodePoint(b);
        b = readByte();
      }
      return sb.toString();
    }

    long nextLong() {
      if (!hasNext()) {
        throw new NoSuchElementException();
      }
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

    double nextDouble() {
      return Double.parseDouble(next());
    }

    double[] nextDoubleArray(int n) {
      double[] array = new double[n];
      for (int i = 0; i < n; i++) {
        array[i] = nextDouble();
      }
      return array;
    }

    double[][] nextDoubleMap(int n, int m) {
      double[][] map = new double[n][];
      for (int i = 0; i < n; i++) {
        map[i] = nextDoubleArray(m);
      }
      return map;
    }

    public int nextInt() {
      return (int) nextLong();
    }

    public int[] nextIntArray(int n) {
      int[] array = new int[n];
      for (int i = 0; i < n; i++) {
        array[i] = nextInt();
      }
      return array;
    }

    public long[] nextLongArray(int n) {
      long[] array = new long[n];
      for (int i = 0; i < n; i++) {
        array[i] = nextLong();
      }
      return array;
    }

    public String[] nextStringArray(int n) {
      String[] array = new String[n];
      for (int i = 0; i < n; i++) {
        array[i] = next();
      }
      return array;
    }

    public char[][] nextCharMap(int n) {
      char[][] array = new char[n][];
      for (int i = 0; i < n; i++) {
        array[i] = next().toCharArray();
      }
      return array;
    }

    public int[][] nextIntMap(int n, int m) {
      int[][] map = new int[n][];
      for (int i = 0; i < n; i++) {
        map[i] = nextIntArray(m);
      }
      return map;
    }
  }
}
