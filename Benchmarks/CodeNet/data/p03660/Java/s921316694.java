import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collection;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.util.BitSet;
import java.util.Queue;
import java.util.ArrayDeque;
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
        DFennecVSSnuke solver = new DFennecVSSnuke();
        solver.solve(1, in, out);
        out.close();
    }

    static class DFennecVSSnuke {
        int n;
        List<Integer>[] adj;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            n = in.nextInt();

            adj = new List[n];
            for (int i = 0; i < n; i++) {
                adj[i] = new ArrayList<>();
            }

            for (int i = 0; i < n - 1; i++) {
                int a = in.nextInt() - 1, b = in.nextInt() - 1;
                adj[a].add(b);
                adj[b].add(a);
            }

            int fennec = bfs(0, n - 1);
            int snuke = bfs(n - 1, 0);

            if (distance(0, n - 1) % 2 == 0) {
                fennec++;
            }

            if (fennec <= snuke) {
                out.println("Snuke");
            } else {
                out.println("Fennec");
            }
        }

        private int bfs(int start, int opponent) {
            BitSet visited = new BitSet();
            visited.set(opponent);
            visited.set(start);
            int count = 0;
            Queue<Integer> q = new ArrayDeque<>();
            q.add(start);
            while (!q.isEmpty()) {
                int cur = q.poll();
                count++;
                for (int next : adj[cur]) {
                    if (visited.get(next)) {
                        continue;
                    }
                    visited.set(next);
                    q.add(next);
                }
            }

            return count;
        }

        private int distance(int start, int opponent) {
            int[] distance = new int[n];
            Arrays.fill(distance, -1);

            distance[start] = 0;
            Queue<Integer> q = new ArrayDeque<>();
            q.add(start);
            while (!q.isEmpty()) {
                int cur = q.poll();
                for (int next : adj[cur]) {
                    if (distance[next] >= 0) {
                        continue;
                    }
                    distance[next] = distance[cur] + 1;
                    q.add(next);
                }
            }

            return distance[opponent];
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

