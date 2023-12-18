import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
  static int mod = (int) 1e9 + 7;
  public static void main(String[] args) throws FileNotFoundException {
    FasterScanner s = new FasterScanner();
    PrintWriter out = new PrintWriter(System.out);
    int test = 1;
    
    while (test-- > 0) {
      int n = s.nextInt();
      int m = s.nextInt();
      boolean[][] b = new boolean[n][m];
      for(int i = 0; i < n; i++) {
        char[] x = s.nextLine().toCharArray();
        for(int j = 0; j< m; j++)
          b[i][j] = x[j] == '#';
      }
      boolean[][] visited = new boolean[n][m];
      int curx = 0 , cury = 0;
      while(true) {
        visited[curx][cury] = true;
        if(curx < n - 1 && b[curx + 1][cury]) {
          curx++;
        }
        else if(cury < m - 1 && b[curx][cury + 1]) {
          cury++;
        }
        else{
          break;
        }
      }
      for(int i = 0; i < n; i++) {
        for(int j = 0;j < m; j++) {
          if(!visited[i][j] && b[i][j]) {
            System.out.println("Impossible");
            return;
          }
        }
      }
      System.out.println("Possible");
    }
    

    out.close();
  }

  public static long pow(long x, long n, long mod) {
    long res = 1;
    for (long p = x; n > 0; n >>= 1, p = (p * p) % mod) {
      if ((n & 1) != 0) {
        res = (res * p % mod);
      }
    }
    return res;
  }

  static long gcd(long n1, long n2) {
    long r;
    while (n2 != 0) {
      r = n1 % n2;
      n1 = n2;
      n2 = r;
    }
    return n1;
  }

  static class FasterScanner {
    private byte[] buf = new byte[1024];
    private int curChar;
    private int snumChars;

    public int read() {
      if (snumChars == -1)
        throw new InputMismatchException();
      if (curChar >= snumChars) {
        curChar = 0;
        try {
          snumChars = System.in.read(buf);
        } catch (IOException e) {
          throw new InputMismatchException();
        }
        if (snumChars <= 0)
          return -1;
      }
      return buf[curChar++];
    }

    public double nextDouble() {
      return Double.parseDouble(this.nextString());
    }

    public String nextLine() {
      int c = read();
      while (isSpaceChar(c))
        c = read();
      StringBuilder res = new StringBuilder();
      do {
        res.appendCodePoint(c);
        c = read();
      } while (!isEndOfLine(c));
      return res.toString();
    }

    public String nextString() {
      int c = read();
      while (isSpaceChar(c))
        c = read();
      StringBuilder res = new StringBuilder();
      do {
        res.appendCodePoint(c);
        c = read();
      } while (!isSpaceChar(c));
      return res.toString();
    }

    public long nextLong() {
      int c = read();
      while (isSpaceChar(c))
        c = read();
      int sgn = 1;
      if (c == '-') {
        sgn = -1;
        c = read();
      }
      long res = 0;
      do {
        if (c < '0' || c > '9')
          throw new InputMismatchException();
        res *= 10;
        res += c - '0';
        c = read();
      } while (!isSpaceChar(c));
      return res * sgn;
    }

    public int nextInt() {
      int c = read();
      while (isSpaceChar(c))
        c = read();
      int sgn = 1;
      if (c == '-') {
        sgn = -1;
        c = read();
      }
      int res = 0;
      do {
        if (c < '0' || c > '9')
          throw new InputMismatchException();
        res *= 10;
        res += c - '0';
        c = read();
      } while (!isSpaceChar(c));
      return res * sgn;
    }

    public int[] nextIntArray(int n) {
      int[] arr = new int[n];
      for (int i = 0; i < n; i++) {
        arr[i] = nextInt();
      }
      return arr;
    }

    public long[] nextLongArray(int n) {
      long[] arr = new long[n];
      for (int i = 0; i < n; i++) {
        arr[i] = nextLong();
      }
      return arr;
    }

    private boolean isSpaceChar(int c) {
      return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
    }

    private boolean isEndOfLine(int c) {
      return c == '\n' || c == '\r' || c == -1;
    }
  }
}