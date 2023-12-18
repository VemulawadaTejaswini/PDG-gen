import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final long l = sc.nextLong();
        final long r = sc.nextLong();

        long ans = Long.MAX_VALUE;

        if (r - l >= 2020) {
            ans = 0;
        } else {
            for (long i = l; i <= r; i++) {
                for (long j = l; j <= r; j++) {
                    if (i == j) continue;
                    ans = Math.min(ans, (i*j) % 2019);
                }
            }
        }

        System.out.println(ans);
    }
}
