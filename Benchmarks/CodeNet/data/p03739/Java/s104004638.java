import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long a[] = new long[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        long odd = f(a, n, 1);
        long even = f(a, n, -1);

        System.out.println(Math.min(odd, even));
    }

    static long f(long a[], int n, int sign) {
        long total = 0;
        long man = 0;
        for (int i = 0; i < n; i++) {
            total += a[i];
            if (total * sign <= 0) {
                long x = Math.abs(total) + 1;
                total += sign * x;
                man += x;
            }
            sign = -sign;
        }
        return man;
    }
}
