import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.PriorityQueue;
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
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        Channel[] cc;
        int n;

        private boolean can(int count) {
            PriorityQueue<Integer> q = new PriorityQueue<>();
            for (int i = 0; i < count; i++) q.add(0);
            for (int i = 0; i < n; i++) {
                int top = q.poll();
                if (cc[i].from - 0.5 < top) return false;
                q.add(cc[i].to);
            }
            return true;
        }

        public void solve(int testNumber, FastReader in, PrintWriter out) {
            n = in.nextInt();
            int C = in.nextInt();
            cc = new Channel[n];
            for (int i = 0; i < n; i++) {
                cc[i] = new Channel(in.nextInt(), in.nextInt(), in.nextInt());
            }
            Arrays.sort(cc, (a, b) -> {
                int cp = Integer.compare(a.from, b.from);
                if (cp == 0) {
                    return Integer.compare(a.to, b.to);
                }
                return cp;
            });
            int lo = 1, hi = 100000;
            int ans = -1;
            while (lo <= hi) {
                int mid = (lo + hi) >> 1;
                if (can(mid)) {
                    ans = mid;
                    hi = mid - 1;
                } else {
                    lo = mid + 1;
                }
            }
            out.println(ans);
        }

        class Channel {
            int from;
            int to;
            int c;

            public Channel(int from, int to, int c) {
                this.from = from;
                this.to = to;
                this.c = c;
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

