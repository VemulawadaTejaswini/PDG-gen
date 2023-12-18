import java.util.*;

public class Main {
    public static void main(String args[]) {
        final int fib = 1000000007;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        long a = pow(2, n / 2);

        int ini = n % 2 == 0 ? 1 : 0;
        int count = 0;
        for (int j = ini; j <= n; j += 2) {
            for (int k = 0; k < n; k++) {
                if (array[k] == j) {
                    count++;
                    if (count > 2 || (count == 2 && j == 0)) {
                        System.out.println(0);
                        return;
                    }
                }
            }
            if (count < 2 && j != 0) {
                System.out.println(0);
                return;
            }
            count = 0;
        }

        if (a > fib) {
            a = a % fib;
        }
        System.out.println(a);
    }

    private static long pow(int base, int n) {
        long ret = 1L;
        for (int i = 0; i < n; i++) {
            ret *= base;
        }
        return ret;
    }
}