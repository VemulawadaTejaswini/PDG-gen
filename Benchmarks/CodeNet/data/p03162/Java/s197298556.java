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

    int n = sc.nextInt();
    int[][] happiness = new int[n + 1][4];
    int[][] dp = new int[n + 1][4];
    for(int i = 1; i <= n; i++){
        for (int j = 1; j <=3; j++) {
            happiness[i][j] = sc.nextInt();
            dp[i][j] = Integer.MIN_VALUE;
            if (i == 0 || j == 0) {
                dp[i][j] = 0;
            }
        }
    }
    for (int j = 1; j <= 3; j++) {
        dp[1][j] = happiness[1][j];
    }
    for (int i = 1; i <=n; i++) {
        for (int j = 1; j <=3 ; j++) {
            if (j == 1) {
                dp[i][j] = Math.max(dp[i - 1][2] + happiness[i][j], dp[i - 1][3] + happiness[i][j]);
            }
            if (j == 2) {
                dp[i][j] = Math.max(dp[i - 1][1] + happiness[i][j], dp[i - 1][3] + happiness[i][j]);
            }
            if (j == 3) {
                dp[i][j] = Math.max(dp[i - 1][1] + happiness[i][j], dp[i - 1][2] + happiness[i][j]);
            }
        }
    }
    int result = Integer.MIN_VALUE;
    for (int j = 1; j <=3; j++) {
        result = Math.max(result, dp[n][j]);
    }
    System.out.println(result);
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