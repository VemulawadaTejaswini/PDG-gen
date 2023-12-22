import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.Map;
import java.io.IOException;
import java.util.HashMap;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.util.ArrayList;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        MyScanner in = new MyScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        E solver = new E();
        solver.solve(1, in, out);
        out.close();
    }

    static class E {
        long N;
        long X;
        long M;
        Map<Long, Long> map = new HashMap<>();

        public void solve(int testNumber, MyScanner in, PrintWriter out) {
            N = in.Long();
            X = in.Long();
            M = in.Long();

//        out.println(func1());
            out.println(func2());
        }

        long func2() {
            ArrayList<Long> list = new ArrayList<>();
            int loop = -1;
            for (long i = 1; i <= N; i++) {
                long temp = calc(i);
                if (list.contains(temp)) {
                    loop = list.indexOf(temp);
                    break;
                }
                list.add(temp);
            }
            long ret = 0;
            int size = list.size();
            if (N <= size) {
                for (int i = 0; i < N; i++) {
                    ret += list.get(i);
                }
            } else {
                long[] sum = new long[size + 1];
                for (int i = 0; i < size; i++) {
                    sum[i + 1] = sum[i] + list.get(i);
                }
                if (list.contains(0L)) {
                    ret = sum[size];
                } else {
                    ret = sum[loop] + (sum[size] - sum[loop]) * ((N - loop) / (size - loop));
                    int i = (int) ((N - loop) % (size - loop));
                    if (i > 0) {
                        ret += sum[loop + i] - sum[loop];
                    }
                }
            }
            return ret;
        }

        long calc(long n) {
            if (n == 1) return X;
            if (map.containsKey(n)) return map.get(n);
            long f = ((long) Math.pow(calc(n - 1), 2) % M);
            map.put(n, f);
            return f;
        }

    }

    static class MyScanner {
        private BufferedReader in;
        private StringTokenizer st;

        public MyScanner(InputStream stream) {
            in = new BufferedReader(new InputStreamReader(stream));
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    String rl = in.readLine();
                    if (rl == null) {
                        return null;
                    }
                    st = new StringTokenizer(rl);
                } catch (IOException e) {
                    return null;
                }
            }
            return st.nextToken();
        }

        public long Long() {
            return Long.parseLong(next());
        }

    }
}

