import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] k = new int[m];
        ArrayList<Integer>[] s = new ArrayList[m];
        for(int i=0; i<m; i++){
            s[i] = new ArrayList<Integer>();
            k[i] = sc.nextInt();
            for(int j=0; j<k[i]; j++){
                s[i].add(sc.nextInt());
            }
        }
        int[] p = new int[m];
        for(int i=0; i<m; i++){
            p[i] = sc.nextInt();
        }

        int ans = 0;
        out: for(int i=0; i<2<<n; i++){
            String si = "0000000000" + Integer.toBinaryString(i);
            boolean[] bi = new boolean[n];
            for(int j=0; j<n; j++){
                bi[j] = si.charAt(si.length()-j-1) == '1';
            }           
            for(int j=0; j<m; j++){
                int count = 0;
                for(Integer ms: s[j]){
                    if(bi[ms-1]) count++;
                }
                if(count % 2 != p[j]) continue out;
            }

            ans++;
        }

        System.out.println(ans/2);
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
