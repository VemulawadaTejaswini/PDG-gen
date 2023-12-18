
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long x = in.nextLong();


        System.out.println(f(b, x) - f(a - 1, x));
    }

    private static long f(long n, long x) {
        if (n >= 0) {
            return n / x + 1;
        }
        return 0;
    }
}
