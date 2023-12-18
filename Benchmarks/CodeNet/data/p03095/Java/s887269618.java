import java.util.*;

public class Main {
    static int[] array;
    static long[] alphabet;
    static int n = 26;
    static long MOD = 1000000007;
    static long ans = 0;
    
    public static void main(String[] args) throws Exception {
        // Your code here! 
        Scanner sc = new Scanner(System.in);
        sc.next();
        String str = sc.next();
        char[] c = str.toCharArray();
        
        // array: 長さnのbit列
        array = new int[n];
        
        // 全探索する時のデータを取得
        alphabet = new long[n];
        for (int i = 0; i < c.length; i++) {
            int idx = c[i] - 'a';
            alphabet[idx]++;
        }
        // System.out.println(Arrays.toString(alphabet));
        
        // arrayのパターンを全探索
        // ex.[1, 1, 1], [1, 1, 2], ... , [m, m, m]
        dfs(0, 0);
        
        // ans: costの最小値
        ans--;
        if (ans < 0) ans += MOD;
        System.out.println(ans);
    }
    
    public static void dfs(int index, int now) {
        // 終了条件
        if (index == n) {
            // できあがったarrayで計算
            long seki = 1;
            for (int i = 0; i < n; i++) {
                if (array[i] == 1) {
                    seki *= alphabet[i];
                    seki %= MOD;
                }
            }
            
            ans += seki;
            ans %= MOD;
            // System.out.println(ans);
            
            return;
        }
        
        // 次項の取る値: 0 or 1
        if (alphabet[index] == 0) {
            dfs(index + 1, 0);
        } else {
            for (int i = 0; i < 2; i++) {
                array[index] = i;
                dfs(index + 1, i);
            }
        }
    }
}