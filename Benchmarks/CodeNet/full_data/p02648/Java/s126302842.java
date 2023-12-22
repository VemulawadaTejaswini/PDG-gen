import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.NoSuchElementException;

public class Main {
    static int N,Q;
    static int[] V,W,U,L;
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        N = (int)sc.nextLong();
        V = new int[N];
        W = new int[N];
        for(int i=0; i<N; i++) {
            V[i] = (int)sc.nextLong();
            W[i] = (int)sc.nextLong();
        }
        Q = (int)sc.nextLong();
        U = new int[Q];
        L = new int[Q];
        for(int i=0; i<Q; i++) {
            U[i] = (int)sc.nextLong();
            L[i] = (int)sc.nextLong();
        }

        HashMap<Integer, Integer> dp,dp2;
        for(int i=0; i<Q; i++) {
            dp = new HashMap<>();
            dp.put(0, 0);
            int u = U[i];
            int l = L[i];
            while (u > 0) {
                int v = V[u-1];
                int w = W[u-1];
                dp2 = new HashMap<>();
                for (Entry<Integer, Integer> e: dp.entrySet()) {
                    int w0 = e.getKey();
                    int v0 = e.getValue();
                    if(dp2.containsKey(w0)) {
                        dp2.put(w0, Math.max(dp2.get(w0), v0));
                    } else {
                        dp2.put(w0, v0);
                    }
                    if (w0+w > l) continue;
                    if(dp2.containsKey(w0+w)) {
                        dp2.put(w0+w, Math.max(dp2.get(w0+w), v0+v));
                    } else {
                        dp2.put(w0+w, v0+v);
                    }
                }
                dp = dp2;
                u /= 2;
            }
            int ans = 0;
            for (Entry<Integer, Integer> e: dp.entrySet()) {
                ans = Math.max(ans, e.getValue());
            }
            System.out.println(ans);
        }

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
