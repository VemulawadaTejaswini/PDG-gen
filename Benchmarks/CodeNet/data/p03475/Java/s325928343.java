import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.OutputStream;
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
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, FastReader in, OutputWriter out) {
            int n = in.nextInt();
            Train[] trains = new Train[n];
            for (int i = 0; i < n - 1; i++) {
                trains[i] = new Train(i, in.nextInt(), in.nextInt(), in.nextInt());
            }
            int[] ans = new int[n];
            int[] toReach = new int[n];

            for (int i = 0; i < n - 1; i++) {
                int cur = trains[i].start;
                for (int j = i; j < n - 1; j++) {
                    if (cur > trains[j].start) {
                        int nx = nextMultiple(trains[j].start, trains[j].f, cur);
                        cur += (nx - cur);
                    } else {
                        cur += (trains[j].start - cur);
                    }
                    cur += trains[j].cost;
                }
                ans[i] = cur;
            }
            for (int i = 0; i < n; i++) {
                out.println(ans[i]);
            }
        }

        private int nextMultiple(int start, int f, int cur) {
            int p = start;
            while (p < cur) {
                p += f;
            }
            return p;
        }

        class Train {
            int index;
            int cost;
            int start;
            int f;

            public Train(int index, int cost, int start, int f) {
                this.index = index;
                this.cost = cost;
                this.start = start;
                this.f = f;
            }

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
}

