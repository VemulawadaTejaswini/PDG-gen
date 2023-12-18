import java.util.Scanner;

public class Main {
    static final Scanner sc  = new Scanner(System.in);
    static final int     MOD = (int) 1E9 + 7;
    static final int INF = Integer.MAX_VALUE;
    static int[][] ints;

    static long max = -1;
    static int N;
    static int W;
    static int[] w;
    static int[] v;
    public static void main(String[] args) {
        N = nint();
        W = nint();
        ints(2, N, 1, 0);
        w = ints[0];
        v = ints[1];

        calc(1, true, 0, 0);
        calc(1, false, 0, 0);
        System.out.println(max);
    }
    
    
    static void calc(int n, boolean usesN, int valSum, int weightSum) {
        if (weightSum > W) return;
        if (n == N+1) {
            max = max(valSum, max);
            return;
        }
        
        if (usesN) {
            calc(n+1, true , valSum + v[n], weightSum + w[n]);
            calc(n+1, false, valSum + v[n], weightSum + w[n]);
        } else {
            calc(n+1, true , valSum, weightSum);
            calc(n+1, false, valSum, weightSum);
        }
    }
    
    
    static void ints(int W, int N, int padL, int padR) {
        ints = new int[W][];
        for (int w = 0; w < W; w++)
            ints[w] = new int[N + padL + padR];
        
        for (int l = 0; l < N; l++)
            for (int w = 0; w < W; w++)
                ints[w][padL + l] = nint();
    }
    
    static void ints(int W, int N) {
        ints(W, N, 0, 0);
    }
    
    static long max(long... longs) {
        long max = -INF;
        for (long i: longs) {
            max = Math.max(i, max);
        }
        return max;
    }

    private static long nlong() {
        return sc.nextLong();
    }

    private static int nint() {
        return sc.nextInt();
    }

    private static String nstr() {
        return sc.next();
    }

    private static char[] nchars() {
        return sc.next().toCharArray();
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

    private static char[][] nchars2(int h, int w) {
        return nchars2(h, w, 0);
    }

    private static char[][] nchars2(int h, int w, int pad) {
        char[][] a2 = new char[h + pad * 2][w + pad * 2];
        for (int i = 0; i < h; i++)
            System.arraycopy(nchars(), 0, a2[pad + i], pad, w);
        return a2;
    }
}
