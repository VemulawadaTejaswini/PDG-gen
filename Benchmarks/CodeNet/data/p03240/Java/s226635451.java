
import java.util.*;

public class Main {

    long INF = Long.MAX_VALUE;

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] x = new long[N];
        long[] y = new long[N];
        long[] h = new long[N];
        long H = 0;
        for (int i = 0; i < N; i++) {
            x[i] = sc.nextLong();
            y[i] = sc.nextLong();
            h[i] = sc.nextLong();
        }
        for (int cx = 0; cx <= 100; cx++) {
            for (int cy = 0; cy <= 100; cy++) {
                long needH = -1;
                for (int i = 0; i < N; i++) {
                    if (h[1] == 0) {
                        continue;
                    }
                    long tmp = h[i] + Math.abs(x[i] - cx) + Math.abs(y[i] - cy);
                    if (needH == -1) {
                        needH = tmp;
                    } else {
                        if (needH != tmp) {
                            needH = -2;
                            break;
                        }
                    }
                }
                if (needH == -2) {
                    continue;
                }
                for (int i = 0; i < N; i++) {
                    if (h[i] != 0) {
                        continue;
                    }
                    long dist = Math.abs(x[i] - cx) + Math.abs(y[i] - cy);
                    if (needH > dist) {
                        needH = -2;
                        break;
                    }
                }
                if (needH == -2) {
                    continue;
                }
                System.out.println(cx + " " + cy + " " + needH);
                return;
            }
        }
    }
}
