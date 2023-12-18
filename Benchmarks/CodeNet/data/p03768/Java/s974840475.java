import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
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
 * @author neuivn
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskB solver = new TaskB();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskB {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int N = in.nextInt();
            int M = in.nextInt();

            int[] dist = new int[N + 1];

            int[] distA = new int[N + 1];
            int[] distB = new int[N + 1];
            Arrays.fill(dist, 1 << 30);
            int[] color = new int[N + 1];

            ArrayList<Integer>[] adj = new ArrayList[N + 1];

            for (int i = 0; i <= N; ++i) {
                adj[i] = new ArrayList<>();
            }
            for (int m = 0; m < M; ++m) {
                int A = in.nextInt();
                int B = in.nextInt();
                adj[A].add(B);
                adj[B].add(A);
            }
            int components = 0;
            HashMap<Integer, Integer> vertexToComponent = new HashMap<>();

            boolean[] used = new boolean[N + 1];
            for (int i = 1; i <= N; ++i) {
                if (!used[i]) {
                    Queue<Integer> q = new LinkedList<>();
                    vertexToComponent.put(i, components);
                    q.offer(i);
                    used[i] = true;
                    while (!q.isEmpty()) {
                        int v = q.poll();
                        vertexToComponent.put(v, components);
                        for (int to : adj[v]) {
                            if (!used[to]) {
                                used[to] = true;
                                q.offer(to);
                            }
                        }
                    }
                    ++components;
                }
            }
            ArrayList<Integer>[] vQ = new ArrayList[components];
            ArrayList<Integer>[] dQ = new ArrayList[components];
            ArrayList<Integer>[] cQ = new ArrayList[components];

            for (int i = 0; i < components; ++i) {
                vQ[i] = new ArrayList<>();
                dQ[i] = new ArrayList<>();
                cQ[i] = new ArrayList<>();
            }

            int Q = in.nextInt();
            for (int qq = 0; qq < Q; ++qq) {
                int vv = in.nextInt();
                int dd = in.nextInt();
                int cc = in.nextInt();
                int compId = vertexToComponent.get(vv);
                vQ[compId].add(vv);
                dQ[compId].add(dd);
                cQ[compId].add(cc);
            }

            Arrays.fill(used, false);

            for (int i = 1; i <= N; ++i) {
                if (!used[i]) {
                    used[i] = true;
                    ArrayList<Integer> allValid = new ArrayList<>();
                    int compId = vertexToComponent.get(i);
                    Arrays.fill(distA, 1 << 30);
                    Arrays.fill(distB, 1 << 30);
                    Queue<Integer> q = new LinkedList<>();
                    q.offer(i);
                    int farthest = i;
                    int max = -1;
                    distA[i] = 0;
                    int startA = i;
                    while (!q.isEmpty()) {
                        int top = q.poll();
                        allValid.add(top);
                        used[top] = true;
                        if (max < distA[top]) {
                            max = distA[top];
                            startA = top;
                        }
                        for (int to : adj[top]) {
                            if (distA[to] > distA[top] + 1) {
                                distA[to] = distA[top] + 1;
                                q.offer(to);
                            }
                        }
                    }

                    Arrays.fill(distA, 1 << 30);
                    distA[startA] = 0;
                    max = -1;
                    int startB = i;
                    q.offer(startA);

                    while (!q.isEmpty()) {
                        int top = q.poll();
                        if (max < distA[top]) {
                            max = distA[top];
                            startB = top;
                        }
                        for (int to : adj[top]) {
                            if (distA[to] > distA[top] + 1) {
                                distA[to] = distA[top] + 1;
                                q.offer(to);
                            }
                        }
                    }
                    int[] toPaint = new int[max + 1];
                    Arrays.fill(distB, 1 << 30);
                    distB[startB] = 0;
                    q.offer(startB);
                    while (!q.isEmpty()) {
                        int top = q.poll();
                        for (int to : adj[top]) {
                            if (distB[to] > distB[top] + 1) {
                                distB[to] = distB[top] + 1;
                                q.offer(to);
                            }
                        }
                    }

                    for (int qq = 0; qq < vQ[compId].size(); ++qq) {
                        int fromV = vQ[compId].get(qq);
                        int within = dQ[compId].get(qq);
                        int col = cQ[compId].get(qq);
                        color[fromV] = col;
                        for (int toV : allValid) {
                            if (Math.abs(distA[toV] - distA[fromV]) <= within &&
                                    Math.abs(distB[toV] - distB[fromV]) <= within) color[toV] = col;
                        }
                    }

                }
            }
            for (int i = 1; i <= N; ++i) {
                out.println(color[i]);
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

