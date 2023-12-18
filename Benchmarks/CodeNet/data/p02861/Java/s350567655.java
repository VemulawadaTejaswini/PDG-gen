import java.awt.Point;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    static final Scanner sc  = new Scanner(System.in);
    static final int     MOD = (int) 1E9 + 7;
    
    static Point[] p;
    static double sumDist = 0.0;
    
    public static void main(String[] args) {
        int N = nint();
        p = new Point[N];
        for (int i = 0; i < N; i++) {
            p[i] = new Point(nint(), nint());
        }
        
        int[] base = IntStream.rangeClosed(1, N).toArray();
        permutation(base);
        System.out.println(sumDist / factorial(N));
    }
    
    static int factorial(int n) {
        int prod = 1;
        for (int i = n; i >= 1; i--) {
            prod *= i;
        }
        return prod;
    }
    
    private static void procPerm(int[] perm) {
        double dist = 0.0;
        for (int i = 0; i < perm.length - 1; i++) {
            dist += p[perm[i] - 1].distance(p[perm[i+1] - 1]);
        }
        sumDist += dist;
    }
    

    private static void permutation(int[] seed) {
        int[] perm = new int[seed.length];
        boolean[] used = new boolean[seed.length];
        buildPerm(seed, perm, used, 0);
    }

    private static void buildPerm(int[] seed, int[] perm, boolean[] used, int index) {
        if (index == seed.length) {
            procPerm(perm);
            return;
        }

        for (int i = 0; i < seed.length; ++i) {
            if (used[i]) continue;
            perm[index] = seed[i];
            used[i] = true;
            buildPerm(seed, perm, used, index + 1);
            used[i] = false;
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

    private static long min(long... ls) {
        return Arrays.stream(ls).min().getAsLong();
    }

    private static int min(int... is) {
        return Arrays.stream(is).min().getAsInt();
    }

    private static long max(long... ls) {
        return Arrays.stream(ls).max().getAsLong();
    }

    private static int max(int... is) {
        return Arrays.stream(is).max().getAsInt();
    }

    private static long abs(long a, long b) {
        return Math.abs(a - b);
    }
}
