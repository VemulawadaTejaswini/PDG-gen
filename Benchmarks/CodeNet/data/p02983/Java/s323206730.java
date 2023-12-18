import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    private static Scanner in = new Scanner(System.in);
    private static PrintWriter out = new PrintWriter(System.out);

    private static final int MOD = 2019;

    public static void main(String[] args) {
        solve();
        out.flush();
    }

    private static void solve() {
        int l = in.nextInt();
        int r = in.nextInt();

        int ans = Integer.MAX_VALUE;
        for (int i=l; i <= Math.min(l+2018, r-1); i++) {
            for (int j=l+1; j <= Math.min(l+2019, r); j++) {
                int n = (i * j) % 2019;
                ans = Math.min(ans, n);
            }
        }

        out.println(ans);
    }
}
