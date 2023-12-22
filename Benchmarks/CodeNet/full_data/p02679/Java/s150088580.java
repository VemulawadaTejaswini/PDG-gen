/**
 * @author derrick20
 */
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);

        int N = sc.nextInt();

        freq = new HashMap<>();
        int zeroes = 0;
        for (int i = 0; i < N; i++) {
            long num = sc.nextLong();
            long denom = sc.nextLong();
            if (num == 0 && denom == 0) {
                zeroes++;
                continue;
            }
            else if (num == 0) {
                int[] val = freq.computeIfAbsent("0_1", key -> new int[2]);
                val[0]++;
            }
            else if (denom == 0) {
                int[] val = freq.computeIfAbsent("0_1", key -> new int[2]);
                val[1]++;
            }
            else {
                long g = gcd(Math.abs(num), Math.abs(denom));
                if (g != 0) {
                    num /= g;
                    denom /= g;
                }
                if (denom < 0) {
                    num *= -1;
                    denom *= -1;
                }
                // let's hash based on the positive version. If it's negative,
                // add one to the negative bucket.
                Fish f = new Fish(num, denom);
                int sign = (Math.signum(num) * Math.abs(denom) > 0 ? 0 : 1);
                String hash = f.toString();
                int[] val = freq.computeIfAbsent(hash, key -> new int[2]);
                val[sign]++;
            }
        }

        long[] pow = new long[(int) 2e5 + 1];
        pow[0] = 1;
        for (int i = 1; i < pow.length; i++) {
            pow[i] = (2 * pow[i - 1]) % mod;
        }

        long ans = 1;
        for (var e : freq.entrySet()) {
            String key = e.getKey();
            int[] buckets = e.getValue();

//            System.out.println(key + ": " + Arrays.toString(buckets));
            long a = pow[buckets[0]];
            long b = pow[buckets[1]];
            ans += (ans * (a + b - 1 - 1 + mod) % mod) % mod;
            ans %= mod;
        }

        out.println((ans - 1 + mod + zeroes) % mod);
        out.close();
    }

    static long mod = 1000000007;

    static long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    static HashMap<String, int[]> freq;

    static class Fish {
        long num, denom;
        public Fish(long n, long d) {
            num = n; denom = d;
        }

        public String toString() {
            // return the positive version
            long n1 = Math.abs(num);
            long d1 = Math.abs(denom);
            long sign = (long) (Math.signum(num) * Math.signum(denom));
            if (sign > 0) {
                return n1 + "_" + d1;
            }
            else {
                return d1 + "_" + n1;
            }
        }
    }

    static class FastScanner {
        private int BS = 1<<16;
        private char NC = (char)0;
        private byte[] buf = new byte[BS];
        private int bId = 0, size = 0;
        private char c = NC;
        private double cnt = 1;
        private BufferedInputStream in;

        public FastScanner() {
            in = new BufferedInputStream(System.in, BS);
        }

        public FastScanner(String s) {
            try {
                in = new BufferedInputStream(new FileInputStream(new File(s)), BS);
            }
            catch (Exception e) {
                in = new BufferedInputStream(System.in, BS);
            }
        }

        private char getChar(){
            while(bId==size) {
                try {
                    size = in.read(buf);
                }catch(Exception e) {
                    return NC;
                }
                if(size==-1)return NC;
                bId=0;
            }
            return (char)buf[bId++];
        }

        public int nextInt() {
            return (int)nextLong();
        }

        public int[] nextInts(int N) {
            int[] res = new int[N];
            for (int i = 0; i < N; i++) {
                res[i] = (int) nextLong();
            }
            return res;
        }

        public long[] nextLongs(int N) {
            long[] res = new long[N];
            for (int i = 0; i < N; i++) {
                res[i] = nextLong();
            }
            return res;
        }

        public long nextLong() {
            cnt=1;
            boolean neg = false;
            if(c==NC)c=getChar();
            for(;(c<'0' || c>'9'); c = getChar()) {
                if(c=='-')neg=true;
            }
            long res = 0;
            for(; c>='0' && c <='9'; c=getChar()) {
                res = (res<<3)+(res<<1)+c-'0';
                cnt*=10;
            }
            return neg?-res:res;
        }

        public double nextDouble() {
            double cur = nextLong();
            return c!='.' ? cur:cur+nextLong()/cnt;
        }

        public String next() {
            StringBuilder res = new StringBuilder();
            while(c<=32)c=getChar();
            while(c>32) {
                res.append(c);
                c=getChar();
            }
            return res.toString();
        }

        public String nextLine() {
            StringBuilder res = new StringBuilder();
            while(c<=32)c=getChar();
            while(c!='\n') {
                res.append(c);
                c=getChar();
            }
            return res.toString();
        }

        public boolean hasNext() {
            if(c>32)return true;
            while(true) {
                c=getChar();
                if(c==NC)return false;
                else if(c>32)return true;
            }
        }
    }
}