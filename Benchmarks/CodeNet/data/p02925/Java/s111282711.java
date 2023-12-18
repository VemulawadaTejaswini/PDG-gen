import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue<Integer>[] que = new ArrayDeque[n];
        for (int i = 0; i < n; i++) {
            que[i] = new ArrayDeque<Integer>();
        }
        
        // que[i]: iが次戦いたい相手のキュー
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                int opponent = sc.nextInt() - 1;
                que[i].add(opponent);
            }
        }
        
        int day = 0;
        while (true) {
            boolean allok = true;
            boolean ok = false;
            
            boolean[] already = new boolean[n];
            for (int j = 0; j < n; j++) {
                if (already[j]) continue;
                already[j] = true;
                if (que[j].isEmpty()) continue;
                allok = false;
                
                int opponent = que[j].peek();
                if (que[opponent].peek() != j) {
                    continue;
                } else {
                    if (already[opponent]) continue;
                    que[j].poll();
                    que[opponent].poll();
                    ok = true;
                    already[opponent] = true;
                }
            }
            if (ok) day++;
            
            if (allok) break;
            if (!ok) {
                System.out.println(-1);
                return;
            }
        }
        
        System.out.println(day);
    }
}