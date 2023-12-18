import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int X = sc.nextInt();

        if (n == 1) {
            int x = sc.nextInt();
            sc.close();
            System.out.println(x - X);
            return;
        } else if (n == 2) {
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();
            sc.close();
            System.out.println(Math.abs(x1 - x2));
            return;
        } else {

            int[] x = new int[n];

            for (int i = 0; i < n; i++) {
                x[i] = sc.nextInt();
            }
            sc.close();

            int a = x[0];
            int b = x[1];
            int c = x[2];

            long d = gcd(Math.abs(c - a), Math.abs(b - a));

            System.out.println(d);
        }
    }

    private static long gcd(long m, long n) {
        if (m < n)
            return gcd(n, m);
        if (n == 0)
            return m;
        return gcd(n, m % n);
    }

}