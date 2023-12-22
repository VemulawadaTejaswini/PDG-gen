import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Main {
    private static final PrintStream ps = System.out;
    private static final InputStream IS = System.in;
    private static final byte[] BUFFER = new byte[1024];
    private static int ptr = 0;
    private static int buflen = 0;
    
    public static void main(String[] args) {
        final int MAX = Integer.MAX_VALUE;
        int n = ni();
        int[][] g = new int[n][n];
        for (int i = 0; i < g.length; i++) {
            for (int j = 0; j < g[i].length; j++) {
                int tmp = ni();
                g[i][j] = tmp == -1 ? MAX : tmp;
            }
        }
        
        boolean[] b = new boolean[n];
        int[] d = new int[n];
        Arrays.fill(d, MAX);
        int[] p = new int[n];
        
        d[0] = 0;
        p[0] = -1;
        while (true) {
            int tmpMinCost = MAX;
            int u = 0;
            for (int i = 0; i < n; i++) {
                if (!b[i] && d[i] < tmpMinCost) {
                    u = i;
                    tmpMinCost = d[i];
                }
            }
            
            if (tmpMinCost == MAX) break;
            
            b[u] = true;
            for (int v = 0; v < n; v++) {
                if (!b[v] && g[u][v] != MAX) { // 未訪問かつ u と v の間に辺がある
                    if (g[u][v] < d[v]) {
                        d[v] = g[u][v];
                        p[v] = u;
                    }
                }
            }
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (p[i] != -1) sum += g[i][p[i]];
        }
        ps.println(sum);
    }

    private static boolean hasNextByte() {
        if (ptr < buflen) return true;
        else{
            ptr = 0;
            try { buflen = IS.read(BUFFER); } catch (IOException e) { e.printStackTrace();}
            if (buflen <= 0) return false;
        }
        return true;
    }
    private static int readByte() { if (hasNextByte()) return BUFFER[ptr++]; else return -1;}
    private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
    public static boolean hasNext() { while(hasNextByte() && !isPrintableChar(BUFFER[ptr])) ptr++; return hasNextByte();}
    public static String n() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while(isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }
    public static long nl() {
        if (!hasNext()) throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        if (b < '0' || '9' < b) throw new NumberFormatException();
        while(true){
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            } else if (b == -1 || !isPrintableChar(b)) return minus ? -n : n;
            else throw new NumberFormatException();
            b = readByte();
        }
    }
    public static int ni() {
        long nl = nl();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
        return (int) nl;
    }
    public static double nextDouble() { return Double.parseDouble(n());}

    private static int[] nia(int n) {
        int[] a = new int[n];
        for (int i=0; i<n; i++) a[i] = ni();
        return a;
    }
    
    private static long[] nla(int n) {
        long[] a = new long[n];
        for (int i=0; i<n; i++) a[i] = nl();
        return a;
    }
    
    private static String[] na(int n) {
        String[] a = new String[n];
        for (int i=0; i<n; i++) a[i] = n();
        return a;
    }

    private static int[][] nia2(int n, int m) {
        int[][] a = new int[n][m];
        for (int i=0; i<n; i++) a[i] = nia(m);
        return a;
    }
    
    private static long[][] nla2(int n, int m) {
        long[][] a = new long[n][m];
        for (int i=0; i<n; i++) a[i] = nla(m);
        return a;
    }
   
    private static char[][] nca2(int n) {
        char[][] a = new char[n][];
        for (int i=0; i<n; i++) a[i] = n().toCharArray();
        return a;
        
    }
}
