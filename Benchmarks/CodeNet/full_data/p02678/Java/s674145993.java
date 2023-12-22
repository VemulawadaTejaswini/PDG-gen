import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); int m = sc.nextInt();
        int[][] table = new int[n+1][n+1]; for(int i = 0; i <= n; i++) Arrays.fill(table[i], 0);
        int[] guide = new int[n+1]; Arrays.fill(guide, -1);
        int[] pre = new int[n+1]; Arrays.fill(pre, 0);
        for(int i = 0; i < m; i++) {
            int a = sc.nextInt(); int b = sc.nextInt();
            table[a][b] = 1; table[b][a] = 1;
        }
        pre[1] = 0; 
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(1);
        while(true) {
            Integer q = deque.poll(); if(q == null) break;
            int room = q.intValue();
            if(guide[room] == -1) {
                guide[room] = pre[room];
                for(int j = 1; j <= n; j++) {
                    if(table[room][j] == 1 && !deque.contains(j)) {
                        deque.add(j); pre[j] = room;
                    }
                }
            }
        }

        System.out.println("Yes");
        for(int i = 2; i <= n; i++) System.out.println(guide[i]);
    }
}