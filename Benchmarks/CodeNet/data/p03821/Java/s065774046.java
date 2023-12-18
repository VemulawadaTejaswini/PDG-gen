import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        long a[] = new long[n];
        long b[] = new long[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextLong();
            b[i] = in.nextLong();
        }

        long ans = 0;
        for (int i = n - 1; i >= 0; i--) {
            long c = ((a[i] + b[i] - 1) / b[i]) * b[i] - a[i];
            ans += c;
            for (int j = 0; j <= i; j++) {
                a[j] += c;
            }
        }

        System.out.println(ans);
    }
}