import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }
    
    // 変数一覧
    int x;
    int y;
    int z;

    public void run() {
        // 入力情報取得
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();
        sc.close(); 

        // 解答処理
        solve();
    }
    
    private void solve() {
        int tmp = x;
        x = y;
        y = tmp;

        tmp = x;
        x = z;
        z = tmp;
        System.out.println(x + " " + y + " " + z);
    }
}