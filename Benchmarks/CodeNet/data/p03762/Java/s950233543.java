import java.util.Scanner;

public class Main {
    public static long D = 1000000007;

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] xs = new int[n];
        int[] ys = new int[m];
        for (int i = 0; i < n; i++) {
            xs[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            ys[i] = sc.nextInt();
        }
        int nn = n - 1;
        int mm = m - 1;
        long[] dxs = new long[nn];
        long[] dys = new long[mm];
        for (int i = 0; i < nn; i++) {
            dxs[i] = (xs[i + 1] - xs[i]) % D;
        }
        for (int i = 0; i < mm; i++) {
            dys[i] = (ys[i + 1] - ys[i]) % D;
        }

        long[] cxs = new long[nn];
        long[] cys = new long[mm];
        for (int i = 0; i < nn; i++) {
            cxs[i] = ((i + 1) * (n - (i + 1))) % D;
        }
        for (int i = 0; i < mm; i++) {
            cys[i] = ((i + 1) * (m - (i + 1))) % D;
        }

        long sum = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < m - 1; j++) {
                long area = (dxs[i] * dys[j]) % D;
                long count = (cxs[i] * cys[j]);
                sum += area * count;
            }
        }
        System.out.println(sum % D);
    }
}
