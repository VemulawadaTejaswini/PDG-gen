import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.HashMap;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Objects;
import java.util.List;
import java.util.StringTokenizer;
import java.util.Queue;
import java.io.BufferedReader;
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
        DColoringEdgesOnTree solver = new DColoringEdgesOnTree();
        solver.solve(1, in, out);
        out.close();
    }

    static class DColoringEdgesOnTree {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            List<Integer>[] adj = new List[n];
            for (int i = 0; i < n; i++)
                adj[i] = new ArrayList<>();
            HashMap<Pair<Integer, Integer>, Integer> edgeIndex = new HashMap<>();
            for (int i = 0; i < n - 1; i++) {
                int a = in.nextInt() - 1, b = in.nextInt() - 1;
                adj[a].add(b);
                adj[b].add(a);
                edgeIndex.put(Pair.of(a, b), i);
                edgeIndex.put(Pair.of(b, a), i);
            }

            int[] color = new int[n - 1];
            Queue<Pair<Integer, Integer>> q = new ArrayDeque<>();
            q.add(Pair.of(0, -1));
            while (!q.isEmpty()) {
                Pair<Integer, Integer> p = q.poll();
                int cur = p.first;
                int parent = p.second;
                int colorOfParent = parent == -1 ? 0 : color[edgeIndex.get(Pair.of(cur, parent))];
                int skippedColor = -1, skippedEdge = -1;
                for (int i = 0; i < adj[cur].size(); i++) {
                    if (adj[cur].get(i) == parent) {
                        skippedColor = i + 1;
                        continue;
                    }
                    if (i + 1 == colorOfParent) {
                        skippedEdge = edgeIndex.get(Pair.of(cur, adj[cur].get(i)));
                    } else {
                        color[edgeIndex.get(Pair.of(cur, adj[cur].get(i)))] = i + 1;
                    }
                    q.add(Pair.of(adj[cur].get(i), cur));
                }
                if (skippedEdge >= 0)
                    color[skippedEdge] = skippedColor;
            }
            out.println(Util.max(color));
            for (int x : color)
                out.println(x);
        }

    }

    static class Pair<F, S> {
        public final F first;
        public final S second;

        public Pair(F first, S second) {
            this.first = first;
            this.second = second;
        }

        public static <F, S> Pair<F, S> of(F first, S second) {
            return new Pair<>(first, second);
        }

        public boolean equals(Object o) {
            if (this == o)
                return true;
            if (o == null || getClass() != o.getClass())
                return false;
            Pair<?, ?> pair = (Pair<?, ?>) o;
            return Objects.equals(first, pair.first) && Objects.equals(second, pair.second);
        }

        public int hashCode() {
            return Objects.hash(first, second);
        }

        public String toString() {
            return "(" + first + ", " + second + ')';
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

    static class Util {
        public static int max(int... x) {
            int max = Integer.MIN_VALUE;
            for (int i : x) {
                max = Math.max(i, max);
            }
            return max;
        }

    }
}

