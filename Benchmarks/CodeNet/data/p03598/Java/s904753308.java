import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }
    
    int n;
    int k;
    int[] x;

    public void run() {
        // 入力情報取得
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }
        sc.close();

        // 解答処理
        solve();
    }
    
    private void solve() {
        int total = 0;
        for (int i = 0; i < n; i++) {
            int dist_b;
            if (x[i] > k) {
                dist_b = x[i] - k;
            } else {
                dist_b = k - x[i];
            }
            if (x[i] > dist_b) {
                total += dist_b * 2;
            } else {
                total += x[i] * 2;
            }
        }
        System.out.println(total);
    }
}