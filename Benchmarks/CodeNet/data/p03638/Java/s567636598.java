import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collection;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.util.Queue;
import java.util.ArrayDeque;
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
        GridColoring solver = new GridColoring();
        solver.solve(1, in, out);
        out.close();
    }

    static class GridColoring {
        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};

        public void solve(int testNumber, FastReader in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            int count = in.nextInt();
            int[] a = new int[count + 1];
            for (int i = 1; i <= count; i++) a[i] = in.nextInt();
            int[][] res = new int[n][m];
            IntPair cur = null;
            for (int[] temp : res) Arrays.fill(temp, -1);
            for (int i = 1; i <= count; i++) {
                if (cur == null) {
                    cur = fill(res, 0, 0, i, a[i], n, m);
                } else {
                    cur = fill(res, cur.getFirst(), cur.getSecond(), i, a[i], n, m);
                }
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (j > 0) out.print(" ");
                    out.print(res[i][j]);
                }
                out.println();
            }

        }

        IntPair fill(int[][] res, int sx, int sy, int num, int times, int n, int m) {
            Queue<IntPair> pairs = new ArrayDeque<>();
            pairs.add(new IntPair(sx, sy));
            if (times > 0) {
                res[sx][sy] = num;
                --times;
            }
            while (!pairs.isEmpty()) {
                IntPair cur = pairs.poll();
                for (int i = 0; i < 4; i++) {
                    int xx = cur.getFirst() + dx[i];
                    int yy = cur.getSecond() + dy[i];
                    if (xx < 0 || yy < 0 || xx >= n || yy >= m || res[xx][yy] != -1) continue;
                    if (times == 0) return new IntPair(xx, yy);
                    res[xx][yy] = num;
                    --times;
                    pairs.add(new IntPair(xx, yy));
                }
            }
            return null;
        }

    }

    static class IntPair implements Comparable<IntPair> {
        int first;
        int second;

        public IntPair(int first, int second) {
            this.first = first;
            this.second = second;
        }


        public int compareTo(IntPair a) {
            if (second == a.second) {
                return Integer.compare(first, a.first);
            }
            return Integer.compare(second, a.second);
        }


        public String toString() {
            return "<" + first + ", " + second + ">";
        }


        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            IntPair a = (IntPair) o;

            if (first != a.first) return false;
            return second == a.second;
        }


        public int hashCode() {
            int result = first;
            result = 31 * result + second;
            return result;
        }

        public int getFirst() {
            return first;
        }

        public int getSecond() {
            return second;
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
}

