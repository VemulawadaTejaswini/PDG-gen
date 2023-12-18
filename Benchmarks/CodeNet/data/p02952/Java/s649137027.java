import java.io.PrintWriter;
import java.util.Scanner;

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

        int ans = 0;
        for (int i=1; i <= n; i++) {
            if (String.valueOf(i).length() % 2 == 1)
                ans++;
        }
        out.println(ans);
    }

}
