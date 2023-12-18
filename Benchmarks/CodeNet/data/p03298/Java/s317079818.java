import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author kessido
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CStringColoring solver = new CStringColoring();
        solver.solve(1, in, out);
        out.close();
    }

    static class CStringColoring {
        char[] c;
        int n;
        long[][] dp;
        int[][] dpLastUpdate;
        int state;

        int getNext(int posFrom, boolean red) {
            for (; posFrom < n; posFrom++) {
                if (((state & (1 << posFrom)) != 0) == red) {
                    break;
                }
            }
            return posFrom;
        }

        long get(int posBlue, int posRed, int currentIndex) {
            if (dpLastUpdate[posBlue][posRed] == state) {
                return dp[posBlue][posRed];
            }
            long res = 0;
            if (currentIndex < n) {
                res = 1;
            } else {
                if (posBlue != n && c[posBlue] == c[currentIndex]) {
                    res += get(getNext(posBlue + 1, false), posRed, currentIndex - 1);
                }
                if (posRed != n && c[posRed] == c[currentIndex]) {
                    res += get(posBlue, getNext(posRed + 1, true), currentIndex - 1);
                }
            }
            dpLastUpdate[posBlue][posRed] = state;
            dp[posBlue][posRed] = res;
            return res;
        }

        long get() {
            int posBlue = getNext(0, false);
            int posRed = getNext(0, true);
            return get(posBlue, posRed, 2 * n - 1);
        }

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            n = in.NextInt();
            c = in.next().toCharArray();
            long res = 0;
            dp = new long[n + 1][n + 1];
            dpLastUpdate = new int[n + 1][n + 1];
            MatrixExtension.fill(dpLastUpdate, -1);
            for (state = 0; state < 1 << n; state++) {
                long delta = get();
                res += delta;
            }
            out.println(res);
        }

    }

    static class InputReader {
        BufferedReader reader;
        StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine(), " \t\n\r\f,");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int NextInt() {
            return Integer.parseInt(next());
        }

    }

    static class MatrixExtension {
        public static void fill(int[][] mat, int value) {
            for (int[] m : mat) Arrays.fill(m, value);
        }

    }
}

