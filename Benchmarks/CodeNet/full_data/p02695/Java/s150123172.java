import java.util.Scanner;

public class Main {

    static long ans = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int q = Integer.parseInt(sc.next());
        int[] a = new int[q];
        int[] b = new int[q];
        int[] c = new int[q];
        int[] d = new int[q];
        for (int i = 0; i < q; i++) {
            a[i] = Integer.parseInt(sc.next());
            b[i] = Integer.parseInt(sc.next());
            c[i] = Integer.parseInt(sc.next());
            d[i] = Integer.parseInt(sc.next());
        }
        int[] e = new int[n + 1];
        dfs(1, n, 1, e, a, b, c, d, q, m);
        System.out.println(ans);
    }

    private static void dfs(int v, int n, int num, int[] e, int[] a, int[] b, int[] c, int[] d, int q, int m) {
        if (n < v) {
            long temp = 0;
            for (int i = 0; i < q; i++) {
                if (e[b[i]] - e[a[i]] == c[i]) {
                    temp += d[i];
                }
            }
            ans = Math.max(ans, temp);
            return;
        }
        for (int i = num; i <= m; i++) {
            e[v] = i;
            dfs(v + 1, n, i, e, a, b, c, d, q, m);
        }
    }
}