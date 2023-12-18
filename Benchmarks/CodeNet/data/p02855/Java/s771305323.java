
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {
    static final Scanner sc    = new Scanner(System.in);
    static final int     MOD   = (int) 1E9 + 7;
    static final long    INF_L = (long) 4E18;
    static final char ICHIGO = '#';
    static final char EMPTY = '.';
    
    public static void main(String[] args) {
        int H = nint();
        int W = nint();
        int K = nint();
        char[][] s = nchars2(H, W);
        int[][] a = new int[H][W];
        int pieceNo = 0;
        Map<Integer, Container> map = new HashMap<>();
        
        int rowFilled = -1;
        for (int r = 0; r < H; r++) {
            if (ichigoIsInRow(s, r) >= 0) {
                pieceNo++;
                map.put(pieceNo, new Container(rowFilled + 1, r, ichigoIsInRow(s, r)));
                
                for (int r2 = rowFilled + 1; r2 <= r; r2++) {
                    Arrays.fill(a[r2], pieceNo);
                }
                rowFilled = r;
            }
        }
        
        if (rowFilled < H-1) {
            map.get(pieceNo).r2 = H-1;
            for (int r2 = rowFilled + 1; r2 < H; r2++) {
                Arrays.fill(a[r2], pieceNo);
            }
        }
        
        for (Entry<Integer, Container> e : map.entrySet()) {
            int rowFrom = e.getValue().r1;
            int rowTo   = e.getValue().r2;
            if (only1IchigoIs(s, rowFrom, rowTo)) {
                continue;
            }
            
            int colFilled = e.getValue().c1;
            
            for (int c = e.getValue().c1 + 1; c < W; c++) {
                if (ichigoIsInCol(s, c, rowFrom, rowTo)) {
                    pieceNo++;
                    for (int c2 = colFilled + 1; c2 <= c; c2++) {
                        fill(a, c2, rowFrom, rowTo, pieceNo);
                    }
                    colFilled = c;
                }
                
                if (colFilled < W-1) {
                    for (int c2 = colFilled + 1; c2 < W; c2++) {
                        fill(a, c2, rowFrom, rowTo, pieceNo);
                    }
                }
            }
        }
        
        for (int r = 0; r < H; r++) {
            for (int c = 0; c < W; c++) {
                System.out.print(a[r][c]);
                System.out.print(' ');
            }
            System.out.println();
        }
    }
    
    static class Container {
        int r1;
        int r2;
        int c1;
        Container(int r1, int r2, int c1) {
            this.r1 = r1;
            this.r2 = r2;
            this.c1 = c1;
        }
        @Override
        public String toString() {
            return "(" + r1 + ", " + r2 + ", " + c1 + ")";
        }
    }
    static boolean only1IchigoIs(char[][] s, int rowFrom, int rowTo) {
        int count = 0;
        for (int r = rowFrom; r <= rowTo; r++) {
            for (int c = 0; c < s[0].length; c++) {
                if (s[r][c] == ICHIGO) {count++;}
            }
        }
        return count == 1;
    }
    static void fill(int[][] a, int col, int rowFrom, int rowTo, int fillWith) {
        
        for (int r = rowFrom; r <= rowTo; r++) {
            a[r][col] = fillWith;
        }
    }
    
    static int ichigoIsInRow(char[][] s, int row) {
        for (int col = 0; col < s[0].length; col++) {
            if (s[row][col] == ICHIGO) {
                return col;
            }
        }
        return -1;
    }
    
    static boolean ichigoIsInCol(char[][] s, int col, int rowFrom, int rowTo) {
        for (int row = rowFrom; row <= rowTo; row++) {
            if (s[row][col] == ICHIGO) {
                return true;
            }
        }
        return false;
    }

    @Deprecated
    static int nint() {
        return sc.nextInt();
    }

    @Deprecated
    static int[] nints(int N) {
        return nints(0, N, 0);
    }

    @Deprecated
    private static int[] nints(int padL, int N, int padR) {
        int[] a = new int[padL + N + padR];
        for (int i = 0; i < N; i++)
            a[padL + i] = nint();
        return a;
    }

    static long nlong() {
        return sc.nextLong();
    }

    static long[] nlongs(int N) {
        return nlongs(0, N, 0);
    }

    static long[] nlongs(int padL, int N, int padR) {
        long[] a = new long[padL + N + padR];
        for (int i = 0; i < N; i++)
            a[padL + i] = nlong();
        return a;
    }

    static double ndouble() {
        return sc.nextDouble();
    }

    static double[] ndoubles(int N) {
        return ndoubles(0, N, 0);
    }

    static double[] ndoubles(int padL, int N, int padR) {
        double[] d = new double[N + padL + padR];
        for (int i = 0; i < N; i++) {
            d[padL + i] = ndouble();
        }
        return d;
    }

    static String nstr() {
        return sc.next();
    }

    static char[] nchars() {
        return sc.next().toCharArray();
    }

    static char[] nchars(int padL, int padR) {
        char[] temp = sc.next().toCharArray();
        char[] ret = new char[temp.length + padL + padR];
        System.arraycopy(temp, 0, ret, padL, temp.length);
        return ret;
    }

    static char[][] nchars2(int H, int W) {
        return nchars2(H, W, 0, 0);
    }

    static char[][] nchars2(int H, int W, int padLU, int padRD) {
        char[][] a2 = new char[H + padLU + padRD][W + padLU + padRD];
        for (int i = 0; i < H; i++)
            System.arraycopy(nchars(), 0, a2[padLU + i], padLU, W);
        return a2;
    }

    static long min(long... ls) {
        return Arrays.stream(ls).min().getAsLong();
    }

    static long max(long... ls) {
        return Arrays.stream(ls).max().getAsLong();
    }

    static long abs(long a) {
        return Math.abs(a);
    }
}
