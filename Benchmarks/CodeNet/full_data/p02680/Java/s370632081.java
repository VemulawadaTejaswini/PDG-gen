import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.PrintStream;
import java.util.Arrays;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.Function;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.AbstractCollection;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.util.ArrayDeque;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Eric
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        FSingleDot3 solver = new FSingleDot3();
        solver.solve(1, in, out);
        out.close();
    }

    static class FSingleDot3 {
        private static final Integer INF = 1_000_000_001;
        private long[] a;
        private long[] b;
        private long[] c;
        private long[] d;
        private long[] e;
        private long[] f;
        private int n;
        private int m;

        public void solve(int testNumber, FastReader in, PrintWriter out) {
            n = in.nextInt();
            m = in.nextInt();
            a = new long[n];
            b = new long[n];
            c = new long[n];
            d = new long[m];
            e = new long[m];
            f = new long[m];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextLong();
                b[i] = in.nextLong();
                c[i] = in.nextLong();
            }
            for (int i = 0; i < m; i++) {
                d[i] = in.nextLong();
                e[i] = in.nextLong();
                f[i] = in.nextLong();
            }

            long ans = solveMe();
            out.println(ans == -1 ? "INF" : ans);
            //out.print("Case #"+ testNumber + ": ");
        }

        int get(Long[] arr, long value) {
            if (arr[0] > value)
                return -1;
            int pos = binarySearchInt(i -> arr[i] <= value, 0, arr.length - 1);
            return arr[pos] != value ? -1 : pos;
        }

        private long solveMe() {
            ArrayList<Long> x = new ArrayList<>();
            ArrayList<Long> y = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                x.add(a[i]);
                x.add(b[i]);
                y.add(c[i]);
            }

            for (int i = 0; i < m; i++) {
                x.add(d[i]);
                y.add(e[i]);
                y.add(f[i]);
            }

            x.add(0L);
            y.add(0L);
            x.add((long) INF);
            x.add((long) -INF);
            y.add((long) INF);
            y.add((long) -INF);

            Long[] xs = new HashSet<>(x).toArray(new Long[0]);
            Long[] ys = new HashSet<>(y).toArray(new Long[0]);

            x = null;
            y = null;

            Arrays.sort(xs);
            Arrays.sort(ys);

            int[][] seg = new int[xs.length - 1][ys.length - 1];
            for (int i = 0; i < n; i++) {
                int xPos1 = get(xs, a[i]);
                int xPos2 = get(xs, b[i]);
                int yPos = get(ys, c[i]);
                for (int j = xPos1; j < xPos2; j++) {
                    seg[j][yPos] |= 1 << 2;
                    seg[j][yPos - 1] |= 1 << 0;
                }
            }

            for (int i = 0; i < m; i++) {
                int xPos = get(xs, d[i]);
                int yPos1 = get(ys, e[i]);
                int yPos2 = get(ys, f[i]);
                for (int j = yPos1; j < yPos2; j++) {
                    seg[xPos][j] |= 1 << 3;
                    seg[xPos - 1][j] |= 1 << 1;
                }
            }

            long area = 0;
            ArrayDeque<FSingleDot3.MyPair> queue = new ArrayDeque<>();
            boolean[][] visited = new boolean[xs.length - 1][ys.length - 1];

            queue.add(new FSingleDot3.MyPair(get(xs, 0), get(ys, 0)));
            visited[get(xs, 0)][get(ys, 0)] = true;
            int[][] moves = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

            while (!queue.isEmpty()) {
                FSingleDot3.MyPair curr = queue.poll();
                int oldX = (int) curr.first;
                int oldY = (int) curr.second;
                //d(s("pair", curr));
                if (oldX == 0 || oldY == 0 || oldX == visited.length - 1 || oldY == visited[0].length - 1)
                    return -1;
                area += (xs[oldX + 1] - xs[oldX]) * (ys[oldY + 1] - ys[oldY]);
                for (int i = 0; i < 4; i++) {
                    int newX = (int) (curr.first + moves[i][0]);
                    int newY = (int) (curr.second + moves[i][1]);

                    if (newX < 0 || newY < 0 || newX >= visited.length || newY >= visited[0].length)
                        continue;
                    if (!visited[newX][newY] && (seg[oldX][oldY] & (1 << i)) == 0) {
                        visited[newX][newY] = true;
                        queue.add(new FSingleDot3.MyPair(newX, newY));
                    }
                }
            }

            return area;


        }

        public static void assertTrue(boolean shouldBeTrue) {
            assertTrue(shouldBeTrue, "");
        }

        public static void assertTrue(boolean shouldBeTrue, String message) {
            if (!shouldBeTrue)
                throw new RuntimeException(message);
        }

        private int binarySearchInt(Function<Integer, Boolean> isOkFunction, int ok, int extremity) {
            return binarySearchLong(isOkFunction.compose(Long::intValue), ok, extremity).intValue();
        }

        private Long binarySearchLong(Function<Long, Boolean> isOkFunction, long ok, long extremity) {
            Function<Boolean, Integer> funct = (b -> b ? 1 : -1);
            return binarySearchLong(funct.compose(isOkFunction), ok, extremity, true);
        }

        private Long binarySearchLong(Function<Long, Integer> falseEqualTrueFunction, long ok, long extremity, boolean shouldBeCloseToOk) {
            assertTrue(falseEqualTrueFunction.apply(ok) >= 0);
            if (ok == extremity)
                return ok;
            long ans;
            Long ansEqual = null;
            if (ok < extremity) {
                long left = ok;
                long right = extremity;
                ans = left;
                while (left <= right) {
                    long mid = left + (right - left) / 2;
                    int res = falseEqualTrueFunction.apply(mid);
                    if (res >= 0) {
                        ans = mid;
                    }
                    if (res == 0)
                        ansEqual = mid;
                    if (res < 0 || (res == 0 && shouldBeCloseToOk)) {
                        right = mid - 1;
                    } else {
                        left = mid + 1;
                    }
                }
            } else {
                long left = extremity;
                long right = ok;
                ans = ok;
                while (left <= right) {
                    long mid = left + (right - left) / 2;
                    int res = falseEqualTrueFunction.apply(mid);
                    if (res >= 0) {
                        ans = mid;
                    }
                    if (res == 0)
                        ansEqual = mid;
                    if (res < 0 || (res == 0 && shouldBeCloseToOk)) {
                        left = mid + 1;
                    } else {
                        right = mid - 1;
                    }
                }
            }
            return ansEqual != null ? ansEqual : ans;
        }

        public static class MyPair implements Comparable<FSingleDot3.MyPair> {
            long first;
            long second;

            public MyPair(long first, long second) {
                this.first = first;
                this.second = second;
            }

            public String toString() {
                //return "[" + first + ", " + second + "]";
                return first + ";" + second;
            }

            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                FSingleDot3.MyPair myPair = (FSingleDot3.MyPair) o;
                return first == myPair.first &&
                        second == myPair.second;
            }

            public int hashCode() {
                return Objects.hash(first, second);
            }

            public int compareTo(FSingleDot3.MyPair p2) {
                int res = Long.compare(first, p2.first);
                return res != 0 ? res : Long.compare(second, p2.second);
            }

        }

    }

    static class FastReader {
        public BufferedReader br;
        public StringTokenizer st;
        String context = null;

        public FastReader(InputStream in) {
            this(new InputStreamReader(in));
        }

        public FastReader(InputStreamReader input) {
            br = new BufferedReader(input);
        }

        public String next() {
            if (context != null) {
                System.err.print("[" + context + "] Wait for input ...");
            }
            while (st == null || !st.hasMoreElements()) {
                try {
                    String s = br.readLine();
                    if (s == null)
                        return null;
                    st = new StringTokenizer(s);
                } catch (IOException e) {
                    e.printStackTrace();
                    throw new RuntimeException("Could not read");
                }
            }
            String res = st.nextToken();
            if (context != null) {
                System.err.println("[" + context + "] ... received : " + res);
            }
            return res;
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

    }
}

