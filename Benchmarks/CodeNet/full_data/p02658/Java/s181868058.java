import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }

        long ans = 1;
        long th = (long) Math.pow(10, 18);
        for (int i = 0; i < n; i++) {
            ans *= a[i];
            if (ans > th) {
                System.out.println(-1);
                return;
            }
        }

        System.out.println(ans);
    }
}