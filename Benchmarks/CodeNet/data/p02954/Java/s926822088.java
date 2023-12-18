import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    static final Scanner     sc = new Scanner(System.in);
    static final PrintStream so = System.out;

    public static void main(String[] args) {
        char[] s = nstr().toCharArray();
        int[] ans = new int[s.length];
        
        int i = 0;
        while(i < s.length) {
            int numR = 0;
            int numL = 0;
            while (s[i] == 'R') {
                i++;
                numR++;
            }
            while (i < s.length && s[i] == 'L') {
                i++;
                numL++;
            }
            
            int br = i-numL-1;
            int bl = br + 1;
            ans[br] = here(numR) + there(numL);
            ans[bl] = here(numL) + there(numR);
        }
        for (int i_ans = 0; i_ans < ans.length; i_ans++) {
            so.println(ans[i_ans]);
        }
    }

    private static int here(int i) {
        return (i+1)/2;
    }
    
    private static int there(int i) {
        return i/2;
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
