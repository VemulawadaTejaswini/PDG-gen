import java.io.*;
import java.util.*;
 
 
public class Main implements Runnable {
 
  public void run() {
    BetterScanner scanner = new BetterScanner(System.in);
  
    int h = scanner.nextInt();
    int w = scanner.nextInt();
    int[][] cc = new int[10][10];
    for (int i = 0 ; i <= 9 ; i ++) {
      for (int j = 0 ; j <= 9 ; j ++) {
        cc[i][j] = scanner.nextInt();
      }
    }

    int[] minC = new int[10];
    for (int i = 0 ; i <= 9 ; i ++) {
      int[] dist = new int[10];
      for (int j = 0 ; j <= 9 ; j ++) {
        dist[j] = (j == i) ? 0 : 100000;
      }
      Set<Integer> queue = new HashSet<Integer>();
      for (int j = 0 ; j <= 9 ; j ++) {
        queue.add(j);
      }
      while (!queue.isEmpty()) {
        int minJ = 0;
        int minDist = 100000;
        for (int j : queue) {
          if (dist[j] < minDist) {
            minJ = j;
            minDist = dist[j];
          }
        }
        queue.remove(minJ);
        for (int k = 0 ; k <= 9 ; k ++) {
          if (dist[k] > dist[minJ] + cc[minJ][k]) {
            dist[k] = dist[minJ] + cc[minJ][k];
          }
        }
      }
      minC[i] = dist[1]; 
    }

    int result = 0;
    for (int p = 0 ; p < h ; p ++) {
      for (int q = 0 ; q < w ; q ++) {
        int a = scanner.nextInt();
        if (a >= 0) {
          result += minC[a];
        }
      }
    }
    System.out.println(result);
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