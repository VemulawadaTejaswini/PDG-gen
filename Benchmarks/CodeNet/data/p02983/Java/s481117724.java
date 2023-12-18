
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    void run() {
        Scanner sc = new Scanner(System.in);

        int MOD = 2019;
        long l = sc.nextLong();
        long r = sc.nextLong();

        long nextLMOD = l + (MOD - (l % MOD));
        if (r >= nextLMOD) {
            System.out.println(0);
            return;
        }

        long min = Integer.MAX_VALUE;
        for (long i = l; i < r; i++) {
            for (long j = i + 1; j <= r; j++) {
                min = Math.min(min, (i % MOD) * (j % MOD) % MOD);
            }
        }

        System.out.println(min);
    }

    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
