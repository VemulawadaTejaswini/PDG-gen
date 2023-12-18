import java.io.PrintWriter;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    private static Scanner in = new Scanner(System.in);
    private static PrintWriter out = new PrintWriter(System.out);

    private static final long MOD = (long) 1e9 + 7;

    public static void main(String[] args) {
        solve();
        out.flush();
    }

    private static void solve() {
        int n = in.nextInt();
        double[] a = new double[n];
        for (int i=0; i < n; i++) {
            a[i] = (double) in.nextInt();
        }

        double ans = 0;
        for (int i=0; i < n; i++)
            ans += (1 / a[i]);

        out.println(1 / ans);
    }

}
