
import java.io.PrintWriter;
import java.util.*;

public class Main {
    void run() {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        long MOD = (long) 1e9 + 7;
        int n = sc.nextInt();

        if (n == 1) {
            System.out.println(0);
            return;
        }
        long total = 1;
        long ex0 = 1;
        long ex9 = 1;
        long ex09 = 1;
        for (int i = 0; i < n; i++) {
            total = total * 10 % MOD;
            ex0 = ex0 * 9 % MOD;
            ex9 = ex9 * 9 % MOD;
            ex09 = ex09 * 8 % MOD;
        }

        long sub = ex0 + ex9 - ex09;
        System.out.println(total - sub < 0 ? total - sub + MOD : total - sub);


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
