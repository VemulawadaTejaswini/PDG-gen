//Created by Aminul on 7/5/2020.

import java.io.*;
import java.util.*;

import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        FastReader in = new FastReader(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = in.nextInt(), k = in.nextInt();
        PriorityQueue<Long> pos = new PriorityQueue<>(),
                neg = new PriorityQueue<>();
        PriorityQueue<Long> posRev = new PriorityQueue<>(Collections.reverseOrder()),
                negRev = new PriorityQueue<>(Collections.reverseOrder());

        long mod = (long) 1e9 + 7;
        boolean hasZero = false;
        for (int i = 0; i < n; i++) {
            long x = in.nextInt();
            if (x > 0) {
                pos.add(x);
                posRev.add(x);
            } else if (x < 0) {
                neg.add(x);
                negRev.add(x);
            } else hasZero = true;
        }

        if (pos.size() + neg.size() < k) {
            pw.println(0);
        } else {
            boolean isPositive = false;
            for (int i = 0; i <= neg.size() && i <= k; i += 2) {
                if (i + pos.size() >= k) {
                    isPositive = true;
                    break;
                }
            }

            if (!isPositive) {
                if (hasZero) pw.println(0);
                else {
                    long res = 1;
                    while (k > 0) {
                        if (!posRev.isEmpty() && !negRev.isEmpty()) {
                            if (abs(negRev.peek()) <= abs(posRev.peek())) {
                                res = mod(res * negRev.poll(), mod);
                            } else {
                                res = mod(res * posRev.poll(), mod);
                            }
                        } else if (!posRev.isEmpty()) {
                            res = mod(res * posRev.poll(), mod);
                        } else {
                            res = mod(res * negRev.poll(), mod);
                        }
                        k--;
                    }

                    pw.println(res);
                }
            } else {
                long res = 1;
                while (k > 0) {
                    if (k >= 2 && pos.size() >= 2 && neg.size() >= 2) {
                        long p1 = pos.poll(), p2 = pos.poll();
                        long n1 = neg.poll(), n2 = neg.poll();
                        if (p1 * p2 >= n1 * n2) {
                            res = (res * ((p1 * p2) % mod)) % mod;
                            neg.add(n1);
                            neg.add(n2);
                        } else {
                            res = (res * ((n1 * n2) % mod)) % mod;
                            pos.add(p1);
                            pos.add(p2);
                        }
                        k -= 2;
                    } else if (k >= 2 && neg.size() >= 2) {
                        long n1 = neg.poll(), n2 = neg.poll();
                        res = (res * ((n1 * n2) % mod)) % mod;
                        k -= 2;
                    } else if (pos.size() > 0) {
                        res = (res * pos.poll()) % mod;
                        k--;
                    }
                }

                pw.println(res);
            }
        }

        pw.close();
    }

    public static long mod(long a, long m) {
        long A = (a % m);
        return A >= 0 ? A : A + m;
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
            while (!isEndOfLine(c)){
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