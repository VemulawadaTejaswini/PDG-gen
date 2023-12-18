import java.io.*;
import java.math.BigInteger;
import java.net.Inet4Address;
import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import java.util.Map.Entry;

public class Main implements Runnable {
    static final int MOD = (int) 1e9 + 7;
    static final int MI = (int) 1e9;
    static final long ML = (long) 1e18;
    static final Reader in = new Reader();
    static final PrintWriter out = new PrintWriter(System.out);
    StringBuilder answer = new StringBuilder();
    Random random = new Random(751454315315L + System.currentTimeMillis());

    public static void main(String[] args) {
        new Thread(null, new Main(), "persefone", 1 << 28).start();
    }

    @Override
    public void run() {
        solve();
        printf();
        flush();
    }

    void solve() {
        int n = in.nextInt();
        int m = in.nextInt();
        Edge[] edges = new Edge[m];
        IntStream.iterate(0, i -> i + 1).limit(m).forEach(i -> {
            edges[i] = new Edge(in.nextInt() - 1, in.nextInt() - 1);
        });

        long[] ans = new long[m];
        ans[m - 1] = 1l * n * (n - 1) / 2;
        Value v = new Value();
        v.val = ans[m - 1] - 1;
        Dsu dsu = new Dsu(n);
        dsu.merge(edges[m - 1].from, edges[m - 1].to);
        IntStream.iterate(m - 2, i -> i - 1).limit(m - 1).forEach(i -> {
            ans[i] = v.val;
            v.val -= dsu.merge(edges[i].from, edges[i].to);
        });

        IntStream.range(0, m).forEach(i -> printf(ans[i]));
    }

    static class Value {
        long val;
    }

    static class Edge {
        int from, to;

        public Edge(int from, int to) {
            this.from = from;
            this.to = to;
        }
    }

    static class Dsu {
        int vertices, connectedComponents;
        int[] ancestor;
        int[] rank;

        public Dsu(int vertices) {
            this.vertices = vertices;
            this.connectedComponents = vertices;
            this.ancestor = IntStream.range(0, vertices).toArray();
            this.rank = IntStream.generate(() -> 1).limit(vertices).toArray();
        }

        public int find(int vertex) {
            while (vertex != ancestor[vertex]) {
                vertex = ancestor[vertex];
            }
            return vertex;
        }

        public long merge(int from, int to) {
            from = find(from);
            to = find(to);
            if (from == to) {
                return 0;
            }
            connectedComponents--;
            if (rank[from] > rank[to]) {
                ancestor[to] = from;
                rank[from] += rank[to];
                return 1l * (rank[from] - rank[to]) * rank[to];
            } else {
                ancestor[from] = to;
                rank[to] += rank[from];
                return 1l * (rank[to] - rank[from]) * rank[from];
            }
        }
    }

    void printf() {
        out.print(answer);
    }

    void close() {
        out.close();
    }

    void flush() {
        out.flush();
    }

    void printf(Stream<?> str) {
        str.forEach(o -> add(o, " "));
        add("\n");
    }


    void printf(Object... obj) {
        printf(false, obj);
    }

    void printfWithDescription(Object... obj) {
        printf(true, obj);
    }


    private void printf(boolean b, Object... obj) {

        if (obj.length > 1) {
            for (int i = 0; i < obj.length; i++) {
                if (b) add(obj[i].getClass().getSimpleName(), " - ");
                if (obj[i] instanceof Collection<?>) {
                    printf((Collection<?>) obj[i]);
                } else if (obj[i] instanceof int[][]) {
                    printf((int[][]) obj[i]);
                } else if (obj[i] instanceof long[][]) {
                    printf((long[][]) obj[i]);
                } else if (obj[i] instanceof double[][]) {
                    printf((double[][]) obj[i]);
                } else printf(obj[i]);
            }
            return;
        }

        if (b) add(obj[0].getClass().getSimpleName(), " - ");
        printf(obj[0]);
    }

    void printf(Object o) {
        if (o instanceof int[])
            printf(Arrays.stream((int[]) o).boxed());
        else if (o instanceof char[])
            printf(new String((char[]) o));
        else if (o instanceof long[])
            printf(Arrays.stream((long[]) o).boxed());
        else if (o instanceof double[])
            printf(Arrays.stream((double[]) o).boxed());
        else if (o instanceof boolean[]) {
            for (boolean b : (boolean[]) o) add(b, " ");
            add("\n");
        } else
            add(o, "\n");
    }

    void printf(int[]... obj) {
        for (int i = 0; i < obj.length; i++) printf(obj[i]);
    }

    void printf(long[]... obj) {
        for (int i = 0; i < obj.length; i++) printf(obj[i]);
    }

    void printf(double[]... obj) {
        for (int i = 0; i < obj.length; i++) printf(obj[i]);
    }

    void printf(boolean[]... obj) {
        for (int i = 0; i < obj.length; i++) printf(obj[i]);
    }

    void printf(Collection<?> col) {
        printf(col.stream());
    }

    <T, K> void add(T t, K k) {
        if (t instanceof Collection<?>) {
            ((Collection<?>) t).forEach(i -> add(i, " "));
        } else if (t instanceof Object[]) {
            Arrays.stream((Object[]) t).forEach(i -> add(i, " "));
        } else
            add(t);
        add(k);
    }


    <T> void add(T t) {
        answer.append(t);
    }

    static class Reader {
        private BufferedReader br;
        private StringTokenizer st;

        Reader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        Reader(String fileName) throws FileNotFoundException {
            br = new BufferedReader(new FileReader(fileName));
        }

        boolean isReady() throws IOException {
            return br.ready();
        }

        String next() {
            try {
                while (st == null || !st.hasMoreTokens()) {
                    st = new StringTokenizer(br.readLine());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] nextIntArray(int n) {
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = nextInt();
            return arr;
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String s = "";
            try {
                s = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return s;
        }
    }
}