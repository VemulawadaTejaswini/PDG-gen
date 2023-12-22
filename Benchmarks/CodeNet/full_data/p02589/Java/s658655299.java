

import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Set;

public class Main {
    static int N;
    static String[] S;
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        N = (int)sc.nextLong();
        S = new String[N];

        int maxlen = 0;
        for(int i=0; i<N; i++) {
            S[i] = sc.next();
            maxlen = Math.max(maxlen, S[i].length());
        }

        Set<String>[] T = new Set[maxlen+1];
        for(String s: S) {
            if(T[s.length()] == null) T[s.length()] = new HashSet<String>();
            T[s.length()].add(s);
        }

        int ans = 0;
        for(String s: S) {
            Set<String> pre = new HashSet<>();
            pre.add("" + s.charAt(0));
            for(int l = s.length()-1; l > 0; l--) {
                pre.add("" + s.charAt(s.length()-l));
                if (T[l] == null) continue;
                for(String p: pre) {
                    String suf = l==1 ? "" : s.substring(s.length()-l+1);
                    if(T[l].contains(p + suf)) ans++;
                }
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
