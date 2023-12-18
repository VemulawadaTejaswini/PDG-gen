import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.DelayQueue;

public class Main {

    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        int h = fs.nextInt();
        int w = fs.nextInt();
        String[][] ss = new String[h][w];
        for( int i = 0 ; i < h ; i++ ){
            ss[i] = fs.next().split("" );
        }

        int count = 1000000;

        Deque<Integer> posQueue = new ArrayDeque();

        // 変換カウント(3桁) + 白かどうか(1桁) + 縦座標(2桁) + 横座標(2桁)
        // 200 + 1 + 99 + 99
        posQueue.add(("#".equals(ss[0][0]) ? 1 : 0) * 10000 + ("#".equals(ss[0][0]) ? 0 : 1) * 1000); // 白かどうか　+ 縦座標 * 100 + 横座標

        while( !posQueue.isEmpty() ) {

            // 今いる場所
            int item = posQueue.poll();
            int changeCount = item / 10000;
            int isWhite = (item % 10000) / 1000;
            int hPos = (item % 1000) / 100;
            int wPos = item % 100;

            // 今いる場所が最終地点なら集計して終了
            if (hPos == h - 1 && wPos == w - 1) {
                count = Math.min(count, changeCount);
                continue;
            }

            // 下を見る
            if (hPos != h - 1) {
                // 白い場所から黒い場所へ移る場合のみカウントを増加
                int addCount = (isWhite == 1 && "#".equals(ss[hPos + 1][wPos])) ? 1 : 0;
                posQueue.add((changeCount+addCount)*10000 + (".".equals(ss[hPos + 1][wPos]) ? 1 : 0) * 1000 + (hPos + 1) * 100 + wPos);
            }
            // 右を見る
            if (wPos != w - 1) {
                // 白い場所から黒い場所へ移る場合のみカウントを増加
                int addCount = (isWhite == 1 && "#".equals(ss[hPos][wPos + 1])) ? 1 : 0;
                posQueue.add((changeCount+addCount)*10000 + (".".equals(ss[hPos][wPos+1]) ? 1 : 0) * 1000 + hPos * 100 + wPos + 1 );
            }
        }

        System.out.println( count );

    }

    static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1024];
        private int ptr = 0;
        private int bufferLength = 0;

        private boolean hasNextByte() {
            if (ptr < bufferLength) {
                return true;
            } else {
                ptr = 0;
                try {
                    bufferLength = in.read(buffer);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return bufferLength > 0;
            }
        }

        private int readByte() {
            if (hasNextByte()) {
                return buffer[ptr++];
            } else {
                return -1;
            }
        }

        private static boolean isPrintableChar(int c) {
            return 33 <= c && c <= 126;
        }

        boolean hasNext() {
            while (hasNextByte() && !isPrintableChar(buffer[ptr])) {
                ptr++;
            }
            return hasNextByte();
        }

        String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            StringBuilder sb = new StringBuilder();
            int b = readByte();
            while (isPrintableChar(b)) {
                sb.appendCodePoint(b);
                b = readByte();
            }
            return sb.toString();
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

        public int nextInt() {
            long nl = nextLong();
            if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) {
                throw new NumberFormatException();
            }
            return (int) nl;
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }
    }
}
