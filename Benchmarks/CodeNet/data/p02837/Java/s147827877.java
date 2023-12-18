
import java.util.*;
import java.io.*;
class Main {
    static int[][] a;
    static int N;
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        N = sc.nextInt();
        a = new int[N][N+1];
        for(int i = 0; i<N; i++) {
            for(int j = 0; j<N+1; j++) a[i][j] = -1;
        }
        for(int i = 0; i<N; i++) {
            int x = sc.nextInt();
            for(int j = 0; j<x; j++) {
                a[i][sc.nextInt()] = sc.nextInt();
            }
        }
        int[] person = new int[N+1];
        for(int i = 0; i<=N; i++) person[i] = -1;
        int ans = dfs(0, person);
	    p(ans);
    }
    public static int dfs(int dep, int[] person) {
        //for(int i = 1; i<=N; i++) p(dep+" "+i+" "+person[i]);
        if(dep == N) {
            int cnt = 0;
            for(int i = 1; i<=N; i++) {
                if(person[i]!=0) cnt++;
            }
            return cnt;
        }
        int max = 0;
        int[] p = new int[N+1];
        for(int i = 0; i<=N; i++) p[i] = person[i];
        if(person[dep+1]!=1) {
            p[dep+1]=0;
            max = dfs(dep+1, p);
        }
        if(person[dep+1]!=0) {
            for(int i = 0; i<=N; i++) p[i] = person[i];
            p[dep+1] = 1;
            for(int i = 1; i<=N; i++) {
                if(p[i] == -1) p[i] = a[dep][i];
                if(p[i] != a[dep][i] && a[dep][i]!=-1) {
                    //p("return max "+i+" "+person[i]+" "+a[dep][i]);
                    return max;
                }
            }
            max = Math.max(max,dfs(dep+1,p));
        }
        return max;

    }
    public static <T> void p(T element) {
	System.out.println(element);
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