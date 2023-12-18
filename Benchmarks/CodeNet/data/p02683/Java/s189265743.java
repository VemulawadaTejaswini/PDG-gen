import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author iavanish
 */
public class Main {

    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CSkillUp solver = new CSkillUp();
        solver.solve(1, in, out);
        out.close();
    }

    static class CSkillUp {

        public void solve(int testNumber, FastReader in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            int x = in.nextInt();
            int[] cost = new int[n];
            int[][] value = new int[n][m];
            for (int i = 0; i < n; i++) {
                cost[i] = in.nextInt();
                for (int j = 0; j < m; j++) {
                    value[i][j] = in.nextInt();
                }
            }

            long result = solve(cost, value, new int[m], 0, x);
            if (result == Integer.MAX_VALUE) {
                out.println(-1);
            } else {
                out.println(result);
            }
        }

        private long solve(int[] cost, int[][] value, int[] accumulatedValue, int currBook, int x) {
            if (currBook == cost.length) {
                if (accumulated(accumulatedValue, x)) {
                    return 0;
                }
                return Integer.MAX_VALUE;
            }
            long result = solve(cost, value, accumulatedValue, currBook + 1, x);
            for (int i = 0; i < accumulatedValue.length; i++) {
                accumulatedValue[i] += value[currBook][i];
            }
            result = Math.min(result, cost[currBook] + solve(cost, value, accumulatedValue, currBook + 1, x));
            for (int i = 0; i < accumulatedValue.length; i++) {
                accumulatedValue[i] -= value[currBook][i];
            }
            return result;
        }

        private boolean accumulated(int[] accumulatedValue, int x) {
            for (int a : accumulatedValue) {
                if (a < x) {
                    return false;
                }
            }
            return true;
        }

    }

    static class FastReader {

        private final int BUFFER_SIZE = 1 << 16;
        private final InputStream inputStream;
        private final byte[] buffer;
        private int bufferPointer;
        private int bytesRead;

        public FastReader() {
            this.inputStream = new DataInputStream(System.in);
            this.buffer = new byte[BUFFER_SIZE];
            this.bufferPointer = bytesRead = 0;
        }

        public FastReader(InputStream inputStream) {
            this.inputStream = inputStream;
            this.buffer = new byte[BUFFER_SIZE];
            this.bufferPointer = bytesRead = 0;
        }

        public FastReader(String fileName) {
            try {
                this.inputStream = new DataInputStream(new FileInputStream(fileName));
                this.buffer = new byte[BUFFER_SIZE];
                this.bufferPointer = bytesRead = 0;
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

        public int nextInt() {
            int nextInt = 0;
            byte c = read();
            while (c <= ' ') {
                c = read();
            }
            boolean negative = (c == '-');
            if (negative) {
                c = read();
            }
            do {
                nextInt = nextInt * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');
            if (negative) {
                return -nextInt;
            }
            return nextInt;
        }

        public void fillBuffer() {
            try {
                bytesRead = inputStream.read(buffer, bufferPointer = 0, BUFFER_SIZE);
                if (bytesRead == -1) {
                    buffer[0] = -1;
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        public byte read() {
            if (bufferPointer == bytesRead) {
                fillBuffer();
            }
            return buffer[bufferPointer++];
        }

    }

}

