import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }
    
    int n;
    int m;
    int c;
    int[] b;
    int[][] a;
    int ans;
    

    public void run() {
        // 入力情報取得
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        c = sc.nextInt();
        b = new int[m];
        a = new int[n][m];
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();                
            }
        }
        sc.close();

        // 解答処理
        solve();
    }
    
    private void solve() {
        ans = 0;
        check();
        System.out.println(ans);
    }

    private void check() {
        for(int i = 0;i<n;i++) {
            int score = 0;
            for (int j = 0; j < m; j++) {
                score += a[i][j] * b[j];
            }
            if (score + c > 0) {
                ans++;                
            }
        }
    }
}