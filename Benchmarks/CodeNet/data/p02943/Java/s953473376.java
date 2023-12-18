import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.InputStream;

/**
 * Built using CHelper plug-in Actual solution is at the top
 *
 * @author ilyakor
 */
public class Main {

  public static void main(String[] args) {
    InputStream inputStream = System.in;
    OutputStream outputStream = System.out;
    InputReader in = new InputReader(inputStream);
    OutputWriter out = new OutputWriter(outputStream);
    TaskF solver = new TaskF();
    solver.solve(1, in, out);
    out.close();
  }

  static class TaskF {

    public void solve(int testNumber, InputReader in, OutputWriter out) {
      int n = in.nextInt();
      int k = in.nextInt();
      char[] s = in.nextToken().toCharArray();
      k = Math.min(k, 15);
      if (k == 1) {
        StringBuilder t = new StringBuilder();
        for (int i = 0; i < n; ++i) {
          t.append(s[i]);
        }
        for (int i = n - 1; i >= 0; --i) {
          t.append(s[i]);
        }
        String res = null;
        for (int j = 0; j < n; ++j) {
          String cur = t.substring(j, j + n);
          if (res == null || cur.compareTo(res) < 0) {
            res = cur;
          }
        }
        out.printLine(res);
        return;
      }
      char c = 'z';
      for (int i = 0; i < n; ++i) {
        if (c > s[i]) {
          c = s[i];
        }
      }

      String res = null;
      int cnt = 0;
      for (int i = 0; i < n; ++i) {
        if (s[i] == c) {
          ++cnt;
        } else {
          if (cnt > 0) {
            int l = i - cnt, r = i - 1;
            StringBuilder cur = new StringBuilder();
            int pos = r;
            for (int j = 0; j < (1 << (k - 1)) && cur.length() < n; ++j) {
              if (pos == r) {
                while (pos >= l && cur.length() < n) {
                  cur.append(s[pos--]);
                }
                ++pos;
              } else {
                while (pos <= r && cur.length() < n) {
                  cur.append(s[pos++]);
                }
                --pos;
              }
            }
            ++pos;
            int dir = 1;
            while (cur.length() < n) {
              if (pos == n) {
                pos = n - 1;
                dir = -1;
              } else if (pos == -1) {
                pos = 0;
                dir = 1;
              }
              cur.append(s[pos]);
              pos += dir;
            }
            String cs = cur.toString();
            if (res == null || cs.compareTo(res) < 0) {
              res = cs;
            }
          }
          cnt = 0;
        }
      }

      int numLast = 0;
      {
        int l = n - 1;
        while (l >= 0 && s[l] == c) {
          --l;
          ++numLast;
        }
      }
      if (numLast > 0) {
        int l = s.length - numLast;
        int r = s.length - 1;
        StringBuilder cur = new StringBuilder();
        int pos = l;
        for (int j = 0; j < (1 << k) && cur.length() < n; ++j) {
          if (pos == r) {
            while (pos >= l && cur.length() < n) {
              cur.append(s[pos--]);
            }
            ++pos;
          } else {
            while (pos <= r && cur.length() < n) {
              cur.append(s[pos++]);
            }
            --pos;
          }
        }
        --pos;
        int dir = -1;
        while (cur.length() < n) {
          if (pos == n) {
            pos = n - 1;
            dir = -1;
          } else if (pos == -1) {
            pos = 0;
            dir = 1;
          }
          cur.append(s[pos]);
          pos += dir;
        }
        String cs = cur.toString();
        if (res == null || cs.compareTo(res) < 0) {
          res = cs;
        }
      }

      out.printLine(res);
    }

  }

  static class InputReader {

    private InputStream stream;
    private byte[] buffer = new byte[10000];
    private int cur;
    private int count;

    public InputReader(InputStream stream) {
      this.stream = stream;
    }

    public static boolean isSpace(int c) {
      return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
    }

    public int read() {
      if (count == -1) {
        throw new InputMismatchException();
      }
      try {
        if (cur >= count) {
          cur = 0;
          count = stream.read(buffer);
          if (count <= 0) {
            return -1;
          }
        }
      } catch (IOException e) {
        throw new InputMismatchException();
      }
      return buffer[cur++];
    }

    public int readSkipSpace() {
      int c;
      do {
        c = read();
      } while (isSpace(c));
      return c;
    }

    public String nextToken() {
      int c = readSkipSpace();
      StringBuilder sb = new StringBuilder();
      while (!isSpace(c)) {
        sb.append((char) c);
        c = read();
      }
      return sb.toString();
    }

    public int nextInt() {
      int sgn = 1;
      int c = readSkipSpace();
      if (c == '-') {
        sgn = -1;
        c = read();
      }
      int res = 0;
      do {
        if (c < '0' || c > '9') {
          throw new InputMismatchException();
        }
        res = res * 10 + c - '0';
        c = read();
      } while (!isSpace(c));
      res *= sgn;
      return res;
    }

  }

  static class OutputWriter {

    private final PrintWriter writer;

    public OutputWriter(OutputStream outputStream) {
      writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
    }

    public OutputWriter(Writer writer) {
      this.writer = new PrintWriter(writer);
    }

    public void print(Object... objects) {
      for (int i = 0; i < objects.length; i++) {
        if (i != 0) {
          writer.print(' ');
        }
        writer.print(objects[i]);
      }
    }

    public void printLine(Object... objects) {
      print(objects);
      writer.println();
    }

    public void close() {
      writer.close();
    }

  }
}

