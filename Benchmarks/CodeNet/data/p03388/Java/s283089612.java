import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int q = stdin.nextInt();
        for (int i = 0; i < q; i++) {
            long a = stdin.nextLong();
            long b = stdin.nextLong();
            System.out.println(f(a, b));
        }
    }

    private static long f(long a, long b) {
        if (a == b) {
            return (a - 1) * 2;
        }

        if (a > b) {
            return f(b, a);
        }

        int c = (int)Math.floor(Math.sqrt(a * b));
        if (c * c < a * b) {
            if (c * (c + 1) < a * b) {
                return c * 2 - 1;
            } else {
                return c * 2 - 2;
            }
        } else {
            return (c - 1) * 2 - 1;
        }
    }
}
