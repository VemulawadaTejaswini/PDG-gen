import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;

public class Main {
    static class FS {
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
            return hasNextByte() ? buffer[ptr++] : -1;
        }

        private boolean isPrintableChar(int c) {
            return 33 <= c && c <= 126;
        }

        private void skipUnprintable() {
            while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
        }

        public boolean hasNext() {
            skipUnprintable();
            return hasNextByte();
        }

        public String next() {
            if (!hasNext()) throw new NoSuchElementException();
            StringBuilder sb = new StringBuilder();
            int b = readByte();
            while (isPrintableChar(b)) {
                sb.appendCodePoint(b);
                b = readByte();
            }
            return sb.toString();
        }

        public int nextInt() {
            return (int) nextLong();
        }

        public long nextLong() {
            if (!hasNext()) throw new NoSuchElementException();
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
    }

    public static void main(String[] args) throws Exception {
        FS fs = new FS();
//        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//        String s = bf.readLine();
//        int n = Integer.parseInt(s.substring(0, s.indexOf(' ')));//n packages
//        int k = Integer.parseInt(s.substring(s.indexOf(' '), s.length()));//k trucks
        int n = fs.nextInt();
        int k = fs.nextInt();
        int p = 0;
        int resids = 0;
        int ink = 1;//当前已用卡车
        boolean index = true;//首次

        int[] np = new int[n];
        int max=0;
        for (int i = 0; i < n; i++) {

            np[i] = fs.nextInt();
            max=max<np[i]?np[i]:max;
        }
         p=max;
        resids=p;
        for (int i = 0; i < n; i++) {
            int j = np[i];
            if (resids >= j) {
                resids -= j;
            } else {
                ink++;
                resids = p;
                i--;
                if (ink > k) {
                    p++;
                    i = -1;
                    resids = p;
                    ink = 1;
                    continue;
                }
            }
        }
        System.out.println(p);
    }
}
