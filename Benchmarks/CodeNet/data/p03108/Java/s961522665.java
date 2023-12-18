import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static final Scanner sc  = new Scanner(System.in);
    static final int MOD = (int) 1E9 + 7;
    static final int INF = Integer.MAX_VALUE;
    
    public static void main(String[] args) {
        int N = nint();
        int M = nint();
        int[] A = new int[M+1];
        int[] B = new int[M+1];
        for (int m = 1; m <= M; m++) {
            A[m] = nint();
            B[m] = nint();
        }

        long[] ans = new long[M+1];
        ans[M] = (long) N * (N-1) / 2;
        
        UF uni = new UF(N);
        for (int m = M; m >= 1; m--) {
            ans[m-1] = ans[m];
            if (uni.root(A[m]) != uni.root(B[m])) {
                ans[m-1] -= (long) uni.size(A[m]) * uni.size(B[m]);
                uni.connect(A[m], B[m]);
            }
        }
        
        for (int m = 1; m <= M; m++) {
            System.out.println(ans[m]);
        }
    }
    
    public static class UF {
        // 親の番号を格納する。親の場合は-(その集合のサイズ)
        int[] parent;
        
        UF(int N) {
            parent = new int[N+1];
            Arrays.fill(parent, -1); // 各要素がバラバラになる
        }
        
        // Aがどのグループに属しているか調べる
        int root(int A) {
            if (parent[A] < 0) return A; // A 自身が親
            
            // 親を繋ぎかえる
            parent[A] = root(parent[A]);
            return parent[A];
        }
        
        // Aが属する集合のサイズ
        int size(int A) { 
            return -parent[root(A)]; // 親の親はサイズ
        }
        
        // AとBをくっつける. 親同士をくっつけたい
        boolean connect(int A, int B) {
            A = root(A);
            B = root(B);
            
            if (A == B) {
                return false; // すでにくっついている
            } else if (size(A) < size(B)) {
                return connect(B, A);
            } else {
                parent[A] += parent[B]; // 小さい方を大きい方にくっつける
                parent[B] = A;
                return true;
            }
        }
    }

    private static int nint() {
        return sc.nextInt();
    }

    private static int[] nints(int n) {
        return nints(n, 0, 0);
    }

    private static int[] nints(int n, int padL, int padR) {
        int[] a = new int[padL + n + padR];
        for (int i = 0; i < n; i++)
            a[padL + i] = nint();
        return a;
    }

    private static long nlong() {
        return sc.nextLong();
    }

    private static long[] nlongs(int n) {
        return nlongs(n, 0, 0);
    }

    private static long[] nlongs(int n, int padL, int padR) {
        long[] a = new long[padL + n + padR];
        for (int i = 0; i < n; i++)
            a[padL + i] = nlong();
        return a;
    }

    private static double ndouble() {
        return sc.nextDouble();
    }
    
    private static double[] ndoubles(int n) {
        return ndoubles(n, 0, 0);
    }
    
    private static double[] ndoubles(int n, int padL, int padR) {
        double[] d = new double[n + padL + padR];
        for (int i = 0; i < n; i++) {
            d[padL + i] = ndouble();
        }
        return d;
    }

    private static String nstr() {
        return sc.next();
    }

    private static char[] nchars() {
        return sc.next().toCharArray();
    }

    private static char[] nchars(int padL, int padR) {
        char[] temp = sc.next().toCharArray();
        char[] ret = new char[temp.length + padL + padR];
        System.arraycopy(temp, 0, ret, padL, temp.length);
        return ret;
    }
    
    private static char[][] nchars2(int h, int w) {
        return nchars2(h, w, 0, 0);
    }

    private static char[][] nchars2(int h, int w, int padLU, int padRD) {
        char[][] a2 = new char[h + padLU + padRD][w + padLU + padRD];
        for (int i = 0; i < h; i++)
            System.arraycopy(nchars(), 0, a2[padLU + i], padLU, w);
        return a2;
    }
    
    static long max(long... longs) {
        return Arrays.stream(longs).max().getAsLong();
    }
    
    static long min(long... longs) {
        return Arrays.stream(longs).min().getAsLong();
    }
}
