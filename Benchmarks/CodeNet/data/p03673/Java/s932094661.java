import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.Collection;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author MaxHeap
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, FastReader in, PrintWriter out) {
            int n = in.nextInt();
            int[] arr = new int[n + 1];
            for (int i = 1; i <= n; i++) arr[i] = in.nextInt();
            ArrayList<Integer> res = new ArrayList<>();
            if (n % 2 == 0) {
                for (int i = n; i >= 2; i -= 2) res.add(arr[i]);
                for (int i = 1; i <= n - 1; i += 2) res.add(arr[i]);
            } else {
                for (int i = n; i >= 1; i -= 2) res.add(arr[i]);
                for (int i = 2; i <= n - 1; i += 2) res.add(arr[i]);
            }
            out.println(StringUtils.join(res));
        }

    }

    static class FastReader {
        BufferedReader reader;
        StringTokenizer st;

        public FastReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream));
            st = null;
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    String line = reader.readLine();
                    if (line == null) {
                        return null;
                    }
                    st = new StringTokenizer(line);
                } catch (Exception e) {
                    throw new RuntimeException();
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }

    static class StringUtils {
        public static <E> String join(Collection<E> collection, String delim) {
            StringBuilder sb = new StringBuilder();
            for (E o : collection) {
                sb.append(o);
                sb.append(delim);
            }
            return sb.toString().trim();
        }

        public static <E> String join(Collection<E> collection) {
            return join(collection, " ");
        }

    }
}

