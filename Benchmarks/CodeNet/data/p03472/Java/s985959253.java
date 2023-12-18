import java.util.Arrays;
import java.util.Scanner;

public class Main {
    int n;
    long h;
    long[] as, bs;
    public static void main(String[] args) {
        Main m = new Main();
        m.read();
        m.solve();
    }

    private void read() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        h = sc.nextLong();
        as = new long[n];
        bs = new long[n];
        for (int i = 0; i < n; i++) {
            as[i] = sc.nextLong();
            bs[i] = sc.nextLong();
        }
    }

    private void solve() {
        int cnt = 0;
        final long maxA = Arrays.stream(as).max().getAsLong();
        long[] bs2 = Arrays.stream(bs).filter(b -> b > maxA).toArray();
        for (long b: bs2) {
            h -= b;
            cnt++;
            if (h <= 0)
                break;
        }
        if (h <= 0) {
            System.out.println(cnt);
            System.exit(0);
        }
        cnt += h / maxA;
        if (h % maxA != 0)
            cnt++;
        System.out.println(cnt);
    }
}
