import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.StringTokenizer;
import java.io.Writer;
import java.io.BufferedReader;
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
        OutputWriter out = new OutputWriter(outputStream);
        BPath solver = new BPath();
        solver.solve(1, in, out);
        out.close();
    }

    static class BPath {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int[][] ab = in.NextIntMatrix(3, 2);
            for (int i = 1; i <= 4; i++) {
                for (int i1 = 0; i1 < 3; i1++) {
                    int iAfterI1 = traverse(i, ab[i1]);
                    if (i == iAfterI1) continue;
                    for (int i2 = 0; i2 < 3; i2++) {
                        int iAfterI2 = traverse(iAfterI1, ab[i2]);
                        if (iAfterI1 == iAfterI2 || i == iAfterI2) continue;
                        for (int i3 = 0; i3 < 3; i3++) {
                            if (i1 == i2 || i2 == i3 || i1 == i3) continue;
                            int iAfterI3 = traverse(iAfterI2, ab[i3]);
                            if (iAfterI1 == iAfterI3 || i == iAfterI3 || iAfterI2 == iAfterI3) continue;
                            out.println("YES");
                            return;
                        }
                    }
                }
            }
            out.println("NO");
        }

        private int traverse(int i, int[] ints) {
            if (i == ints[0]) return ints[1];
            if (i == ints[1]) return ints[0];
            return i;
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

        public int[][] NextIntMatrix(int n, int m) {
            return NextIntMatrix(n, m, 0);
        }

        public int[][] NextIntMatrix(int n, int m, int offset) {
            int[][] a = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = NextInt() + offset;
                }
            }
            return a;
        }

    }

    static class OutputWriter extends PrintWriter {
        public OutputWriter(Writer out) {
            super(out);
        }

        public OutputWriter(File file) throws FileNotFoundException {
            super(file);
        }

        public OutputWriter(OutputStream out) {
            super(out);
        }

    }
}

