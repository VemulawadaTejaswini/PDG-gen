import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.TreeSet;
import java.io.InputStream;
import java.io.IOException;


public class Main {
  public static void main(String[] args) {
    InputReader sc = new InputReader(System.in);

    int N = sc.nextInt();
    int [] a = new int[N + 1];
    int [] b = new int[N + 1];
    int [] c = new int [N + 1];
    int[][] dp = new int[N + 1][4];
    for (int i = 1 ; i <= N; i++) {
        a[i] = sc.nextInt();
        b[i] = sc.nextInt();
        c[i] = sc.nextInt();
    }
    dp[1][1] = a[1];
    dp[1][2] = b[1];
    dp[1][3] = c[1];

    for (int i = 2; i <= N; i++) {
        for (int j = 1; j <= 3; j++) {
            if (j == 1) {
                dp[i][j] = a[i] + Math.max(dp[i -1][2], dp[i -1][3]);
            } else if (j == 2) {
                dp[i][j] = b[i] + Math.max(dp[i -1][1], dp[i -1][3]);
            } else {
                dp[i][j] = c[i] + Math.max(dp[i -1][1], dp[i -1][2]);
            }
        }
    }
    System.out.println(Math.max(dp[N][1],Math.max(dp[N][2], dp[N][3])));
  }
  static class InputReader {
      private InputStream stream;
      private byte[] buf = new byte[1024];
      private int curChar;
      private int numChars;
      private SpaceCharFilter filter;

      public InputReader(InputStream stream) {
          this.stream = stream;
      }

      public int next() {
          if (numChars == -1)
              throw new InputMismatchException();
          if (curChar >= numChars) {
              curChar = 0;
              try {
                  numChars = stream.read(buf);
              } catch (IOException e) {
                  throw new InputMismatchException();
              }
              if (numChars <= 0)
                  return -1;
          }
          return buf[curChar++];
      }

      public String nextStr() {
        int c = next();
        while(isSpaceChar(c)){c = next();}
        StringBuffer str = new StringBuffer();
        do{
          str.append((char)c);
          c = next();
        }while(!isSpaceChar(c));
        return str.toString();
      }

      public char nextChar() {
        int c = next();
        while(isSpaceChar(c)){c = next();}
        char ret;
        do{
          ret = (char)c;
          c = next();
        }while(!isSpaceChar(c));
        return ret;
      }

      public int nextInt() {
          int c = next();
          while (isSpaceChar(c))
              c = next();
          int sgn = 1;
          if (c == '-') {
              sgn = -1;
              c = next();
          }
          int res = 0;
          do {
              if (c < '0' || c > '9')
                  throw new InputMismatchException();
              res *= 10;
              res += c - '0';
              c = next();
          } while (!isSpaceChar(c));
          return res * sgn;
      }

      public boolean isSpaceChar(int c) {
          if (filter != null)
              return filter.isSpaceChar(c);
          return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
      }

      public interface SpaceCharFilter {
          public boolean isSpaceChar(int ch);
      }
  }
}
