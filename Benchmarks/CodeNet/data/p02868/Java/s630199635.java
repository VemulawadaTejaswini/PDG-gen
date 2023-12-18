import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.AbstractMap;
import java.util.TreeMap;
import java.util.StringTokenizer;
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
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ProblemD_ShortestPathOnALine solver = new ProblemD_ShortestPathOnALine();
        solver.solve(1, in, out);
        out.close();
    }

    static class ProblemD_ShortestPathOnALine {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            List<Segment>[] startingHere = new List[n];
            List<Long>[] endingHere = new List[n];
            for (int i = 0; i < n; i++) {
                startingHere[i] = new ArrayList<>();
                endingHere[i] = new ArrayList<>();
            }
            for (int i = 0; i < m; i++) {
                int l = in.nextInt() - 1;
                int r = in.nextInt() - 1;
                int c = in.nextInt();
                startingHere[l].add(new Segment(l, r, c));
            }

            long[] d = new long[n];
            TreeMap<Long, Integer> cnt = new TreeMap<>();
            for (int i = 0; i < n; i++) {
                if (i > 0) {
                    if (cnt.isEmpty()) {
                        out.println(-1);
                        return;
                    }
                    d[i] = cnt.firstKey();
                }
                for (Segment s : startingHere[i]) {
                    change(cnt, d[i] + s.c, +1);
                    endingHere[s.r].add(d[i] + s.c);
                }
                for (long c : endingHere[i]) {
                    change(cnt, c, -1);
                }
            }
            out.println(d[n - 1]);
        }

        private void change(TreeMap<Long, Integer> cnt, long key, int delta) {
            Integer val = cnt.get(key);
            if (val == null) {
                val = 0;
            }
            val += delta;
            if (val == 0) {
                cnt.remove(key);
            } else {
                cnt.put(key, val);
            }
        }

        class Segment {
            int l;
            int r;
            int c;

            Segment(int l, int r, int c) {
                this.l = l;
                this.r = r;
                this.c = c;
            }

        }

    }

    static class FastScanner {
        private BufferedReader in;
        private StringTokenizer st;

        public FastScanner(InputStream stream) {
            in = new BufferedReader(new InputStreamReader(stream));
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    String rl = in.readLine();
                    if (rl == null) {
                        return null;
                    }
                    st = new StringTokenizer(rl);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

