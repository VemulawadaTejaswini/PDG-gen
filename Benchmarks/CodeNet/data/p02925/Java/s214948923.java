import java.io.*;
import java.util.*;

public class Main {

    private static FastReader in = new FastReader(System.in);
    private static PrintWriter out = new PrintWriter(System.out);

    private static final long MOD = (long) 1e9 + 7;

    public static void main(String[] args) {
        solve();
        out.flush();
    }

    private static void solve() {
        int n = in.nextInt();
        List<Queue<Integer>> a = new ArrayList<>();
        for (int i=0; i < n; i++) {
            a.add(new ArrayDeque<>());
            for (int j=0; j < n - 1; j++) {
                a.get(i).add(in.nextInt() - 1);
            }
        }

        // https://atcoder.jp/contests/abc139/submissions/7293795
        int days = 0;
        int[] latest = new int[n];
        Queue<Integer> toCheck = new ArrayDeque<>();
        for (int i=0; i < n; i++)
            toCheck.add(i);
        int remaining = n * (n-1) / 2;
        while (!toCheck.isEmpty()) {
            int me = toCheck.poll();
            if (a.get(me).isEmpty()) continue;
            int opp = a.get(me).peek();
            if (a.get(opp).isEmpty()) continue;
            if (a.get(opp).peek() == me) {
                remaining--;
                a.get(me).poll();
                a.get(opp).poll();
                toCheck.add(me);
                toCheck.add(opp);
                latest[me] = latest[opp] = Math.max(latest[me], latest[opp]) + 1;
                days = Math.max(latest[me], days);
            }
        }

        out.println(remaining == 0 ? days : -1);
    }

    private static boolean check(Queue<Integer>[] a, int n) {
        for (Queue<Integer> d : a) {
            if (!d.isEmpty())
                return false;
        }
        return true;
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
