import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int n = sc.nextInt();
        int k = sc.nextInt();
        String s = sc.next();
        int[] d = new int[n];
        for(int i=0; i<n; i++){
            if(s.charAt(i) == 'L'){
                d[i] = -1;
            }else{
                d[i] = 1;
            }
        }

        int num = 0;
        int dir = 0;
        if(d[0] + d[n-1] >= 0){
            dir = 1;
        }else{
            dir = -1;
        }

        int ans = 0;
        if(n > 1){
            if(d[0] == 1 && d[1] == 1) ans++;
        }
        if(n > 2){
            if(d[n-1] == -1 && d[n-2] == -1) ans++;
        }

        for(int i=1; i<n-1; i++){
            if(d[i] == -1 && d[i-1] == -1) ans++;
            if(d[i] == 1 && d[i+1] == 1) ans++;
        }


        int lpos = 0;
        int rpos = n-1;

        
        for(int i=0; i<k; i++){
            int mdir = i % 2 == 0 ? dir : -dir;
            int muse = 0;
            for(; lpos<=rpos; lpos++){
                if(d[lpos] != mdir){
                    ans++;
                    // if(lpos == 0 && dir == 1) ans--;
                    muse++;
                    break;
                }
            }
            for(; rpos >= lpos; rpos--){
                if(d[rpos] != mdir){
                    ans++;
                    // if(rpos == n-1 && dir == -1) ans--;
                    muse++;
                    break;
                }
            }
        }

        if(d[0] != d[n-1]){
            int ndir = k % 2 == 0 ? dir : -dir;
            boolean same = true;
            for(int i = lpos; i<= rpos; i++){
                if(d[i] != ndir) same = false;
            }

            if(same) ans--;
        }

        System.out.println(ans);

    }

    private static class FastScanner {
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
        private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
        public boolean hasNext() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; return hasNextByte();}
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
        public int nextInt() {
            long nl = nextLong();
            if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
            return (int) nl;
        }
        public double nextDouble() { return Double.parseDouble(next());}
    }
}
