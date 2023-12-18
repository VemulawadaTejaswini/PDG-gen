import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();

        long total = 0;
        for (int i = 1; i <= k; i++) {
            for (int j = 1; j <= k; j++) {
                for (int m = 1; m <= k; m++) {
                    total += gcd(gcd(i, j), m);
                }
            }
        }
        System.out.println(total);
    }

    static int gcd(int a, int b) {
        if (a % b == 0) return b;
        return gcd(b, a % b);
    }
}
