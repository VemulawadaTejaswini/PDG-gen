import java.io.*;
import java.util.*;
 
 
public class Main implements Runnable {
 
  public void run() {
    BetterScanner scanner = new BetterScanner(System.in);

    int h = scanner.nextInt();
    int w = scanner.nextInt();
    int d = scanner.nextInt();

    int[][] poss = new int[2][h * w];
    for (int i = 0 ; i < w ; i ++) {
      for (int j = 0 ; j < h ; j ++) {
        int num = scanner.nextInt() - 1;
        poss[0][num] = i;
        poss[1][num] = j;
      }
    }

    long[] accs = new long[h * w];
    for (int k = 0 ; k < d ; k ++) {
      long acc = 0;
      for (int num = k + d ; num < h * w ; num += d) {
        int diffX = poss[0][num - d] - poss[0][num];
        int diffY = poss[1][num - d] - poss[1][num];
        if (diffX < 0) {
          diffX = -diffX;
        }
        if (diffY < 0) {
          diffY = -diffY;
        }
        acc += diffX + diffY;
        accs[num] = acc;
      }
    }

    int q = scanner.nextInt();
    StringBuilder output = new StringBuilder();
    for (int k = 0 ; k < q ; k ++) {
      int l = scanner.nextInt() - 1;
      int r = scanner.nextInt() - 1;
      long result = accs[r] - accs[l];
      output.append(result).append("\n");
    }

    System.out.println(output.toString());
  }
 
  public static void main(String[] args) {
    Main main = new Main();
    main.run();
  }
 
  // scanner slightly faster than usual ones
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