import java.util.Arrays;
import java.util.Scanner;

public class Main {

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

        boolean[] prime = new boolean[(int) Math.ceil(Math.sqrt(d)) + 1];
        Arrays.fill(prime, true);

        int sol = 1;
        for (int i = 2; i < prime.length; i++) {
            if (!prime[i]) continue;
            if (d % i == 0) sol++;
            for (int j = i; j < prime.length; j += i) prime[j] = false;
        }

        if (sol == 1) sol = d == 1 ? 1 : 2;
        System.out.println(sol);
    }
}
