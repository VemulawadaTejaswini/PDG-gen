import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.PriorityQueue;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author HossamDoma
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskE solver = new TaskE();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskE {
        public void solve(int testNumber, InputReader in, PrintWriter out) {


            int n = in.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; ++i) {
                a[i] = in.nextInt();
            }

            PriorityQueue<Pair> pq = new PriorityQueue<>();

            for (int i = 0; i + 1 < n; ++i) {
                pq.add(new Pair(i, i + 1, a[i] + a[i + 1]));
            }


            int vis[] = new int[n + 1];

            int ans[] = new int[n];

            int idx = n - 1;

            while (pq.size() > 0 && idx > 0) {

                Pair p = pq.poll();

                if (vis[p.i] == p.j)
                    continue;

                ans[idx--] = a[p.j];
                ans[idx--] = a[p.i];

                if (p.i > 0) {
                    vis[p.i - 1] = p.i;
                }

                if (p.j < n - 1) {
                    vis[p.j] = p.j + 1;
                }

                if (p.i > 0 && p.j < n - 1) {
                    pq.add(new Pair(p.i - 1, p.j + 1, a[p.i - 1] + a[p.j + 1]));
                }

            }

            for (int i = 0; i < n; ++i) {
                out.print(ans[i] + (i == n - 1 ? "\n" : " "));
            }

        }

        class Pair implements Comparable<Pair> {
            int i;
            int j;
            int sum;

            public Pair(int i, int j, int sum) {
                this.i = i;
                this.j = j;
                this.sum = sum;
            }


            public int compareTo(Pair o) {
                return o.sum - sum;
            }


            public boolean equals(Object obj) {
                if (!(obj instanceof Pair))
                    return false;

                Pair p = (Pair) obj;

                return p.i == i && p.j == j && sum == p.sum;
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

