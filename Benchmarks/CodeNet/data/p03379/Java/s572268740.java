
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        int n = fs.nextInt();
        int[][] x = new int[n][2];
        for (int i = 0; i < n; i++) {
            x[i][0] = fs.nextInt();
            x[i][1] = i;
        }
        Arrays.sort(x, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        PrintWriter out = new PrintWriter(System.out);
        int mid = n/2;
        int[] res = new int[n];
        for(int i=0;i<n;i++){
            if(i < mid){
                res[x[i][1]] = x[n/2][0];
            }else{
                res[x[i][1]] = x[n/2-1][0];
            }
        }
        for (int i = 0; i < n; i++) {
            out.println(res[i]);
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
                    return buflen > 0;
                }
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