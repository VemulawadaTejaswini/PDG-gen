import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.util.ArrayDeque;
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
        Task solver = new Task();
        solver.solve(1, in, out);
        out.close();
    }

    static class Task {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int k = in.nextInt();
            ArrayList<Task.node> a = new ArrayList<Task.node>();
            ArrayDeque<Task.node> dq = new ArrayDeque<>();
            HashSet<Integer> hs = new HashSet<>();
            for (int i = 0; i < n; i++) {
                a.add(new Task.node(in.nextInt(), in.nextLong()));
            }
            Collections.sort(a, new Comparator<Task.node>() {

                public int compare(Task.node o1, Task.node o2) {
                    return (int) (o2.a - o1.a);
                }
            });
            long max = -1;
            long val = 0;
            for (int i = 0; i < k; i++) {
                val += a.get(i).a;
                if (hs.contains(a.get(i).b)) {
                    dq.add(a.get(i));
                } else {
                    hs.add(a.get(i).b);
                }
            }
            val += hs.size() * hs.size();
            int num = hs.size();
            max = val;
            for (int i = k; i < n; i++) {
                if (dq.size() == 0) break;
                if (hs.contains(a.get(i).b)) continue;
                else {
                    Task.node temp = dq.removeLast();
                    val += -temp.a + 2 * num + 1 + a.get(i).a;
                    hs.add(a.get(i).b);
                    num++;
                    max = Math.max(val, max);
                }
            }
            out.println(max);
        }

        static class node {
            long a;
            int b;

            node(int b, long a) {
                this.a = a;
                this.b = b;
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

        public long nextLong() {
            return Long.parseLong(next());
        }

    }
}

