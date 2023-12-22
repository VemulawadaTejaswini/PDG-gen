import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    static final Scanner     sc = new Scanner(System.in);
    static final PrintStream so = System.out;

    public static void main(String[] args) {
        int q = nint();
        for (int i = 0; i < q; i++) {
            String a = nstr();
            String b = nstr();
            so.println(lcsLength(a, b));
        }
    }
    
    private static int lcsLength(String a, String b) {
        int lenA = a.length();
        int lenB = b.length();
        int[][] c = new int[lenA+1][lenB+1];
        for (int iA = 1; iA <= lenA; iA++) {
            for (int iB = 1; iB <= lenB; iB++) {
                if (a.charAt(iA-1) == b.charAt(iB-1)) {
                    c[iA][iB] = c[iA-1][iB-1] + 1;
                } else {
                    c[iA][iB] = Math.max(c[iA-1][iB], c[iA][iB-1]);
                }
            }
        }
        return  c[lenA][lenB];
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

