import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static int n;
    private static int m;
    private static int q;
    private static int[] a;
    private static int[] b;
    private static int[] c;
    private static int[] d;
    private static int ans;

    private static void dfs(List<Integer> A) {
        if (A.size() == n + 1) {
            int now = 0;
            for (int i = 0; i < q; i++) {
                if (A.get(b[i]) - A.get(a[i]) == c[i]) {
                    now += d[i];
                }
            }
            ans = Math.max(ans, now);
            return;
        }
        int start = A.get(A.size() - 1);
        for (int i = start; i <= m; i++) {
            A.add(i);
            dfs(A);
            A.remove(A.size() - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        q = sc.nextInt();
        a = new int[q];
        b = new int[q];
        c = new int[q];
        d = new int[q];
        for (int i = 0; i < q; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            c[i] = sc.nextInt();
            d[i] = sc.nextInt();
        }
        List<Integer> list = new ArrayList<>();
        list.add(1);
        dfs(list);
        System.out.println(ans);
    }

}
