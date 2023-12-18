import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        PrintWriter w = new PrintWriter(System.out);

        int n = in.nextInt();
        int x = in.nextInt();
        
        if (n == 1) {
            if (x == 1) {
                w.println("Yes");
                w.println("1");
            } else{
                w.println("No");
            }
            w.close();
            return;
        }

        if (n == 2) {
            if (x == 2) {
                w.println("Yes");
                w.println(1);
                w.println(2);
                w.println(3);
            }
            else {
                w.println("No");
            }
            w.close();
            return;
        }
        
        if (x <= 1 || x >= 2 * n - 1)
            w.println("No");
        else {
            w.println("Yes");
            ArrayList<Integer> ans = new ArrayList<Integer>();

            ArrayList<Integer> avail = new ArrayList<Integer>();
            
            for (int i = 1; i < x - 2; i++) {
               avail.add(i);
            }
            
            for (int i = x + 3; i < 2 * n; i++) {
                avail.add(i);
            }
            
            for (int i = 0; i < (avail.size()+1) / 2; i++) {
                ans.add(avail.get(i));
            }

            if (x == 2) {
                ans.add(3);
                ans.add(2);
                ans.add(1);
                ans.add(4);
            } else {
                ans.add(x - 2);
                ans.add(x + 1);
                ans.add(x);
                ans.add(x - 1);
                if (x + 2 < 2 * n)
                    ans.add(x + 2);
            }

            for (int i = (avail.size() + 1) / 2; i < avail.size(); i++)
                ans.add(avail.get(i));
            
            for (int y : ans)
                w.println(y);
            
            //if (get(ans) != x)
              //  System.out.println(ans.toString() + " " + get(ans));
        }

        w.close();
    }

    static int get(ArrayList<Integer> x) {

        while (x.size() > 1) {
            ArrayList<Integer> y = new ArrayList<Integer>();
            for (int i = 0; i + 2 < x.size(); i++) {
                ArrayList<Integer> z = new ArrayList<Integer>();
                for (int k = i; k <= i + 2; k++)
                    z.add(x.get(k));
                Collections.sort(z);
                y.add(z.get(1));
            }
            x = y;
        }

        return x.get(0);
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
