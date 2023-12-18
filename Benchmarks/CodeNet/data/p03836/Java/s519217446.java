
import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        int sx = fs.nextInt();
        int sy = fs.nextInt();
        int tx = fs.nextInt();
        int ty = fs.nextInt();
        int xdiff = tx-sx;
        int ydiff = ty-sy;
        StringBuilder sb = new StringBuilder();
        //s -> t
        for(int i=0;i<xdiff;i++)sb.append('R');
        for(int i=0;i<ydiff;i++)sb.append('U');
        //t -> s
        for(int i=0;i<xdiff;i++)sb.append('L');
        for(int i=0;i<ydiff;i++)sb.append('D');

        //s -> t
        sb.append('D');
        for(int i=0;i<xdiff+1;i++)sb.append('R');
        for(int i=0;i<ydiff+1;i++)sb.append('U');
        sb.append('L');

        sb.append('U');
        for(int i=0;i<xdiff+1;i++)sb.append('L');
        for(int i=0;i<ydiff+1;i++)sb.append('D');
        sb.append('R');
        System.out.println(sb.toString());
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
