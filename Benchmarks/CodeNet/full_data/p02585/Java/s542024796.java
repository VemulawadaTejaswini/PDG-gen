
import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

public class Main {
    static int N,K;
    static int[] P,C;
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        N = (int)sc.nextLong();
        K = (int)sc.nextLong();
        P = new int[N];
        C = new int[N];
        for(int i=0; i<N; i++) P[i] = (int)sc.nextLong();
        for(int i=0; i<N; i++) C[i] = (int)sc.nextLong();

        long ans = Long.MIN_VALUE;
        for(int i=0; i<N; i++) {
            int j = i;
            long s = 0;
            for(int k=0; k<K; k++) {
                j = P[j]-1;
                s += C[j];
                ans = Math.max(ans,s);
            }
        }
        System.out.println(ans);
    }

    //https://qiita.com/p_shiki37/items/65c18f88f4d24b2c528b
    static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1024];
        private int ptr = 0;
        private int buflen = 0;
        private boolean hasNextByte() {
            if (ptr < buflen) {
                return true;
            }else{
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
        private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
        private boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
        private void skipUnprintable() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;}
        public boolean hasNext() { skipUnprintable(); return hasNextByte();}
        public String next() {
            if (!hasNext()) throw new NoSuchElementException();
            StringBuilder sb = new StringBuilder();
            int b = readByte();
            while(isPrintableChar(b)) {
                sb.appendCodePoint(b);
                b = readByte();
            }
            return sb.toString();
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
            while(true){
                if ('0' <= b && b <= '9') {
                    n *= 10;
                    n += b - '0';
                }else if(b == -1 || !isPrintableChar(b)){
                    return minus ? -n : n;
                }else{
                    throw new NumberFormatException();
                }
                b = readByte();
            }
        }
    }
}
