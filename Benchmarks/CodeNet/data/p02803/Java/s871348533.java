
import java.util.*;
import java.io.*;
class Main {
    static int H,W;
    static char[][] c;
    static char[][] cc;
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        H = sc.nextInt();
        W = sc.nextInt();
        c = new char[H+2][W+2];
        cc = new char[H+2][W+2];
        for(int i = 0; i<H+2; i++) {
            for(int j = 0; j<W+2; j++) {
                if(i==0 || j==0|| i==H+1 || j== W+1) {
                    c[i][j] = '#';
                    cc[i][j] = '#';
                    continue;
                }
            }
        }
        for(int i = 1; i<H+1; i++) {
            String str = sc.next();
            for(int j = 1; j<W+1; j++) {
               c[i][j] = str.charAt(j-1);
                cc[i][j] = c[i][j];
            }
        }
        int max = 0;
        for(int i = 1; i<H+1; i++) {
            for(int j = 1; j<W+1; j++) {
                
               if(c[i][j] =='.') {
                    for(int ii = 1; ii<H+1; ii++) {
                        for(int ij = 1; ij<W+1; ij++) {
                            if(c[ii][ij]=='.') {
                                // for(int iii = 1; iii<H+1; iii++) {
                                //     for(int iij = 1; iij<W+1; iij++) {
                                //         cc[iii][iij] = c[iii][iij];
                                //     }
                                // }
                                
                                int tmp = dfs(i,j,ii,ij);
                                //pe(tmp);
                                if(max<tmp) pe(i+" "+j+" "+ii+" "+ij);
                                max = Math.max(max, tmp);
                            }
                        }
                    }
                }
            }
        }
        p(max);
    }
    public static int dfs(int i, int j, int gi, int gj) {
        if(i==gi && j==gj) return 0;
        //pe("aa"+i+" "+j+" "+gi+" "+gj);
        int min = 200;
        cc[i][j] = '#';
        if(cc[i+1][j]=='.') {
            min = Math.min(dfs(i+1,j,gi,gj)+1,min);
            //cc[i+1][j] = '.';
        }
        if(cc[i-1][j]=='.') {
            min = Math.min(dfs(i-1,j,gi,gj)+1,min);
            //cc[i-1][j] = '.';
        }
        if(cc[i][j+1]=='.') {
            min = Math.min(dfs(i,j+1,gi,gj)+1,min);
            //cc[i][j+1] = '.';
        }
        if(cc[i][j-1]=='.') {
            min = Math.min(dfs(i,j-1,gi,gj)+1,min);
            //cc[i][j-1] = '.';
        }
        cc[i][j] = '.';
        return min;
    }
    public static <T> void p(T element) {
	System.out.println(element);
    }
    public static <T> void pe(T element) {
        System.err.println(element);
        }
    public static int min(int a, int b, int c) {
	int min = Math.min(a,b);
	min = Math.min(min,c);
	return min;
    }
    public static int max(int a, int b,int c) {
	int max= Math.max(a,b);
	max = Math.max(max,c);
        return max;
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