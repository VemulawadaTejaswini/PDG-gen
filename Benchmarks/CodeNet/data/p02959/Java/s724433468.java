import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n + 1];
        int[] b = new int[n];

        for (int i = 0; i < n + 1; i++) {
            a[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = s.nextInt();
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] < b[i]) {
                count += a[i];
                b[i] -= a[i];
                if (a[i + 1] < b[i]) {
                    count += a[i + 1];
                    b[i] -= a[i + 1];
                } else {
                    count += b[i];
                    a[i + 1] -= b[i];
                }
            } else {
                count += b[i];
                a[i] -= b[i];
            }
        }

        System.out.println(count);
    }
}
