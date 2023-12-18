import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.stream.IntStream;

class Main {

  public static void main(String[] args) {
    final FastScanner scanner = new FastScanner();
    final PrintWriter writer = new PrintWriter(System.out);
    final int target = Integer.parseInt(scanner.next());
    final String val1 = IntStream.range(0, target).mapToObj(i -> scanner.next()).reduce("", (a, b) -> a + b);
    final String val2 = IntStream.range(0, target).mapToObj(i -> scanner.next()).reduce("", (a, b) -> a + b);
    final String input = IntStream.range(1, target + 1).mapToObj(i -> String.valueOf(i)).reduce("", (a, b) -> a + b);
    final Map<String, Integer> result = new HashMap<>();
    permutation(result, input, "");
    writer.println(Math.abs(result.get(val1) - result.get(val2)));
    writer.flush();
    writer.close();
  }

  public static void permutation(Map<String, Integer> result, String q, String ans) {
    if (q.length() <= 1) {
      result.put(ans + q, result.size());
    } else {
      for (int i = 0; i < q.length(); i++) {
        permutation(result, q.substring(0, i) + q.substring(i + 1), ans + q.charAt(i));
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