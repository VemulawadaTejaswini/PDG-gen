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

        int[] one = new int[2];
        HashMap<String, int[]> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            long num = sc.nextLong();
            long denom = sc.nextLong();
            long g = gcd(num, denom);
            if (g != 0) {
                num /= g;
                denom /= g;
            }
            if (denom < 0) {
                num *= -1;
                denom *= -1;
            }
            Fish f = new Fish(num, denom);
            int greater = Math.abs(num) > Math.abs(denom) ? 0 : 1;
            String hash = f.toString();
//            System.out.println(num + " " + denom);
            if (num == -1 && denom == 1) {
                one[1]++;
            }
            else if ((num == 1 && denom == 1)) {
                one[0]++;
            }
            else {
                if (map.containsKey(hash)) {
                    map.get(hash)[greater]++;
                }
                else {
                    int[] freq = new int[2];
                    freq[greater]++;
                    map.put(hash, freq);
                }
            }
        }
/*
0.5: [1, 0]
0.3333333333333333: [0, 1]
8.0: [1, 0]
4.0: [1, 0]
2.0: [1, 0]
1.5: [2, 1]

-1_2: [1, 0]
1_3: [0, 1]
1_4: [1, 0]
1_2: [1, 0]
1_8: [1, 0]
2_3: [2, 0]
-2_3: [0, 1]
767

 */
        long[] pow = new long[(int) 2e5 + 1];
        pow[0] = 1;
        for (int i = 1; i < pow.length; i++) {
            pow[i] = (2 * pow[i - 1]) % mod;
        }

        long ans = 1;
//        System.out.println(map.keySet());
        for (var e : map.entrySet()) {
            String key = e.getKey();
            int[] freq = e.getValue();

//            System.out.println(key + ": " + Arrays.toString(freq));
            long a = pow[freq[0]];
            long b = pow[freq[1]];
            ans += (ans * (a + b - 1 - 1) % mod) % mod;
            ans %= mod;
//            total = (total + ans) % mod;
        }

        long a = pow[one[0]];
        long b = pow[one[1]];
        ans += (ans * (a + b - 1 - 1) % mod) % mod;
        ans %= mod;

        out.println((ans - 1 + mod) % mod);
        out.close();
    }

    static long mod = 1000000007;

    static long fastExpo(long x, long k) {
        if (k == 0) {
            return 1;
        }
        else if (k == 1) {
            return x;
        }
        else {
            long root = fastExpo(x, k / 2);
            long ans = (root * root) % mod;
            if (k % 2 == 1) {
                ans = (ans * x) % mod;
            }
            return ans;
        }
    }

    static long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    static class Fish implements Comparable<Fish> {
        long num, denom;
        public Fish(long n, long d) {
            num = n; denom = d;
        }

        public double getHash() {
            double v = 1.0 * num / denom;
            if (v < 0) {
                v = -1.0 / v;
            }
            return v;
        }

        public String toString() {
            long n1 = Math.abs(num);
            long d1 = Math.abs(denom);
            if (n1 > d1) {
                long temp = n1;
                n1 = d1;
                d1 = temp;
            }
//            long sign = (long) (Math.signum(num) * Math.signum(denom));
            String s1 = n1 + "_" + d1;
            return s1;
        }

        public int compareTo(Fish f2) {
            long n1 = Math.abs(num);
            long d1 = Math.abs(denom);
            long n2 = Math.abs(f2.num);
            long d2 = Math.abs(f2.denom);
            if (n1 > d1) {
                long temp = n1;
                n1 = d1;
                d1 = temp;
            }
            if (n2 > d2) {
                long temp = n2;
                n2 = d2;
                d2 = temp;
            }
            String s1 = n1 + "_" + d1;
            String s2 = n2 + "_" + d2;
            return s1.compareTo(s2);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Fish fish = (Fish) o;
            return num == fish.num &&
                    denom == fish.denom;
        }

        @Override
        public int hashCode() {
            return Objects.hash(num, denom);
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