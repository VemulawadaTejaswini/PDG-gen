import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }
    
    long h;
    long w;

    public void run() {
        // 入力情報取得
        Scanner sc = new Scanner(System.in);
        h = sc.nextLong();
        w = sc.nextLong();
        sc.close();

        // 解答処理
        solve();
    }
    
    private void solve() {
        long odd = (int) Math.round(w / 2.0);
        long even = w / 2;
        long odd_row = (int) Math.round(h / 2.0);
        long even_row = h / 2;
        long ans = odd * odd_row + even * even_row;
        System.out.println(ans);
    }
}