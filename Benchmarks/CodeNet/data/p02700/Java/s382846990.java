import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }
    
    // 変数一覧
    int a;
    int b;
    int c;
    int d;

    public void run() {
        // 入力情報取得
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        sc.close();

        // 解答処理
        solve();
    }
    
    private void solve() {
        c -= b;
        if (c < 1) {
            System.out.println("Yes");
            return;
        }
        a -= d;
        if (a < 1) {
            System.out.println("No");
            return;
        }
        solve();
    }
}