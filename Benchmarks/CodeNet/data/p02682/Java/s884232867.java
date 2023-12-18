import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }
    
    // 変数一覧
    long a;
    long b;
    long c;
    long k;
    long ans;

    public void run() {
        // 入力情報取得
        Scanner sc = new Scanner(System.in);
        a = sc.nextLong();
        b = sc.nextLong();
        c = sc.nextLong();
        k = sc.nextLong();
        sc.close();

        // 解答処理
        solve();
    }
    
    private void solve() {
        long rem = k;
        if (a <= rem) {
            ans += a;
            rem -= a;
        } else {
            rem -= a;
            ans = a;
        }
        if (b <= rem && rem > 0) {
            rem -= b;
        }
        if (rem > 0) {
            ans -= rem;
        }
        System.out.println(ans);
    }
}