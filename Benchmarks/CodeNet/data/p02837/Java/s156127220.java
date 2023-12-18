import java.util.*;

public class Main {
    static int[] array;
    static int[][][] data;
    static int n;
    static int ans = 0;
    
    public static void main(String[] args) throws Exception {
        // Your code here! 
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        
        // array: 長さnのbit列
        array = new int[n];
        
        // 全探索する時のデータを取得
        data = new int[n][n-1][2];
        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();
            for (int j = 0; j < k; j++) {
                data[i][j][0] = sc.nextInt() - 1;
                data[i][j][1] = sc.nextInt();
            }
            
            for (int j = k; j < n-1; j++) {
                data[i][j][0] = -1;
                data[i][j][1] = -1;
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
            for (int i = 0; i < n; i++) {
                if (array[i] == 1) {
                    for (int j = 0; j < n-1; j++) {
                        if (data[i][j][0] == -1) break;
                        
                        int p = data[i][j][0];
                        int s = data[i][j][1];
                        if (array[p] != s) {
                            return;
                        }
                    }
                }
            }
            
            int count = 0;
            if (ok) {
                for (int i = 0; i < n; i++) {
                    if (array[i] == 1) count++;
                }
            }
            ans = Math.max(ans, count);
            return;
        }
        
        // 次項の取る値: 0 or 1
        for (int i = 0; i < 2; i++) {
            array[index] = i;
            dfs(index + 1, i);
        }
    }
}