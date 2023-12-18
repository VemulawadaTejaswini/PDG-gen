import java.util.*;
import java.io.*;
class Main {
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int H = sc.nextInt();
        int W = sc.nextInt();
        int[][] a = new int[H+2][W+2];
        int[][] b = new int[H+2][W+2];
        int count = 0;
        for(int i = 0; i< H+2; i++) {
            for(int j = 0; j<W+2; j++) {
                if(i==0 || i==H+1 || j==0 || j==W+1) {
                    a[i][j] = -1;
                    continue;
                }
                a[i][j] = sc.nextInt();
            }
        }

        for(int i = 1; i< H+1; i++) {
            for(int j = 1; j<W+1; j++) {
                if(a[i][j] % 2 == 0) continue;
                if(a[i][j+1] % 2 != 0 && a[i][j+1] >= 0) {
                    b[i][j] = 1;
                    a[i][j]--;
                    a[i][j+1]++;
                    count++;
                    continue;
                }
                if(a[i+1][j] % 2 != 0 && a[i+1][j] >= 0) {
                    b[i][j] = 2;
                    a[i][j]--;
                    a[i+1][j]++;
                    count++;
                    continue;
                }
                if(a[i][j+1] >= 0) {
                    b[i][j] = 1;
                    a[i][j]--;
                    a[i][j+1]++;
                    count++;
                    continue;
                }
                if(a[i+1][j] >= 0) {
                    b[i][j] = 2;
                    a[i][j]--;
                    a[i+1][j]++;
                    count++;
                    continue;
                }
                b[i][j] = 0;
            }
        }
        System.out.println(count);
        for(int i = 1; i< H+1; i++) {
            for(int j = 1; j<W+1; j++) {
                if(b[i][j]==1) {
                    System.out.println(i + " " + j + " " +i+ " " +(j+1));
                }
                if(b[i][j]==2) {
                    System.out.println(i + " " + j + " " +(i+1)+ " " +j);
                }
            }
        }
    }
}
class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    private boolean hasNextByte() {
        if (ptr < buflen) {
            return true;
        } else {
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
 
    private int readByte() {
        if (hasNextByte())
            return buffer[ptr++];
        else
            return -1;
    }
 
    private boolean isPrintableChar(int c) {
        return 33 <= c && c <= 126;
    }
 
    public boolean hasNext() {
        while (hasNextByte() && !isPrintableChar(buffer[ptr]))
            ptr++;
        return hasNextByte();
    }
 
    public String next() {
        if (!hasNext())
            throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }
 
    public long nextLong() {
        if (!hasNext())
            throw new NoSuchElementException();
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
        while (true) {
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            } else if (b == -1 || !isPrintableChar(b)) {
                return minus ? -n : n;
            } else {
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }
 
    public int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
            throw new NumberFormatException();
        return (int) nl;
    }
 
    public double nextDouble() {
        return Double.parseDouble(next());
    }
}