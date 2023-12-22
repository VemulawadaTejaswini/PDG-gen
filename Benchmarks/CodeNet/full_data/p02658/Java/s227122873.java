import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
            if (a[i] == 0) {
                System.out.println(0);
                return;
            }
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