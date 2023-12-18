import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;

class Main {

  public static void main(String[] args) {
    final FastScanner scanner = new FastScanner();
    final PrintWriter writer = new PrintWriter(System.out);
    int n = scanner.nextInt();
    int k = scanner.nextInt();
    int r = scanner.nextInt();
    int s = scanner.nextInt();
    int p = scanner.nextInt();
    String t = scanner.next();
    writer.println(new Solver(t, n, k, r, s, p).runDfs());
    writer.flush();
    writer.close();
  }

  static class Solver {
    String computer;
    int round, k, r, s, p, maxScore;

    Solver(String computer, int round, int k, int r, int s, int p) {
      this.computer = computer;
      this.round = round;
      this.k = k;
      this.r = r; // g
      this.s = s; // c
      this.p = p; // p
    }

    int runDfs() {
      dfs("", 1, 0);
      return maxScore;
    }

    void dfs(String history, int current, int score) {
      if (history.length() == computer.length()) {
        maxScore = Math.max(maxScore, score);
        return;
      }
      char comp = computer.charAt(current - 1);
      if (history.length() >= k) {
        char c = history.charAt(history.length() - k);
        switch (c) {
        case 'p':
          dfs(history + "r", current + 1, comp == 's' ? score + r : score);
          dfs(history + "s", current + 1, comp == 'p' ? score + s : score);
          break;
        case 'r':
          dfs(history + "p", current + 1, comp == 'r' ? score + p : score);
          dfs(history + "s", current + 1, comp == 'p' ? score + s : score);
          break;
        case 's':
          dfs(history + "p", current + 1, comp == 'r' ? score + p : score);
          dfs(history + "r", current + 1, comp == 's' ? score + r : score);
          break;
        default:
          throw new IllegalArgumentException();
        }
      } else {
        switch (comp) {
        case 'p':
          dfs(history + "s", current + 1, score + s);
          break;
        case 'r':
          dfs(history + "p", current + 1, score + p);
          break;
        case 's':
          dfs(history + "r", current + 1, score + r);
          break;
        default:
          throw new IllegalArgumentException();
        }
      }
    }
  }

  // FastScanner --
  static class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;

    public FastScanner() {
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
      if (hasNextByte())
        return buffer[ptr++];
      else
        return -1;
    }

    private boolean isPrintableChar(int c) {
      return 33 <= c && c <= 126;
    }

    public boolean hasNext() {
      while (hasNextByte() && !isPrintableChar(buffer[ptr]))
        ptr++;
      return hasNextByte();
    }

    public String next() {
      if (!hasNext())
        throw new NoSuchElementException();
      StringBuilder sb = new StringBuilder();
      int b = readByte();
      while (isPrintableChar(b)) {
        sb.appendCodePoint(b);
        b = readByte();
      }
      return sb.toString();
    }

    public long nextLong() {
      if (!hasNext())
        throw new NoSuchElementException();
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
      long nl = nextLong();
      if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
        throw new NumberFormatException();
      return (int) nl;
    }

    public double nextDouble() {
      return Double.parseDouble(next());
    }
  }
}