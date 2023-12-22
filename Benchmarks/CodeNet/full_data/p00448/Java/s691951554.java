import java.util.*;
import java.io.*;

public class Main {
    private static IO io = new IO();
    private static boolean map[][];
    private static int ys;
    private static int xs;
    private static int ans;
    public static void main(String[] args) {
        while (true) {

            ys = io.nextInt();
            xs = io.nextInt();
            if (ys==0) break;
            
            map = new boolean[xs][ys];
            for (int j = 0; j < ys; j++) {
                for (int i = 0; i < xs; i++) {
                    map[i][j] = io.nextInt()==1;
                }
            }

            for (int i=0; i<(1<<ys); i++) {
                int flip[] = new int[ys];
                for (int j=0; j<ys; j++) {
                    if ((i&1<<j)!=0) flip[j] = 1;
                }
                count(flip);
            }

            System.out.println(ans);

        }
    }

    private static void count(int flip[]) {
        for (int i = 0; i < ys; i++) {
            if (flip[i]==1) {
                for (int j = 0; j < xs; j++) {
                    map[j][i] = !map[j][i];
                }
            }
        }

        int total = 0;
        for (int i=0; i<xs; i++) {
            int cnt = 0;
            for (int j=0; j<ys; j++) {
                if (map[i][j]) cnt++;
            }
            total += Math.max(cnt, ys-cnt);
        }

        ans = Math.max(ans, total);

        for (int i = 0; i < ys; i++) {
            if (flip[i]==1) {
                for (int j = 0; j < xs; j++) {
                    map[j][i] = !map[j][i];
                }
            }
        }
    }

    static class IO extends PrintWriter {
        private final InputStream in;
        private final byte[] buffer = new byte[1024];
        private int ptr = 0;
        private int buflen = 0;

        IO() {
            this(System.in);
        }

        IO(InputStream source) {
            super(System.out);
            this.in = source;
        }

        boolean hasNextByte() {
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

        int readByte() {
            if (hasNextByte()) return buffer[ptr++];
            else return -1;
        }

        boolean isPrintableChar(int c) {
            return 33 <= c && c <= 126;
        }

        void skipUnprintable() {
            while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
        }


        boolean hasNext() {
            skipUnprintable();
            return hasNextByte();
        }

        long nextLong() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
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

        int nextInt() {
            long nl = nextLong();
            if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) {
                throw new NumberFormatException();
            }
            return (int) nl;
        }

        public void close() {
            super.close();
            try {
                in.close();
            } catch (IOException ignored) {
            }
        }
    }
}