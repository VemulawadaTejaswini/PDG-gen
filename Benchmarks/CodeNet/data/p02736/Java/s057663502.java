import java.io.*;
import java.util.NoSuchElementException;

public class Main {

    /*

    1 - 1 = 0
    1 - 2 = 1
    1 - 3 = 2
    2 - 2 = 0
    2 - 3 = 1
    3 - 3 = 0

     */

    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        int n = fs.nextInt();
        String[] params = fs.next().split("");
        int[] as = new int[n];
        int leftNumPos = 0; // 左から順に値がある項目のindex
        int rightNumPos = n - 2; // 右から順に値がある項目のindex
        for( int i = 0 ; i < n ; i++ ){
            as[i] = Integer.parseInt(params[i]);
            if( i != 0 ){
                as[i-1] = Math.abs( as[i-1] - as[i] );
                if( i-1 == leftNumPos && as[i-1] == 0 ){
                    leftNumPos = i;
                }
            }
        }
        for( int i = rightNumPos ; leftNumPos <= i ; i-- ){
            // 右から値を確認して値が入ってくるまでカウントを進める
            if( as[i] != 0 ){
                rightNumPos = i;
                break;
            }
        }

        // debug
//        for( int i = 0 ; i < n ; i++ ){ System.out.print( as[i] ); }
//        System.out.println(" leftNum:" + leftNumPos + " rightNum:" + rightNumPos );
        // debug

        while( leftNumPos < rightNumPos ) {
            for (int i = leftNumPos + 1; i <= rightNumPos; i++) {
                as[i - 1] = Math.abs(as[i] - as[i - 1]);
                if (leftNumPos == i - 1 && as[i - 1] == 0) {
                    leftNumPos = i - 1;
                }
            }
            rightNumPos--;
            for (int i = rightNumPos; leftNumPos <= i; i--) {
                // 右から値を確認して値が入ってくるまでカウントを進める
                if (as[i] != 0) {
                    rightNumPos = i;
                    break;
                }
            }

            // debug
//            for( int i = 0 ; i < n ; i++ ){ System.out.print( as[i] ); }
//            System.out.println(" leftNum:" + leftNumPos + " rightNum:" + rightNumPos );
            // debug

        }
        System.out.println( as[leftNumPos] );

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
