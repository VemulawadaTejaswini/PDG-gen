import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }

        long ans = 0;
        for (int i = 0; i < n; i++) {
            long tmp = 0;
            for (int j = i + 1; j < n; j++) {
                tmp += a[j];
            }
            ans += a[i] * (tmp % 1000000007) % 1000000007;
        }
        System.out.println(ans % 1000000007);
    }
}