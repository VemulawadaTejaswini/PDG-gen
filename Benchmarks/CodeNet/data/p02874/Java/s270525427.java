import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.util.Comparator;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        TaskB solver = new TaskB();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskB {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int N = in.nextInt();
            Point point[] = new Point[N];
            for (int i = 0; i < N; i++) {
                point[i] = new Point(in.nextInt(), in.nextInt(), i);
            }
            Arrays.sort(point, new Comparator<Point>() {

                public int compare(Point o1, Point o2) {
                    if (o1.left != o2.left) {
                        return Integer.compare(o1.left, o2.left);
                    } else if (o1.right != o2.right) {
                        return Integer.compare(o1.right, o2.right);
                    }
                    return Integer.compare(o1.index, o2.index);
                }
            });
            int ans = getAns(point[0], point[N - 1], point);
            out.printLine(ans);

        }

        public int getAns(Point a, Point b, Point points[]) {
            int aLeft = a.left;
            int aRight = a.right;
            int bLeft = b.left;
            int bRight = b.right;
            for (int i = 0; i < points.length; i++) {
                if (points[i].index == a.index || points[i].index == b.index) {
                    continue;
                }
                if (Math.max(0, Math.min(aRight, points[i].right) - Math.max(aLeft, points[i].left) + 1) + Math.max(0, bRight - bLeft + 1) >
                        Math.max(0, Math.min(bRight, points[i].right) - Math.max(bLeft, points[i].left) + 1) + Math.max(0, aRight - aLeft + 1)) {
                    aRight = Math.min(points[i].right, aRight);
                    aLeft = Math.max(points[i].left, aLeft);
                } else {
                    bRight = Math.min(points[i].right, bRight);
                    bLeft = Math.max(points[i].left, bLeft);
                }
            }
            return Math.max(0, aRight - aLeft + 1) + Math.max(0, bRight - bLeft + 1);
        }

        class Point {
            int left;
            int right;
            int size;
            int index;

            public Point(int left, int right, int index) {
                this.left = left;
                this.right = right;
                this.size = right - left + 1;
                this.index = index;
            }

        }

    }

    static class OutputWriter {
        PrintWriter writer;

        public OutputWriter(OutputStream outputStream) {
            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
        }

        public OutputWriter(Writer writer) {
            this.writer = new PrintWriter(writer);
        }

        public void print(Object... objects) {
            for (int i = 0; i < objects.length; i++) {
                if (i != 0) {
                    writer.print(' ');
                }
                writer.print(objects[i]);
            }
        }

        public void printLine(Object... objects) {
            print(objects);
            writer.println();
        }

        public void close() {
            writer.close();
        }

    }

    static class InputReader {
        BufferedReader in;
        StringTokenizer tokenizer = null;

        public InputReader(InputStream inputStream) {
            in = new BufferedReader(new InputStreamReader(inputStream));
        }

        public String next() {
            try {
                while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                    tokenizer = new StringTokenizer(in.readLine());
                }
                return tokenizer.nextToken();
            } catch (IOException e) {
                return null;
            }
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

