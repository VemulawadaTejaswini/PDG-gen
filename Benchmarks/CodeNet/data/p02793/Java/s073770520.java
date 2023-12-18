import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Main main = new Main();
        main.solve();
    }

    public void solve() throws Exception {
        long mod = 1000000007;
        //Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        FastScan scan = new FastScan(System.in);
        int N = scan.scanInt();
        int[] A = new int[N];
        int max = 0;
        for (int i = 0; i < N; i++) {
            A[i] = scan.scanInt();
            max = Math.max(max, A[i]);
        }

        Map<Integer, Integer>[] list = new Map[N];
        for (int i = 0; i < N; i++) {
            list[i] = prime_factor(A[i]);
        }
        Map<Integer, Integer> lcm = new HashMap<>();
        for (int i = 0; i < N; i++) {
            Map<Integer, Integer> map = list[i];
            for (int prime : map.keySet()) {
                lcm.merge(prime, map.get(prime), Integer::max);
            }
        }
        long ans = 0;
        for (int i = 0; i < N; i++) {
            long b = 1;
            Map<Integer, Integer> factorize = list[i];
            for (int prime : lcm.keySet()) {
                b *= pow(prime, lcm.get(prime) - factorize.getOrDefault(prime, 0), mod);
                b %= mod;
            }
            ans += b;
            ans %= mod;
        }
        System.out.println(ans);
    }
    private long pow(long base, long exp, long mod) {
        if (exp == 0) {
            return 1;
        }
        if (exp % 2 == 1) {
            long x = base * pow(base, exp-1, mod);
            x %= mod;
            return x;
        }
        long x = pow(base, exp/2, mod);
        x = x * x;
        x %= mod;
        return x;
    }
    private Map<Integer, Integer> prime_factor(int N) {
        int current = N;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 2; i * i < N; i++) {
            int count = 0;
            while(current % i == 0) {
                current /= i;
                count += 1;
            }
            if (0 < count) {
                map.put(i, count);
            }
        }
        if (0 < current) {
            map.put(current, 1);
        }
        return map;
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
        long scanLong() throws IOException {
            return Long.parseLong(this.next());
        }
        int scanInt() throws IOException {
            return Integer.parseInt(this.next());
        }
        double scanDouble() throws IOException {
            return Double.parseDouble(this.next());
        }
        char scanCharacter() throws IOException {
            return this.next().charAt(0);
        }
        String nextLine() throws IOException {
            return br.readLine().trim();
        }
    }
}
