import java.io.*;
import java.math.BigInteger;
import java.util.*;


public class Main {

    static long mod = ((long) (1E9 + 7));

    public static void main(String[] args) {
//        Parser scr = new Parser(System.in);
        FastScanner scr = new FastScanner();
        PrintWriter out = new PrintWriter(System.out, true);
//        int t = scr.nextInt();
//        while (t-- > 0)
        solve(scr, out);
        out.close();
    }


    static void solve(FastScanner in, PrintWriter out) {
//        int N = in.nextInt();
//        int M = in.nextInt();
//        int X = in.nextInt();
//        int[] a = new int[M];
//        for (int i = 0; i < N; i++) {
//            int C = in.nextInt();
//            a[i] = in.nextInt();
//
//        }
        long A = in.nextLong();
        long B = in.nextLong();
        long C = in.nextLong();
        long K = in.nextLong();
        long S = 0;

        if (A <= K) {
            S += A;
            K -= A;

        } else {
            S += K;
            K = 0;
        }
        if (K == 0) {
            out.println(S);
            return;
        }

        if (B <= K) {
            K -= B;
        } else {
            K = 0;
        }
        if (K == 0) {
            out.println(S);
            return;
        }
        if (C <= K) {
            S -= C;
        } else {
            S -= K;
        }
        out.println(S);


    }

    static class Parser {
        final private int BUFFER_SIZE = 1 << 16;
        private DataInputStream din;
        private byte[] buffer;
        private int bufferPointer, bytesRead;

        public Parser(InputStream in) {
            din = new DataInputStream(in);
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public String nextString(int maxSize) {
            byte[] ch = new byte[maxSize];
            int point = 0;
            try {
                byte c = read();
                while (c == ' ' || c == '\n' || c == '\r')
                    c = read();
                while (c != ' ' && c != '\n' && c != '\r') {
                    ch[point++] = c;
                    c = read();
                }
            } catch (Exception e) {
            }
            return new String(ch, 0, point);
        }

        public int nextInt() {
            int ret = 0;
            boolean neg;
            try {
                byte c = read();
                while (c <= ' ')
                    c = read();
                neg = c == '-';
                if (neg)
                    c = read();
                do {
                    ret = ret * 10 + c - '0';
                    c = read();
                } while (c > ' ');

                if (neg) return -ret;
            } catch (Exception e) {
            }
            return ret;
        }

        public long nextLong() {
            long ret = 0;
            boolean neg;
            try {
                byte c = read();
                while (c <= ' ')
                    c = read();
                neg = c == '-';
                if (neg)
                    c = read();
                do {
                    ret = ret * 10 + c - '0';
                    c = read();
                } while (c > ' ');

                if (neg) return -ret;
            } catch (Exception e) {
            }
            return ret;
        }

        private void fillBuffer() {
            try {
                bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
            } catch (Exception e) {
            }
            if (bytesRead == -1) buffer[0] = -1;
        }

        private byte read() {
            if (bufferPointer == bytesRead) fillBuffer();
            return buffer[bufferPointer++];
        }
    }


    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner() {
            init();
        }

        public FastScanner(String name) {
            init(name);
        }

        public FastScanner(boolean isOnlineJudge) {
            if (!isOnlineJudge || System.getProperty("ONLINE_JUDGE") != null) {
                init();
            } else {
                init("input.txt");
            }
        }

        private void init() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        private void init(String name) {
            try {
                br = new BufferedReader(new FileReader(name));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        public String nextToken() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(nextToken());
        }


        public long nextLong() {
            return Long.parseLong(nextToken());
        }

        public double nextDouble() {
            return Double.parseDouble(nextToken());
        }

    }


}
