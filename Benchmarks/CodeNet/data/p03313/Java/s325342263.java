import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.io.InputStreamReader;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.util.Collections;
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
        EOrPlusMax solver = new EOrPlusMax();
        solver.solve(1, in, out);
        out.close();
    }

    static class EOrPlusMax {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int m = in.nextInt();
            int n = 1 << m;

            long[] a = in.nextLongArray(n);
            long base = (long) 1e9 + 1;
            for (int i = 0; i < n; i++) {
                a[i] = a[i] * base + i;
            }

            List<List<Long>> lists = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                lists.add(new ArrayList<>());
                lists.get(i).add(a[i]);
            }

            for (int i = 0; i < m; i++) {
                lists.get(1 << i).add(a[0]);
            }

            for (int i = 1; i < n; i++) {
                lists.set(i, new ArrayList<>(new TreeSet<>(lists.get(i))));
                Collections.sort(lists.get(i));
                lists.set(i, lists.get(i).subList(lists.get(i).size() - 2, lists.get(i).size()));
                for (int j = 0; j < m; j++) {
                    if ((i & 1 << j) == 0) {
                        lists.get(i | 1 << j).add(lists.get(i).get(0));
                        lists.get(i | 1 << j).add(lists.get(i).get(1));
                    }
                }
            }

            long max = 0;
            for (int i = 1; i < n; i++) {
                long x1 = lists.get(i).get(0) / base;
                long x2 = lists.get(i).get(1) / base;
                max = Math.max(max, x1 + x2);
                out.println(max);
            }
        }

    }

    static class InputReader {
        private BufferedReader br;
        private StringTokenizer st;

        public InputReader(InputStream inputStream) {
            br = new BufferedReader(new InputStreamReader(inputStream));
            st = new StringTokenizer("");
        }

        public String nextString() {
            while (!st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine(), " ");
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(nextString());
        }

        public long nextLong() {
            return Long.parseLong(nextString());
        }

        public long[] nextLongArray(int n) {
            long[] res = new long[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextLong();
            }
            return res;
        }

    }
}

