import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

public class Main {

  public static void main(String[] args) {
    FastScanner sc = new FastScanner();
    long x = sc.nextLong();
    boolean digit = x >= 0 ? true : false;
    x = (long) Math.sqrt(Math.pow(x, 2));
    if (x == 0) {
      System.out.println(0 + " " + 0);
      return;
    }
    if (x == 1) {
      System.out.println(0 + " " + -1);
      return;
    }
    for (long i = 2; i <= x; i++) {
      if (x % i == 0) {
        for (long a = 0; a <= x / i; a++) {
          long b = a - i;
          long ex = (long) (Math.pow(a, 4) + (Math.pow(a, 3) * b) + (Math.pow(a, 2) * Math.pow(b, 2))
              + (a * Math.pow(b, 3)) + Math.pow(b, 4));
          if (x / i == ex) {
            System.out.println(digit ? a + " " + b : -a + " " + -b);
            break;
          }
        }
      }
    }
  }
}

class FastScanner {
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
    if (hasNextByte())
      return buffer[ptr++];
    else
      return -1;
  }

  private static boolean isPrintableChar(int c) {
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