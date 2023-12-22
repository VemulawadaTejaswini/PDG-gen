import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.PrintStream;
import java.util.Arrays;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.TreeMap;
import java.util.StringTokenizer;
import java.util.Map.Entry;
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
        FSingleDot2 solver = new FSingleDot2();
        solver.solve(1, in, out);
        out.close();
    }

    static class FSingleDot2 {
        private static final Long INF = 1_000_000_001L;
        private FSingleDot2.Tuple[] abc;
        private FSingleDot2.Tuple[] def;
        private int n;
        private int m;
        private boolean[][] segAtX;
        private boolean[][] segAtY;
        private long area;
        private boolean[][] visited;
        private TreeMap<Long, Integer> setX;
        private TreeMap<Long, Integer> setY;
        private long[] posY;
        private long[] posX;

        public void solve(int testNumber, FastReader in, PrintWriter out) {
            n = in.nextInt();
            m = in.nextInt();

            abc = new FSingleDot2.Tuple[n];
            def = new FSingleDot2.Tuple[m];

            for (int i = 0; i < n; i++) {
                abc[i] = new FSingleDot2.Tuple(in.nextInt(), in.nextInt(), in.nextInt());
            }
            for (int i = 0; i < m; i++) {
                def[i] = new FSingleDot2.Tuple(in.nextInt(), in.nextInt(), in.nextInt());
            }

            long ans = solveMe();
            out.println(ans == -1 ? "INF" : ans);

            //out.print("Case #"+ testNumber + ": ");
        }

        private long solveMe() {
            setX = new TreeMap<>();
            setY = new TreeMap<>();
            for (int i = 0; i < n; i++) {
                setX.put((long) (Integer) abc[i].first(), null);
                setX.put((long) (Integer) abc[i].second(), null);
                setY.put((long) (Integer) abc[i].third(), null);
            }
            for (int i = 0; i < m; i++) {
                setX.put((long) (Integer) def[i].first(), null);
                setY.put((long) (Integer) def[i].second(), null);
                setY.put((long) (Integer) def[i].third(), null);
            }

            setX.put(-INF, null);
            setX.put(INF, null);
            setY.put(-INF, null);
            setY.put(INF, null);
            setX.put(0L, null);
            setY.put(0L, null);

            int iPos = 0;
            posX = new long[setX.size()];
            for (Entry<Long, Integer> entry : setX.entrySet()) {
                entry.setValue(iPos);
                posX[iPos] = entry.getKey();
                iPos++;
            }

            iPos = 0;
            posY = new long[setY.size()];
            for (Entry<Long, Integer> entry : setY.entrySet()) {
                entry.setValue(iPos);
                posY[iPos] = entry.getKey();
                iPos++;
            }

            segAtX = new boolean[setX.size()][setY.size() + 1];
            segAtY = new boolean[setY.size()][setX.size() + 1];

            for (int i = 0; i < m; i++) {
                int xPosition = setX.get((long) (Integer) def[i].first());
                int startPosition = setY.get((long) (Integer) def[i].second());
                int endPosition = setY.get((long) (Integer) def[i].third());
                for (int j = startPosition; j < endPosition; j++) {
                    segAtX[xPosition][j] = true;
                }
            }

            for (int i = 0; i < n; i++) {
                int yPosition = setY.get((long) (Integer) abc[i].third());
                int startPosition = setX.get((long) (Integer) abc[i].first());
                int endPosition = setX.get((long) (Integer) abc[i].second());
                for (int j = startPosition; j < endPosition; j++) {
                    segAtY[yPosition][j] = true;
                }
            }

            //d(s("segAtX", stringMeDeb(toArray(segAtX))));
            //d(s("segAtY", stringMeDeb(toArray(segAtY))));

            area = 0;
            visited = new boolean[setX.size() - 1][setY.size() - 1];
            dfs(setX.get(0L), setY.get(0L));
            return area;
        }

        private void dfs(int x, int y) {
            ArrayDeque<FSingleDot2.MyPair> queue = new ArrayDeque<>();
            queue.add(new FSingleDot2.MyPair(x, y));
            visited[x][y] = true;
            while (!queue.isEmpty()) {
                FSingleDot2.MyPair curr = queue.pop();
                // d(s("pair", curr));
                x = (int) curr.first;
                y = (int) curr.second;
                if (x >= visited.length || x < 0 || y >= visited[0].length || y < 0) {
                    continue;
                }

                if (x == visited.length - 1 || x == 0 || y == visited[0].length - 1 || y == 0) {
                    area = -1;
                    break;
                }

                area += (posX[x + 1] - posX[x]) * (posY[y + 1] - posY[y]);

                if (!segAtX[x][y] && !visited[x - 1][y]) {
                    queue.add(new FSingleDot2.MyPair(x - 1, y));
                    visited[x - 1][y] = true;
                }
                if (!segAtX[x + 1][y] && !visited[x + 1][y]) {
                    queue.add(new FSingleDot2.MyPair(x + 1, y));
                    visited[x + 1][y] = true;
                }
                if (!segAtY[y][x] && !visited[x][y - 1]) {
                    queue.add(new FSingleDot2.MyPair(x, y - 1));
                    visited[x][y - 1] = true;
                }
                if (!segAtY[y + 1][x] && !visited[x][y + 1]) {
                    queue.add(new FSingleDot2.MyPair(x, y + 1));
                    visited[x][y + 1] = true;
                }
            }

        }

        public static <T> String stringMe(T[] a, String separator) {
            int n = a.length;
            StringBuilder res = new StringBuilder();
            for (int i = 0; i < n; i++) {
                if (i > 0)
                    res.append(separator);
                res.append(a[i]);
            }
            return res.toString();
        }

        public static class MyPair implements Comparable<FSingleDot2.MyPair> {
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
                FSingleDot2.MyPair myPair = (FSingleDot2.MyPair) o;
                return first == myPair.first &&
                        second == myPair.second;
            }

            public int hashCode() {
                return Objects.hash(first, second);
            }

            public int compareTo(FSingleDot2.MyPair p2) {
                int res = Long.compare(first, p2.first);
                return res != 0 ? res : Long.compare(second, p2.second);
            }

        }

        public static class Tuple implements Comparable<FSingleDot2.Tuple> {
            Object[] elements;

            public Tuple(Object... elements) {
                this.elements = elements;
            }

            public Object first() {
                return elements[0];
            }

            public Object second() {
                return elements[1];
            }

            public Object third() {
                return elements[2];
            }

            public String toString() {
                //return Arrays.deepToString(elements);
                return stringMe(elements, ";");
            }

            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                FSingleDot2.Tuple tuple = (FSingleDot2.Tuple) o;
                return Arrays.equals(elements, tuple.elements);
            }

            public int hashCode() {
                return Objects.hash(elements);
            }

            public int compareTo(FSingleDot2.Tuple t2) {
                if (t2.elements.length != elements.length)
                    throw new RuntimeException("Elements has 2 different sizes!");
                if (getClass() != t2.getClass())
                    throw new RuntimeException("Elements are not of the same class!");
                for (int i = 0; i < elements.length; i++) {
                    if (!(elements[i] instanceof Comparable)) {
                        throw new RuntimeException("Element is not comparable!");
                    }
                    int val = ((Comparable) elements[i]).compareTo(t2.elements[i]);
                    if (val != 0)
                        return val;
                }
                return 0;
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

    }
}

