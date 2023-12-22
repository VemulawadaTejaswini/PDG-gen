import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }
    
    // 変数一覧
    String s;
    String t;

    public void run() {
        // 入力情報取得
        Scanner sc = new Scanner(System.in);
        s = sc.next();
        t = sc.next();
        sc.close();

        // 解答処理
        solve();
    }
    
    private void solve() {
        if (t.substring(0, t.length() - 1).equals(s)) {
            System.out.println("Yes");            
        } else {
            System.out.println("No");
        }
    }
}