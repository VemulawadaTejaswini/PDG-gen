import java.util.Scanner;

public class Main {

    private static final int MOD = 1_000_000_007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long L = sc.nextLong();
        long R = sc.nextLong();

        long mod = Long.MAX_VALUE;


        for (long i = L; i < R; i++) {
            for (long j = R; j > i; j--) {
                mod = Math.min(mod, (i * j) % 2019);
            }
        }

        System.out.println(mod);
    }
}
