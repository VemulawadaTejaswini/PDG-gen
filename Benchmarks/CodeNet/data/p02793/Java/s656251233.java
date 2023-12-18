import java.util.*;
import java.io.*;

public class Main {
    static long mod = 1_000_000_007L;
    public static void main(String[] args) {
        FastScanner scanner = new FastScanner();
        PrintWriter out = new PrintWriter(System.out,false);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        //two ways to find the lcm of two numbers -> (1) use product + gcd
        //-> (2) use the fact that the lcm is simply the product of the maximum occurrence of any prime in any component number
        int sz = 1_000_005;
        int[] largest = new int[sz];
        for(int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            int cur = arr[i];
            for(int j = 2; j * j <= cur; j++) {
                if (cur % j == 0) {
                    int cnt = 0;
                    while(cur % j == 0) {
                        cur/=j;
                        cnt++;
                    }
                    largest[j] = Math.max(largest[j], cnt);
                }
            }
            if (cur > 1) {
                largest[cur] = Math.max(largest[cur], 1);
            }
        }
        //compute the lcm
        long lcm = 1;
        for(int i = 0; i < sz; i++) {
            for(int j = 0; j < largest[i]; j++) {
                lcm = (lcm * i) % mod;
            }
        }
        long ans = 0;
        for(int i = 0; i < n; i++) {
            ans = (ans + lcm * modInv(arr[i])) % mod;
        }
        out.println(ans);
        out.flush();
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
