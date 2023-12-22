//Created by Aminul on 9/13/2020.

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.TreeMap;

public class F_2 {
    public static void main(String[] args) throws Exception {
        FastReader in = new FastReader(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = in.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
            b[i] = x;
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        int majA = majorityElement(n, a), majB = majorityElement(n, b);
        if (majA != -1 && majA == majB) {
            pw.println("No");
        } else {
            b = solve(n, a, map);
            if (b == null) pw.println("No");
            else {
                pw.println("Yes");
                for (int i : b) pw.print(i + " ");
                pw.println();
            }
        }

        pw.close();
    }

    static boolean check(int n, int[] a, int[] b) {
        for (int i = 0; i < n; i++) {
            if (a[i] == b[i]) return false;
        }
        return true;
    }

    static int[] solveRandom(int n, int[] a, int[] b) {
        for (int i = 0; i < 500; i++) {
            shuffle(b);
            if (check(n, a, b)) return b;
        }
        return null;
    }

    public static void shuffle(int[] a) {
        Random rnd = new Random();
        for (int i = a.length - 1; i >= 1; i--) {
            int j = rnd.nextInt(i + 1);
            int t = a[i];
            a[i] = a[j];
            a[j] = t;
        }
    }

    static int[] solve(int n, int[] a, int b[]) {
        n--;
        int N = n;
        for (int i = 0; i <= n; i++) {
            if (a[i] == b[i]) {
                int tmp = b[n];
                b[n] = b[i];
                b[i] = tmp;
                n--;
            }
        }

        return b;
    }

    static int[] solve(int n, int[] a, TreeMap<Integer, Integer> map) {
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            
            Integer val = map.firstKey();
            if (val.equals(a[i])) val = map.lastKey();
            if (val.equals(a[i])) val = map.lowerKey(a[i]);
            if (val == null) val = map.higherKey(a[i]);
            //debug(i, a[i], val);
            if (val == null) return null;
            map.put(val, map.getOrDefault(val, 0) - 1);
            if (map.get(val) == 0) map.remove(val);
            b[i] = val;
        }
        return b;
    }

    static int majorityElement(int n, int[] a) {
        int f[] = new int[n + 1];
        for (int i : a) {
            f[i]++;
            if (f[i] > n / 2) return i;
        }
        return -1;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }

    static class FastReader {
        InputStream is;
        private byte[] inbuf = new byte[1024];
        private int lenbuf = 0, ptrbuf = 0;

        public FastReader(InputStream is) {
            this.is = is;
        }

        public int readByte() {
            if (lenbuf == -1) throw new InputMismatchException();
            if (ptrbuf >= lenbuf) {
                ptrbuf = 0;
                try {
                    lenbuf = is.read(inbuf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (lenbuf <= 0) return -1;
            }
            return inbuf[ptrbuf++];
        }

        public boolean isSpaceChar(int c) {
            return !(c >= 33 && c <= 126);
        }

        private boolean isEndOfLine(int c) {
            return c == '\n' || c == '\r' || c == -1;
        }

        public int skip() {
            int b;
            while ((b = readByte()) != -1 && isSpaceChar(b)) ;
            return b;
        }

        public String next() {
            int b = skip();
            StringBuilder sb = new StringBuilder();
            while (!(isSpaceChar(b))) {
                sb.appendCodePoint(b);
                b = readByte();
            }
            return sb.toString();
        }


        public String nextLine() {
            int c = skip();
            StringBuilder sb = new StringBuilder();
            while (!isEndOfLine(c)) {
                sb.appendCodePoint(c);
                c = readByte();
            }
            return sb.toString();
        }

        public int nextInt() {
            int num = 0, b;
            boolean minus = false;
            while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-')) ;
            if (b == '-') {
                minus = true;
                b = readByte();
            }
            while (true) {
                if (b >= '0' && b <= '9') {
                    num = (num << 3) + (num << 1) + (b - '0');
                } else {
                    return minus ? -num : num;
                }
                b = readByte();
            }
        }

        public long nextLong() {
            long num = 0;
            int b;
            boolean minus = false;
            while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-')) ;
            if (b == '-') {
                minus = true;
                b = readByte();
            }

            while (true) {
                if (b >= '0' && b <= '9') {
                    num = (num << 3) + (num << 1) + (b - '0');
                } else {
                    return minus ? -num : num;
                }
                b = readByte();
            }
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public char[] next(int n) {
            char[] buf = new char[n];
            int b = skip(), p = 0;
            while (p < n && !(isSpaceChar(b))) {
                buf[p++] = (char) b;
                b = readByte();
            }
            return n == p ? buf : Arrays.copyOf(buf, p);
        }

        public char readChar() {
            return (char) skip();
        }
    }
}