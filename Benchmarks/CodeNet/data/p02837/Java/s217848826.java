import java.util.*;

public class Main {
    static int[] array;
    static int n;
    static int[] a;
    static int[][] x;
    static int[][] y;
    static int ans = 0;
    
    public static void main(String[] args) throws Exception {
        // Your code here! 
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        
        // array: 長さnのbit列
        array = new int[n];
        
        // 全探索する時のデータを取得
        a = new int[n];
        x = new int[n][n-1];
        y = new int[n][n-1];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            for (int j = 0; j < a[i]; j++) {
                x[i][j] = sc.nextInt()-1;
                y[i][j] = sc.nextInt();
            }
        }
        
        // arrayのパターンを全探索
        // ex.[1, 1, 1], [1, 1, 2], ... , [m, m, m]
        dfs(0, 0);
        
        // ans: costの最小値
        System.out.println(ans);
    }
    
    public static void dfs(int index, int now) {
        // 終了条件
        if (index == n) {
            // できあがったarrayで計算
            
            boolean ok = true;
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (array[i] == 0) continue;
                count++;
                
                for (int j = 0; j < a[i]; j++) {
                    int num = x[i][j];
                    int state = y[i][j];
                    if (array[num] != state) ok = false;
                }
            }
            
            if (ok) {
                ans = Math.max(ans, count);
            }
            return;
        }
        
        // 次項の取る値: 0 or 1
        for (int i = 0; i < 2; i++) {
            array[index] = i;
            dfs(index + 1, i);
        }
    }
}