import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }
    
    // 変数一覧
    int s;
    int w;

    public void run() {
        // 入力情報取得
        Scanner sc = new Scanner(System.in);
        s = sc.nextInt();
        w = sc.nextInt();
        sc.close();

        // 解答処理
        solve();
    }
    
    private void solve() {
        if (s<=w) System.out.println("unsafe");
        else System.out.println("safe");
    }
}