import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author kangtaku
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        arc103_a solver = new arc103_a();
        solver.solve(1, in, out);
        out.close();
    }

    static class arc103_a {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            Map<Integer, Integer> mp = new HashMap<>();
            int n = in.readInt(), t, cnt;
            for (int i = 0; i < n; ++i) {
                t = in.readInt();
                cnt = mp.getOrDefault(t, 0);
                mp.put(t, cnt + 1);
            }
            int max1 = -1, max2 = -1, maxNum1 = 0, maxNum2 = 0;
            for (Map.Entry<Integer, Integer> kv : mp.entrySet()) {
                if (max1 < kv.getValue()) {
                    max2 = max1;
                    maxNum2 = maxNum1;

                    max1 = kv.getValue();
                    maxNum1 = kv.getKey();
                    continue;
                }
                if (max2 < kv.getValue()) {
                    max2 = kv.getValue();
                    maxNum2 = kv.getKey();
                }
            }
            if (max2 == -1) out.println(n / 2);
            else out.println(n - (max1 + max2));
        }

    }

    static class InputReader {
        private InputStream stream;
        private BufferedReader br = null;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;

        public InputReader(InputStream stream) {
            this.stream = stream;
            this.br = new BufferedReader(new InputStreamReader(stream));
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

        public int readInt() {
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

        public boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

    }
}

