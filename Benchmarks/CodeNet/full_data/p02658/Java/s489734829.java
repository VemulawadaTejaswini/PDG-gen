
import java.io.PrintWriter;
import java.util.*;

public class Main {
    void run() {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = sc.nextInt();
        long[] arr = new long[n];

        long ans = 1;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
            if (arr[i] == 0) {
                System.out.println(0);
                return;
            }
        }

        for (int i = 0; i < n; i++) {
            ans = ans * arr[i];
            if (ans > (long) 1e18 || ans < 0) {
                System.out.println(-1);
                return;
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
