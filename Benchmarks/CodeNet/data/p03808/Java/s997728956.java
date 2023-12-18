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
            s += a[i];
        }
        int t = n * (n + 1) / 2;
        if (s%(t)!=0) {
            System.out.println("NO");
            return;
        }
        int k = s / t;
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