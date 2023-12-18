import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int n = sc.nextInt();
        ArrayList[] a = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            a[i] = new ArrayList<Integer>();
            int na = sc.nextInt();
            for (int j = 0; j < na; j++) {
                int mx = sc.nextInt();
                int my = sc.nextInt();
                if(my == 1){
                    a[i].add(mx);
                }else{
                    a[i].add(-mx);
                }
            }
        }

        int ans = 0;
        out: for (int i = 0; i < Math.pow(2, n); i++) {
            String mbin = "000000000000000" + Integer.toBinaryString(i);
            boolean[] data = new boolean[n];
            for (int j = 0; j < n; j++) {
                if(mbin.charAt(mbin.length() - 1- j) == '1'){
                    data[j] = true;
                }else{
                    data[j] = false;
                }
            }

            int[] mdata = new int[n];
            int mans = 0;
            for (int j = 0; j < n; j++) {
                if(data[j]){
                    if(mdata[j] == -1) continue out;
                    else mdata[j] = 1;
                    mans++;
                    for (int k = 0; k < a[j].size(); k++) {
                        int ma = (int)a[j].get(k);
                        if(ma > 0){
                            ma--;
                            if(mdata[ma] == -1) continue out;
                            else mdata[ma] = 1;
                        }else{
                            ma = -ma - 1;
                            if(mdata[ma] == 1) continue out;
                            else mdata[ma] = -1;
                        }
                    }
                }else{
                    if(mdata[j] == 1) continue out;
                    else mdata[j] = -1;
                }
            }
            ans = Math.max(ans, mans);
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
