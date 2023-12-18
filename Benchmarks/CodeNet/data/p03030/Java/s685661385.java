import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashMap;
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
        BGuidebook solver = new BGuidebook();
        solver.solve(1, in, out);
        out.close();
    }

    static class BGuidebook {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            ArrayList<node> a = new ArrayList<>();
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) a.add(new node(in.next(), in.nextInt(), i));
            Collections.sort(a, new Comparator<node>() {

                public int compare(node o1, node o2) {
                    if (o1.x.compareTo(o2.x) == 0) {
                        return o2.val - o1.val;
                    } else {
                        return o1.x.compareTo(o2.x);
                    }
                }
            });
            for (int i = 0; i < n; i++) out.println(a.get(i).indi + 1);
        }

        class node {
            String x;
            int val;
            int indi;

            node(String x, int val, int indi) {
                this.x = x;
                this.val = val;
                this.indi = indi;
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

