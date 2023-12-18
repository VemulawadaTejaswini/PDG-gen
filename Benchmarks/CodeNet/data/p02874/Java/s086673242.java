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
            int ans = 0;
            for (int i = 0; i < N; i++) {
                point[i] = new Point(in.nextInt(), in.nextInt(), i);
                ans = Math.max(ans, point[i].size);
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
            int overlapA[] = new int[N];
            int overlapB[] = new int[N];
            int left = point[0].left, right = point[0].right;
            for (int i = 0; i < N; i++) {
                left = Math.max(left, point[i].left);
                right = Math.min(right, point[i].right);
                overlapA[i] = Math.max(0, right - left + 1);
            }
            left = point[N - 1].left;
            right = point[N - 1].right;
            for (int i = N - 1; i >= 0; i--) {
                left = Math.max(left, point[i].left);
                right = Math.min(right, point[i].right);
                overlapB[i] = Math.max(0, right - left + 1);
            }
            for (int i = 0; i < N - 1; i++) {
                ans = Math.max(ans, overlapA[i] + overlapB[i + 1]);
            }
            out.printLine(ans);

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

