import java.io.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    private static FastReader in = new FastReader(System.in);
    private static PrintWriter out = new PrintWriter(System.out);

    private static final long MOD = (long) 1e9 + 7;

    public static void main(String[] args) {
        solve();
        out.flush();
    }

    private static class Person {
        private List<Testimony> t;
        private Person(List<Testimony> t) {
            this.t = t;
        }
    }

    private static class Testimony {
        private int x;
        private boolean y;
        private Testimony(int x, int y) {
            this.x = x - 1;
            this.y = y == 1;
        }
    }

    private static void solve() {
        int n = in.nextInt();
        Person[] people = new Person[n];
        for (int i = 0; i < n; i++) {
            List<Testimony> ts = new ArrayList<>();
            int a = in.nextInt();
            for (int j = 0; j < a; j++) {
                ts.add(new Testimony(in.nextInt(), in.nextInt()));
            }
            people[i] = new Person(ts);
        }

        AtomicInteger ans = new AtomicInteger(0);
        dfs(people, new boolean[n], 0, ans);
        out.println(ans.get());
    }

    private static void dfs(Person[] people, boolean[] assumption, int depth, AtomicInteger ans) {
        if (depth == people.length) {
            if (check(people, assumption)) {
                ans.set(Math.max(ans.get(), count(assumption)));
            }
            return;
        }

        assumption[depth] = false;
        dfs(people, assumption, depth + 1, ans);
        assumption[depth] = true;
        dfs(people, assumption, depth + 1, ans);
    }

    private static boolean check(Person[] people, boolean[] assumption) {
        for (int i = 0; i < people.length; i++) {
            if (!assumption[i]) continue;
            for (Testimony t : people[i].t) {
                if (assumption[t.x] != t.y) {
                    return false;
                }
            }
        }
        return true;
    }

    private static int count(boolean[] assumption) {
        int ret = 0;
        for (boolean b : assumption) {
            if (b) ret++;
        }
        return ret;
    }

    // https://www.geeksforgeeks.org/fast-io-in-java-in-competitive-programming/
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader(InputStream inputStream) {
            br = new BufferedReader(new
                    InputStreamReader(inputStream));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException  e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
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

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

        // https://qiita.com/masakinpo/items/5f77f2a879578a85a0bb
        public int[] nextIntArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }

        public long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        }
    }
}
