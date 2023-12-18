import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Main {
    static long mod = 1_000_000_007L;
    public static void main(String[] args) {
        FastScanner scanner = new FastScanner();
        PrintWriter out = new PrintWriter(System.out,false);
        int n = scanner.nextInt();
        BigInteger[] arr = new BigInteger[n];
        BigInteger gcd = BigInteger.ZERO;
        BigInteger prod = BigInteger.ONE;
        BigInteger MOD = BigInteger.valueOf(mod);
        for(int i = 0; i < n; i++) {
            arr[i] = BigInteger.valueOf(scanner.nextLong());
            gcd = arr[i].gcd(prod);
            prod = arr[i].multiply(prod);
            if (i > 0) {
                prod = prod.divide(gcd);
            }
        }
        long ans = 0;
        for(int i = 0; i < n; i++){
            ans = (ans + prod.divide(arr[i]).mod(MOD).longValue()) % mod;
        }
        out.println(ans);
        out.flush();
    }
    static long gcd(long a, long b) {
        if(b == 0) return a;
        return gcd(b, a % b);
    }
    static long modInv(long x) {
        if (x == 0) return 0;
        return modPow(x, mod-2);
    }
    static long modPow(long x, long p) {
        if (p == 0) return 1L;
        long t = modPow(x, p/2);
        t = (t * t) % mod;
        if (p % 2 == 0) return t;
        return (t * x) % mod;
    }
    public static class FastScanner {
        BufferedReader br;
        StringTokenizer st;
        public FastScanner(Reader in) {
            br = new BufferedReader(in);
        }
        public FastScanner() {
            this(new InputStreamReader(System.in));
        }
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
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
        String readNextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
