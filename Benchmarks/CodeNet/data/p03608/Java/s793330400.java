import java.io.*;
import java.util.*;
 
 
public class Main implements Runnable {
 
  public static final int MOD = 1000000007;

  public void run() {
    BetterScanner scanner = new BetterScanner(System.in);

    int n = scanner.nextInt();
    int m = scanner.nextInt();
    int rNum = scanner.nextInt();

    int[] rr = new int[rNum];
    for (int i = 0 ; i < rNum ; i ++) {
      rr[i] = scanner.nextInt() - 1;
    }

    int[][] costs = new int[n][n];
    for (int i = 0 ; i < m ; i ++) {
      int a = scanner.nextInt() - 1;
      int b = scanner.nextInt() - 1;
      int c = scanner.nextInt();
      costs[a][b] = c;
      costs[b][a] = c;
    }

    int[][] dd = new int[n][n];
    for (int i = 0 ; i < n ; i ++) {
      for (int j = 0 ; j < n ; j ++) {
        dd[i][j] = (costs[i][j] > 0) ? costs[i][j] : Integer.MAX_VALUE;
      }
    }
    for (int k = 0 ; k < n ; k ++) {
      for (int i = 0 ; i < n ; i ++) {
        for (int j = 0 ; j < n ; j ++) {
          if (dd[i][k] < Integer.MAX_VALUE && dd[k][j] < Integer.MAX_VALUE && dd[i][j] > dd[i][k] + dd[k][j]) {
            dd[i][j] = dd[i][k] + dd[k][j];
          }
        }
      }
    }

    int min = Integer.MAX_VALUE;
    int[] array = new int[rNum];
    for (int i = 0 ; i < rNum ; i ++) {
      array[i] = i;
    }
    do {
      int d = 0;
      for (int i = 0 ; i < rNum - 1 ; i ++) {
        d += dd[rr[array[i]]][rr[array[i + 1]]];
      }
      if (d < min) {
        min = d;
      }
    } while (nextPermutation(array));
    System.out.println(min);
  }

  private static boolean nextPermutation(int[] array) {
    for (int i = array.length - 1 ; i > 0 ; i --) {
      if (array[i - 1] < array[i]) {
        int j = find(array, array[i - 1], i, array.length - 1);
        int temp = array[j];
        array[j] = array[i - 1];
        array[i - 1] = temp;
        Arrays.sort(array, i, array.length);
        return true;
      }
    }
    return false;
  }

  private static int find(int[] array, int dest, int f, int l) {
    if (f == l) {
      return f;
    }
    int m = (f + l + 1) / 2;
    return (array[m] <= dest) ? find(array, dest, f, m - 1) : find(array, dest, m, l);
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
