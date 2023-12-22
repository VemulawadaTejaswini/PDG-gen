import java.util.*;

public class Main {

    private static int findF(int[] f, int x) {
        if (f[x] == x) return x;
        return f[x] = findF(f, f[x]);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] f = new int[n];
        for (int i = 0; i < n; i++) f[i] = i;
        for (int i = 0; i < m; i++) {
            int a = scan.nextInt() - 1;
            int b = scan.nextInt() - 1;
            int fa = findF(f, a);
            int fb = findF(f, b);
            if (fa != fb) {
                if (fa < fb) f[fb] = fa;
                else f[fa] = fb;
            }
        }
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            int fa = findF(f, i);
            num[fa]++;
        }
        int ans = 1;
        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, num[i]);
        }
        System.out.println(ans);
    }
}
