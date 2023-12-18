
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        Main main = new Main();
        main.solve();
    }

    public void solve() throws Exception {
        int mod_int = 1000000007;
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int[] A = new int[N];
        int max = 0;
        for (int i = 0; i < N; i++) {
            A[i] = scan.nextInt();
        }

        BigInteger lcm = lcm(A);
        long ans = 0;
        BigInteger mod = new BigInteger(String.valueOf(mod_int));
        for (int i = 0; i < N; i++) {
            BigInteger x = lcm.divide(new BigInteger(String.valueOf(A[i])));
            long b = x.mod(mod).longValue();
            ans += b;
            ans %= mod_int;
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
    private BigInteger gcd(BigInteger x, BigInteger y) {
        if (y.equals(BigInteger.ZERO)) {
            return x;
        }
        return gcd(y, x.mod(y));
    }
    private BigInteger lcm(BigInteger x, BigInteger y) {
        return x.multiply(y).divide(gcd(x, y));
    }
    private BigInteger lcm(int[] a) {
        BigInteger lcm = new BigInteger(String.valueOf(a[0]));
        for (int i = 0; i < a.length; i++) {
            lcm = lcm(lcm, new BigInteger(String.valueOf(a[i])));
        }
        return lcm;
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
