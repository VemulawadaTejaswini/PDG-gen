import java.util.*;
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int x = input.nextInt();
        int[] a = new int[n];
        int[] p = new int[n];
        a[0] = 1; p[0] = 1;
        for (int i = 1; i < n; i++) {
            a[i] = 2 * a[i-1] + 3;
            p[i] = 2 * p[i-1] + 1;
        }
        System.out.print(foo(n, x, a, p));
    }

    private static int foo (int n, int x, int[] a, int[] p) {
        if (n == 0)
            return x == 1 ? 1: 0;
        else if (x <= 1 + a[n-1])
            return foo(n-1, x-1, a, p);
        else
            return p[n-1] + 1 + foo(n-1, x - 2 - a[n-1], a, p);
    }
}


