import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.OutputStream;
import java.util.Arrays;
import java.io.InputStreamReader;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.StringTokenizer;
import java.io.Writer;
import java.io.BufferedReader;
import java.io.UnsupportedEncodingException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author MaxHeap
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        final int MAX = 100010;
        boolean[] prime = new boolean[MAX];
        int[] acc = new int[MAX];

        void build() {
            Arrays.fill(prime, true);
            prime[1] = prime[0] = false;
            for (int i = 2; i < MAX; i++) {
                if (prime[i]) {
                    for (int j = 2 * i; j < MAX; j += i) {
                        prime[j] = false;
                    }
                }
            }
            for (int i = 0; i < MAX; i++) {
                if (prime[i] && prime[(i + 1) / 2]) acc[i] = 1;
            }
            for (int i = 1; i < MAX; i++) acc[i] += acc[i - 1];
        }

        public void solve(int testNumber, FastReader in, OutputWriter out) {
            build();
            int n = in.nextInt();
            while (n-- > 0) {
                int left = in.nextInt();
                int right = in.nextInt();
                out.println(get(left, right));
            }
        }

        private int get(int left, int right) {
            return acc[right] - acc[left - 1];
        }

    }

    static class FastReader {
        BufferedReader reader;
        StringTokenizer st;

        public FastReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream));
            st = null;
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    String line = reader.readLine();
                    if (line == null) {
                        return null;
                    }
                    st = new StringTokenizer(line);
                } catch (Exception e) {
                    throw new RuntimeException();
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }

    static class OutputWriter extends PrintWriter {
        public OutputWriter(OutputStream os, boolean autoFlush) {
            super(os, autoFlush);
        }

        public OutputWriter(Writer out) {
            super(out);
        }

        public OutputWriter(Writer out, boolean autoFlush) {
            super(out, autoFlush);
        }

        public OutputWriter(String fileName) throws FileNotFoundException {
            super(fileName);
        }

        public OutputWriter(String fileName, String csn) throws FileNotFoundException, UnsupportedEncodingException {
            super(fileName, csn);
        }

        public OutputWriter(File file) throws FileNotFoundException {
            super(file);
        }

        public OutputWriter(File file, String csn) throws FileNotFoundException, UnsupportedEncodingException {
            super(file, csn);
        }

        public OutputWriter(OutputStream out) {
            super(out);
        }


        public void flush() {
            super.flush();
        }


        public void close() {
            super.close();
        }

    }
}

