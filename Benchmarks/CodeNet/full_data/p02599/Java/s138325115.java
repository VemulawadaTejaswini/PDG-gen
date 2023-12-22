import java.io.*;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    FastScanner in;
    PrintWriter out;

    class Fenw {
        int[] s;

        int n;

        Fenw(int n) {
            this.n = n;
            s = new int[n];
        }

        void add(int pos, int x) {
//            System.err.println("ADD " + pos + " " + x);
            for (; pos < n; pos |= pos + 1) {
                s[pos] += x;
            }
        }

        int get(int pos) {
            int r = 0;
            for (; pos >= 0; pos = (pos & (pos + 1)) - 1) {
                r += s[pos];
            }
            return r;
        }
    }

    void solve() {
        int n = in.nextInt();
        int q = in.nextInt();
        int[] colors = new int[n];
        int[] lastPos = new int[n];
        Arrays.fill(lastPos, -1);
        int[] next = new int[n];
        Arrays.fill(next, -1);
        Fenw f = new Fenw(n);
        for (int i = 0; i < n; i++) {
            colors[i] = in.nextInt() - 1;
            if (lastPos[colors[i]] != -1) {
                next[lastPos[colors[i]]] = i;
            } else {
                f.add(i, 1);
            }
            lastPos[colors[i]] = i;
        }
        Query[] queries = new Query[q];
        for (int i = 0; i < q; i++) {
            queries[i] = new Query(in.nextInt() - 1, in.nextInt() - 1, i);
        }
        Arrays.sort(queries);
        int curFr = 0;
        int[] res = new int[q];
        for (Query qu : queries) {
            while (curFr != qu.fr) {
                int ne = next[curFr];
                if (ne != -1) {
                    f.add(ne, 1);
                }
                f.add(curFr, -1);
                curFr++;
            }
            res[qu.id] = f.get(qu.to);
//            System.err.println("RES = " + res[qu.id]);
        }
        for (int x : res) {
            out.println(x);
        }
    }

    class Query implements Comparable<Query> {
        int fr, to;
        int id;

        public Query(int fr, int to, int id) {
            this.fr = fr;
            this.to = to;
            this.id = id;
        }

        @Override
        public int compareTo(Query o) {
            return Integer.compare(fr, o.fr);
        }
    }

    final int mod = (int) 1e9 + 7;
    final int MAX = (int) 2e6 + 10;

    void init() {
        fact = new int[MAX];
        fact[0] = 1;
        for (int i = 1; i < MAX; i++) {
            fact[i] = mul(fact[i - 1], i);
        }
        factInv = new int[MAX];
        factInv[MAX - 1] = BigInteger.valueOf(fact[MAX - 1]).modInverse(BigInteger.valueOf(mod)).intValue();
        for (int i = MAX - 1; i > 0; i--) {
            factInv[i - 1] = mul(factInv[i], i);
        }
    }

    int c(int n, int k) {
        if (k < 0 || k > n) {
            return 0;
        }
        return mul(fact[n], mul(factInv[k], factInv[n - k]));
    }

    int[] fact;
    int[] factInv;

    int mul(int x, int y) {
        return (int) ((x * 1L * y) % mod);
    }

    int add(int x, int y) {
        x += y;
        return x >= mod ? (x - mod) : x;
    }

    void run() {
        try {
            in = new FastScanner(new File("Main.in"));
            out = new PrintWriter(new File("Main.out"));

            solve();

            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    void runIO() {

        in = new FastScanner(System.in);
        out = new PrintWriter(System.out);

        solve();
        out.close();
    }

    class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(File f) {
            try {
                br = new BufferedReader(new FileReader(f));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        public FastScanner(InputStream f) {
            br = new BufferedReader(new InputStreamReader(f));
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                String s = null;
                try {
                    s = br.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (s == null)
                    return null;
                st = new StringTokenizer(s);
            }
            return st.nextToken();
        }

        boolean hasMoreTokens() {
            while (st == null || !st.hasMoreTokens()) {
                String s = null;
                try {
                    s = br.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (s == null)
                    return false;
                st = new StringTokenizer(s);
            }
            return true;
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }
    }

    public static void main(String[] args) {
        new Main().runIO();
    }
}