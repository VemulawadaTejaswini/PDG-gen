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
        int[] h = new int[n];
        for (int i=0; i < n; i++)
            h[i] = in.nextInt();

        for (int i=n-2; i > 0; i--) {
            if (h[i] < h[i-1])
                h[i-1]--;
        }
        boolean ans = true;
        for (int i=0; i < n-1; i++) {
            if (h[i] > h[i+1]) {
                ans = false;
                break;
            }
        }
        out.println(ans ? "Yes" : "No");
    }

}
