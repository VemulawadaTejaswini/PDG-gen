import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.TreeMap;
import java.util.TreeSet;

/*
                   _ooOoo_
                  o8888888o
                  88" . "88
                  (| -_- |)
                  O\  =  /O
               ____/`---'\____
             .'  \\|     |//  `.
            /  \\|||  :  |||//  \
           /  _||||| -:- |||||-  \
           |   | \\\  -  /// |   |
           | \_|  ''\---/''  |   |
           \  .-\__  `-`  ___/-. /
         ___`. .'  /--.--\  `. . __
      ."" '<  `.___\_<|>_/___.'  >'"".
     | | :  `- \`.;`\ _ /`;.`/ - ` : | |
     \  \ `-.   \_ __\ /__ _/   .-` /  /
======`-.____`-.___\_____/___.-`____.-'======
                   `=---='
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
            pass System Test!
*/

public class Main {
  private static class Task {
    int[][] bit = new int[3][3];
    int[][] board = new int[][]{
      {
        1, 1, 1, 0, 0,
        1, 1, 1, 0, 0,
        1, 1, 1, 0, 0,
        0, 0, 0, 0, 0,
        0, 0, 0, 0, 0},
      {
        0, 0, 0, 0, 0,
        1, 1, 1, 0, 0,
        1, 1, 1, 0, 0,
        1, 1, 1, 0, 0,
        0, 0, 0, 0, 0,
      },
      {
        0, 0, 0, 0, 0,
        0, 0, 0, 0, 0,
        1, 1, 1, 0, 0,
        1, 1, 1, 0, 0,
        1, 1, 1, 0, 0,
      },
      {
        0, 1, 1, 1, 0,
        0, 1, 1, 1, 0,
        0, 1, 1, 1, 0,
        0, 0, 0, 0, 0,
        0, 0, 0, 0, 0,
      },
      {
        0, 0, 0, 0, 0,
        0, 1, 1, 1, 0,
        0, 1, 1, 1, 0,
        0, 1, 1, 1, 0,
        0, 0, 0, 0, 0,
      },
      {
        0, 0, 0, 0, 0,
        0, 0, 0, 0, 0,
        0, 1, 1, 1, 0,
        0, 1, 1, 1, 0,
        0, 1, 1, 1, 0,
      },
      {
        0, 0, 1, 1, 1,
        0, 0, 1, 1, 1,
        0, 0, 1, 1, 1,
        0, 0, 0, 0, 0,
        0, 0, 0, 0, 0,
      },
      {
        0, 0, 0, 0, 0,
        0, 0, 1, 1, 1,
        0, 0, 1, 1, 1,
        0, 0, 1, 1, 1,
        0, 0, 0, 0, 0,
      },
      {
        0, 0, 0, 0, 0,
        0, 0, 0, 0, 0,
        0, 0, 1, 1, 1,
        0, 0, 1, 1, 1,
        0, 0, 1, 1, 1,
      },
    };

    void init() {
      for (int i = 0; i < board.length; i++) {
        int c = 0;
        for (int j = 0; j < board[i].length; j++) {
          c |= (board[i][j] << j);
        }
        int a = i % 3;
        int b = i / 3;
        bit[a][b] = c;
      }
    }

    void solve(FastScanner in, PrintWriter out) {
      init();

      long H = in.nextInt();
      long W = in.nextInt();
      int N = in.nextInt();
      if (H < 3 || W < 3) {
        for (int i = 0; i < 10; i++) out.println(0);
        return;
      }

      long[] ans = new long[10];

      TreeMap<Integer, TreeSet<Integer>> black = new TreeMap<>();
      TreeMap<Integer, TreeSet<Integer>> used = new TreeMap<>();

      ArrayList<int[]> blackList = new ArrayList<>();
      for (int i = 0; i < N; i++) {
        int a = in.nextInt(), b = in.nextInt();
        blackList.add(new int[]{a, b});
        TreeSet<Integer> set = black.get(a);
        if (set == null) black.put(a, set = new TreeSet<>());
        set.add(b);
      }

      for (int[] ab : blackList) {
        int a = ab[0];
        int b = ab[1];
        int mask = 0;
        for (int i = 0; i < 5; i++) {
          if (!black.containsKey(a + i - 2)) continue;
          TreeSet<Integer> set = black.get(a + i - 2);
          for (int j = 0; j < 5; j++) {
            if (!set.contains(b + j - 2)) continue;
            mask |= (1 << (5 * i + j));
          }
        }

        for (int i = 0; i < 3; i++) {
          for (int j = 0; j < 3; j++) {
            int ta = a + i;
            int tb = b + j;
            if (ta < 3 || tb < 3) continue;
            if (ta > H || tb > W) continue;
            if (used.containsKey(ta) && used.get(ta).contains(tb)) continue;
            int n = Integer.bitCount(mask & bit[i][j]);
            if (n > 0) ans[n]++;
            TreeSet<Integer> set = used.get(ta);
            if (set == null) used.put(ta, set = new TreeSet<Integer>());
            set.add(tb);
          }
        }
      }

      long all = (H - 2) * (W - 2);
      for (long a : ans) {
        all -= a;
      }
      ans[0] = all;
      for (int i = 0; i < 10; i++) {
        out.println(ans[i]);
      }
    }
  }

  /**
   * ここから下はテンプレートです。
   */
  public static void main(String[] args) {
    OutputStream outputStream = System.out;
    FastScanner in = new FastScanner();
    PrintWriter out = new PrintWriter(outputStream);
    Task solver = new Task();
    solver.solve(in, out);
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
      if (hasNextByte()) return buffer[ptr++];
      else return -1;
    }

    private static boolean isPrintableChar(int c) {
      return 33 <= c && c <= 126;
    }

    private void skipUnprintable() {
      while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
    }

    boolean hasNext() {
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

    long nextLong() {
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
      for (int i = 0; i < n; i++) array[i] = nextInt();
      return array;
    }

    public long[] nextLongArray(int n) {
      long[] array = new long[n];
      for (int i = 0; i < n; i++) array[i] = nextLong();
      return array;
    }

    public String[] nextStringArray(int n) {
      String[] array = new String[n];
      for (int i = 0; i < n; i++) array[i] = next();
      return array;
    }

    public char[][] nextCharMap(int n) {
      char[][] array = new char[n][];
      for (int i = 0; i < n; i++) array[i] = next().toCharArray();
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