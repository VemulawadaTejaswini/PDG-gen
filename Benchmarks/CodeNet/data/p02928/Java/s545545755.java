import java.util.Scanner;


public class Main {
    static final Scanner sc = new Scanner(System.in);
    static final int MOD = (int) 1E9 + 7;
    
    public static void main(String[] args) {
        int N = nint();
        long K = nint();
        int[] A = nints(N);
        int[] c = new int[2001];
        for (int i_A = 0; i_A < N; i_A++) {
            for (int i_c = 1; i_c <= 2000; i_c++) {
                if (A[i_A] < i_c) {
                    c[i_c]++;
                }
            }
        }
        long add = 0;
        for (int i = 0; i < N; i++) {
            add += c[A[i]];
        }
        
        long invA = inv(A);
        
        long f = invA;
        long l = (invA + add * (K-1));
        
        if (K % 2 == 0) {
            System.out.println(K/2 * ((f+l) % MOD) % MOD);
        } else {
            System.out.println(K * ((f+l)/2 % MOD) % MOD);
        }
        
    }
    
    static long inv(int[] a) {
        int inv = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    inv++;
                }
            }
        }
        return inv;
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

    private static char[] nsToChars() {
        return sc.next().toCharArray();
    }

    private static long[] nlongs(int n) {
        return nlongs(n, 0, 0);
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

    private static long[] nlongs(int n, int padL, int padR) {
        long[] a = new long[padL + n + padR];
        for (int i = 0; i < n; i++)
            a[padL + i] = nlong();
        return a;
    }

    private static String[] nstrs(int n) {
        String[] a = new String[n];
        for (int i = 0; i < n; i++)
            a[i] = nstr();
        return a;
    }

    private static char[][] nsToChars2D(int h, int w) {
        return nsToChars2D(h, w, 0);
    }

    private static char[][] nsToChars2D(int h, int w, int pad) {
        char[][] a2 = new char[h + pad * 2][w + pad * 2];
        for (int i = 0; i < h; i++)
            System.arraycopy(nsToChars(), 0, a2[pad + i], pad, w);
        return a2;
    }
}
