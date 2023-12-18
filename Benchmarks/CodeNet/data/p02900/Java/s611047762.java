import java.util.Scanner;

public class Main {

    static final int LIMIT = 1000000;

    static long gcd(long a, long b) {
        if (a > b) return gcd(b, a);
        if (a == 0) return b;
        return gcd(b % a, a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long A = sc.nextLong();
        long B = sc.nextLong();
        long d = gcd(A, B);

        int sol = 1;
        for (int i = 2; i * i <= d; i++) {
            if (d % i == 0) sol++;
            while (d % i == 0) d /= i;
        }

        if (d != 1) sol++;
        System.out.println(sol);
    }
}
