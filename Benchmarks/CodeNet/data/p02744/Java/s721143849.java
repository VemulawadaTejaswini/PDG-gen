import java.util.*;

public class Main {
    static int[] array;
    static int n;
    
    public static void main(String[] args) throws Exception {
        // Your code here! 
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        
        // array: 要素の値が1以上m以下からなる、広義単調増加の数列
        array = new int[n];
        
        // 全探索する時のデータを取得
        
        // arrayのパターンを全探索
        // ex.[1, 1, 1], [1, 1, 2], ... , [m, m, m]
        dfs(0, -1);
        
        // ans: scoreの最大値
        // System.out.println(ans);
    }
    
    public static void dfs(int index, int max) {
        // 終了条件
        if (index == n) {
            // できあがったarrayで計算
            for (int i = 0; i < n; i++) {
                char c = (char)(array[i] + 'a'); // 3 -> 'd'
                System.out.print(c);
            }
            System.out.println();
            return;
        }
        
        // 次項の取る値: now以上(広義単調増加)
        for (int i = 0; i <= max + 1; i++) {
            array[index] = i;
            dfs(index + 1, Math.max(max, i));
        }
    }
}