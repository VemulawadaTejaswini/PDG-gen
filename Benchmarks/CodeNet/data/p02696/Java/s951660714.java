import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }
    
    // 変数一覧
    Double a;
    Double b;
    Double n;
    Double calcmax=0.0;

    public void run() {
        // 入力情報取得
        Scanner sc = new Scanner(System.in);
        a = sc.nextDouble();
        b = sc.nextDouble();
        n = sc.nextDouble();
        sc.close();

        // 解答処理
        solve();
    }
    
    private void solve() {
        for (int x = 0; x <= n; x++) {
            Double calc = Math.floor((a * x) / b) - a * Math.floor(x/b);
            if (calcmax < calc) {
                calcmax = calc;
            }
        }
        System.out.println(Math.round(calcmax));
    }
}