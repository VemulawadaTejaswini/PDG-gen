import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        // String s = sc.next();
        int[] a = new int[n];
        int ans = 0;
        for (int i = 0; i < m; i++) {
            a[i] = Integer.parseInt(sc.next());
            ans += a[i];
        }

        if (n >= ans) {
            System.out.println(n - ans);
        } else {
            System.out.println(-1);
        }
        sc.close();
    }
}