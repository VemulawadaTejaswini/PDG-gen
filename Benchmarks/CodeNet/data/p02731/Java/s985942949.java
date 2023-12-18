import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }
    
    // 変数一覧
    double l;
    double a;

    public void run() {
        // 入力情報取得
        Scanner sc = new Scanner(System.in);
        l = sc.nextDouble();
        sc.close();

        // 解答処理
        solve();
    }
    
    private void solve() {
        a = l / 3.0;
        System.out.println(Math.pow(a, 3));
    }
}