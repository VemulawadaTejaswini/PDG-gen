import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class Main {


  public static void main(String[] args) {
    InputReader in = new InputReader(System.in);

    int n = in.nextInt();
    long k = in.nextLong();

    int[] a = new int[n+1];
    for (int i = 1; i <= n; i++) {
      a[i] = in.nextInt();
    }
    boolean[] visited = new boolean[n+1];
    ArrayList<Integer> path = new ArrayList<>();
    path.add(1);
    boolean ok = true;
    int current = 1;   // where repeatation will start
    visited[1] = true;
    while (ok) {
      current = a[current];
      if (!visited[current]) {
        visited[current] = true;
        path.add(current);
      } else {
        ok = false;
      }
    }
    int id = -1;
    for (int i = 0; i < path.size(); i++) {
      if (path.get(i) == current) {
        id = i;
        break;
      }
    }

    if (id == -1) {
      System.out.println(path.get((int)k));
    } else {
      if (id != 0) k = k - id + 1;

      if (id == 0) {
        if (k <= path.size() - 1) {
          System.out.println(path.get((int)k));
        } else {
          k = k - path.size() + 1;
          if (k % (path.size() - id) == 0) {
            System.out.println(path.get(path.size()-1));
          } else {
            long val = k % (path.size() - id);
            if (id > 0) id--;
            System.out.println(path.get(id+(int)val));
          }
        }
      } else {
        if (k % (path.size() - id) == 0) {
          System.out.println(path.get(path.size()-1));
        } else {
          long val = k % (path.size() - id);
          if (id > 0) id--;
          System.out.println(path.get(id+(int)val));
        }
      }
    }


  }

  static class InputReader {

    private final InputStream stream;
    private final byte[] buf = new byte[8192];
    private int curChar, snumChars;
    private SpaceCharFilter filter;

    public InputReader(InputStream stream) {
      this.stream = stream;
    }

    public int snext() {
      if (snumChars == -1) throw new InputMismatchException();
      if (curChar >= snumChars) {
        curChar = 0;
        try {
          snumChars = stream.read(buf);
        } catch (IOException e) {
          throw new InputMismatchException();
        }
        if (snumChars <= 0) return -1;
      }
      return buf[curChar++];
    }

    public int nextInt() {
      int c = snext();
      while (isSpaceChar(c)) {
        c = snext();
      }
      int sgn = 1;
      if (c == '-') {
        sgn = -1;
        c = snext();
      }
      int res = 0;
      do {
        if (c < '0' || c > '9') throw new InputMismatchException();
        res *= 10;
        res += c - '0';
        c = snext();
      } while (!isSpaceChar(c));
      return res * sgn;
    }

    public long nextLong() {
      int c = snext();
      while (isSpaceChar(c)) {
        c = snext();
      }
      int sgn = 1;
      if (c == '-') {
        sgn = -1;
        c = snext();
      }
      long res = 0;
      do {
        if (c < '0' || c > '9') throw new InputMismatchException();
        res *= 10;
        res += c - '0';
        c = snext();
      } while (!isSpaceChar(c));
      return res * sgn;
    }

    public int[] nextIntArray(int n) {
      int a[] = new int[n];
      for (int i = 0; i < n; i++) {
        a[i] = nextInt();
      }
      return a;
    }

    public String readString() {
      int c = snext();
      while (isSpaceChar(c)) {
        c = snext();
      }
      StringBuilder res = new StringBuilder();
      do {
        res.appendCodePoint(c);
        c = snext();
      } while (!isSpaceChar(c));
      return res.toString();
    }

    public String nextLine() {
      int c = snext();
      while (isSpaceChar(c)) c = snext();
      StringBuilder res = new StringBuilder();
      do {
        res.appendCodePoint(c);
        c = snext();
      } while (!isEndOfLine(c));
      return res.toString();
    }

    public boolean isSpaceChar(int c) {
      if (filter != null) return filter.isSpaceChar(c);
      return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
    }

    private boolean isEndOfLine(int c) {
      return c == '\n' || c == '\r' || c == -1;
    }

    public interface SpaceCharFilter {
      public boolean isSpaceChar(int ch);
    }
  }
}
