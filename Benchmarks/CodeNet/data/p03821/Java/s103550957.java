import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        long[] a = new long[n];
        long[] b = new long[n];
        long ans = 0;
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            b[i] = scanner.nextInt();
        }
        for (int i = n - 1; i >= 0; i--)
            ans += b[i] - (a[i] + ans - 1) % b[i] - 1;
        System.out.println(ans);
    }
}