import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigDecimal;

public class Main{
    public static void main (String[] args) throws java.lang.Exception {
        InputReader in = new InputReader(System.in);
        PrintWriter w = new PrintWriter(System.out);
        int n = in.nextInt(), max1 = 0, max2 = 0;
        HashMap<Integer, Integer> hm1 = new HashMap<>(), hm2 = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int temp = in.nextInt();
            if (i % 2 == 0) {
                if (!hm1.containsKey(temp))
                    hm1.put(temp, 0);
                hm1.put(temp, hm1.get(temp) + 1);
                if (hm1.get(temp) > max1)
                    max1 = hm1.get(temp);
            } else {
                if (!hm2.containsKey(temp))
                    hm2.put(temp, 0);
                hm2.put(temp, hm2.get(temp) + 1);
                if (hm2.get(temp) > max2)
                    max2 = hm2.get(temp);
            }
        }
        if (hm1.size() == 1 && hm2.size() == 1) {
            HashSet<Integer> hs = new HashSet<>();
            for (int x : hm1.keySet())
                hs.add(x);
            for (int x : hm2.keySet())
                hs.add(x);
            if (hs.size() == 1) {
                w.println(2);
                w.close();
                return;
            }
        }
        w.println((n / 2 - max1) + (n / 2 - max2));
        w.close();
    }
    /*static int fibo(int n) {
        if (n == 1 || n == 2)
            return 1;
        return fibo(n - 1) + fibo(n - 2);
    }
    static int fibo(int n) {
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