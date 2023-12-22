import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        char[] c = str.toCharArray();
        
        // WRWWRWRR
        // WRが一つもないまでの最小回数
        
        // 操作1: 任意のi, jを入れ替え
        // 操作2: iを選んで色反転
        
        // WRRRRR Wを買えるのがいい
        // WWWWRR Rをかえるのがいい
        
        // WRがないとは？
        // RRRRWWWWWWWWということ
        // Rが0個以上Wが0個以上
        
        // WRWWRWRR ans=3
        // ぶつかるまで左はじ右端からWRを数えたらOK？
        
        int l = 0;
        int r = n-1;
        int count = 0;
        while (true) {
            if (l == r) break;
            if (l > r) break;
            
            while (c[l] != 'W') {
                l++;
                if (l == n-1) break;
            }
            
            while (c[r] != 'R') {
                r--;
                if (r == 0) break;
            }
            
            // System.out.println(l + " " + r);
            
            if (l < r) {
                count++;
                l++;
                r--;
            } else {
                break;
            }
        }
        System.out.println(count);
    }
}
