import java.util.Scanner;

public class Main {
    static final Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int N = nint();
        int T = nint();
        int[] t = nints(N);
        
        long ans = 0;
        for (int i = 0; i < N-1; i++) {
            ans += Math.min(T, t[i+1] - t[i]);
        }
        ans += T;
        
        System.out.println(ans);
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