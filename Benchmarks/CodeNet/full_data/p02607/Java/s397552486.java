
import java.io.PrintWriter;
import java.util.*;

public class Main {
    void run() {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            int a = sc.nextInt();
            if (i % 2 == 0) continue;
            if (a % 2 == 1) count++;
        }

        System.out.println(count);
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
