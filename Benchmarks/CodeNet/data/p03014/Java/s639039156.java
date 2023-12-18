import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int h = sc.nextInt();
        int w = sc.nextInt();
        int[][] data = new int[h][w];
        for(int i=0; i<h; i++){
            String s = sc.next();
            for(int j=0; j<w; j++){
                if(s.charAt(j) == '#'){
                    data[i][j] = -1;
                }else{
                    data[i][j] = 0;
                }
            }
        }

        for(int i=0; i<h; i++){
            int s = 0;
            int e = 0;
            for(int j=0; j<w; j++){
                if(data[i][j] == -1){
                    e = j-1;
                    int l = e-s+1;
                    for(int k=s; k<=e; k++){
                        data[i][k] += l;
                    }
                    s = j+1;
                }else if( j == w-1){
                    e = j;
                    int l = e-s+1;
                    for(int k=s; k<=e; k++){
                        data[i][k] += l;
                    }
                }
            }
        }

        for(int i=0; i<w; i++){
            int s = 0;
            int e = 0;
            for(int j=0; j<h; j++){
                if(data[j][i] == -1){
                    e = j-1;
                    int l = e-s+1;
                    for(int k=s; k<=e; k++){
                        data[k][i] += l;
                    }
                    s = j+1;
                }else if( j == h-1){
                    e = j;
                    int l = e-s+1;
                    for(int k=s; k<=e; k++){
                        data[k][i] += l;
                    }
                }
            }
        }

        int ans = 0;
        for(int i=0; i<h; i++){
            for(int j=0; j<w; j++){
                ans = Math.max(ans, data[i][j]);
            }
        }

        System.out.println(ans-1);
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
