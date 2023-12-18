import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n + 1];
        for (int i = 0; i < n + 1; i++) {
            a[i] = sc.nextInt();
        }

        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        long sum = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] >= b[i]) {
                sum += b[i];
                b[i] = 0;
            } else {
                sum += a[i];
                b[i] -= a[i];
            }

            if (b[i] > 0) {
                if (a[i + 1] >= b[i]) {
                    sum += b[i];
                    a[i + 1] -= b[i];
                } else {
                    sum += a[i + 1];
                    a[i + 1] = 0;
                }
            }
        }
        System.out.print(sum);
    }
}