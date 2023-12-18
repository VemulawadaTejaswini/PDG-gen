import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.util.Comparator;
import java.util.Collections;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Jaynil
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DIntegerCards solver = new DIntegerCards();
        solver.solve(1, in, out);
        out.close();
    }

    static class DIntegerCards {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            ArrayList<Integer> a = new ArrayList<>();
            ArrayList<node> b = new ArrayList<>();
            for (int i = 0; i < n; i++) a.add(in.nextInt());
            for (int i = 0; i < m; i++) {
                b.add(new node(in.nextInt(), in.nextInt()));
            }
            Collections.sort(a);
            Collections.sort(b, new Comparator<node>() {

                public int compare(node o1, node o2) {
                    return o2.c - o1.c;
                }
            });
            int j = 0;
            for (int i = 0; i < m; i++) {
                while (j < n && b.get(i).b > 0) {
                    if (a.get(j) < b.get(i).c) {
                        a.set(j, b.get(i).c);
                        b.get(i).b = b.get(i).b - 1;
                    }
                    j++;
                }
            }
            long ans = 0;
            for (int i = 0; i < n; i++) ans += a.get(i);
            out.println(ans);
        }

        class node {
            int b;
            int c;

            node(int b, int c) {
                this.b = b;
                this.c = c;
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

