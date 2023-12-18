import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Collection;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.BitSet;
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
        ECompleteCompress solver = new ECompleteCompress();
        solver.solve(1, in, out);
        out.close();
    }

    static class ECompleteCompress {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            char[] sChars = in.next().toCharArray();
            int[] s = new int[n];
            for (int i = 0; i < n; i++) {
                s[i] = sChars[i] == '1' ? 1 : 0;
            }

            int[] a = new int[n - 1];
            int[] b = new int[n - 1];

            List<Integer>[] edges = new List[n];
            for (int i = 0; i < n; i++) {
                edges[i] = new ArrayList<>();
            }

            for (int i = 0; i < n - 1; i++) {
                a[i] = in.nextInt() - 1;
                b[i] = in.nextInt() - 1;
                edges[a[i]].add(i);
                edges[b[i]].add(i);
            }

            int answer = Integer.MAX_VALUE;
            for (int center = 0; center < n; center++) {
                int branchCount = edges[center].size();
                int[] branches = new int[n];
                for (int i = 0; i < branchCount; i++) {
                    int e = edges[center].get(i);
                    int root = a[e] + b[e] - center;
                    BitSet visited = new BitSet();
                    visited.set(center);

                    Queue<ECompleteCompress.Node> q = new ArrayDeque<>();
                    q.add(new ECompleteCompress.Node(root, 1));
                    visited.set(root);

                    while (!q.isEmpty()) {
                        ECompleteCompress.Node cur = q.poll();
                        branches[root] += s[cur.index] * cur.dist;

                        for (int nextEdge : edges[cur.index]) {
                            int next = a[nextEdge] + b[nextEdge] - cur.index;
                            if (!visited.get(next)) {
                                q.add(new ECompleteCompress.Node(next, cur.dist + 1));
                                visited.set(next);
                            }
                        }
                    }
                }

                int branchTotal = 0;
                for (int branch : branches) {
                    branchTotal += branch;
                }

                if (branchTotal % 2 != 0) {
                    continue;
                }

                int maxBranch = 0;
                for (int branch : branches) {
                    maxBranch = Math.max(maxBranch, branch);
                }

                if (maxBranch > branchTotal / 2) {
                    continue;
                }

                answer = Math.min(answer, branchTotal / 2);
            }

            if (answer == Integer.MAX_VALUE) {
                answer = -1;
            }
            out.println(answer);
        }

        static class Node {
            final int index;
            final int dist;

            Node(int index, int dist) {
                this.index = index;
                this.dist = dist;
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

