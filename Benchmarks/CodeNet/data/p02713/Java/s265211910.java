import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Hola solver = new Hola();
        solver.solve(1, in, out);
        out.close();
    }

    static class Hola {
        PrintWriter out;
        InputReader in;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            this.out = out;
            this.in = in;
            int n = ni();
            long sum = 0;
            int[][] gcd = new int[n + 1][n + 1];
            int i = 0, j = 0, k = 0;
            for(i = 1; i <= n; i++){
                for (j = 1; j <= n; j++)
                    gcd[i][j] = gcd(i, j);
            }
            long ans = 0;
            for(i = 1; i <= n; i++){
                for(j = 1; j <= n; j++){
                    for(k = 1; k <= n; k++)
                        ans += (long)(gcd(k, gcd(i, j)));
                }
            }
            pn(ans);
        }
        int gcd(int a, int b)
        {
            if (a == 0)
                return b;

            return gcd(b%a, a);
        }

        final Comparator<Tuple> com = new Comparator<Tuple>() {
            @Override
            public int compare(Tuple t1, Tuple t2) {
                if(t1.x != t2.x)
                    return Long.compare(t1.x, t2.x);
                else
                    return Long.compare(t2.y, t1.y);
            }
        };
        class Tuple{
            int x, y;
            Tuple(int x, int y){
                this.x = x;
                this.y = y;
            }
        }
        int ni() {
            return in.nextInt();
        }
        long nl() {
            return in.nextLong();
        }
        void pn(Object o) {
            out.println(o);
        }
        void p(Object o) {
            out.print(o);
        }

    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (numChars == -1)
                throw new UnknownError();
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new UnknownError();
                }
                if (numChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }
        public long nextLong() {
            return Long.parseLong(next());
        }

        public String next() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            StringBuffer res = new StringBuffer();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isSpaceChar(c));

            return res.toString();
        }

        private boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

    }
}