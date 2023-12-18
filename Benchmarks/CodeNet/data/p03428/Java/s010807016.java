import java.io.*;
import java.util.*;
 
 
public class Main implements Runnable {
 
  public void run() {
    BetterScanner scanner = new BetterScanner(System.in);
  
    int n = scanner.nextInt();
    int[] xx = new int[n];
    int[] yy = new int[n];
    
    if (n == 1) {
      System.out.println(100.0);
      return;
    }

    int a = 0;
    int minY = 10000000;
    int minX = 10000000;
    for (int i = 0 ; i < n ; i ++) {
      int x = scanner.nextInt();
      int y = scanner.nextInt();
      xx[i] = x;
      yy[i] = y;
      if (y <= minY) {
        minY = y;
        if (y < minY) {
          minX = 10000000;
        }
        if (y == minY && x < minX) {
          minX = x;
          a = i;
        }
      }
    }
    List<Integer> hulls = new ArrayList(n);
    int b, c;
    do {
      hulls.add(a);
      b = 0;
      for (int i = 1 ; i < n ; i ++) {
        c = i;
        if (b == a) {
          b = c;
        } else {
          long v = (long)(xx[a] - xx[b]) * (yy[a] - yy[c]) - (long)(xx[a] - xx[c]) * (yy[a] - yy[b]);
          long ab = (long)(xx[a] - xx[b]) * (xx[a] - xx[b]) + (long)(yy[a] - yy[b]) * (yy[a] - yy[b]);
          long ac = (long)(xx[a] - xx[c]) * (xx[a] - xx[c]) + (long)(yy[a] - yy[c]) * (yy[a] - yy[c]);
          if (v > 0L || (v == 0L && ac > ab)) {
            b = c;
          }
        }
      }
      a = b;
    } while (a != hulls.get(0));

    int sumX = 0;
    int sumY = 0;
    for (int i : hulls) {
      sumX += xx[i];
      sumY += yy[i];
    }
    double intX = (double)sumX / hulls.size();
    double intY = (double)sumY / hulls.size();

    double[] angles = new double[n];
    for (int i = 0 ; i < n ; i ++) {
      angles[i] = 100.0;
    }
    for (int i : hulls) {
      double angle = Math.atan2((double)yy[i] - intY, (double)xx[i] - intX);
      angles[i] = angle;
    }
    double[] oldAngles = Arrays.copyOf(angles, n);
    Arrays.sort(angles);

    int[] afters = new int[n];
    int[] befores = new int[n];
    for (int i = 0 ; i < n ; i ++) {
      afters[i] = -1;
    }
    for (int i : hulls) {
      for (int j = 0 ; j < n ; j ++) {
        if (oldAngles[i] == angles[j]) {
          afters[i] = j;
          befores[j] = i;
          break;
        }
      }
    }

    int m = hulls.size();
    double[] tans = new double[m];
    for (int j = 0 ; j < m ; j ++) {
      double tan;
      if (j < m - 1) {
        tan = Math.atan2(yy[befores[j]] - yy[befores[j + 1]], xx[befores[j]] - xx[befores[j + 1]]) + Math.PI / 4;
      } else {
        tan = Math.atan2(yy[befores[m - 1]] - yy[befores[0]], xx[befores[m - 1]] - xx[befores[0]]) + Math.PI / 4;
      }
      if (tan > Math.PI) {
        tan -= 2 * Math.PI;
      }
      tans[j] = tan;
    }

    double[] ranges = new double[m];
    for (int j = 0 ; j < m ; j ++) {
      double range;
      if (j > 0) {
        range = tans[j] - tans[j - 1];
      } else {
        range = tans[0] - tans[m - 1];
      }
      if (range < 0) {
        range += 2 * Math.PI;
      }
      ranges[j] = range;
    }

    for (int i = 0 ; i < n ; i ++) {
      if (afters[i] >= 0) {
        System.out.println(ranges[afters[i]] / (2 * Math.PI));
      } else {
        System.out.println(0.0);
      }
    }
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
