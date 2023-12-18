import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long h = sc.nextLong();

        long node = 0;

        while (h > 0) {
            h /= 2;
            node += 1;
        }
        sc.close();
        long ans = pow(2, node) - 1;
        System.out.println(ans);

    }

    public static long pow(long a, long n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return a;
        }
        if (n % 2 == 0) {
            return pow(a * a, n / 2);
        } else {
            return a * pow(a * a, (n - 1) / 2);
        }
    }
}
