import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        int d = gcd(a, b);
        int p = 2, cnt = 0;
        while (p * p <= d) {
            if (d % p == 0) cnt++;
            while (d % p == 0) {
                d /= p;
            }
            p++;
        }
        if (d > 1) {
            cnt++;
        }

        System.out.println(cnt + 1);
    }

    private static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
