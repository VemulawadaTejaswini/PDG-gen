import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.ArrayList;
import java.io.InputStream;

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
        PIndependentSet solver = new PIndependentSet();
        solver.solve(1, in, out);
        out.close();
    }

    static class PIndependentSet {
        long[] black = new long[(int) 1e5 + 5];
        long[] white = new long[(int) 1e5 + 5];
        ArrayList<Integer>[] g;
        long MOD = (int) 1e9 + 7;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int N = in.nextInt();
            g = new ArrayList[N + 1];
            for (int i = 0; i <= N; i++) {
                g[i] = new ArrayList<>();
            }
            for (int i = 0; i < N - 1; i++) {
                int x = in.nextInt();
                int y = in.nextInt();
                g[x].add(y);
                g[y].add(x);
            }
            dfs(1, -1);
            out.print((black[1] + white[1]) % MOD);
        }

        void dfs(int s, int p) {
            black[s] = 1;
            white[s] = 1;
            for (int ele : g[s]) {
                if (ele == p) continue;
                dfs(ele, s);
                black[s] = (black[s] * white[ele]) % MOD;
                white[s] = (white[s] * (black[ele] + white[ele])) % MOD;
            }
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

        private boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

    }
}

