import java.io.*;
import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        int n = fs.nextInt();
        int[] as = new int[n];
        for( int index = 0 ; index < n ; index++ ){
            as[index] = fs.nextInt();
        }
        long[] dpAns = new long[n+1];
        boolean[] dpAnsCheck = new boolean[n+1];

        long[][] dp = new long[n+1][n+1];
        boolean[][] dpCheck = new boolean[n+1][n+1];

        // 出力分ループ
        for( int first = 0 ; first < n ; first++ ){

            // Aiを抜いた場合の回答が既に求められている場合は流用
            if( dpAnsCheck[ as[first] ] ){
                System.out.println( dpAns[ as[first] ] / 2 );
                continue;
            }

            long ans = 0;
            boolean[] check = new boolean[n+1];
            for( int second = 0 ; second < n ; second++ ){

                // Aiは抜かれてるので省略
                if( first == second ){
                    continue;
                }

                // Aiが抜かれている場合にAjのカウントを数える場合流用する
                if( dpCheck[ as[first] ][ as[second] ] ){
                    // 既に加算済みの場合は省略
                    if( check[ as[second] ] ) {
                        ans += dp[as[first]][as[second]];
                    }
                    continue;
                }

                // Aiが抜かれている場合のAjのカウントを数えていない場合は求める
                long count = 0;
                for( int third = second + 1; third < n ; third++ ){
                    if( third == first ){
                        continue;
                    }
                    if( as[third] == as[second] ){
                        count++;
                    }
                }

                dpCheck[ as[first] ][ as[second] ] = true;
                dp[ as[first] ][ as[second] ] = count;
                check[ as[second] ] = true;

                ans += count;
            }

            // Aiと同じ値がなくなる場合は流用するために保持
            dpAnsCheck[ as[first] ] = true;
            dpAns[ as[first] ] = ans;

            System.out.println( ans / 2 );

        }

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
