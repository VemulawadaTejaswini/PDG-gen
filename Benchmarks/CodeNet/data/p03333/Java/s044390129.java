import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.TreeSet;
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
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int N = in.nextInt();
            TaskC.Range[] ranges = new TaskC.Range[N];


            for (int i = 0; i < N; i++) {
                int left = in.nextInt();
                int right = in.nextInt();
                ranges[i] = new TaskC.Range(i, left, right);
            }

            long ansLeft = goLeft(ranges, true);
            long ansRight = goLeft(ranges, false);
            long ans = Math.max(ansLeft, ansRight);

            out.println(ans);
        }

        private long goLeft(TaskC.Range[] ranges, boolean left) {
            TreeSet<TaskC.Range> byStart = new TreeSet<>((r1, r2) -> {
                if (r1.start < r2.start) return -1;
                if (r1.start > r2.start) return +1;
                return r1.idx - r2.idx;
            });

            TreeSet<TaskC.Range> byEnd = new TreeSet<>((r1, r2) -> {
                if (r1.end < r2.end) return -1;
                if (r1.end > r2.end) return +1;
                return r1.idx - r2.idx;
            });

            for (TaskC.Range r : ranges) {
                byStart.add(r);
                byEnd.add(r);
            }

            long ans = 0;

            //left by end
            //right by start
            long pos = 0;
            while (!byStart.isEmpty()) {
                TaskC.Range r;
                if (left) {
                    r = byEnd.pollFirst();
                    long npos;
                    if (pos < r.start) {
                        npos = r.start;
                    } else if (pos <= r.end) {
                        npos = pos;
                    } else {
                        npos = r.end;
                    }

                    ans += Math.abs(npos - pos);
                    pos = npos;
                    byStart.remove(r);
                } else {
                    r = byStart.pollLast();
                    long npos;
                    if (pos > r.end) {
                        npos = r.end;
                    } else if (pos >= r.start) {
                        npos = pos;
                    } else {
                        npos = r.start;
                    }

                    ans += Math.abs(npos - pos);
                    pos = npos;
                    byEnd.remove(r);
                }
                left = !left;
            }
            return ans + Math.abs(0 - pos);
        }

        static class Range {
            int start;
            int end;
            int idx;

            public Range(int idx, int start, int end) {
                this.idx = idx;
                this.start = start;
                this.end = end;
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

