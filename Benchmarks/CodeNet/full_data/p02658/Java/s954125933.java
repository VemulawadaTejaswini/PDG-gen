import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long a[] = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
            if (a[i] == 0L) {
                System.out.println(0);
                return;
            }
        }
        long ans = 0;
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                ans = a[i];
            } else {
                ans = ans * a[i];
            }
        }
        if (ans > 1000000000000000000L) {
            System.out.println(-1);
        } else {
            System.out.println(ans);
        }
    }
}