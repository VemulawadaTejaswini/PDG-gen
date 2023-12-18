
import java.util.*;

public class Main {
    void run() {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        n = n % k;
        System.out.println(Math.min(n ,Math.abs(k - n)));
    }

    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
