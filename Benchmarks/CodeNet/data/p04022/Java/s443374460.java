import java.io.*;
import java.util.*;
 
public class Main {
 
    static boolean prime[];
    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        PrintWriter w = new PrintWriter(System.out);
 
        int n = in.nextInt();
 
        long a[] = new long[n];
        for (int i = 0; i < n; i++)
            a[i] = in.nextLong();
 
        int N = 100100;
        sieve(N);
        long p[] = new long[2 * N + 1];
        long r[] = new long[N + 1];
        int ptr = 0, ptr2 = 0;
        for (int i = 2; i <= N; i++) {
            if (prime[i]) {
                r[ptr2++] = i * 1L * i;
                r[ptr2++] = i;
                p[ptr++] = i * 1L * i * 1L * i;
            }
        }
 
        for (int i = 0; i < n; i++) {
            for (int j = 0; p[j] <= a[i]; j++) {
                while (a[i] % p[j] == 0)
                    a[i] /= p[j];
            }
        }
 
        // now we have cube free numbers
        TreeMap<Pair, Integer> map = new TreeMap<Pair, Integer>();
        HashMap<Long, Long> AA = new HashMap<Long, Long>();
        HashMap<Long, Long> BB = new HashMap<Long, Long>();
 
        for (int i = 0; i < n; i++) {
            long A = 1, B = 1;
           
            if (AA.containsKey(a[i])) {
                A = AA.get(a[i]);
                B = BB.get(a[i]);
            } 
            
            else {
                long sav = a[i];
                for (int j = 0; r[j] <= a[i]; j += 2) {
                    if (a[i] % r[j + 1] == 0) {
                        if (a[i] % r[j] == 0) {
                            B *= r[j + 1];
                            a[i] /= r[j];
                        } else {
                            A *= r[j + 1];
                            a[i] /= r[j + 1];
                        }
                    }
                }
                if (a[i] != 1)
                    A *= a[i];
                AA.put(sav, A);
                BB.put(sav, B);
            }
            
            Pair P = new Pair(A, B);
            if (!map.containsKey(P))
                map.put(P, 0);
            map.put(P, map.get(P) + 1);
        }
 
        int ans = 0;
        
        for (Pair P : map.keySet()) {
            
            Pair O = new Pair(P.y, P.x);
            if (P.x == 1 && P.y == 1) {
                ans += Math.min(1, map.get(P));
            } 
            
            else if (!map.containsKey(O) || P.x > P.y) {
                int pp = map.get(P);
                int qq = map.containsKey(O) ? map.get(O) : 0;
                ans += Math.max(pp, qq);
            }
        }
 
        w.println(ans);
        w.close();
    }
 
    public static void sieve(int n) {
        prime = new boolean[n + 1];
        Arrays.fill(prime, true);
        prime[0] = prime[1] = false;
 
        for (int i = 2; i * i <= n; i++)
            if (prime[i])
                for (int k = i * i; k <= n; k += i)
                    prime[k] = false;
    }
 
    static class Pair implements Comparable<Pair> {
        long x, y;
 
        Pair(long x, long y) {
            this.x = x;
            this.y = y;
        }
 
        public int compareTo(Pair o) {
            if (x != o.x)
                return Long.compare(x, o.x);
            return Long.compare(y, o.y);
        }
 
        public String toString() {
            return x + " " + y;
        }
    }
 
    static class InputReader {
 
        private final InputStream stream;
        private final byte[] buf = new byte[8192];
        private int curChar, snumChars;
        private SpaceCharFilter filter;
 
        public InputReader(InputStream stream) {
            this.stream = stream;
        }
 
        public int snext() {
            if (snumChars == -1)
                throw new InputMismatchException();
            if (curChar >= snumChars) {
                curChar = 0;
                try {
                    snumChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (snumChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }
 
        public int nextInt() {
            int c = snext();
            while (isSpaceChar(c)) {
                c = snext();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = snext();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = snext();
            } while (!isSpaceChar(c));
            return res * sgn;
        }
 
        public long nextLong() {
            int c = snext();
            while (isSpaceChar(c)) {
                c = snext();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = snext();
            }
            long res = 0;
            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = snext();
            } while (!isSpaceChar(c));
            return res * sgn;
        }
 
        public int[] nextIntArray(int n) {
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = nextInt();
            }
            return a;
        }
 
        public String readString() {
            int c = snext();
            while (isSpaceChar(c)) {
                c = snext();
            }
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = snext();
            } while (!isSpaceChar(c));
            return res.toString();
        }
 
        public String nextLine() {
            int c = snext();
            while (isSpaceChar(c))
                c = snext();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = snext();
            } while (!isEndOfLine(c));
            return res.toString();
        }
 
        public boolean isSpaceChar(int c) {
            if (filter != null)
                return filter.isSpaceChar(c);
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }
 
        private boolean isEndOfLine(int c) {
            return c == '\n' || c == '\r' || c == -1;
        }
 
        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);
        }
    }
}