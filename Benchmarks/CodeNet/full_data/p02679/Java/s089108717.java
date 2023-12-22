import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;
import java.util.TreeMap;
import java.util.StringTokenizer;
import java.util.Map;
import java.util.Map.Entry;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ABullet solver = new ABullet();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABullet {
        int mod;

        public long gcd(long a, long b) {
            if (b == 0)
                return a;
            return gcd(b, a % b);
        }

        public void solve(int testNumber, Scanner sc, PrintWriter pw) {
            int n = sc.nextInt();
            mod = (int) 1e9 + 7;
            TreeMap<pair, Integer> map = new TreeMap<>();
            for (int i = 0; i < n; i++) {
                long a = sc.nextLong(), b = sc.nextLong();
                pair temp = makePair(a, b);
                map.put(temp, map.getOrDefault(temp, 0) + 1);
            }
            long ans = 1;
            TreeSet<pair> visited = new TreeSet<>();
            visited.add(new pair(0, 0));
            for (Map.Entry<pair, Integer> entry : map.entrySet()) {
                pair p = entry.getKey();
                int c = entry.getValue();
                if (visited.contains(p))
                    continue;
                int bool = 0;
                if (-p.b < 0)
                    bool ^= 1;
                if (p.a < 0)
                    bool ^= 1;
                pair incomp = new pair((bool == 1 ? -1 : 1) * Math.abs(p.b), Math.abs(p.a));
                visited.add(incomp);
                int c2 = map.getOrDefault(incomp, 0);
                ans *= (fastPowMod(2, c) % mod + fastPowMod(2, c2) % mod - 1 + mod) % mod;
            }
            pw.println((ans - 1 + mod) % mod);
        }

        private pair makePair(long a, long b) {
            if (a == 0 && b == 0)
                return new pair(0, 0);
            if (a == 0)
                return new pair(0, 1);
            if (b == 0)
                return new pair(1, 0);
            int bool = a < 0 ? 1 : 0;
            bool ^= b < 0 ? 1 : 0;
            a = Math.abs(a);
            b = Math.abs(b);
            long gcd = gcd(a, b);
            return new pair((bool == 1 ? -1 : 1) * a / gcd, b / gcd);
        }

        public long fastPowMod(long a, long b) {
            if (b == 0)
                return 1;
            long temp = fastPowMod(a, b / 2) % mod;
            if (b % 2 == 1)
                return a % mod * temp % mod * temp % mod;
            else
                return temp % mod * temp % mod;
        }

        public class pair implements Comparable<pair> {
            long a;
            long b;

            public pair(long a, long b) {
                this.a = a;
                this.b = b;
            }

            public int compareTo(pair pair) {
                return a == pair.a ? Long.compare(b, pair.b) : Long.compare(a, pair.a);
            }

            public String toString() {
                return "pair{" +
                        "a=" + a +
                        ", b=" + b +
                        '}';
            }

        }

    }

    static class Scanner {
        StringTokenizer st;
        BufferedReader br;

        public Scanner(FileReader r) {
            br = new BufferedReader(r);
        }

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

    }
}

