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

    private static class Spell {
        private int strength;
        private int cost;

        private Spell(int strength, int cost) {
            this.strength = strength;
            this.cost = cost;
        }

        private double performance() {
            return (double) strength / (double) cost;
        }
    }

    private static void solve() {
        int h = in.nextInt();
        int n = in.nextInt();

        List<Spell> spells = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int s = in.nextInt();
            int c = in.nextInt();
            spells.add(new Spell(s, c));
        }

        memo = new int[h + 1];
        Arrays.fill(memo, Integer.MAX_VALUE / 2);
        out.println(minCost(spells, h));
    }

    private static int[] memo;

    private static int minCost(List<Spell> spells, int hp) {
        if (hp <= 0) return 0;
        if (memo[hp] != Integer.MAX_VALUE / 2) return memo[hp];
        int min = Integer.MAX_VALUE;
        for (Spell spell : spells) {
            min = Math.min(min, spell.cost + minCost(spells, hp - spell.strength));
        }
        memo[hp] = min;
        return min;
    }

    // https://www.geeksforgeeks.org/fast-io-in-java-in-competitive-programming/
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        FastReader(InputStream inputStream) {
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
