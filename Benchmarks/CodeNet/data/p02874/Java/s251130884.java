import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
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
            Point leftMostBiggest = point[0];
            for (int i = 1; i < N; i++) {
                if (point[i].left < leftMostBiggest.left) {
                    leftMostBiggest = point[i];
                } else if (point[i].left == leftMostBiggest.left && point[i].right > leftMostBiggest.right) {
                    leftMostBiggest = point[i];
                }
            }
            Point secondPartner = null;
            int leastOverlap = Constants.INT_INFINITY;
            for (int i = 0; i < N; i++) {
                if (point[i].index == leftMostBiggest.index) {
                    continue;
                }
                if (point[i].overlap(leftMostBiggest) < leastOverlap) {
                    secondPartner = point[i];
                    leastOverlap = point[i].overlap(leftMostBiggest);
                }
            }
            int size;
            for (int i = 0; i < N; i++) {
                if (point[i].index == leftMostBiggest.index || point[i].index == secondPartner.index) {
                    continue;
                }
                int a = point[i].overlap(leftMostBiggest);
                int b = point[i].overlap(secondPartner);
                if (a + secondPartner.size > b + leftMostBiggest.size) {
                    leftMostBiggest.left = Math.max(leftMostBiggest.left, point[i].left);
                    leftMostBiggest.right = Math.min(leftMostBiggest.right, point[i].right);
                    leftMostBiggest.size = Math.max(leftMostBiggest.right - leftMostBiggest.left + 1, 0);
                } else {
                    secondPartner.left = Math.max(secondPartner.left, point[i].left);
                    secondPartner.right = Math.min(secondPartner.right, point[i].right);
                    secondPartner.size = Math.max(secondPartner.right - secondPartner.left + 1, 0);
                }
            }
            size = leftMostBiggest.size + secondPartner.size;
            out.printLine(size);
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

            public int overlap(Point a) {
                return Math.max(Math.min(a.right, this.right) - Math.max(a.left, this.left) + 1, 0);
            }

        }

    }

    static class Constants {
        public static final Integer INT_INFINITY = (int) 2e9;

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

