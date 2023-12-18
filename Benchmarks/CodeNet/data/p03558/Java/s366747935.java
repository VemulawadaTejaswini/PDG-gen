import java.util.*;
import java.io.*;

public class Main {
    private static IO io = new IO();
    
    public static void main(String[] args) {
        int k = io.nextInt();
        long d[] = new long[k];
        Arrays.fill(d, Long.MAX_VALUE);
        d[1] = 1;
        Deque<long[]> que = new ArrayDeque<>();
        que.offer(new long[] {1, 1});    // 総コスト、現在位置

        while (!que.isEmpty()) {
            long poll[] = que.poll();
            long dis = poll[0];
            long now = poll[1];
            if (dis > d[(int)now]) continue;

            if (d[(int)((now*10)%k)]>dis) {
                d[(int)((now*10)%k)] = dis;
                que.offerFirst(new long[] {dis, (now*10)%k});
            }

            if (d[(int)((now+1)%k)]>dis+1) {
                d[(int)((now+1)%k)] = dis+1;
                que.offerLast(new long[] {dis+1, (now+1)%k});
            }
        }

        System.out.println(d[0]);
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
            if (ptr < buflen) return true;
            else {
                ptr = 0;
                try {
                    buflen = in.read(buffer);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (buflen <= 0) return false;
            }
            return true;
        }
        int readByte() {
            if (hasNextByte()) return buffer[ptr++];
            else return -1;
        }
        boolean isPrintableChar(int c) {return 33<=c &&c <=126;}
        void skipUnprintable() {while(hasNextByte() && !isPrintableChar(buffer[ptr]))ptr++;}
        boolean hasNext() {
            skipUnprintable();
            return hasNextByte();
        }

        long nextLong() {
            if (!hasNext()) throw new NoSuchElementException();
            long n = 0;
            boolean minus = false;
            int b = readByte();
            if (b == '-') {
                minus = true;
                b = readByte();
            }
            if (b < '0' || '9' < b) throw new NumberFormatException();
            while (true) {
                if ('0' <= b && b <= '9') {
                    n *= 10;
                    n += b - '0';
                } else if (b == -1 || !isPrintableChar(b)) return minus ? -n : n;
                else throw new NumberFormatException();
                b = readByte();
            }
        }

        int nextInt() {
            long nl = nextLong();
            if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
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
