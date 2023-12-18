import java.io.PrintWriter;
import java.util.*;

public class Main {

    private static Scanner in = new Scanner(System.in);
    private static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        solve();
        out.flush();
    }

    private static void solve() {
        int n = in.nextInt();
        int[] p = new int[n];
        for (int i=0; i < n; i++)
            p[i] = in.nextInt();

        int ans = 0;
        for (int i=0; i < n-2; i++) {
            int[] sub = new int[]{p[i], p[i + 1], p[i + 2]};
            Arrays.sort(sub);
            if (sub[1] == p[i + 1])
                ans++;
        }

        out.println(ans);
    }

}
