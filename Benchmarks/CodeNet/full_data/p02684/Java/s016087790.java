import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long k = scanner.nextLong();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int city = 1;
        for (long i = 0; i < k; i++) {
            city = a[city - 1];
        }
        System.out.println(city);

        /*
        long a = scanner.nextInt();
        long b = scanner.nextInt();
        long c = scanner.nextInt();
        long k = scanner.nextInt();
        if (a + b >= k) {
            System.out.println(a);
        }else {
            System.out.println(a - (k - (a + b)));
        }

         */
    }
}
