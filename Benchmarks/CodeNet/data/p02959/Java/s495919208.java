import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        long[] a = new long[n+1];
        for (int i = 0; i < n+1; i++) {
            a[i] = sc.nextLong();
        }

        long cnt = 0;
        for (int i = 0; i < n; i++) {
            long b = sc.nextLong();
            if (b > a[i]) {
                cnt += a[i];
                b -= a[i];
            } else {
                cnt += b;
                b = 0;
            }
            if (b >= a[i+1]) {
                cnt += a[i+1];
                a[i+1] = 0;
            } else {
                cnt += b;
                a[i+1] -= b;
            }
        }

        System.out.println(cnt);
    }
}