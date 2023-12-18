import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        
        // ans: dequeue(array)において次の3種類の操作をk回までできる時の最大価値
        // 操作A: 左端から1個取り出す
        // 操作B: 右端から1個取り出す
        // 操作C: 手持ちから1個捨てる
        int ans = 0;
        
        // 左からi個右からj個取るパターンを全探索する
        for (int i = 0; i <= k; i++) {
            if (i == n + 1) break;
            
            for (int j = 0; j <= k-i; j++) {
                if (i + j == n + 1) break;
                
                PriorityQueue<Integer> que = new PriorityQueue<>();
                
                // 操作A
                for (int x = 0; x < i; x++) {
                    que.add(array[x]);
                }
                // 操作B
                for (int x = n - 1; x > n - 1 - j; x--) {
                    que.add(array[x]);
                }
                // 操作C
                for (int x = 0; x < k - i - j; x++) {
                    if (que.isEmpty()) break;
                    int num = que.peek();
                    if (num <= 0) {
                        que.poll();
                    }
                }
                
                int sum = 0;
                while (!que.isEmpty()) {
                    sum += que.poll();
                }
                
                ans = Math.max(ans, sum);
            }
        }
        System.out.println(ans);
    }
}
