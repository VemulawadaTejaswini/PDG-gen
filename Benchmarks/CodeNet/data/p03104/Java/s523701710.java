
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        final long B = sc.nextLong();
        if (A == 0) {
            if (B == 0) {
                System.out.println(0);
                System.out.flush();
                sc.close();
                return;
            } else {
                A++;
            }
        }

        System.out.println(f(B)^f(A - 1));
        System.out.flush();
        sc.close();
    }

    private static long f(final long A) {
        long res[] = new long[] {A, 1l, A + 1, 0l};
        return res[(int) (A%4)];
    }
}
