import java.util.Scanner;

public class Main {

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
        long ans = 0;
        int[] dd = new int[m + 1];
        for (int i = 1; i <= n; ++i) dd[i] = 1;
        while (dd[0] <= 0) {
            int[] ary = new int[n];
            for (int i = 1; i <= n; ++i) {
                ary[i - 1] = dd[i];
            }
//            System.out.println(Arrays.toString(ary));
            long temp = 0;
            for (int i = 0; i < q; i++) {
                if (ary[b[i] - 1] - ary[a[i] - 1] == c[i]) {
                    temp += d[i];
                }
            }
            ans = Math.max(ans, temp);
            for (int j = n; 0 <= j; --j) {
                ++dd[j];
                for (int k = j + 1; k <= n; ++k)
                    dd[k] = dd[k - 1];
                if (dd[j] <= m) break;
            }
        }
        System.out.println(ans);
    }
}