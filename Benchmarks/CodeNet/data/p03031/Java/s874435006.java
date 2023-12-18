import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author anand.oza
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CSwitches solver = new CSwitches();
        solver.solve(1, in, out);
        out.close();
    }

    static class CSwitches {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();

            BitMatrix32 matrix = new BitMatrix32(m, n + 1);
            for (int i = 0; i < m; i++) {
                int k = in.nextInt();
                for (int j = 0; j < k; j++) {
                    matrix.data[i] += (1 << in.nextInt());
                }
            }
            for (int i = 0; i < m; i++) {
                matrix.data[i] += in.nextInt();
            }

            int rank = matrix.reduce();
            int free = n - rank;

            int answer = free < 0 ? 0 : 1 << (n - rank);

            out.println(answer);
        }

    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }

    static class BitMatrix32 {
        final int rows;
        final int cols;
        public int[] data;

        public BitMatrix32(int rows, int cols) {
            this.rows = rows;
            this.cols = cols;
            data = new int[rows];
        }

        public int reduce() {
            return reducePartial(0, rows);
        }

        public int reducePartial(int alreadyReducedRowCount, int maxRank) {
            int firstZeroRow = maxRank;
            for (int i = 0; i < firstZeroRow; i++) {
                while (data[i] == 0) {
                    if (firstZeroRow - 1 >= i) {
                        swapRows(i, firstZeroRow - 1);
                        firstZeroRow--;
                    } else {
                        return firstZeroRow;
                    }
                }
                int firstNonZeroCol = Math.min(cols, Integer.numberOfTrailingZeros(data[i]));

                for (int b = Math.max(alreadyReducedRowCount, i + 1); b < firstZeroRow; b++) {
                    if (((data[b] >> firstNonZeroCol) & 1) != 0) {
                        xorRow(b, i);
                    }
                }
            }

            return firstZeroRow;
        }

        public void swapRows(int i, int j) {
            int t = data[i];
            data[i] = data[j];
            data[j] = t;
        }

        public void xorRow(int target, int rowToAdd) {
            data[target] ^= data[rowToAdd];
        }

    }
}

