import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }
    
    // 変数一覧
    int n;
    int a[];

    public void run() {
        // 入力情報取得
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = new int[n];
        for (int i = 0; i < n-1; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        // 解答処理
        solve();
    }
    
    private void solve() {
        int[] s = new int[n];
        Arrays.fill(s, 0);
        for (int i = 0; i < a.length-1; i++) {
            s[a[i] - 1]++;
        }
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);            
        }
    }
}