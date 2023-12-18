import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author vikas.k
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        private final long MAXA = (long) (1e16 + 1000L);

        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            long K = in.nextLong();
            for (int i = 2; i <= 50; i++) {
                if (isSolvable(i, K)) {
                    long v = K / i;
                    List<Long> lst = new ArrayList<>();
                    for (int j = 0; j < i; j++) {
                        lst.add(v + 1);
                    }
                    //lst.forEach(a -> out.print(a+" "));
                    //out.println();
                    long rm = K % i;
                    for (int j = 0; j < rm; j++) {
                        long mn = Long.MAX_VALUE;
                        int id = 0;
                        for (int k = 0; k < i; k++) {
                            long u = lst.get(k);
                            lst.set(k, u - 1);
                            if (mn > u) {
                                mn = u;
                                id = k;
                            }
                        }
                        lst.set(id, mn + i);
                    }
                    out.println(i);
                    lst.forEach(a -> out.print(a + " "));
                    break;
                }
            }

        }

        private boolean isSolvable(int numElements, long moves) {
            long v = moves / numElements;
            long num = v + 1 + (moves % numElements);
            return num <= MAXA;
        }

    }

    static class FastScanner {
        private BufferedReader bufferedReader;
        private StringTokenizer stringTokenizer;

        public FastScanner(InputStream inputStream) {
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        }

        public String next() {
            if (stringTokenizer == null || !stringTokenizer.hasMoreElements()) {
                try {
                    stringTokenizer = new StringTokenizer(bufferedReader.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return stringTokenizer.nextToken();
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

    }
}

