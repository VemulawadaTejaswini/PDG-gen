import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }
    
    String a;
    String b;

    public void run() {
        // 入力情報取得
        Scanner sc = new Scanner(System.in);
        a = sc.next();
        b = sc.next();
        sc.close();

        // 解答処理
        solve();
    }
    
    private void solve() {
        a = a + b;
        int n = Integer.parseInt(a);
        int m = (int)Math.sqrt(n);
        if (n == m * m) {
            System.out.println("Yes");            
        } else {
            System.out.println("No");
        }
    }
}