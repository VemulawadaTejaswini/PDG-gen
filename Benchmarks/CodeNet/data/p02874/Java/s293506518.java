import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
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
        PrintWriter out = new PrintWriter(outputStream);
        TaskB solver = new TaskB();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskB {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            TaskB.Segment[] segs = new TaskB.Segment[n];
            for (int i = 0; i < n; ++i) {
                segs[i] = new TaskB.Segment();
                segs[i].l = in.nextInt();
                segs[i].r = in.nextInt() + 1;
            }
            int res = 0;
            for (TaskB.Segment s : segs) res = Math.max(res, s.r - s.l);
            int r1 = Integer.MAX_VALUE;
            for (TaskB.Segment s : segs) r1 = Math.min(r1, s.r);
            int l1 = Integer.MIN_VALUE;
            for (TaskB.Segment s : segs) l1 = Math.max(l1, s.l);
            res += Math.max(0, r1 - l1);
            Arrays.sort(segs, new Comparator<TaskB.Segment>() {

                public int compare(TaskB.Segment o1, TaskB.Segment o2) {
                    return o1.l - o2.l;
                }
            });
            int[] a = new int[n + 1];
            int l = Integer.MIN_VALUE;
            int r = Integer.MAX_VALUE;
            for (int i = 0; i < n; ++i) {
                l = Math.max(l, segs[i].l);
                r = Math.min(r, segs[i].r);
                a[i + 1] = Math.max(0, r - l);
            }
            l = Integer.MIN_VALUE;
            r = Integer.MAX_VALUE;
            for (int i = 0; i < n; ++i) {
                l = Math.max(l, segs[n - 1 - i].l);
                r = Math.min(r, segs[n - 1 - i].r);
                res = Math.max(res, Math.max(0, r - l) + a[n - 1 - i]);
            }
            out.println(res);
        }

        static class Segment {
            int l;
            int r;

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

