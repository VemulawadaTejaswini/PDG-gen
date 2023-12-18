import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Task solver = new Task();
        solver.solve(in, out);
        out.close();
    }

    static class Task {
        int N;
        int[] color; // white: 0, black: 1, not painted: -1
        List<Set<int[]>> graph = new ArrayList<>();

        void bfs() {
            Queue<Integer> q = new ArrayDeque<>();

            color[1] = 0;
            q.offer(1);

            while (q.size() > 0) {
                int node = q.poll();
                for (int[] nextNodeInfo : graph.get(node)) {
                    int v = nextNodeInfo[0];
                    int w = nextNodeInfo[1];

                    if (color[v] == -1) {
                        q.offer(v);
                        if (w % 2 == 0) {
                            color[v] = color[node];
                        } else {
                            color[v] = 1 - color[node];
                        }
                    }
                }
            }
        }

        void solve(InputReader in, PrintWriter out) {
            // write your code here
            N = in.nextInt();

            color = new int[N];
            Arrays.fill(color, -1);

            for (int i = 0; i < N; i++) {
                graph.add(new HashSet<>());
            }

            for (int i = 0; i < N - 1; i++) {
                int u = in.nextInt(); --u;
                int v = in.nextInt(); --v;
                int w = in.nextInt() % 2;

                graph.get(u).add(new int[] {v, w});
                graph.get(v).add(new int[] {u, w});
            }

            bfs();

            for (int i = 0; i < N; i++) {
                out.println(color[i]);
            }
        }
    }

    static class InputReader {
        BufferedReader reader;
        StringTokenizer tokenizer;

        InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream));
            tokenizer = null;
        }

        String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] nextIntArray(int size) {
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = nextInt();
            }
            return arr;
        }
    }
}
