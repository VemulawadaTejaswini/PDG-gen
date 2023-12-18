import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Set;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.StringTokenizer;
import java.util.Queue;
import java.io.BufferedReader;
import java.util.ArrayDeque;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author anand.oza
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ENonTriangularTriplets solver = new ENonTriangularTriplets();
        solver.solve(1, in, out);
        out.close();
    }

    static class ENonTriangularTriplets {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            long n = in.nextInt();
            long k = in.nextLong();

            long minN = (k - 1) * 2 + 1;
            if (minN > n) {
                out.println(-1);
                return;
            }

            long surplus = n - minN;
            n = minN;

            Queue<Long> a = new ArrayDeque<>();
            Queue<Long> b = new ArrayDeque<>();
            Set<Long> c = new HashSet<>();
            for (int i = 0; i < n; i++) {
                a.add(k + n - 1 - i);
            }
            for (int i = 0; i < n; i += 2) {
                b.add(k + n + i);
            }
            for (int i = 1; i < n; i += 2) {
                b.add(k + n + i);
            }
            for (int i = 0; i < n; i++) {
                c.add(k + 2 * n + i);
            }

            List<ENonTriangularTriplets.T> answer = new ArrayList<>();
            while (!a.isEmpty()) {
                long i = a.poll();
                long j = b.poll();
                c.remove(i + j);

                answer.add(new ENonTriangularTriplets.T(i, j, i + j));
            }

            if (surplus > 0) {
                for (ENonTriangularTriplets.T t : answer) {
                    t.a += surplus;
                    t.b += surplus * 2;
                    t.c += surplus * 3;
                }
            }

            n += surplus;

            for (int i = 0; i < surplus; i++) {
                answer.add(new ENonTriangularTriplets.T(k + i, k + n + i, k + 2 * n + i));
            }

            for (ENonTriangularTriplets.T t : answer) {
                out.println(t);
            }

        }

        static class T {
            long a;
            long b;
            long c;

            public T(long a, long b, long c) {
                this.a = a;
                this.b = b;
                this.c = c;
            }

            public String toString() {
                return Util.join(a, b, c);
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

    static class Util {
        public static String join(long... i) {
            StringBuilder sb = new StringBuilder();
            for (long o : i) {
                sb.append(o);
                sb.append(" ");
            }
            if (sb.length() > 0) {
                sb.deleteCharAt(sb.length() - 1);
            }
            return sb.toString();
        }

    }
}

