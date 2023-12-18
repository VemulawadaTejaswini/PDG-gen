import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Main {

    public static class CustomPair {
        int a;
        int b;
        public CustomPair(int a , int b ){
            this.a = a;
            this.b = b;
        }
    }

    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        int n = fs.nextInt();

        int[] as = new int[n-1];
        int[] bs = new int[n-1];
        for( int i = 0 ; i < n - 1; i++ ){
            int tempA = fs.nextInt();
            int tempB = fs.nextInt();
            if( tempA < tempB ){
                as[i] = tempA;
                bs[i] = tempB;
            }
            else {
                as[i] = tempB;
                bs[i] = tempA;
            }
        }

        boolean[] check = new boolean[n];
        List<CustomPair> customPairs = new ArrayList<>();
        int[] pos = new int[n];
        for( int i = 1 ; i < n + 1 ; i++ ){
            pos[i-1] = i;
            search(customPairs, as , bs , 0 , i , i , -1 , check );
        }

        for(int i = 0; i < customPairs.size() ; i++ ){
            CustomPair p = customPairs.get(i);
            int a = p.a;
            int b = p.b;
            if( ( b - a ) % 3 == 0 ){
                int notUse = -1;
                for( int j = b - 1 ; j < n ; j++ ){
                    if( !check[j] ) {
                        notUse = j;
                        check[j] = true;
                        break;
                    }
                }
                if( notUse == -1 ){
                    for( int j = b - 1 ; 0 <= j ; j-- ){
                        if( !check[j] ) {
                            notUse = j;
                            check[j] = true;
                            break;
                        }
                    }
                }
                if( notUse == -1 ){
                    System.out.println( -1 );
                    return;
                }
                int tempPos = pos[notUse];
                pos[notUse] = pos[b-1];
                pos[b-1] = tempPos;
            }
        }

        for( int i = 0 ; i < pos.length ; i++ ){
            System.out.print( pos[i] + " ");
        }

    }

    static void search(List<CustomPair> customPairs, int[] as , int[] bs , int count , int pos , int base , int before , boolean[] check ){
        for( int i = 0 ; i < as.length ; i++ ){
            if( as[i] == pos ){
                if( bs[i] != before ) {
                    if (count == 2) {
                        if( base < bs[i] ) {
                            check[base-1] = true;
                            check[bs[i]-1] = true;
                            customPairs.add(new CustomPair(base, bs[i]));
                        }
                    } else {
                        search(customPairs, as, bs, count + 1, bs[i], base, pos , check );
                    }
                }
            }
        }
        for( int i = 0 ; i < bs.length ; i++ ){
            if( bs[i] == pos ){
                if( as[i] != before ) {
                    if (count == 2) {
                        if( base < as[i] ) {
                            check[base-1] = true;
                            check[as[i]-1] = true;
                            customPairs.add(new CustomPair(base, as[i]));
                        }
                    } else {
                        search(customPairs, as, bs, count + 1, as[i], base, pos , check );
                    }
                }
            }
        }
    }

    static class FastScanner {
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
            if (hasNextByte()) {
                return buffer[ptr++];
            } else {
                return -1;
            }
        }

        private static boolean isPrintableChar(int c) {
            return 33 <= c && c <= 126;
        }

        public boolean hasNext() {
            while (hasNextByte() && !isPrintableChar(buffer[ptr])) {
                ptr++;
            }
            return hasNextByte();
        }

        public String next() {
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

        public long nextLong() {
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
