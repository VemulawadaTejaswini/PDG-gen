import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.HashMap;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
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
        DColoringEdgesOnTree solver = new DColoringEdgesOnTree();
        solver.solve(1, in, out);
        out.close();
    }

    static class DColoringEdgesOnTree {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int[] ans = new int[n];
            ArrayList<Integer> a[] = new ArrayList[n];
            for (int i = 0; i < n; i++) a[i] = new ArrayList<>();
            boolean vis[] = new boolean[n];
            HashSet<Integer> ha[] = new HashSet[n];

            HashMap<Long, Integer> map = new HashMap<>();
            int max = 0;
            for (int i = 0; i < n; i++) ha[i] = new HashSet<Integer>();
            for (int i = 0; i < n - 1; i++) {
                int u = in.nextInt() - 1;
                int v = in.nextInt() - 1;
                a[u].add(v);
                a[v].add(u);
                map.put((long) u * (long) 1000000 + (long) v, i);
                map.put((long) v * (long) 1000000 + (long) u, i);

            }
            Queue<Integer> q = new LinkedList<>();
            q.add(0);
            while (q.size() > 0) {
                int root = q.poll();
                if (vis[root]) continue;
                vis[root] = true;
                int temp = 1;
                for (int i = 0; i < a[root].size(); i++) {
                    if (!vis[a[root].get(i)]) {
                        while (ha[root].contains(temp)) temp++;
                        ha[a[root].get(i)].add(temp);
                        ha[root].add(temp);
                        max = Math.max(temp, max);
                        ans[map.get((long) root * 1000000 + a[root].get(i))] = temp;
                        q.add(a[root].get(i));
                    }
                }
            }
            out.println(max);
            for (int i = 0; i < n - 1; i++) out.println(ans[i]);

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

