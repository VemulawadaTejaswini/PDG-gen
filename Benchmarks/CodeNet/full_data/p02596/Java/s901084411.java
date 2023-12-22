
import java.io.PrintWriter;
import java.util.*;

public class Main {
    void run() {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int k = sc.nextInt();
        if (7 % k == 0) {
            System.out.println(1);
            return;
        }

        int ans = -1;

        long mod = 7 % k;
        for (int i = 1; i <= 1000000; i++) {
            mod = (mod * 10 + 7) % k;

            if (mod == 0) {
                ans = i + 1;
                break;
            }
        }

        System.out.println(ans);

        // out.println("Hello World");
        out.flush();
    }

    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
