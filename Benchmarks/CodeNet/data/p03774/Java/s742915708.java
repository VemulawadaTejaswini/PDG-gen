import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;
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
        PrintWriter out = new PrintWriter(outputStream);
        CheckPoints solver = new CheckPoints();
        solver.solve(1, in, out);
        out.close();
    }

    static class CheckPoints {
        public int manhatan(CheckPoints.Student s, CheckPoints.CheckPoint check) {
            return Math.abs(s.x - check.x) + Math.abs(s.y - check.y);
        }

        public void solve(int testNumber, FastReader in, PrintWriter out) {
            int n = in.nextInt(), m = in.nextInt();
            CheckPoints.Student[] students = new CheckPoints.Student[n];
            CheckPoints.CheckPoint[] checkpoints = new CheckPoints.CheckPoint[m];
            for (int i = 0; i < n; i++) {
                students[i] = new CheckPoints.Student(in.nextInt(), in.nextInt());
            }
            for (int i = 0; i < m; i++) {
                checkpoints[i] = new CheckPoints.CheckPoint(in.nextInt(), in.nextInt());
            }
            for (int i = 0; i < n; i++) {
                int min = 99999999;
                int minIndex = -1;
                for (int j = 0; j < m; ++j) {
                    if (manhatan(students[i], checkpoints[j]) < min) {
                        min = manhatan(students[i], checkpoints[j]);
                        minIndex = j + 1;
                    }
                }
                out.println(minIndex);
            }
        }

        static class Student {
            int x;
            int y;

            public Student(int x, int y) {
                this.x = x;
                this.y = y;
            }

        }

        static class CheckPoint {
            int x;
            int y;

            public CheckPoint(int x, int y) {
                this.x = x;
                this.y = y;
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

    }
}

