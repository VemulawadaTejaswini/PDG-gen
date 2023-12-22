import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;

public class Main {
    static In in = new In();
    static Out out = new Out();
    static final long inf = 0x1fffffffffffffffL;
    static final int iinf = 0x3fffffff;
    static long mod = 1000000007;

    void solve() {
        int n = in.nextInt();
        IntPair[] pos = new IntPair[n];
        int[] d = new int[n];
        for (int i = 0; i < n; i++) {
            pos[i] = new IntPair(in.nextInt() * 5, in.nextInt() * 5);
            d[i] = "URDL".indexOf(in.next().charAt(0));
        }
        int ans1 = iinf;
        int ans2 = iinf;
        int ans3 = iinf;
        for (int i = 0; i < 4; i++) {
            {
                Map<Integer, TreeSet<Integer>> uMap = new HashMap<>();
                Map<Integer, TreeSet<Integer>> rMap = new HashMap<>();
                Map<Integer, TreeSet<Integer>> dMap = new HashMap<>();
                Map<Integer, TreeSet<Integer>> lMap = new HashMap<>();
                for (int i = 0; i < n; i++) {
                    if (d[i] == 0) {
                        uMap.computeIfAbsent(pos[i].x, key -> new TreeSet<>()).add(pos[i].y);
                    } else if (d[i] == 1) {
                        rMap.computeIfAbsent(pos[i].y, key -> new TreeSet<>()).add(pos[i].x);
                    } else if (d[i] == 2) {
                        dMap.computeIfAbsent(pos[i].x, key -> new TreeSet<>()).add(pos[i].y);
                    } else if (d[i] == 3) {
                        lMap.computeIfAbsent(pos[i].y, key -> new TreeSet<>()).add(pos[i].x);
                    }
                }
                for (Map.Entry<Integer, TreeSet<Integer>> entry : uMap.entrySet()) {
                    if (dMap.containsKey(entry.getKey())) {
                        TreeSet<Integer> uSet = entry.getValue();
                        TreeSet<Integer> dSet = dMap.get(entry.getKey());
                        for (Integer y : uSet) {
                            Integer higher = dSet.higher(y);
                            if (higher != null) {
                                ans1 = Math.min(ans1, higher - y);
                            }
                        }
                    }
                }
                for (Map.Entry<Integer, TreeSet<Integer>> entry : rMap.entrySet()) {
                    if (lMap.containsKey(entry.getKey())) {
                        TreeSet<Integer> rSet = entry.getValue();
                        TreeSet<Integer> lSet = lMap.get(entry.getKey());
                        for (Integer x : rSet) {
                            Integer higher = lSet.higher(x);
                            if (higher != null) {
                                ans1 = Math.min(ans1, higher - x);
                            }
                        }
                    }
                }
            }
            {
                Map<Integer, TreeSet<Integer>> rMap = new HashMap<>();
                Map<Integer, TreeSet<Integer>> lMap = new HashMap<>();
                for (int i = 0; i < n; i++) {
                    if (d[i] == 0) {
                        rMap.computeIfAbsent(pos[i].x - pos[i].y, key -> new TreeSet<>()).add(pos[i].x + pos[i].y);
                    } else if (d[i] == 1) {
                        rMap.computeIfAbsent(pos[i].x - pos[i].y, key -> new TreeSet<>()).add(pos[i].x + pos[i].y);
                    } else if (d[i] == 2) {
                        lMap.computeIfAbsent(pos[i].x - pos[i].y, key -> new TreeSet<>()).add(pos[i].x + pos[i].y);
                    } else if (d[i] == 3) {
                        lMap.computeIfAbsent(pos[i].x - pos[i].y, key -> new TreeSet<>()).add(pos[i].x + pos[i].y);
                    }
                }
                for (Map.Entry<Integer, TreeSet<Integer>> entry : rMap.entrySet()) {
                    if (lMap.containsKey(entry.getKey())) {
                        TreeSet<Integer> rSet = entry.getValue();
                        TreeSet<Integer> lSet = lMap.get(entry.getKey());
                        for (Integer x : rSet) {
                            Integer higher = lSet.higher(x);
                            if (higher != null) {
                                ans2 = Math.min(ans2, higher - x);
                            }
                        }
                    }
                }
            }
            {
                Map<Integer, TreeSet<Integer>> uMap = new HashMap<>();
                Map<Integer, TreeSet<Integer>> dMap = new HashMap<>();
                for (int i = 0; i < n; i++) {
                    if (d[i] == 0) {
                        dMap.computeIfAbsent(pos[i].x + pos[i].y, key -> new TreeSet<>()).add(pos[i].x - pos[i].y);
                    } else if (d[i] == 1) {
                        uMap.computeIfAbsent(pos[i].x + pos[i].y, key -> new TreeSet<>()).add(pos[i].x - pos[i].y);
                    } else if (d[i] == 2) {
                        uMap.computeIfAbsent(pos[i].x + pos[i].y, key -> new TreeSet<>()).add(pos[i].x - pos[i].y);
                    } else if (d[i] == 3) {
                        dMap.computeIfAbsent(pos[i].x + pos[i].y, key -> new TreeSet<>()).add(pos[i].x - pos[i].y);
                    }
                }
                for (Map.Entry<Integer, TreeSet<Integer>> entry : uMap.entrySet()) {
                    if (dMap.containsKey(entry.getKey())) {
                        TreeSet<Integer> uSet = entry.getValue();
                        TreeSet<Integer> dSet = dMap.get(entry.getKey());
                        for (Integer y : uSet) {
                            Integer higher = dSet.higher(y);
                            if (higher != null) {
                                ans3 = Math.min(ans3, higher - y);
                            }
                        }
                    }
                }
            }
            for (int j = 0; j < n; j++) {
                pos[i] = new IntPair(pos[j].y, 300000 - pos[j].x);
                d[j] = (d[j] + 1) % 4;
            }
        }
        if (ans1 == iinf && ans2 == iinf && ans3 == iinf) {
            out.println("SAFE");
        } else {
            out.println(Math.min(Math.min(ans1, ans2), ans3));
        }
    }

    public static void main(String[]$) {
        new Main().solve();
        out.flush();
    }
}

class IntPair implements Comparable<IntPair> {
    int x;
    int y;

    IntPair(int first, int second) {
        this.x = first;
        this.y = second;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof IntPair)) {
            return false;
        }
        IntPair that = (IntPair)o;
        return x == that.x && y == that.y;
    }

    @Override
    public int compareTo(IntPair o) {
        return x == o.x ? Integer.compare(y, o.y) : Integer.compare(x, o.x);
    }

    @Override
    public String toString() {
        return String.format("[%s, %s]", x, y);
    }
}

class In {
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 0x10000);
    private StringTokenizer tokenizer;

    String next() {
        try {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                tokenizer = new StringTokenizer(reader.readLine());
            }
        } catch (IOException ignored) {
        }
        return tokenizer.nextToken();
    }

    int nextInt() {
        return Integer.parseInt(next());
    }

    long nextLong() {
        return Long.parseLong(next());
    }

    char[] nextCharArray() {
        return next().toCharArray();
    }

    char[][] nextCharGrid(int n, int m) {
        char[][] a = new char[n][m];
        for (int i = 0; i < n; i++) {
            a[i] = next().toCharArray();
        }
        return a;
    }

    int[] nextIntArray(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = nextInt();
        }
        return a;
    }

    int[] nextIntArray(int n, IntUnaryOperator op) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = op.applyAsInt(nextInt());
        }
        return a;
    }

    long[] nextLongArray(int n) {
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = nextLong();
        }
        return a;
    }

    long[] nextLongArray(int n, LongUnaryOperator op) {
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = op.applyAsLong(nextLong());
        }
        return a;
    }
    
    List<List<Integer>> nextEdges(int n, int m) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            res.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            int u = nextInt() - 1;
            int v = nextInt() - 1;
            res.get(u).add(v);
            res.get(v).add(u);
        }
        return res;
    }
}

class Out {
    private PrintWriter out = new PrintWriter(System.out);
    boolean autoFlush = false;

    void println(Object... a) {
        StringJoiner joiner = new StringJoiner(" ");
        for (Object obj : a) {
            joiner.add(String.valueOf(obj));
        }
        out.println(joiner);
        if (autoFlush) {
            out.flush();
        }
    }

    void println(char[] s) {
        out.println(String.valueOf(s));
        if (autoFlush) {
            out.flush();
        }
    }

    void println(int[] a) {
        StringJoiner joiner = new StringJoiner(" ");
        for (int i : a) {
            joiner.add(Integer.toString(i));
        }
        out.println(joiner);
        if (autoFlush) {
            out.flush();
        }
    }

    void println(long[] a) {
        StringJoiner joiner = new StringJoiner(" ");
        for (long i : a) {
            joiner.add(Long.toString(i));
        }
        out.println(joiner);
        if (autoFlush) {
            out.flush();
        }
    }

    void flush() {
        out.flush();
    }
}
