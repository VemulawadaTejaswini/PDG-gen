import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        FastScanner fs = new FastScanner();
        int n = fs.nextInt();
        int m = fs.nextInt();
        int[] as = new int[m + 1];
        int[] bs = new int[m + 1];
        List<Integer>[] nextList = new ArrayList[n+1];
        int[][] dp = new int[n+1][2];
        for( int i = 0 ; i < m ; i++ ){
            as[i] = fs.nextInt();
            bs[i] = fs.nextInt();
            int min = Math.min( as[i] , bs[i] );
            int max = Math.max( as[i] , bs[i] );
            if( nextList[ min ] == null ){
                nextList[ min ] = new ArrayList<>();
            }
            if( nextList[max] == null ){
                nextList[max] = new ArrayList<>();
            }
            nextList[min].add( max );
            nextList[max].add( min );
        }
        Queue<Integer> queue = new ArrayDeque<>();
        if( nextList[1] == null ){
            System.out.println( "No" );
            return;
        }

        queue.add(0); // 移動した回数
        queue.add(1); // 初期位置
        dp[1][0] = Integer.MAX_VALUE; // 最短距離を保存
        dp[1][1] = 0; // 最短ルートを保存

        while( !queue.isEmpty() ){
            int val = queue.poll(); //移動した回数
            int pos = queue.poll(); // 位置

            for( int i = 0 ; i < nextList[pos].size() ; i++ ){
                int next = nextList[pos].get(i);
                // まだ通ったことがなければ今の状態を保存
                if( dp[next][0] == 0 ){
                    dp[next][0] = val + 1;
                    dp[next][1] = pos;
                    queue.add(val+1);
                    queue.add(next);
                }
                // 既に通ったことがあれば最小値を保存
                else{
                    if( val + 1 < dp[next][0] ){
                        dp[next][0] = val + 1;
                        dp[next][1] = pos;
                        queue.add(val+1);
                        queue.add(next);
                    }
                }
            }
        }

        for( int i = 2 ; i < n + 1 ; i++ ){
            if( dp[i][0] == 0 ){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
        for( int i = 2 ; i < n + 1 ; i++ ){
            System.out.println( dp[i][1] );
        }

//        System.out.println( "通れる場所\n部屋:距離:道しるべ:ルート");
//        for( int i = 1 ; i < n + 1 ; i++ ){
//            System.out.print( i + ":" );
//            System.out.print( dp[i][0] + ":" + dp[i][1] + ":" );
//            for( int j = 0 ; j < nextList[i].size() ; j++ ){
//                System.out.print( nextList[i].get(j) + "\t" );
//            }
//            System.out.println();
//        }




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

    private static int gcd( int a , int b ){
        int x;
        int y;
        if (a > b) {
            x = a;
            y = b;
        } else {
            x = b;
            y = a;
        }
        int tmp;
        while ((tmp = x % y) != 0) {
            x = y;
            y = tmp;
        }
        return y;
    }

}
