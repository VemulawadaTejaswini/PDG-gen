import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class Main {
    static long mod = 1000000007;
    public static void main (String[] args) throws java.lang.Exception {
        InputReader in = new InputReader(System.in);
        PrintWriter w = new PrintWriter(System.out);
        int n = in.nextInt();
        int[] a = in.nextIntArray(n), b = new int[n];
        b[1] = Math.abs(a[0] - a[1]);
        for (int i = 2; i < n; i++) {
            b[i] = Math.min(b[i - 1] + Math.abs(a[i - 1] - a[i]), b[i - 2] + Math.abs(a[i - 2] - a[i]));
        }
        w.println(b[n - 1]);
        w.close();
    }
    static int find(int[] a, int ind, int k) {
        int l = ind - k, r = ind + k, ans = a[ind];
        while (r < a.length) {
            ans += a[r];
            r += k;
        }
        while (l >= 0) {
            ans += a[l];
            l -= k;
        }
        return ans;

    }
    static class Obj implements Comparable<Obj> {
        int val, ind;
        Obj(int val, int ind) {
            this.val = val;
            this.ind = ind;
        }
        public int compareTo(Obj O) {
            return this.val - O.val;
        }
    }
    static String process(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);
            if (x == '(')
                sb.append(x);
            else {
                if (sb.length() != 0 && sb.charAt(sb.length() - 1) == '(')
                    sb.deleteCharAt(sb.length() - 1);
                else
                    sb.append(x);
            }
        }
        if (sb.length() == 0)
            return "E";
        StringBuilder sb1 = new StringBuilder();
        for (int i = sb.length() - 1; i > -1; i--) {
            if (sb.charAt(i) == '(')
                sb1.append(')');
            else
                sb1.append('(');
        }
        return sb1.toString();


    }
    static long pow(long x, long p, long mod) {
        long ans = 1;
        x %= mod;
        while (p > 0) {
            if (p % 2 == 1)
                ans = (ans * x) % mod;
            x = (x * x) % mod;
            p /= 2;
        }
        return ans;
    }
    static boolean nextPermutation(int[] a) {
        int n = a.length;
        int ptr = n - 1;
        while (ptr > 0 && a[ptr - 1] >= a[ptr]) {
            ptr--;
        }

        for (int i = ptr, j = n - 1; i < j; i++, j--) {
            int tmp = a[i];
            a[i] = a[j];
            a[j] = tmp;
        }

        if (ptr == 0) {
            return false;
        }

        for (int i = ptr;; i++) {
            if (a[ptr - 1] < a[i]) {
                int tmp = a[ptr - 1];
                a[ptr - 1] = a[i];
                a[i] = tmp;
                return true;
            }
        }
    }
    static int fibo(int n) {
        if (n == 1 || n == 2)
            return 1;
        return fibo(n - 1) + fibo(n - 2);
    }
    /*static int fibo(int n) {
        if (n == 0)
            return 0;
        if (n == 1 || n == 2)
            return f[n] = 1;
        if (f[n] != 0)
            return f[n];
        if (n % 2 == 0) {
            int k = (n) / 2;
            return f[n] = (fibo(k - 1) * 2 + fibo(k)) * fibo(k);
        } else {
            int k = (n + 1) / 2;
            return f[n] = fibo(k - 1) * fibo(k - 1) + fibo(k) * fibo(k);
        }
    }*/
    static class Edge implements Comparable<Edge> {
        int from, to, cost;
        Edge(int from, int to, int cost) {
            this.from = from;
            this.to = to;
            this.cost = cost;
        }
        public int compareTo(Edge O) {
            return this.cost - O.cost;
        }
    }
    static String swap(String s, int i, int j) {
        char[] ca = s.toCharArray();
        char temp = ca[i];
        ca[i] = ca[j];
        ca[j] = temp;
        return new String(ca);
    }
    static void findMissExtra(int[] a) {
        HashSet<Integer> hs = new HashSet<>();
        int n = a.length, extra = 0, miss = 0;
        for (int i = 0; i < n; i++) {
            if (hs.contains(a[i]))
                extra = a[i];
            hs.add(a[i]);

        }
        for (int i = 1; i <= n; i++) {
            if (!hs.contains(i)) {
                miss = i;
                break;
            }
        }
        System.out.println(miss + ", " + extra);
    }
    static void find(int m, int s) {
        if (s == 0 || s > m * 9) {
            System.out.println("Impossible");
            return ;
        }
        s -= 1;
        int[] num = new int[m];
        for (int i = m - 1; i > 0; i--) {
            int temp = Math.min(s, 9);
            num[i] = temp;
            s -= temp;
        }
        num[0] += s + 1;
        for (int x : num)
            System.out.print(x);
    }
    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (numChars == -1)
                throw new UnknownError();
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new UnknownError();
                }
                if (numChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        public int peek() {
            if (numChars == -1)
                return -1;
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    return -1;
                }
                if (numChars <= 0)
                    return -1;
            }
            return buf[curChar];
        }

        public void skip(int x) {
            while (x-- > 0)
                read();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public String nextString() {
            return next();
        }

        public String next() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            StringBuffer res = new StringBuffer();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isSpaceChar(c));

            return res.toString();
        }

        public String nextLine() {
            StringBuffer buf = new StringBuffer();
            int c = read();
            while (c != '\n' && c != -1) {
                if (c != '\r')
                    buf.appendCodePoint(c);
                c = read();
            }
            return buf.toString();
        }

        public double nextDouble() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            double res = 0;
            while (!isSpaceChar(c) && c != '.') {
                if (c == 'e' || c == 'E')
                    return res * Math.pow(10, nextInt());
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            }
            if (c == '.') {
                c = read();
                double m = 1;
                while (!isSpaceChar(c)) {
                    if (c == 'e' || c == 'E')
                        return res * Math.pow(10, nextInt());
                    if (c < '0' || c > '9')
                        throw new InputMismatchException();
                    m /= 10;
                    res += (c - '0') * m;
                    c = read();
                }
            }
            return res * sgn;
        }
        public int[] nextIntArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }
        public long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        }
        public boolean hasNext() {
            int value;
            while (isSpaceChar(value = peek()) && value != -1)
                read();
            return value != -1;
        }

        private boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

    }
}