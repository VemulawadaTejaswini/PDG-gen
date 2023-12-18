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
        // https://atcoder.jp/contests/abc127/submissions/5624603
        int n = in.nextInt();
        int m = in.nextInt();

        List<Integer> a = new ArrayList<>();
        for (int i=0; i < n; i++)
            a.add(in.nextInt());

        List<Map.Entry<Integer, Integer>> bc = new ArrayList<>();
        for (int i=0; i < m; i++) {
            int b = in.nextInt();
            int c = in.nextInt();
            bc.add(new AbstractMap.SimpleEntry<>(b, c));
        }
        bc.sort((o1, o2) -> o2.getValue() - o1.getValue());
        Collections.sort(a);

        int index = 0;
        for (Map.Entry<Integer, Integer> e : bc) {
            for (int i=0; i < e.getKey(); i++) {
                if (index >= a.size())
                    break;

                if (a.get(index) < e.getValue()) {
                    a.set(index, e.getValue());
                } else {
                    break;
                }

                index++;
            }
        }

        long ans = 0;
        for (int i : a)
            ans += i;
        out.println(ans);
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
