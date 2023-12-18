import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
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
            TaskE.Vertex[] vs = new TaskE.Vertex[n];
            String s = in.next();
            for (int i = 0; i < n; ++i) vs[i] = new TaskE.Vertex(s.charAt(i) - '0');
            for (int i = 0; i < n - 1; ++i) {
                TaskE.Vertex a = vs[in.nextInt() - 1];
                TaskE.Vertex b = vs[in.nextInt() - 1];
                TaskE.Edge ab = new TaskE.Edge();
                TaskE.Edge ba = new TaskE.Edge();
                ab.dest = b;
                ab.rev = ba;
                ba.dest = a;
                ba.rev = ab;
                a.outgo.add(ab);
                b.outgo.add(ba);
            }
            long res = Long.MAX_VALUE;
            for (TaskE.Vertex v : vs) {
                v.solve(null);
                if (v.minFreeMoves == 0) {
                    if (v.totalMoves % 2 != 0) throw new RuntimeException();
                    res = Math.min(res, v.totalMoves / 2);
                }
            }
            if (res == Long.MAX_VALUE) {
                res = -1;
            }
            out.println(res);
        }

        static class Edge {
            int numTokens = -1;
            long totalMoves = -1;
            long minFreeMoves = -1;
            long maxFreeMoves = -1;
            TaskE.Vertex dest;
            TaskE.Edge rev;

        }

        static class Vertex {
            int startingTokens;
            List<TaskE.Edge> outgo = new ArrayList<>();
            int numTokens = -1;
            long totalMoves = -1;
            long minFreeMoves = -1;
            long maxFreeMoves = -1;

            public Vertex(int startingTokens) {
                this.startingTokens = startingTokens;
            }

            public void solve(TaskE.Vertex parent) {
                numTokens = startingTokens;
                totalMoves = 0;
                long sumMaxes = 0;
                long largestMinPlusMax = 0;
                for (TaskE.Edge e : outgo) {
                    if (e.dest == parent) continue;
                    if (e.numTokens < 0) {
                        e.dest.solve(this);
                        e.numTokens = e.dest.numTokens;
                        e.totalMoves = e.dest.totalMoves;
                        e.minFreeMoves = e.dest.minFreeMoves;
                        e.maxFreeMoves = e.dest.maxFreeMoves;
                    }
                    numTokens += e.numTokens;
                    totalMoves += e.numTokens + e.totalMoves;
                    sumMaxes += e.maxFreeMoves + e.numTokens;
                    largestMinPlusMax = Math.max(largestMinPlusMax, e.maxFreeMoves + e.numTokens + e.maxFreeMoves + e.numTokens);
                }
                maxFreeMoves = sumMaxes;
                if (largestMinPlusMax > sumMaxes) {
                    minFreeMoves = largestMinPlusMax - sumMaxes;
                } else {
                    minFreeMoves = sumMaxes % 2;
                }
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

