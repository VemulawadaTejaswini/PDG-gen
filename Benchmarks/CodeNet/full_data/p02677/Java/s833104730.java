import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }
    
    // 変数一覧
    double a;
    double b;
    double h;
    double m;

    public void run() {
        // 入力情報取得
        Scanner sc = new Scanner(System.in);
        a = sc.nextDouble();
        b = sc.nextDouble();
        h = sc.nextDouble();
        m = sc.nextDouble();
        sc.close();

        // 解答処理
        solve();
    }
    
    private void solve() {
        
        double m_deg = m * 6.0;
        double h_deg = 0.5 * (60.0 * h + m);
        double deg = 0;
        if (h_deg > m_deg) {
            deg = h_deg - m_deg;
        } else {
            deg = m_deg - h_deg;
        }

        if (deg > 180.0) {
            deg = 360 - deg;
        }

        double ans = Math.sqrt(Math.pow(a, 2.0) + Math.pow(b, 2.0) - (2.0 * a * b * Math.cos(Math.toRadians(deg))));

        System.out.println(ans);
    }
}