import java.util.*;

public class Main {
    public static final int fib = 1000000007;

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        int[] check = new int[n];
        boolean isEven = n % 2 == 0;
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
            if ((isEven && array[i] % 2 == 1) || (!isEven && array[i] % 2 == 0)) {
                check[i] = 0;
            } else {
                System.out.println(0);
                return;
            }
        }
        long a = pow(2, n / 2);

        int count = 0;
        for (int x : array) {
            check[x]++;
            if (check[x] > 2 || (check[x] == 2 && x == 0)) {
                System.out.println(0);
                return;
            }
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
            ret %= fib;
        }
        return ret;
    }
}