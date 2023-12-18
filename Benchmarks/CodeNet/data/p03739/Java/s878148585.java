import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long a[] = new long[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        long man = 0;
        if (a[0] == 0) {
            a[0] = 1;
            long min = f(a, n);
            a[0] = -1;
            min = Math.min(min, f(a, n));
            man = min + 1;
        } else {
            man = f(a, n);
        }

        System.out.println(man);
    }

    static long f(long a[], int n) {
        long total = a[0];
        long man = 0;
        for (int i = 1; i < n; i++) {
            if (total * (total + a[i]) >= 0) {
                long x = Math.abs(total + a[i]) + 1;
                total += a[i] + (total > 0 ? -x : x);
                man += x;
            } else {
                total += a[i];
            }
        }
        return man;
    }
}
