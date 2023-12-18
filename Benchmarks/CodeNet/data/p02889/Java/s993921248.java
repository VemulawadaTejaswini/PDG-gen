import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Main {
    static int n;
    static boolean[][] map;
    static ArrayList<ArrayList<Integer>> next;
    static final long BIG = 10000000000000L;
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int n = sc.nextInt();
        int m = sc.nextInt();
        long l = sc.nextInt();
        long[][] map = new long[n][n];
        for (int i = 0; i < map.length; i++) {
            Arrays.fill(map[i], BIG);
        }

        for (int i = 0; i < m; i++) {
            int ma = sc.nextInt() - 1;
            int mb = sc.nextInt() - 1;
            int mc = sc.nextInt();

            map[ma][mb] = mc;
            map[mb][ma] = mc;
        }

        for (int i = 0; i < n; i++) {
            map[i][i] = 0;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int j2 = 0; j2 < n; j2++) {
                    map[j][j2] = Math.min(map[j][j2], map[j][i] + map[i][j2]);
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(map[i][j] >= BIG) map[i][j] = BIG;
                if(map[i][j] <= l){
                    map[i][j] = 1;
                }else{
                    map[i][j] = BIG;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int j2 = 0; j2 < n; j2++) {
                    map[j][j2] = Math.min(map[j][j2], map[j][i] + map[i][j2]);
                }
            }
        }

        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int ms = sc.nextInt() - 1;
            int mt = sc.nextInt() - 1;
            long mans = map[ms][mt];
            if(mans < BIG){
                System.out.println(mans - 1);
            }else{
                System.out.println(- 1);
            }
        }
    }



    private static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1024];
        private int ptr = 0;
        private int buflen = 0;

        private boolean hasNextByte() {
            if (ptr < buflen) {
                return true;
            } else {
                ptr = 0;
                try {
                    buflen = in.read(buffer);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (buflen <= 0) {
                    return false;
                }
            }
            return true;
        }

        private int readByte() {
            if (hasNextByte())
                return buffer[ptr++];
            else
                return -1;
        }

        private static boolean isPrintableChar(int c) {
            return 33 <= c && c <= 126;
        }

        public boolean hasNext() {
            while (hasNextByte() && !isPrintableChar(buffer[ptr]))
                ptr++;
            return hasNextByte();
        }

        public String next() {
            if (!hasNext())
                throw new NoSuchElementException();
            StringBuilder sb = new StringBuilder();
            int b = readByte();
            while (isPrintableChar(b)) {
                sb.appendCodePoint(b);
                b = readByte();
            }
            return sb.toString();
        }

        public long nextLong() {
            if (!hasNext())
                throw new NoSuchElementException();
            long n = 0;
            boolean minus = false;
            int b = readByte();
            if (b == '-') {
                minus = true;
                b = readByte();
            }
            if (b < '0' || '9' < b) {
                throw new NumberFormatException();
            }
            while (true) {
                if ('0' <= b && b <= '9') {
                    n *= 10;
                    n += b - '0';
                } else if (b == -1 || !isPrintableChar(b)) {
                    return minus ? -n : n;
                } else {
                    throw new NumberFormatException();
                }
                b = readByte();
            }
        }

        public int nextInt() {
            long nl = nextLong();
            if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
                throw new NumberFormatException();
            return (int) nl;
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }
    }

}

