import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        for (long i = 1; i <= 3500; i++) {
            for (long j = i; j <= 3500; j++) {
                long k = lcm(lcm(i, j), N);
                long a = k/i;
                long b = k/j;
                long c = k/N;
                if ((a+b+1) == (4*c)) {
                    System.out.println(i + " " + j + " " + k);
                    return;
                }
            }
        }
    }

    private static long gcd(long a, long b) {
        while (b > 0) {
            long temp = b;
            b = a % b; // % is remainder
            a = temp;
        }
        return a;
    }


    private static long lcm(long a, long b) {
        return a * (b / gcd(a, b));
    }
}