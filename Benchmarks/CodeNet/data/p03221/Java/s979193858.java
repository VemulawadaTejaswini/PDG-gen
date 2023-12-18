import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.PriorityQueue;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.util.Comparator;
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
        CID solver = new CID();
        solver.solve(1, in, out);
        out.close();
    }

    static class CID {
        public String six(StringBuilder ans) {
            StringBuilder temp = new StringBuilder("");
            for (int i = ans.length(); i < 6; i++) temp.append("0");
            temp.append(ans.toString());
            return temp.toString();
        }

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            PriorityQueue<node> pq[] = new PriorityQueue[n];
            for (int i = 0; i < n; i++) {
                pq[i] = new PriorityQueue<node>(new Comparator<node>() {

                    public int compare(node o1, node o2) {
                        return o1.a - o2.a;
                    }
                });
            }
            String[] ans = new String[m];
            for (int i = 0; i < m; i++) {
                int p = in.nextInt();
                int y = in.nextInt();
                pq[p - 1].add(new node(y, i));
            }
            for (int i = 0; i < n; i++) {
                int x = 0;
                while (pq[i].size() > 0) {
                    node temp = pq[i].poll();
                    x++;
                    StringBuilder two = new StringBuilder(Integer.toString(x));
                    StringBuilder q = new StringBuilder(six(new StringBuilder(Integer.toString(i + 1))));
                    q.append(six(two));
                    ans[temp.b] = q.toString();
                }
            }
            for (int i = 0; i < m; i++) {
                out.println(ans[i]);
            }
        }

        class node {
            int a;
            int b;

            node(int a, int b) {
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

    }
}

