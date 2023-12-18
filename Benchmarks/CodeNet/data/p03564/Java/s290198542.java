import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static final void main(String[] args) {
        Main m = new Main();
        m.init();
        m.solve();
        out.flush();
    }

    // ========================================================================= //

    public void init() {

    }

    public void solve() {
        int n = sc.nextInt();
        int k = sc.nextInt();

        int ans = 1;
        for (int i = 0; i < n; i++) {
            int a = ans * 2;
            int b = ans + k;
            if (a > b) {
                ans += k;
            }
            else {
                ans *= 2;
            }
        }
        out.println(ans);
    }
}
