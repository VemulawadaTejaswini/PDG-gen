import java.io.*;
import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        int n = fs.nextInt();
        int[] as = new int[n];
        int max = 0;
        for( int i = 0 ; i < n ; i++ ){
            as[i] = fs.nextInt();
            max = Math.max(as[i],max);
        }
        int[] dpAns = new int[max+1];
        boolean[] dpAnsCheck = new boolean[max+1];
        int[][] dp = new int[max+1][max+1];
        boolean[][] dpCheck = new boolean[max+1][max+1];

        for( int i = 0 ; i < n ; i++ ){
            // Aiを抜いた場合の回答が既に求められている場合は流用
            if( dpAnsCheck[ as[i] ] ){
                System.out.println( dpAns[ as[i] ] / 2);
                continue;
            }

            // 求められていない場合は計算
            int ans = 0;
            for( int j = 0 ; j < n ; j++ ){

                if( i == j ){
                    continue;
                }

                // Aiが抜かれている場合にAjのカウントを数える場合流用する
                if( dpCheck[ as[i] ][ as[j] ] ){
                    ans += dp[ as[i] ][ as[j] ];
                    continue;
                }

                // Aiが抜かれている場合のAjのカウントを数えていない場合は求める
                int count = 0;
                for( int k = j ; k < n ; k++ ){
                    if( k == i || k == j ){
                        continue;
                    }
                    if( as[k] == as[j] ){
                        count++;
                    }
                }

                dpCheck[ as[i] ][ as[j] ] = true;
                dp[ as[i] ][ as[j] ] = count;

                ans += count;
            }

            // Aiと同じ値がなくなる場合は流用するために保持
            dpAnsCheck[ as[i] ] = true;
            dpAns[ as[i] ] = ans;

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
