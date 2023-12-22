import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);

        Problem solver = new Problem();
        solver.solve(0, in, out);
        out.close();
    }

    static class Problem {

        private int count;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int N = in.nextInt(), M = in.nextInt();
            Map<Integer, List<Integer>> graph = new HashMap<>();

            for (int i = 0; i < N; i++) {
                graph.put(i, new ArrayList<>());
            }

                for(int i = 0; i < M; i++) {
                int u = in.nextInt() - 1, v = in.nextInt() - 1;
                graph.get(u).add(v);
                graph.get(v).add(u);
            }

            boolean[] marked = new boolean[N];
            int res = 0;
            for (int i = 0; i < N; i++) {
                if(!marked[i]) {
                    count = 0;
                    dfs(graph, i, marked);
                    res = Math.max(res, count);
                }
            }

            out.println(res);
        }

        public void dfs(Map<Integer, List<Integer>> graph, int s, boolean[] marked) {
            marked[s] = true;
            count++;
            for(int v : graph.get(s)) {
                if(!marked[v])
                    dfs(graph, v, marked);
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

