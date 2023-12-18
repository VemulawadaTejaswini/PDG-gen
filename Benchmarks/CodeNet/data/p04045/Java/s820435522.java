import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        boolean[] ok = new boolean[11];
        Arrays.fill(ok, true);
        for (int i = 0; i < k; i++) {
            int num = sc.nextInt();
            ok[num] = false;
        }
        
        // que: ルンルン数(次の桁に-1～+1で行ける)
        // ex. 334, 2123, 3234566667
        Queue<Integer> que = new ArrayDeque<Integer>();
        
        // 1～9からBFSスタート
        for (int i = 1; i <= 9; i++) {
            if (ok[i]) {
                que.add(i);
            }
        }
        
        while (!que.isEmpty()) {
            int cur = que.poll();
            int x10 = cur * 10;
            
            // 終了条件: k番目の数が取り出された
            if (cur >= n) {
                System.out.println(cur);
                return;
            }
            
            // 次の桁(-1, 0, +1)の3パターンをキューに入れる
            for (int i = 0; i <= 9; i++) {
                if (ok[i]) {
                    que.add(x10 + i);
                }
            }
        }
    }
}