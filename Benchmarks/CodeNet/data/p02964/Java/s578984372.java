/**
 * Created at 23:59 on 2019-07-21
 */

import java.io.*;
import java.util.*;

public class Main {

  static FastScanner sc = new FastScanner();
  static PrintStream out = System.out;
  static PrintWriter pw = new PrintWriter(out);

  static final int[] dx = {0, 1, 0, -1};
  static final int[] dy = {-1, 0, 1, 0};

  static final long MOD = (long) (1e9 + 7);
  static final long INF = Long.MAX_VALUE / 2;

  public static class Solver {
    public Solver() {

      int N = sc.nextInt();
      long K = sc.nextLong();

      int[] A = sc.nextIntArray(N, false);

      int M = 200001;

      //数iがj番目に現れる位置 appear[i].get(j)
      ArrayList<Integer>[] appear = new ArrayList[M];

      for (int i=0; i<M; i++) {
        appear[i] = new ArrayList<Integer>();
      }

      for (int i=0; i<N; i++) {
        appear[A[i]].add(i);
      }

      //数列Aのi(0-based)番目以降の要素のみでK=1として操作を行ったとき得られる数列の初めの要素(なければ-1)
      int[] firstNumber = new int[N+1];
      firstNumber[N] = -1;
      firstNumber[N-1] = A[N-1]; //要素一つなら操作後もそれ一つが残る

      //key:消されない次の要素を示す
      //value:その要素A[i]が残るかどうか(消えるならfalse)
      Pair<Integer, Boolean>[] nextIndex = new Pair[N+1];
      nextIndex[N] = new Pair(-1, false);
      nextIndex[N-1] = new Pair(N, true);

      //後ろから見て行ったとき、数iが最後に現れた位置(まだ現れていなければ-1)
      int[] lastAppear = new int[M];
      Arrays.fill(lastAppear, -1);
      lastAppear[A[N-1]] = N-1;

      for (int i=N-2; i>=0; i--) {
        if (lastAppear[A[i]] == -1) {
          //それ以降に同じ数字がなければこの数字が消えずに残る
          firstNumber[i] = A[i];
          nextIndex[i] = new Pair(i+1, true);
        } else {
          //同じ数字があればそこまでは消されるのでそれ以降で最初の数字
          firstNumber[i] = firstNumber[lastAppear[A[i]]+1];
          nextIndex[i] = new Pair(lastAppear[A[i]]+1, false);
        }
        lastAppear[A[i]] = i;
      }

      //ここからシミュレーション

      int[] startIndex = new int[N+1];

      int index=0;
      int count = 0;
      while(true) {
        if (firstNumber[index] == -1) {
          count++;
          break;
        } else {
          startIndex[count] = index;
          index = appear[firstNumber[index]].get(0)+1;
          count++;
        }
      }

      //これ以降の要素でK=1として操作した時の数列が答え
      int ansStartIndex = startIndex[(int)((K-1) % count)];

      int now = ansStartIndex;
      Pair<Integer, Boolean> next = new Pair(ansStartIndex, false);
      ArrayList<Integer> ansList = new ArrayList<Integer>();
      while(now != N) {
        if (next.getValue()) {
          ansList.add(A[now]);
        }
        now = next.getKey();
        next = nextIndex[next.getKey()];
      }

      if (ansList.size() >= 1) out.print(ansList.get(0));
      for (int i=1; i<ansList.size(); i++) {
        out.print(" " + ansList.get(i));
      }
      out.println();

    }

    public class Pair<K, V> extends AbstractMap.SimpleEntry<K, V> {
      /** serialVersionUID. */
      private static final long serialVersionUID = 6411527075103472113L;

      public Pair(final K key, final V value) {
        super(key, value);
      }
    }
  }

  public static void main(String[] args) {
    new Solver();
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
