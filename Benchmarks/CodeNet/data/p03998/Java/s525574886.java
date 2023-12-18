import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

public class Main {

  public static void main(String[] args) {
    FastScanner sc = new FastScanner();

    char[] a = sc.next().toCharArray();
    char[] b = sc.next().toCharArray();
    char[] c = sc.next().toCharArray();

    Arrays.sort(a);
    Arrays.sort(b);
    Arrays.sort(c);
    List<Character> A = new ArrayList<>();
    List<Character> B = new ArrayList<>();
    List<Character> C = new ArrayList<>();
    for (int i = 0; i < a.length; i++) {
      if (a[i] != 'a')
        A.add(a[i]);
    }
    for (int i = 0; i < b.length; i++) {
      if (b[i] != 'b')
        B.add(b[i]);
    }
    for (int i = 0; i < c.length; i++) {
      if (c[i] != 'c')
        C.add(c[i]);
    }

    int round = A.size() + B.size() + C.size();
    char now = 'a';
    String winner = "";

    for (int i = 0; i <= round; i++) {
      if (!winner.equals(""))
        break;
      switch (now) {
        case 'a':
          if (A.isEmpty()) {
            winner = "A";
            break;
          }
          now = A.remove(0);
          break;
        case 'b':
          if (B.isEmpty()) {
            winner = "B";
            break;
          }
          now = B.remove(0);
          break;
        case 'c':
          if (C.isEmpty()) {
            winner = "C";
            break;
          }
          now = C.remove(0);
          break;
      }
    }

    System.out.println(winner);

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