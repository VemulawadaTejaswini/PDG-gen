import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final int N = sc.nextInt();

        long ans = 0;

        for (int i = 0; i < N; i++) {
            final long A = sc.nextLong();
            ans = gcd(ans, A);
        }

        System.out.println(ans);
    }

    private static long gcd(final long a, final long b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
