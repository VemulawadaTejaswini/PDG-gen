import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            long A = in.nextLong();
            long B = in.nextLong();

            long xorA = f(A);
            long xorB = f(B);

            System.out.println(A ^ xorA ^ xorB);
        }
    }

    private static long f(long n) {
        long xor = 0;
        for (int shift = 0; shift <= 40; shift++) {
            if (shift == 0) {
                long remainder = n % 4;
                if (remainder == 1 || remainder == 2) {
                    xor |= 1L << shift;
                }
                continue;
            }
            long remainder = n % (2L << shift);
            if (remainder >= (1L << shift)) {
                if ((remainder - (1L << shift)) % 2 == 0) {
                    xor |= 1L << shift;
                }
            }
        }
        return xor;
    }

}
