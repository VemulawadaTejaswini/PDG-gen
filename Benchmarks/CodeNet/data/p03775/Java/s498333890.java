
import java.util.*;

public class Main {
    private final static Main main = new Main();

    public static void main(String[] args) {
        main.contest();
    }

    private void contest() {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long res = Long.MAX_VALUE;
        for (long i=1; i*i<=n; ++i) {
            if (n%i != 0) {
                continue;
            }
            res = Math.min(res, Math.max(String.valueOf(i).length(), String.valueOf(n/i).length()));
        }
        System.out.println(res);
    }
}
