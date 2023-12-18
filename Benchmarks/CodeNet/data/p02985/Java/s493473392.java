import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Collection;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.Queue;
import java.io.BufferedReader;
import java.util.LinkedList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Jaynil
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        EVirusTree2 solver = new EVirusTree2();
        solver.solve(1, in, out);
        out.close();
    }

    static class EVirusTree2 {
        public static long mod = 10000_0000_7;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int k = in.nextInt();
            ArrayList<Integer> a[] = new ArrayList[n];
            boolean visited[] = new boolean[n];
            int neighbour[] = new int[n];
            for (int i = 0; i < n; i++) a[i] = new ArrayList<Integer>();
            for (int i = 0; i < n - 1; i++) {
                int u = in.nextInt() - 1;
                int v = in.nextInt() - 1;
                a[u].add(v);
                a[v].add(u);
            }
            Queue<Integer> q = new LinkedList<>();
            q.add(0);
            long ans = 1;
            while (q.size() > 0) {
                int node = q.poll();
                long count = 0;
                if (visited[node]) {
                    continue;
                }
                visited[node] = true;
                for (int x : a[node]) {
                    if (!visited[x]) q.add(x);
                    else count++;
                    count += neighbour[x];
                    neighbour[x]++;
                }
                if (k - count < 0) ans = 0;
                ans *= (k - count) % mod;
                ans %= mod;
            }
            out.println(ans);

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

