import java.util.*;

public class Main {

    long INF = Long.MAX_VALUE;

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] x = new int[N];
        int[] y = new int[N];
        int[] h = new int[N];
        long H = 0;
        for (int i = 0; i < N; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            h[i] = sc.nextInt();
        }
        for (int cx = 0; cx <= 100; cx++) {
            for (int cy = 0; cy <= 100; cy++) {
                int needH = -1;
                for (int i = 0; i < N; i++) {
                    if (h[1] == 0) {
                        continue;
                    }
                    int tmp = h[i] + Math.abs(x[i] - cx) + Math.abs(y[i] - cy);
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
                    int dist = Math.abs(x[i] - cx) + Math.abs(y[i] - cy);
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