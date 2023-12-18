import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author amotoma3
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
        int maxDepth = 0;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int[] p = in.nextIntArray(n);
            List<Integer>[] graph = Stream.generate(ArrayList::new).limit(n + 1).toArray(List[]::new);
            for (int i = 0; i < n; i++) {
                graph[p[i]].add(i + 1);
            }

            int[] depth = new int[n + 1];
            rec(graph, 0, 0, depth);

            int[] cnt = new int[maxDepth + 1];
            List<Integer>[] list = Stream.generate(ArrayList::new).limit(maxDepth + 1).toArray(List[]::new);
            for (int i = 0; i <= n; i++) {
                list[depth[i]].add(i);
                cnt[depth[i]]++;
            }

            long MOD = 1_000_000_007;
            Modulo modulo = new Modulo(MOD);
            long ans = 0;
            for (int i = 0; i <= maxDepth; i++) {
                long tmp = modulo.pow(2, n + 1 - cnt[i]);
                long[] dpDeath = new long[n + 1];
                long[] dpOne = new long[n + 1];
                for (int x : list[i]) {
                    dpDeath[x] = 1;
                    dpOne[x] = 1;
                }
                for (int j = i - 1; j >= 0; j--) {
                    for (int x : list[j]) {
                        long deathMlt = 1;
                        for (int child : graph[x]) {
                            deathMlt = modulo.mlt(deathMlt, dpDeath[child]);
                        }
                        long sum = 1;
                        long oneSum = 0;
                        for (int child : graph[x]) {
                            sum = modulo.mlt(sum, dpOne[child] + dpDeath[child]);
                            oneSum = modulo.add(oneSum, modulo.mlt(dpOne[child], modulo.mlt(deathMlt, modulo.rev(dpDeath[child]))));
                        }
                        dpOne[x] = oneSum;
                        dpDeath[x] = modulo.sub(sum, oneSum);
                    }
                }
                ans = modulo.add(ans, modulo.mlt(tmp, dpOne[0]));
            }

            out.println(ans);
        }

        void rec(List<Integer>[] graph, int x, int d, int[] depth) {
            depth[x] = d;
            maxDepth = Math.max(maxDepth, d);
            for (int child : graph[x]) {
                rec(graph, child, d + 1, depth);
            }
        }

    }

    static class Modulo {
        long m;

        public Modulo(long m) {
            this.m = m;
        }

        public long add(long a, long b) {
            return (a + b) % m;
        }

        public long sub(long a, long b) {
            return (a - b + m) % m;
        }

        public long mlt(long a, long b) {
            return (a * b) % m;
        }

        public long rev(long a) {
            return pow(a, m - 2);
        }

        public long pow(long a, long x) {
            long ans = 1;
            while (x > 0) {
                if ((x & 1) != 0) {
                    ans = (ans * a) % m;
                }
                x >>= 1;
                a = (a * a) % m;
            }
            return ans;
        }

    }

    static class InputReader {
        BufferedReader in;
        StringTokenizer tok;

        public String nextString() {
            while (!tok.hasMoreTokens()) {
                try {
                    tok = new StringTokenizer(in.readLine(), " ");
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
            }
            return tok.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(nextString());
        }

        public int[] nextIntArray(int n) {
            int[] res = new int[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextInt();
            }
            return res;
        }

        public InputReader(InputStream inputStream) {
            in = new BufferedReader(new InputStreamReader(inputStream));
            tok = new StringTokenizer("");
        }

    }
}

