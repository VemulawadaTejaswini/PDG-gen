import java.util.List;
import java.util.ArrayList;
import java.io.*;
import java.util.NoSuchElementException;

class Main {
  public static void main(String... args) {
    Scanner sc = new Scanner();
    int size = sc.nextInt();
    String[][] inserts = new String[26][size];
    String[] results = new String[size];
    String input;
    String find;

    int[] iIndex = new int[26];
    for (int i = 0; i < 26; i++) {
      iIndex[i] = 0;
    }
    int asciiIndex;
    int fIndex = 0;
    boolean first = true;

    for (int i = 0; i < size; i++) {

      if (sc.next().equals("insert")) {
        input = sc.next();
        asciiIndex = getAsciiIndex(input);
        inserts[asciiIndex][iIndex[asciiIndex]] = input;
        iIndex[asciiIndex]++;
        if (first) {
            first = false;
        }

      } else {
        find = sc.next();

        if (first) {
          results[fIndex] = "no";
          fIndex++;
          continue;
        }

        if (search(find, inserts, iIndex)) {
          results[fIndex] = "yes";
        } else {
          results[fIndex] = "no";
        }
        fIndex++;
      }
    }

    for (int i = 0; i < fIndex; i++) {
      System.out.println(results[i]);
    }
  }

  public static int getAsciiIndex(String input) {
    try {
      return input.substring(0, 1).getBytes("US-ASCII")[0] - 65;
    } catch (Exception e) {
      e.printStackTrace();
      return 0;
    }
  }

  public static boolean search(String find, String[][] inserts, int[] iIndex) {
    int asciiIndex = getAsciiIndex(find);

    for (int i = 0; i < iIndex[asciiIndex]; i++) {
      if (inserts[asciiIndex][i].equals(find)) {
        return true;
      }
    }

    return false;
  }
}

class Scanner {
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

  public boolean hasNext() {
    while (hasNextByte() && !isPrintableChar(buffer[ptr])) {
      ptr++;
    }

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

    while(true){
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
    if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) {
      throw new NumberFormatException();
    }

    return (int) nl;
  }

  public double nextDouble() {
    return Double.parseDouble(next());
  }
}

