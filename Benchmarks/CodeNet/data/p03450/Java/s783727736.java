

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
public class Main {
    static final int MAX = Integer.MAX_VALUE;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        HashMap<Integer, Integer>[] d = new HashMap[n+1];
        for (int i = 0; i <= n; i++) {
            d[i] = new HashMap<Integer, Integer>();
        }
        
        for (int i = 0; i < m; i++) {
            int xLi = sc.nextInt();
            int xRi = sc.nextInt();
            int xDi = sc.nextInt();
            d[xLi].put(xRi, xDi);
            d[xRi].put(xLi, -xDi);
        }

        
        Queue<Integer> q = new LinkedList<Integer>();
        long[] pos = new long[n+1];
        boolean[] visited = new boolean[n+1];
        
        for (int i = 1; i <= n; i++) {
            if (visited[i]) continue;
            
            q.add(i);
            pos[i] = 0;
            while (!q.isEmpty()) {
                int first = q.poll();
                Set<Integer> keys = d[first].keySet();
                for (int k : keys) {
                    Integer costFK = d[first].get(k);
//                    U.println(costFK);
                    if (costFK != null && costFK != MAX) {
                        d[first].put(k, MAX);
                        if (visited[k]) {
                            if (pos[k] != pos[first] + costFK) {
                                System.out.println("No");
                                return;
                            }
                        } else {
                            visited[k] = true;
                            pos[k] = pos[first] + costFK;
                        }
                        q.add(k);
                    }
                }
            }
        }
        System.out.println("Yes");
    }
}
