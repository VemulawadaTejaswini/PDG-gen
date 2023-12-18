import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        // to: 隣接リスト
        List<Integer>[] to = new List[n];
        for (int i = 0; i < n; i++) {
            to[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < n - 1; i++) {
            int s = sc.nextInt() - 1;
            int t = sc.nextInt() - 1;
            to[s].add(t);
        }
        
        int[] ans = new int[n];
        int max = -1;
        // 頂点0から順に、親から子へ初期値を配り最終値を求める
        Queue<int[]> que = new ArrayDeque<int[]>();
        que.add(new int[]{0, 0});
        while (!que.isEmpty()) {
            int[] cur = que.poll();
            int p = cur[0];
            int color = cur[1];
            
            int now = 1;
            for (Integer q : to[p]) {
                if (now == color) {
                    now++;
                }
                que.add(new int[]{q, now});
                ans[q] = now;
                max = Math.max(max, now);
                now++;
            }
        }
        
        System.out.println(max);
        for (int i = 1; i < n; i++) {
            System.out.println(ans[i]);
        }
    }
}