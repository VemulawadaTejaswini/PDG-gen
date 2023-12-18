import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }
    
    // 変数一覧
    double a;
    double b;
    double c;
    double k;
    double ans;

    public void run() {
        // 入力情報取得
        Scanner sc = new Scanner(System.in);
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        k = sc.nextDouble();
        sc.close();

        // 解答処理
        solve();
    }
    
    private void solve() {
        double rem = k;
        if (a <= rem) {
            ans = a;
            rem -= a;
        } else {
            ans = a;
            rem = 0;
        }
        if (b <= rem && rem > 0) {
            rem -= b;
        } else {
            rem = 0;
        }
        if (rem > 0) {
            ans -= rem;
        }
        System.out.println(String.format("%,.0f",ans));
    }
}