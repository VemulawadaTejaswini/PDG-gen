import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int X = in.nextInt();

        System.out.println(3 * (N - gcd(N, X)));
    }

    public static long gcd(long a, long b) {
        long k = 0;
        do {
            k = a % b;
            a = b;
            b = k;
        } while (k != 0);
        return a;
    }
}
