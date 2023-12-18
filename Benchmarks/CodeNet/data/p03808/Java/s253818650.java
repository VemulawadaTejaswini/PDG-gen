import java.util.Scanner;

/**
 * Created by zzt on 17-2-4.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        int s = 0;
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            System.err.println(a[i]);
            s += a[i];
        }
        long t = n * (n + 1L) / 2;
        if (s%(t)!=0) {
            System.out.println("NO");
            return;
        }
        long k = s / t;
        int[] d = new int[n];
        for (int i = 0; i < n; i++) {
            d[i] = a[(i + 1) % n] - a[i];
            if ((k-d[i])%n!=0) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}