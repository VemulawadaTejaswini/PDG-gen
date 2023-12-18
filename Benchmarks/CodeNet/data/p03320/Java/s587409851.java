import java.io.*;
import java.util.*;
 
 
public class Main implements Runnable {

  private long rest;

  @SuppressWarnings("unchecked") 
  public void run() {
    BetterScanner scanner = new BetterScanner(System.in);
  
    rest = scanner.nextLong();

    StringBuilder output = new StringBuilder();
    for (int deg = 1 ; deg <= 100 && rest > 0 ; deg ++) {
      calc(deg, output);
    }
    System.out.println(output);
  }

  public void calc(int deg, StringBuilder output) {
    if (deg >= 4) {
      boolean flag = false;
      for (int k = 1 ; k <= deg - 2 && rest > 0 ; k ++) {
        long s1 = pow(deg - 1) + pow(k) - 1;
        long s2 = s1 + pow(k);
        if (snuke(s1) > snuke(s2)) {
          continue;
        }
        long x = pow(deg - 1) + pow(k) - 1;
        for (int i = (flag) ? 1 : 0 ; i <= 9 && rest > 0 ; i ++) {
          output.append(x + i * (pow(k))).append("\n");
          rest --;
        }
        flag = true;
      }
      long y = pow(deg - 1) - 1;
      for (int i = 2 ; i <= 9 && rest > 0 ; i ++) {
        output.append(y + i * (pow(deg - 1))).append("\n");
        rest --;
      }
    } else if (deg >= 2) {
      long y = pow(deg - 1) - 1;
      for (int i = 1 ; i <= 9 && rest > 0 ; i ++) {
        output.append(y + i * (pow(deg - 1))).append("\n");
        rest --;
      }
    } else {
      for (int i = 1 ; i <= 9 && rest > 0 ; i ++) {
        output.append(i).append("\n");
        rest --;
      }
    }
  }

  public double snuke(long x) {
    String s = Long.toString(x);
    long res = 0;
    for (int i = 0 ; i < s.length() ; i ++) {
      res += s.charAt(i) - '0';
    }
    return (double)x / res;
  }

  public long pow(int x) {
    long res = 1;
    for (int i = 0 ; i < x ; i ++) {
      res *= 10;
    }
    return res;
  }

  public static void main(String[] args) {
    Main main = new Main();
    main.run();
  }
 
  public static class BetterScanner {
 
    private InputStream stream;
    private byte[] buffer = new byte[1024];
    private int pointer = 0;
    private int bufferLength = 0;
 
    public BetterScanner(InputStream stream) {
      this.stream = stream;
    }
 
    private boolean updateBuffer() {
      if (pointer >= bufferLength) {
        pointer = 0;
        try {
          bufferLength = stream.read(buffer);
        } catch (IOException exception) {
          exception.printStackTrace();
        }
        return bufferLength > 0;
      } else {
        return true;
      }
    }
 
    private int read() {
      if (updateBuffer()) {
        return buffer[pointer ++];
      } else {
        return -1;
      }
    }
 
    public boolean hasNext() {
      skipUnprintable();
      return updateBuffer();
    }
 
    private void skipUnprintable() { 
      while (updateBuffer() && !isPrintableChar(buffer[pointer])) {
        pointer ++;
      }
    }
 
    public String next() {
      if (hasNext()) {
        StringBuilder builder = new StringBuilder();
        int codePoint = read();
        while (isPrintableChar(codePoint)) {
          builder.appendCodePoint(codePoint);
          codePoint = read();
        }
        return builder.toString();
      } else {
        throw new NoSuchElementException();
      }
    }
 
    public long nextLong() {
      if (hasNext()) {
        long number = 0;
        boolean minus = false;
        int codePoint = read();
        if (codePoint == '-') {
          minus = true;
          codePoint = read();
        }
        if (codePoint >= '0' && codePoint <= '9') {
          while (true) {
            if (codePoint >= '0' && codePoint <= '9') {
              number *= 10;
              number += codePoint - '0';
            } else if (codePoint < 0 || !isPrintableChar(codePoint)) {
              return (minus) ? -number : number;
            } else {
              throw new NumberFormatException();
            }
            codePoint = read();
          }
        } else {
          throw new NumberFormatException();
        }
      } else {
        throw new NoSuchElementException();
      }
    }
 
    public int nextInt() {
      long number = nextLong();
      if (number >= Integer.MIN_VALUE && number <= Integer.MAX_VALUE) {
        return (int)number;
      } else {
        throw new NumberFormatException();
      }
    }
 
    private boolean isPrintableChar(int codePoint) {
      return codePoint >= 33 && codePoint <= 126;
    }
 
  }
 
}
