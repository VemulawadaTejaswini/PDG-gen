import java.io.IOException;
import java.io.InputStream;
import java.util.Comparator;
import java.util.NoSuchElementException;

public class Main {
  public static void main(String[] args) {
    FastScanner sc = new FastScanner();

    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int X = sc.nextInt();
    int Y = sc.nextInt();

    long ans = A * X + B * Y;
    ;
    int z = Math.max(X, Y);
    for (int i = 0; i <= Math.max(X, Y); i++) {
      ans = Math.min(ans, i * C * 2 + A * Math.max(0,(X - i)) + B * Math.max(0,(Y - i)));
    }

    System.out.println(ans);
  }

  public static class Data {
    int a, b;

    public Data(int a, int b) {
      this.a = a;
      this.b = b;
    }
  }

  // Comparator インターフェースを実装する
  public static class MyComparator implements Comparator<Data> {
    public int compare(Data d1, Data d2) {
      if (d1.b == d2.b) {
        return d1.a - d2.b;
      } else {
        return d1.b - d2.b;
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

  public boolean hasNext() {
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

  public int nextInt() {
    if (!hasNext()) {
      throw new NoSuchElementException();
    }
    int n = 0;
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

  public long nextLong() {
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
}