import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.stream.IntStream;
import java.util.Arrays;
import java.util.HashSet;
import java.nio.charset.Charset;
import java.util.StringTokenizer;
import java.io.OutputStreamWriter;
import java.io.OutputStream;
import java.io.BufferedWriter;
import java.util.Set;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Collectors;
import java.io.UncheckedIOException;
import java.util.List;
import java.util.stream.Stream;
import java.io.Writer;
import java.io.BufferedReader;
import java.util.regex.Pattern;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author mikit
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        LightScanner in = new LightScanner(inputStream);
        LightWriter out = new LightWriter(outputStream);
        GLongestPath solver = new GLongestPath();
        solver.solve(1, in, out);
        out.close();
    }

    static class GLongestPath {
        public void solve(int testNumber, LightScanner in, LightWriter out) {
            int n = in.ints(), m = in.ints();
            IntNodeSet<Long, Void> graph = new IntNodeSet<>(n);
            boolean[] outgoing = new boolean[n];
            Arrays.fill(outgoing, true);
            for (int i = 0; i < m; i++) {
                int x = in.ints() - 1, y = in.ints() - 1;
                outgoing[y] = false;
                graph.addDirectedEdge(x, y);
            }
            long ans = 0;
            for (int i = 0; i < n; i++) {
                if (outgoing[i]) {
                    ans = Math.max(ans, dfs(graph.getNode(i), 0));
                }
            }
            out.ans(ans).ln();
        }

        private static long dfs(Node<Long, IntEdge<Long, Void>> node, long depth) {
            long ans = 0;
            for (IntEdge<Long, Void> edge : node.getEdges()) {
                Node<Long, IntEdge<Long, Void>> child = edge.getTo();
                if (child.getMeta() == null || child.getMeta() <= depth) {
                    child.setMeta(depth + 1L);
                    ans = Math.max(ans, dfs(child, depth + 1L) + 1);
                }
            }
            return ans;
        }

    }

    static interface Graph {
    }

    static class Edge<N, E extends Edge<N, E>> {
        private final Node<N, E> from;
        private final Node<N, E> to;

        public Edge(Node<N, E> from, Node<N, E> to) {
            this.from = from;
            this.to = to;
        }

        public Node<N, E> getTo() {
            return to;
        }

    }

    static final class IntNodeSet<N, E> extends NodeSet<N, IntEdge<N, E>> implements IntGraph {
        public IntNodeSet(int n) {
            super(n);
        }

        public void addDirectedEdge(int from, int to, long weight) {
            IntEdge<N, E> e = new IntEdge<>(nodes.get(from), nodes.get(to), weight);
            nodes.get(from).addEdge(e);
        }

    }

    static interface IntGraph extends Graph {
        void addDirectedEdge(int from, int to, long weight);

        default void addDirectedEdge(int from, int to) {
            addDirectedEdge(from, to, 1);
        }

    }

    static class Node<N, E extends Edge<N, E>> {
        private final int index;
        private final Set<E> edges = new HashSet<>();
        private N meta;

        public Node(int index) {
            this.index = index;
        }

        public N getMeta() {
            return meta;
        }

        public void setMeta(N meta) {
            this.meta = meta;
        }

        void addEdge(E e) {
            edges.add(e);
        }

        public Set<E> getEdges() {
            return edges;
        }

        public String toString() {
            return index + "(" + meta + ")";
        }

    }

    static class LightWriter implements AutoCloseable {
        private static final String DEBUG_PROPERTY = "debug";
        private static final String DEBUG_CALL_PATTERN = "^.+\\.debug\\(([a-zA-Z0-9]+)\\);.*$";
        private static Pattern debugRegex;
        private final Writer out;
        private boolean autoflush = false;
        private boolean debug = false;
        private boolean breaked = true;
        private final String src;

        public LightWriter(Writer out) {
            this.out = out;
            src = System.getProperty(DEBUG_PROPERTY);
            if (src != null) {
                debug = true;
                if (debugRegex == null) {
                    debugRegex = Pattern.compile(DEBUG_CALL_PATTERN);
                }
            }
        }

        public LightWriter(OutputStream out) {
            this(new BufferedWriter(new OutputStreamWriter(out, Charset.defaultCharset())));
        }

        public LightWriter print(char c) {
            try {
                out.write(c);
                breaked = false;
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
            return this;
        }

        public LightWriter print(String s) {
            try {
                out.write(s, 0, s.length());
                breaked = false;
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
            return this;
        }

        public LightWriter ans(String s) {
            if (!breaked) {
                print(' ');
            }
            return print(s);
        }

        public LightWriter ans(long l) {
            return ans(Long.toString(l));
        }

        public LightWriter ln() {
            breaked = true;
            print(System.lineSeparator());
            if (autoflush) {
                try {
                    out.flush();
                } catch (IOException ex) {
                    throw new UncheckedIOException(ex);
                }
            }
            return this;
        }

        public void close() {
            try {
                out.close();
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
        }

    }

    static class NodeSet<N, E extends Edge<N, E>> {
        final int n;
        final List<Node<N, E>> nodes;

        NodeSet(int n) {
            this.n = n;
            this.nodes = IntStream.range(0, n).mapToObj(Node<N, E>::new).collect(Collectors.toList());
        }

        public Node<N, E> getNode(int index) {
            return nodes.get(index);
        }

        public String toString() {
            return nodes.toString();
        }

    }

    static class IntEdge<N, E> extends Edge<N, IntEdge<N, E>> {
        private final long w;

        public IntEdge(Node<N, IntEdge<N, E>> from, Node<N, IntEdge<N, E>> to, long w) {
            super(from, to);
            this.w = w;
        }

    }

    static class LightScanner {
        private BufferedReader reader = null;
        private StringTokenizer tokenizer = null;

        public LightScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
        }

        public String string() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new UncheckedIOException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int ints() {
            return Integer.parseInt(string());
        }

    }
}

