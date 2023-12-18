import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int q = stdin.nextInt();
        for (int i = 0; i < q; i++) {
            int a = stdin.nextInt();
            int b = stdin.nextInt();
            System.out.println(f(a, b));
        }
    }

    private static int f(int a, int b) {
        if (a == b) {
            return (a - 1) * 2;
        }

        if (a > b) {
            int t = a;
            a = b;
            b = t;
        }

        int c = (int)Math.sqrt(a * b);
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
