import java.io.*;
import java.util.ArrayDeque;
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
            String[] params = fs.next().split("" );
            for( int j = 0 ; j < w ; j++ ){
                ss[i][j] = params[j];
            }
        }

        int count = 1000000;

        Queue<Integer> posQueue = new ArrayDeque();
        posQueue.add( 0 ); // 縦座標
        posQueue.add( 0 ); // 横座標
        posQueue.add( "#".equals(ss[0][0]) ? 0 : 1 ); // 白かどうか
        posQueue.add( "#".equals(ss[0][0]) ? 1 : 0 ); // 変換カウント

        while( !posQueue.isEmpty() ){

            // 今いる場所
            int hPos = posQueue.poll();
            int wPos = posQueue.poll();
            int isWhite = posQueue.poll();
            int changeCount = posQueue.poll();

            // 今いる場所が最終地点なら集計して終了
            if( hPos == h - 1 && wPos == w - 1 ){
                count = Math.min( count , changeCount );
                continue;
            }


            // 下を見る
            if( hPos != h - 1 ) {
                // 今いる場所が白の場合
                if (isWhite == 1) {
                    // 次の場所が白な場合
                    if (".".equals(ss[hPos + 1][wPos])) {
                        posQueue.add(hPos + 1);
                        posQueue.add(wPos);
                        posQueue.add(1);
                        posQueue.add(changeCount);
                    }
                    // 次の場所が黒の場合
                    else {
                        posQueue.add(hPos + 1);
                        posQueue.add(wPos);
                        posQueue.add(0); // 白じゃない
                        posQueue.add(changeCount + 1); // 変換
                    }
                }
                // 今いる場所が黒の場合
                else {
                    // 次の場所が白な場合
                    if (".".equals(ss[hPos + 1][wPos])) {
                        posQueue.add(hPos + 1);
                        posQueue.add(wPos);
                        posQueue.add(1);
                        posQueue.add(changeCount);
                    }
                    // 次の場所が黒の場合
                    else {
                        posQueue.add(hPos + 1);
                        posQueue.add(wPos);
                        posQueue.add(0); // 白じゃない
                        posQueue.add(changeCount); // 変換をしない
                    }
                }
            }
            // 右を見る
            if( wPos != w - 1 ) {
                // 今いる場所が白の場合
                if (isWhite == 1) {
                    // 次の場所が白な場合
                    if (".".equals(ss[hPos][wPos + 1])) {
                        posQueue.add(hPos);
                        posQueue.add(wPos + 1);
                        posQueue.add(1);
                        posQueue.add(changeCount);
                    }
                    // 次の場所が黒の場合
                    else {
                        posQueue.add(hPos);
                        posQueue.add(wPos + 1);
                        posQueue.add(0); // 白じゃない
                        posQueue.add(changeCount + 1); // 変換
                    }
                }
                // 今いる場所が黒の場合
                else {
                    // 次の場所が白な場合
                    if (".".equals(ss[hPos][wPos + 1])) {
                        posQueue.add(hPos);
                        posQueue.add(wPos + 1);
                        posQueue.add(1);
                        posQueue.add(changeCount);
                    }
                    // 次の場所が黒の場合
                    else {
                        posQueue.add(hPos);
                        posQueue.add(wPos + 1);
                        posQueue.add(0); // 白じゃない
                        posQueue.add(changeCount); // 変換をしない
                    }
                }
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
