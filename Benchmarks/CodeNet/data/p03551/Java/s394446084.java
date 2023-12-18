import java.util.Scanner;

public class Main {
    int n, m;
    private final int LONG = 1900;
    private final int SHORT = 100;
    public static void main(String[] args) {
        Main m = new Main();
        m.read();
        m.solve();
    }

    private void read() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
    }

    private void solve() {
        double ans = 0.;
        double rat = 2 << (m - 1);
        double one = (LONG * m + SHORT * (n - m)) * (1. / rat);
        double co = (rat - 1.) / rat;
        double tmp = 0.;
        ans = one;
        int cnt = 1;
        while (ans - tmp > 0.01) {
            cnt++;
            tmp = ans;
            ans += (one * cnt) * co;
            co *= (rat - 1.) / rat;
        }
        System.out.println(Math.round(ans));
    }
}
