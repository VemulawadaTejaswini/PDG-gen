import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.OutputStream;
import java.io.InputStreamReader;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.ArrayList;
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
        public void solve(int testNumber, FastReader in, OutputWriter out) {
            int n = in.nextInt();
            int[] arr = in.nextIntArray(n);
            boolean neg = false, pos = false;
            for (int i = 0; i < n; i++) {
                if (arr[i] >= 0) pos = true;
                if (arr[i] <= 0) neg = true;
            }
            ArrayList<IntPair> op = new ArrayList<>();
            if (pos && neg) {
                int max = 0, maxPos = 0;
                for (int i = 0; i < n; i++) {
                    if (arr[i] > max) {
                        max = arr[i];
                        maxPos = i;
                    }
                }
                int min = (int) 0, minPos = 0;
                for (int i = 0; i < n; i++) {
                    if (arr[i] < min) {
                        min = arr[i];
                        minPos = i;
                    }
                }
                if (Math.abs(min) > max) {
                    for (int i = 0; i < n; i++) {
                        arr[i] += min;
                        op.add(new IntPair(minPos + 1, i + 1));
                    }
                    for (int i = n - 1; i > 0; i--) {
                        op.add(new IntPair(i + 1, i));
                        arr[i - 1] += arr[i];
                    }
                    for (IntPair p : op) {
                        out.println(p.getFirst() + " " + p.getSecond());
                    }
                } else {
                    for (int i = 0; i < n; i++) {
                        arr[i] += max;
                        op.add(new IntPair(maxPos + 1, i + 1));
                    }
                    for (int i = 1; i < n; i++) {
                        op.add(new IntPair(i, i + 1));
                        arr[i] += arr[i - 1];
                    }
                    for (IntPair p : op) {
                        out.println(p.getFirst() + " " + p.getSecond());
                    }
                }
            } else if (pos) {
                for (int i = 1; i < n; i++) {
                    op.add(new IntPair(i, i + 1));
                    arr[i] += arr[i - 1];
                }
                for (IntPair p : op) {
                    out.println(p.getFirst() + " " + p.getSecond());
                }
            } else if (neg) {
                for (int i = n - 1; i > 0; i--) {
                    op.add(new IntPair(i + 1, i));
                    arr[i - 1] += arr[i];
                }
                for (IntPair p : op) {
                    out.println(p.getFirst() + " " + p.getSecond());
                }
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

    static class IntPair implements Comparable<IntPair> {
        int first;
        int second;

        public IntPair(int first, int second) {
            this.first = first;
            this.second = second;
        }


        public int compareTo(IntPair a) {
            if (second == a.second) {
                return Integer.compare(first, a.first);
            }
            return Integer.compare(second, a.second);
        }


        public String toString() {
            return "<" + first + ", " + second + ">";
        }


        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            IntPair a = (IntPair) o;

            if (first != a.first) return false;
            return second == a.second;
        }


        public int hashCode() {
            int result = first;
            result = 31 * result + second;
            return result;
        }

        public int getFirst() {
            return first;
        }

        public int getSecond() {
            return second;
        }

    }
}

