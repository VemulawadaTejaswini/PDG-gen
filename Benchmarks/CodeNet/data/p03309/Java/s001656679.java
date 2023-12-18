import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class Main {
    final int MAX_N = 2 * 100000;
    void run() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for (int i = 1; i <= n; i++)
            a[i - 1] = scan.nextInt() - i;
        Arrays.sort(a);
        int b = (n % 2 == 0) ? (a[n / 2] + a[n / 2 - 1]) / 2 : a[n / 2];
        long ans = 0;
        for (int i = 1; i <= n; i++)
            ans += Math.abs(a[i - 1] - b);
        System.out.println(ans);
    }
    public static void main(String[] args) {
        new Main().run();
    }
}
