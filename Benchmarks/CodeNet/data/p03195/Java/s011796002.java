import java.util.*;
import java.lang.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long a[] = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        Arrays.sort(a);
        int ans = 0;
        if (a[0] % 2 != 0) {
            ans = n;
        }
        for (int i = 1; i < n; i++) {
            if ((a[i] - a[i - 1]) % 2 != 0) {
                ans ^= n - i;
            }
        }
        if (ans == 0) {
            System.out.println("second");
        } else {
            System.out.println("first");
        }
    }
}
