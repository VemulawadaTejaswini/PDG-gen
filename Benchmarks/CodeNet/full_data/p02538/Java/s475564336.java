import java.io.*;
import java.util.*;
import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) throws Exception {
        Main main = new Main();
        main.solve();
    }
    public void solve() throws Exception {
        //Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        FastScan scan = new FastScan(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int N = scan.nextInt();
        int Q = scan.nextInt();
        TreeMap<Integer, Integer> tree = new TreeMap<>();
        tree.put(-1, 1);
        tree.put(N, 1);
        long mod = 998244353;
        long inv9 = pow(9, mod - 2, mod);
        long current = p(inv9,1, 0, N-1, mod);
        for (int i = 0; i < Q; i++) {
            int tl = scan.nextInt()-1;
            int tr = scan.nextInt()-1;
            int D = scan.nextInt();
            int L = N - 1 - tr;
            int R = N - 1 - tl;
            int from = L;
            HashSet<Integer> cleanup = new HashSet<>();
            while (from <= R) {
                int prev_index = tree.floorKey(from);
                if (L <= prev_index && prev_index <= R) {
                    cleanup.add(prev_index);
                }
                int value = tree.get(prev_index);
                int next_index = tree.ceilingKey(from);
                if (L <= next_index && next_index <= R) {
                    cleanup.add(next_index);
                }
                if (R < next_index) {
                    int to = R;
                    long t = p(inv9, value, from, to, mod);
                    current -= t;
                    if (current < 0) {
                        current += mod;
                    }
                    break;
                }
                int to = next_index;
                long t = p(inv9, value, from, to, mod);
                current -= t;
                if (current < 0) {
                    current += mod;
                }
                from = to + 1;
            }
            long t = p(inv9, D, L, R, mod);
            current += t;
            current %= mod;
            out.println(current);
            int prev_index = tree.lowerKey(L);
            tree.put(L-1, tree.get(prev_index));
            int next_index = tree.lowerKey(R);
            tree.put(R+1, tree.get(next_index));
            for (int x : cleanup) {
                tree.remove(x);
            }
            tree.put(L, D);
            tree.put(R, D);
        }
        out.flush();
    }
    private long p(long inv9, long value, long from, long to, long mod) {
        long t1 = pow(10, to - from + 1, mod);
        t1 -= 1;
        if (t1 < 0) {
            t1 += mod;
        }
        t1 %= mod;
        long t2 = value * inv9; 
        t2 %= mod;
        t2 *= pow(10, from, mod);
        t2 %= mod;
        long t = t1 * t2;
        t %= mod;
        return t;
    }
    private long pow(long base, long count, long mod) {
        if (count == 0) {
            return 1;
        }
        if (count % 2 == 1) {
            long t = base * pow(base, count - 1, mod);
            t %= mod;
            return t;
        }
        long t = pow(base, count / 2, mod);
        t *= t;
        t %= mod;
        return t; 
    }
    class FastScan {
        BufferedReader br;
        StringTokenizer st;
        FastScan(InputStream is) {
            InputStreamReader isr = new InputStreamReader(is);
            this.br = new BufferedReader(isr);
        }
        String next() throws IOException {
            while (this.st == null || !this.st.hasMoreTokens()) {
                this.st = new StringTokenizer(br.readLine().trim());
            }
            return st.nextToken();
        }
        long nextLong() throws IOException {
            return Long.parseLong(this.next());
        }
        int nextInt() throws IOException {
            return Integer.parseInt(this.next());
        }
        double nextDouble() throws IOException {
            return Double.parseDouble(this.next());
        }
        char nextCharacter() throws IOException {
            return this.next().charAt(0);
        }
        String nextLine() throws IOException {
            return br.readLine().trim();
        }
    }
}
