
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        FastReader in = new FastReader(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        ArrayDeque<Long> A = new ArrayDeque<>();
        ArrayDeque<Long> B = new ArrayDeque<>();

        int N = in.nextInt(), M = in.nextInt();
        Long K = in.nextLong();
        for (int i = 0; i < N; i++) {
            A.add(in.nextLong());
        }
        for (int i = 0; i < M; i++) {
            B.add(in.nextLong());
        }
        pw.println(solve(A, B, K));
        pw.close();
    }

    static long solve(ArrayDeque<Long> A, ArrayDeque<Long> B, Long K) {
        Long res = Long.valueOf(0);
        while (true) {
            if (!A.isEmpty() && !B.isEmpty()) {
                if (A.peek() < B.peek()){
                    if (A.peek() <= K) {
                        K -= A.poll();
                        res++;
                    } else {
                        break;
                    }
                } else {
                    if (B.peek() <= K){
                        K -= B.poll();
                        res++;
                    } else {
                        break;
                    }
                }
            }
            else if (!A.isEmpty() && A.peek() <= K) {
                K -= A.poll();
                res++;
            }
            else if (!B.isEmpty() && B.peek() <= K) {
                res++;
                K -= B.poll();
            } else {
                break;
            }
        }
        return res;
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