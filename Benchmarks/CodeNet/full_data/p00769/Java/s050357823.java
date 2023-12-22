import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Stack;
import java.util.ArrayList;
import java.util.Vector;
import java.nio.charset.Charset;
import java.util.StringTokenizer;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.OutputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.List;
import java.io.Writer;
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
        HierarchicalDemocracy solver = new HierarchicalDemocracy();
        solver.solve(1, in, out);
        out.close();
    }

    static class HierarchicalDemocracy {
        public void solve(int testNumber, LightScanner in, LightWriter out) {
            int qNum = in.ints();
            for (int query = 0; query < qNum; query++) {
                String s = in.nextLine();
                Stack<HierarchicalDemocracy.Token> stack = new Stack<>();
                List<HierarchicalDemocracy.Token> list = new ArrayList<>();
                StringBuilder dbg = new StringBuilder();

                int depth = 0;
                long num = 0;
                for (int i = 0; i < s.length(); i++) {
                    dbg.append((char) ('0' + depth));
                    //System.out.println("q=" + query + "size=" + stack.size());
                    char c = s.charAt(i);
                    if ('0' <= c && c <= '9') {
                        num *= 10;
                        num += (c - '0');
                    } else if (c == '[') {
                        depth++;
                    } else {
                        if (num > 0) {
                            stack.push(new HierarchicalDemocracy.Token(depth, (num + 1) / 2));
                            num = 0;
                            depth--;
                        } else {
                            list.clear();
                            while (!stack.isEmpty() && stack.peek().depth == depth + 1) {
                                list.add(stack.pop());
                            }
                            list.sort(Comparator.comparing(t -> t.num));

                            if (list.size() % 2 == 0 || list.size() <= 1) {
                                System.out.println("list=" + list);
                                System.out.println("stack=" + stack);
                                System.out.println("depth=" + depth + " i=" + i);
                                System.out.println(s);
                                System.out.println(dbg);
                                throw new RuntimeException("Inner size is " + list.size());
                            }

                            long ans = 0;
                            for (int j = 0; j < (list.size() + 1) / 2; j++) {
                                ans += list.get(j).num;
                            }

                            stack.push(new HierarchicalDemocracy.Token(depth, ans));
                            depth--;
                        }
                        //System.out.println("NEW TOKEN depth="+stack.peek().depth+" ans="+stack.peek().num);
                    }
                }
                if (stack.size() != 1 || stack.peek().depth != 1) {
                    System.out.println(stack);
                    throw new RuntimeException("i=" + query + " " + stack.size());
                }
                out.ansln(stack.peek().num);
            }
        }

        private static class Token {
            private final int depth;
            private final long num;

            public Token(int depth, long num) {
                this.depth = depth;
                this.num = num;
            }

            public String toString() {
                return "Token{" +
                        "depth=" + depth +
                        ", num=" + num +
                        '}';
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

        public LightWriter ansln(long... n) {
            for (long n1 : n) {
                ans(n1).ln();
            }
            return this;
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

        public String nextLine() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    return reader.readLine();
                } catch (IOException e) {
                    throw new UncheckedIOException(e);
                }
            }
            return tokenizer.nextToken("\n");
        }

        public int ints() {
            return Integer.parseInt(string());
        }

    }
}


