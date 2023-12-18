
import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        int h = fs.nextInt();
        int w = fs.nextInt();
        int n = fs.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = fs.nextInt();
        }
        int[][] color = new int[h][w];
        int colIdx = 0;
        int vec = 1;
        for(int i=0;i<h;i++){
            if(vec==1){
                for(int j=0;j<w;j++){
                    color[i][j] = 1+colIdx;
                    a[colIdx]--;
                    if(a[colIdx]==0){
                        colIdx++;
                    }
                }
            }else{
                for(int j=w-1;j>=0;j--){
                    color[i][j] = colIdx+1;
                    a[colIdx]--;
                    if(a[colIdx]==0){
                        colIdx++;
                    }
                }
            }
            vec = 1-vec;
        }
        PrintWriter out = new PrintWriter(System.out);
        for(int i=0;i<h;i++){
            for(int j=0;j<w;j++){
                out.print(color[i][j]);
                out.print(' ');
            }
            out.print('\n');
        }
        out.flush();
    }

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
