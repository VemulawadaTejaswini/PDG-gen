import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.stream.IntStream;
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
        Contest solver = new Contest();
        solver.solve(1, in, out);
        out.close();
    }

    static class Contest {
        public void solve(int testNumber, FastReader in, OutputWriter out) {
            int n = in.nextInt();
            int[] arr = in.nextIntArray(n);
            long sum = Arrays.stream(arr).sum();
            int m = in.nextInt();
            for (int i = 0; i < m; i++) {
                int cur = in.nextInt() - 1;
                int val = in.nextInt();
                out.println(sum - arr[cur] + val);
            }
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

        public int[] nextIntArray(int n) {
            int[] arr = new int[n];
            int i = 0;
            while (i < n) {
                arr[i++] = nextInt();
            }
            return arr;
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

