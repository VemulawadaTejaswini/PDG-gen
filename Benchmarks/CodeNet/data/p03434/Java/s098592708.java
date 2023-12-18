import java.util.*;
import java.lang.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int alice = 0;
        int bob = 0;
        if (n % 2 == 0) {
            for (int i = 1; i < n; i += 2) {
                alice += a[i];
            }
            for (int i = 0; i < n - 1; i += 2) {
                bob += a[i];
            }
        } else {
            for (int i = 0; i < n; i += 2) {
                alice += a[i];
            }
            for (int i = 1; i < n - 1; i += 2) {
                bob += a[i];
            }
        }
        System.out.println(alice - bob);
    }
}
