import java.util.Scanner;

public class Main {

    private static final int MOD = 1_000_000_007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long L = sc.nextLong();
        long R = sc.nextLong();

        long min = Long.MAX_VALUE;

        for (long i = L; i < R; i++) {
            for (long j = R; j > i; j--) {
                long mod = (i * j) % 2019;

                min = Math.min(min, mod);

//                System.out.println(i + " " + j + ": " + (i * j) % 2019);


                long jump = j - (mod / i) + 1;
                if (jump < j) {
                    j = jump;
                }
            }
        }

        System.out.println(min);
    }
}
