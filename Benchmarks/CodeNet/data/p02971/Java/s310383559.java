import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.*;

public class Main {

    private static Scanner in = new Scanner(System.in);
    private static PrintWriter out = new PrintWriter(System.out);

    private static BigInteger MOD = BigInteger.valueOf((long) 1e9 + 7);

    public static void main(String[] args) {
        solve();
        out.flush();
    }

    private static void solve() {
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i=0; i < n; i++)
            a[i] = in.nextInt();

        int[] maxl = new int[n];
        int[] maxr = new int[n];
        maxl[0] = a[0];
        maxr[0] = a[n-1];
        for (int i=1; i < n; i++) {
            maxl[i] = Math.max(maxl[i-1], a[i]);
            maxr[i] = Math.max(maxr[i-1], a[n-1-i]);
        }

        // out.println(Arrays.toString(maxl));
        // out.println(Arrays.toString(maxr));

        out.println(maxr[n-2]);
        for (int i=1; i < n-1; i++) {
            out.println(Math.max(maxl[i-1], maxr[n-2-i]));
        }
        out.println(maxl[n-2]);
    }

}
