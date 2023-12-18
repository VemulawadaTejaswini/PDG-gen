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
        EHopscotchAddict solver = new EHopscotchAddict();
        solver.solve(1, in, out);
        out.close();
    }

    static class EHopscotchAddict {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            ArrayList<Integer> a[] = new ArrayList[n];
            ArrayList<Integer> b[] = new ArrayList[3 * n];
            for (int i = 0; i < 3 * n; i++) {
                b[i] = new ArrayList<>();
            }
            for (int i = 0; i < m; i++) {
                int u = in.nextInt() - 1;
                int v = in.nextInt() - 1;
                b[u].add(v + n);
                b[u + n].add(v + 2 * n);
                b[u + 2 * n].add(v);
            }
            int s = in.nextInt() - 1;
            int v = in.nextInt() - 1;
            Queue<Integer> q = new LinkedList<>();
            boolean visited[] = new boolean[3 * n];
            int pos[] = new int[3 * n];
            q.add(s);
            while (q.size() > 0) {
                int r = q.poll();
                visited[r] = true;
                for (int x : b[r]) {
                    if (!visited[x]) {
                        q.add(x);
                        pos[x] = pos[r] + 1;
                    }
                }
            }
            if (pos[v] == 0) {
                out.println(-1);
            } else {
                out.println(pos[v] / 3);
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

