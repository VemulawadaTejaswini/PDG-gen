import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int N = nint();
        int[] A = nints(N);
        int[] max = new int[N];
        final int INF = Integer.MAX_VALUE;
        Arrays.fill(max, 0, N, -INF);
        
        int ans = 0;
        int l = N;
        
        for (int i = 0; i < N; i++) {
            int bound = lowerBound(max, A[i]);
            if (bound == l) {
                ans++;
                l--;
            }
            max[bound-1] = A[i];
        }
        System.out.println(ans);
    }

    //探索したいkey以上で最小のindexを返す。
    public static int lowerBound(int[] a, int obj) {
        int l = 0, r = a.length - 1;
        while (r - l >= 0) {
            int c = (l + r) / 2;
            if (obj <= a[c]) {
                r = c - 1;
            } else {
                l = c + 1;
            }
        }
        return l;
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
