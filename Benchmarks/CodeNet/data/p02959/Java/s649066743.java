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
        int[] a = new int[n+1];
        int[] b = new int[n];

        int total = 0;
        for (int i=0; i <= n; i++)
            a[i] = in.nextInt();
        for (int i=0; i < n; i++)
            b[i] = in.nextInt();

        for (int i=0; i < n; i++) {
            int max = Math.min(a[i], b[i]);
            total += max;
            b[i] -= max;
            a[i] -= max;

            max = Math.min(a[i+1], b[i]);
            total += max;
            a[i+1] -= max;
        }

        out.println(total);
    }


}
