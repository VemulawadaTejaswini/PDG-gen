
import java.io.PrintWriter;
import java.util.*;

public class Main {
    void run() {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int k = sc.nextInt();

        int ans = 0;
        if (k >= a) {
            ans += a;
            k -= a;
        } else {
            System.out.println(k);
            return;
        }

        if (k >= b) {
            k -= b;
        } else {
            System.out.println(ans);
            return;
        }


        ans -= Math.min(k, c);
        System.out.println(ans);
    }

    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
