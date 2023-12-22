import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.PriorityQueue;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.BufferedOutputStream;
import java.io.UncheckedIOException;
import java.util.AbstractCollection;
import java.util.List;
import java.nio.charset.Charset;
import java.util.StringTokenizer;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.util.Comparator;
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
        FMakingPalindrome solver = new FMakingPalindrome();
        solver.solve(1, in, out);
        out.close();
    }

    static class FMakingPalindrome {
        public void solve(int testNumber, LightScanner in, LightWriter out) {
            int n = in.ints();
            FMakingPalindrome.Node[] left = new FMakingPalindrome.Node[n], right = new FMakingPalindrome.Node[n];
            for (int i = 0; i < n; i++) {
                char[] s = in.chars();
                int m = s.length;
                long c = in.longs();
                left[i] = new FMakingPalindrome.Node(m, s, c);
                left[i].left = true;
                right[i] = new FMakingPalindrome.Node(m, s, c);
            }
            long ans = Long.MAX_VALUE;
            PriorityQueue<FMakingPalindrome.Node> q = new PriorityQueue<>(Comparator.comparing(node -> node.c));
            for (int i = 0; i < n; i++) {
                q.clear();
                q.offer(left[i]);
                while (!q.isEmpty()) {
                    FMakingPalindrome.Node node = q.poll();
                    if (node.n <= 1) {
                        ans = Math.min(ans, node.c);
                        break;
                    }
                    if (node.next == null) {
                        node.next = new ArrayList<>();
                        FMakingPalindrome.Node[] nodes = node.left ? right : left;
                        for (int j = 0; j < n; j++) {
                            FMakingPalindrome.Node p = node.pair(nodes[j]);
                            if (p != null) {
                                //System.out.println(node + "+" + nodes[j] + "->" + p);
                                node.next.add(p);
                            }
                        }
                    }
                    //System.out.println(node + "->" + node.next);
                    for (FMakingPalindrome.Node next : node.next) {
                        q.offer(next);
                    }
                }
            }
            out.ans(ans == Long.MAX_VALUE ? -1 : ans).ln();
        }

        private static class Node {
            int n;
            boolean left;
            char[] s;
            long c;
            List<FMakingPalindrome.Node> next;

            Node(long c) {
                this.n = 0;
                this.s = new char[0];
                this.c = c;
            }

            Node(int n, char[] s, long c) {
                this.n = n;
                this.s = s;
                this.c = c;
            }

            private FMakingPalindrome.Node pair(FMakingPalindrome.Node t) {
                if (left == t.left) return null;
                int m = t.n;
                int com = Math.min(n, m);
                for (int i = 0; i < com; i++) if (s[i] != t.s[m - 1 - i]) return null;
                if (n == m) return new FMakingPalindrome.Node(c + t.c);
                if (n < m) {
                    char[] nt = new char[m - n];
                    for (int i = 0; i < m - n; i++) {
                        nt[i] = t.s[m - n - 1 - i];
                    }
                    FMakingPalindrome.Node res = new FMakingPalindrome.Node(m - n, nt, c + t.c);
                    res.left = false;
                    return res;
                } else {
                    char[] nt = new char[n - m];
                    System.arraycopy(s, m, nt, 0, n - m);
                    FMakingPalindrome.Node res = new FMakingPalindrome.Node(n - m, nt, c + t.c);
                    res.left = true;
                    return res;
                }
            }

            public String toString() {
                return String.valueOf(s) + "(" + c + ")";
            }

        }

    }

    static class LightScanner implements AutoCloseable {
        private BufferedReader reader = null;
        private StringTokenizer tokenizer = null;

        public LightScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
        }

        public String string() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new UncheckedIOException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public char[] chars() {
            return string().toCharArray();
        }

        public int ints() {
            return Integer.parseInt(string());
        }

        public long longs() {
            return Long.parseLong(string());
        }

        public void close() {
            try {
                this.reader.close();
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
        }

    }

    static class LightWriter implements AutoCloseable {
        private final Writer out;
        private boolean autoflush = false;
        private boolean breaked = true;

        public LightWriter(Writer out) {
            this.out = out;
        }

        public LightWriter(OutputStream out) {
            this(new OutputStreamWriter(new BufferedOutputStream(out), Charset.defaultCharset()));
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
            print(System.lineSeparator());
            breaked = true;
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
}

