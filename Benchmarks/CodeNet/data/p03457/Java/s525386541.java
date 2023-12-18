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
 *
 * @author vikas.k
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int n = in.nextInt();
            List<Position> gv = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                gv.add(new Position(in.nextInt(), in.nextInt(), in.nextInt()));
            }

            gv.sort(Comparator.comparingInt(u -> u.t));
            int u = 0;
            int v = 0;
            int T = 0;
            for (int i = 0; i < n; i++) {
                Position p = gv.get(i);
                int nt = Math.abs(p.x - u) + Math.abs(p.y - v);
                if (T + nt > p.t || (p.x + p.y) % 2 != (p.t) % 2) {
                    out.print("No");
                    return;
                } else {
                    u = p.x;
                    v = p.y;
                    T = p.t;
                }
            }
            out.print("Yes");
        }

        private class Position {
            int t;
            int x;
            int y;

            public Position(int t, int x, int y) {
                this.t = t;
                this.x = x;
                this.y = y;
            }

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

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

