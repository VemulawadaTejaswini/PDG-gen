import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.AbstractCollection;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.util.LinkedList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author kessido
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        FMonochromeCat solver = new FMonochromeCat();
        solver.solve(1, in, out);
        out.close();
    }

    static class FMonochromeCat {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.NextInt();
            Node[] nodes = new Node[n];
            for (int i = 0; i < n; i++) {
                nodes[i] = new Node();
            }
            for (int i = 0; i < n - 1; i++) {
                int u = in.NextInt() - 1;
                int v = in.NextInt() - 1;
                nodes[u].edges.add(nodes[v]);
                nodes[v].edges.add(nodes[u]);
            }
            char[] colors = in.next().toCharArray();
            for (int i = 0; i < n; i++) {
                nodes[i].isWhite = colors[i] == 'W' ? 1 : 0;
            }
            HashSet<Node> nodes1 = new HashSet<>(Arrays.asList(nodes));
            LinkedList<Node> q = new LinkedList<>();
            for (Node node : nodes) if (node.edges.size() == 1) q.add(node);
            while (!q.isEmpty()) {
                Node node = q.poll();
                if (node.isWhite == 0) {
                    nodes1.remove(node);
                    for (Node node1 : node.edges) {
                        node1.edges.remove(node);
                        if (node1.edges.size() == 1) q.add(node1);
                    }
                }
            }

            long res = Long.MAX_VALUE;
            for (Node node : nodes1) res = Math.min(res, node.calculateCostWhenStartingHere(null, false));
            if (nodes1.size() == 0) res = 0;
            out.println(res);
        }

        class Node {
            HashSet<Node> edges = new HashSet<>();
            int isWhite;
            ArrayList<HashMap<Node, Long>> costWithReturn = new ArrayList<>();
            ArrayList<HashMap<Node, Long>> costWithoutReturn = new ArrayList<>();

            public Node() {
                costWithReturn.add(new HashMap<>());
                costWithReturn.add(new HashMap<>());
                costWithoutReturn.add(new HashMap<>());
                costWithoutReturn.add(new HashMap<>());
            }

            public long calculateCostWhenStartingHere(Node parent, boolean shouldReturn) {
                HashMap<Node, Long> toCheck = shouldReturn ? costWithReturn.get(isWhite) : costWithoutReturn.get(isWhite);
                {
                    if (parent != null) {
                        Long res = toCheck.get(parent);
                        if (res != null) return res;
                    }
                }

                int isWhite = this.isWhite;
                long sum = 0;
                for (Node node : edges) {
                    if (node != parent) {
                        if (node.calculateCostWhenStartingHere(this, true) == 0) continue;
                        node.isWhite ^= 1;
                        sum += node.calculateCostWhenStartingHere(this, true) + 2;
                        node.isWhite ^= 1;
                        isWhite ^= 1;
                    }
                }
                long res = sum;
                if (isWhite == 1) res++;
                if (!shouldReturn) {
                    isWhite ^= 1;
                    for (Node node : edges) {
                        if (node != parent) {
                            if (node.calculateCostWhenStartingHere(this, true) == 0) continue;
                            long currentRes = sum;

                            node.isWhite ^= 1;
                            currentRes -= node.calculateCostWhenStartingHere(this, true) + 2;
                            currentRes += node.calculateCostWhenStartingHere(this, false) + 1;
                            node.isWhite ^= 1;

                            if (isWhite == 1) currentRes++;
                            res = Math.min(currentRes, res);
                        }
                    }
                }
                if (parent != null)
                    toCheck.put(parent, res);
                return res;
            }

        }

    }

    static class InputReader {
        BufferedReader reader;
        StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine(), " \t\n\r\f,");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int NextInt() {
            return Integer.parseInt(next());
        }

    }
}

