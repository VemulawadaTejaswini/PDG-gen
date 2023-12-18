
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long N = s.nextLong(),K = s.nextLong();
        if(N == 1 || K == 1) {
            System.out.println(0);
            return;
        }
        System.out.println(GCD(N, K));
    }

    private static long GCD(long a, long b) {
        if (a == 0)
            return b;
        return GCD(b % a, a);
    }
}