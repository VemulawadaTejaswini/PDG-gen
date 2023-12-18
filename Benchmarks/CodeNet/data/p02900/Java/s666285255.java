import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int c = gcd(a, b);

        int count = 1;

        for (int i = 2; i*i <= c; i++) {
            if (c%i != 0) {
                continue;
            }
            while (c%i ==0) {
                c /= i;
            }
            count++;
        }

        if (c > 1) {
            count++;
        }
        System.out.println(count);
    }

    private static int gcd(int a, int b) {
        while (b%a != 0) {
            int c = b % a;
            b = a;
            a = c;
        }
        return a;
    }
}