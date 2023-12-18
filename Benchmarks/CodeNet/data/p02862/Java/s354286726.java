import java.util.*;
import java.io.*;

public class Main {
    static long mod = 1_000_000_007L;
    public static void main(String[] args) {
        FastScanner scanner = new FastScanner();
        PrintWriter out = new PrintWriter(System.out, false);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int sum = x + y;
        if (sum % 3 != 0 || sum/3 > x || sum/3 > y) {
            out.println(0);
        } else {
            int choose = x - sum/3;
            long[] fact = new long[sum + 1];
            fact[0] = fact[1] = 1;
            for(int i = 2; i <= sum; i++) {
                fact[i] = fact[i-1] * i;
                fact[i] %= mod;
            }
            int val = sum/3;
            long ans = (fact[val] * modInv(fact[val - choose])) % mod;
            ans = (ans* modInv(fact[choose])) % mod;
            out.println(ans);
        }
        out.flush();
    }
    static long modInv(long x) {
        return modPow(x, mod-2);
    }
    static long modPow(long x, long p) {
        if (p == 0) return 1;
        long t = modPow(x , p/2);
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
