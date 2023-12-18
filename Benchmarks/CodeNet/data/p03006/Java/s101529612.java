import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author anand.oza
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BPickingUp solver = new BPickingUp();
        solver.solve(1, in, out);
        out.close();
    }

    static class BPickingUp {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            BPickingUp.Point[] points = new BPickingUp.Point[n];

            for (int i = 0; i < n; i++) {
                points[i] = new BPickingUp.Point(in.nextInt(), in.nextInt());
            }

            int answer = n;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    BPickingUp.Line l = new BPickingUp.Line(points[i], points[j]);
                    int score = score(points, l);
                    //System.out.println(l + "\t" + score);
                    answer = Math.min(answer, score);
                }
            }
            out.println(answer);
        }

        private int score(BPickingUp.Point[] points, BPickingUp.Line l) {
            HashSet<Long> c = new HashSet<>();
            for (BPickingUp.Point p : points) {
                c.add(l.getC(p));
            }
            return c.size();
        }

        private static class Point {
            final long x;
            final long y;

            private Point(long x, long y) {
                this.x = x;
                this.y = y;
            }

        }

        private static class Line {
            final long a;
            final long b;
            final long c;

            Line(long a, long b, long c) {
                this.a = a;
                this.b = b;
                this.c = c;
            }

            Line(BPickingUp.Point p1, BPickingUp.Point p2) {
                a = p1.y - p2.y;
                b = p2.x - p1.x;
                c = getC(p1);
            }

            long getC(BPickingUp.Point p) {
                return a * p.x + b * p.y;
            }

            public String toString() {
                return "Line{" + "a=" + a + ", b=" + b + ", c=" + c + '}';
            }

        }

    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

