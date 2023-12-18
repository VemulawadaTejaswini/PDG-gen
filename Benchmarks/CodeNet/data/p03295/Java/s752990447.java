import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        boolean[] a = new boolean[n];
        boolean[] b = new boolean[n];
        for (int i = 0; i < m; i++) {
            a[scanner.nextInt() - 1] = true;
            b[scanner.nextInt() - 1] = true;
        }

        int ans = 1;
        boolean f = false;
        for (int i = 0; i < n; i++) {
            if (b[i]) f = true;
            if (f && a[i]) ans++;
            if (a[i]) f = false;
        }
        System.out.println(ans);
    }
}