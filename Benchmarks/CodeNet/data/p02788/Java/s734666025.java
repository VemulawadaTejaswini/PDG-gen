import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.util.Comparator;
import java.io.InputStream;

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
        F solver = new F();
        solver.solve(1, in, out);
        out.close();
    }

    static class F {
        public void solve(int testNumber, MyScanner in, PrintWriter out) {
            int N = in.nextInt();
            long D = in.nextLong();
            long A = in.nextLong();
            List<Monster> list = new ArrayList<>(N);
            long maxX = 0;
            for (int i = 0; i < N; i++) {
                long X = in.nextLong();
                maxX = Math.max(maxX, X);
                long L = in.nextLong();
                list.add(new Monster(X, (long) Math.ceil(L / (double) A)));
            }
            list.sort(Comparator.comparingLong(o -> o.X));

            long count = 0;
            long bcnt = 0;
            int index = 0;
            long bcenter = -1;
            while (index < N) {
                long center = list.get(index).X + D;
                long cnt = 0;
                while (index < N) {
                    Monster m = list.get(index);
                    if (m.X > center) {
                        break;
                    }
                    long l = bcenter + D > m.X ? bcnt : 0;
                    cnt = Math.max(cnt, m.H - l);
                    index++;
                }
                count += cnt;
                while (index < N) {
                    Monster m = list.get(index);
                    if (center + D < m.X || cnt < m.H) {
                        break;
                    }
                    index++;
                }
                bcnt = cnt;
                bcenter = center;
            }
            out.println(count);
        }

        class Monster {
            long X;
            long H;

            Monster(long x, long h) {
                X = x;
                H = h;
            }

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
                    throw new RuntimeException(e);
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

    }
}

