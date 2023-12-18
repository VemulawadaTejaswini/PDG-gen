    //Do what you can't.
     
    import java.io.*;
    import java.util.*;
    import java.math.BigInteger;
    public class Main{
      public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        PrintWriter w = new PrintWriter(System.out);
        int n = in.nextInt();
        int[] a = in.nextIntArray(n);
        boolean[] b = new boolean[8];
        int tt = 0;
        for (int i = 0; i < n; i++) {
          if (1 <= a[i] && a[i] <= 399)
            b[0] = true;
          else if (400 <= a[i] && a[i] <= 799)
            b[1] = true;
          else if (800 <= a[i] && a[i] <= 1199)
            b[2] = true;
          else if (1200 <= a[i] && a[i] <= 1599)
            b[3] = true;
          else if (1600 <= a[i] && a[i] <= 1999)
            b[4] = true;
          else if (2000 <= a[i] && a[i] <= 2399)
            b[5] = true;
          else if (2400 <= a[i] && a[i] <= 2799)
            b[6] = true;
          else if (2800 <= a[i] && a[i] <= 3199)
            b[7] = true;
          else if (a[i]>=3200)
            tt++;
     
        }
        int c = 0;
        for (int i = 0; i < 8; i++)
          if (b[i])
            c++;
        int mn = c;
        int mx = mn+tt;
        if (mn==0)
          mn=1;
        w.println(mn + " " + mx);
        w.close();
      }
      static class InputReader {
     
        private final InputStream stream;
        private final byte[] buf = new byte[8192];
        private int curChar, snumChars;
        private SpaceCharFilter filter;
     
        public InputReader(InputStream stream) {
          this.stream = stream;
        }
     
        public int snext() {
          if (snumChars == -1)
            throw new InputMismatchException();
          if (curChar >= snumChars) {
            curChar = 0;
            try {
              snumChars = stream.read(buf);
            } catch (IOException e) {
              throw new InputMismatchException();
            }
            if (snumChars <= 0)
              return -1;
          }
          return buf[curChar++];
        }
     
        public int nextInt() {
          int c = snext();
          while (isSpaceChar(c)) {
            c = snext();
          }
          int sgn = 1;
          if (c == '-') {
            sgn = -1;
            c = snext();
          }
          int res = 0;
          do {
            if (c < '0' || c > '9')
              throw new InputMismatchException();
            res *= 10;
            res += c - '0';
            c = snext();
          } while (!isSpaceChar(c));
          return res * sgn;
        }
     
        public long nextLong() {
          int c = snext();
          while (isSpaceChar(c)) {
            c = snext();
          }
          int sgn = 1;
          if (c == '-') {
            sgn = -1;
            c = snext();
          }
          long res = 0;
          do {
            if (c < '0' || c > '9')
              throw new InputMismatchException();
            res *= 10;
            res += c - '0';
            c = snext();
          } while (!isSpaceChar(c));
          return res * sgn;
        }
     
        public int[] nextIntArray(int n) {
          int a[] = new int[n];
          for (int i = 0; i < n; i++) {
            a[i] = nextInt();
          }
          return a;
        }
     
        public String readString() {
          int c = snext();
          while (isSpaceChar(c)) {
            c = snext();
          }
          StringBuilder res = new StringBuilder();
          do {
            res.appendCodePoint(c);
            c = snext();
          } while (!isSpaceChar(c));
          return res.toString();
        }
     
        public String nextLine() {
          int c = snext();
          while (isSpaceChar(c))
            c = snext();
          StringBuilder res = new StringBuilder();
          do {
            res.appendCodePoint(c);
            c = snext();
          } while (!isEndOfLine(c));
          return res.toString();
        }
     
        public boolean isSpaceChar(int c) {
          if (filter != null)
            return filter.isSpaceChar(c);
          return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }
     
        private boolean isEndOfLine(int c) {
          return c == '\n' || c == '\r' || c == -1;
        }
     
        public interface SpaceCharFilter {
          public boolean isSpaceChar(int ch);
        }
      }
    }