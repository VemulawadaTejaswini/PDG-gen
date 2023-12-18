import java.util.*;

public class Main {
    public void main(Scanner sc) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        long a[] = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }

        long ans = 0;
        for (int i = 0; i < n - k; i++) {
            if (a[i] > 0) {
                ans += a[i];
            }
        }

        long tmp = 0;
        for (int i = n - k; i < n; i++) {
            tmp += a[i];
        }

        System.out.println(ans + Math.max(tmp, 0));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
