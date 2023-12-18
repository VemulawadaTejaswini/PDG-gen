import java.util.Scanner;

public class Main {
    int n;
    long z, w;
    long[] as;
    public static void main(String[] args) {
        Main m = new Main();
        m.read();
        m.solve();
    }

    private void read() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        z = sc.nextLong();
        w = sc.nextLong();
        as = new long[n];
        for (int i = 0; i < n; i++)
            as[i] = sc.nextLong();
    }

    private void solve() {
        long ret = Long.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            boolean flg = true;
            for (int j = i + 1; j < n - 1; j++) {
                long tmp0 = Math.abs(as[i] - as[j]);
                long tmp1 = Math.abs(as[i] - as[n-1]);
                flg &= tmp0 >= tmp1;
            }
            if (flg)
                ret = Math.max(ret, Math.abs(as[i] - as[n-1]));
        }
        ret = Math.max(ret, Math.abs(as[n-1] - w));
        System.out.println(ret);
    }

}
