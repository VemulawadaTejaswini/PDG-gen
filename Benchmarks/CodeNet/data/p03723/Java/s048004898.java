import java.util.*;

public class Main {
    //-------------------------------------------------------------//
    public static final void main(String[] args) {
        new Main().solve();
    }
    //-------------------------------------------------------------//
    private final Scanner sc = new Scanner(System.in);
    void solve() {
        long[] cs = new long[3];
        for (int i = 0; i < 3; i++) cs[i] = sc.nextInt();
        long ans = 0;
        long s = System.currentTimeMillis();
        do {
            boolean check = false;
            for (int i = 0; i < 3; i++) if (cs[i] % 2 == 1) check = true;
            if (check) break;
            long newA = cs[1] / 2L + cs[2] / 2L;
            long newB = cs[0] / 2L + cs[2] / 2L;
            long newC = cs[0] / 2L + cs[1] / 2L;
            cs[0] = newA; cs[1] = newB; cs[2] = newC;
            ans++;
            if (System.currentTimeMillis() - s >= 1900L) {
                System.out.println(-1);
                return;
            }
        } while(true);
        System.out.println(ans);
    }
}