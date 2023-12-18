import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            long[] T = new long[N];
            for (int i = 0; i < N; i++) {
                T[i] = in.nextLong();
            }

            long lcm = T[0];
            for (int i = 0; i < N; i++) {
                lcm = lcm(lcm, T[i]);
            }
            System.out.println(lcm);
        }
    }

    public static final long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static final long lcm(long a, long b) {
        return (a * b) / gcd(a, b);
    }

}
