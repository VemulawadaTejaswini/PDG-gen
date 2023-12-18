import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }
    
    // 変数一覧
    int n;
    int m;
    long[] a;

    public void run() {
        // 入力情報取得
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        a = new long[m];
        for (int i = 0; i < m; i++) {
            a[i] = sc.nextLong();
        }
        sc.close();

        // 解答処理
        solve();
    }
    
    private void solve() {
        for (int i = 0; i < a.length; i++) {
            n -= a[i];
            if (n < 0) {
                System.out.println("-1");
                break;
            }
            if (i == m-1) {
                System.out.println(n);
            }
        }
    }
}